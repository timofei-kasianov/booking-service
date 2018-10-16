package com.chisw.timofei.booking.accommodation.service.impl.read;

import com.chisw.timofei.booking.accommodation.data.document.embeddable.Address;
import com.chisw.timofei.booking.accommodation.data.document.Host;
import com.chisw.timofei.booking.accommodation.service.api.read.HostsProvider;
import com.chisw.timofei.booking.accommodation.service.api.dto.AddressDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.HostDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.search.HostSearchRequestDTO;
import com.chisw.timofei.booking.accommodation.data.repository.HostsRepository;
import com.chisw.timofei.booking.accommodation.service.impl.read.common.CommonProviderImpl;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
@Service
@Transactional(readOnly = true)
public class HostsProviderImpl extends CommonProviderImpl<Host, HostDTO, String, HostsRepository> implements HostsProvider {

    @Inject
    public HostsProviderImpl(HostsRepository repository) {
        super(repository);
    }

    @Override
    public List<HostDTO> search(HostSearchRequestDTO request) {
        return Lists.newArrayList();
    }

    @Override
    protected HostDTO documentToDto(Host host) {
        return HostDTO
                .builder()
                .id(host.getId())
                .title(host.getTitle())
                .description(host.getDescription())
                .address(toAddressDto(host.getAddress()))
                .build();
    }

    private AddressDTO toAddressDto(Address address) {
        return address != null ?
                AddressDTO
                        .builder()
                        .country(address.getCountry())
                        .city(address.getCity())
                        .line1(address.getLine1())
                        .line2(address.getLine2())
                        .build() :
                null;
    }
}
