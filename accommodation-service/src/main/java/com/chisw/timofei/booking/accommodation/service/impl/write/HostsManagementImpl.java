package com.chisw.timofei.booking.accommodation.service.impl.write;

import com.chisw.timofei.booking.accommodation.data.document.embeddable.Address;
import com.chisw.timofei.booking.accommodation.data.document.Host;
import com.chisw.timofei.booking.accommodation.data.repository.HostsRepository;
import com.chisw.timofei.booking.accommodation.service.api.write.HostsManagement;
import com.chisw.timofei.booking.accommodation.service.api.dto.AddressDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.HostDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @author timofei.kasianov 10/2/18
 */
@Service
@Transactional
public class HostsManagementImpl implements HostsManagement {

    private final HostsRepository hostsRepository;

    @Inject
    public HostsManagementImpl(HostsRepository hostsRepository) {
        this.hostsRepository = hostsRepository;
    }

    @Override
    public String create(HostDTO hostDto) {
        // validate
        final Host hostDocument = Host
                .builder()
                .title(hostDto.getTitle())
                .description(hostDto.getDescription())
                .address(toAddress(hostDto.getAddress()))
                .build();
        return hostsRepository.save(hostDocument).getId();
    }

    @Override
    public void update(String hostId, HostDTO hostDto) {
        // validate
        if (!hostsRepository.existsById(hostId)) {
            throw new RuntimeException("Host with ID: " + hostId + " is not found");
        }
        final Host updatedDocument = Host
                .builder()
                .id(hostId)
                .title(hostDto.getTitle())
                .description(hostDto.getDescription())
                .address(toAddress(hostDto.getAddress()))
                .build();
        hostsRepository.save(updatedDocument);
    }

    @Override
    public void delete(String hostId) {
        // validate
        hostsRepository.deleteById(hostId);
    }

    private Address toAddress(AddressDTO addressDto) {
        return addressDto != null ?
                Address
                        .builder()
                        .country(addressDto.getCountry())
                        .city(addressDto.getCity())
                        .line1(addressDto.getLine1())
                        .line2(addressDto.getLine2())
                        .build() :
                null;
    }
}
