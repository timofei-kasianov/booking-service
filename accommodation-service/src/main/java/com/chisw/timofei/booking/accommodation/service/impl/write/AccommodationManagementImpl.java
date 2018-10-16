package com.chisw.timofei.booking.accommodation.service.impl.write;

import com.chisw.timofei.booking.accommodation.data.document.Accommodation;
import com.chisw.timofei.booking.accommodation.data.repository.AccommodationsRepository;
import com.chisw.timofei.booking.accommodation.service.api.dto.AccommodationDTO;
import com.chisw.timofei.booking.accommodation.service.api.write.AccommodationsManagement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @author timofei.kasianov 10/3/18
 */
@Service
@Transactional
public class AccommodationManagementImpl implements AccommodationsManagement {

    private final AccommodationsRepository accommodationsRepository;

    @Inject
    public AccommodationManagementImpl(AccommodationsRepository accommodationsRepository) {
        this.accommodationsRepository = accommodationsRepository;
    }

    @Override
    public String create(AccommodationDTO accommodationDto) {
        // validate
        final Accommodation accommodation = Accommodation
                .builder()
                .description(accommodationDto.getDescription())
                .hostId(accommodationDto.getHostId())
                .ratePerNightInCents(accommodationDto.getRatePerNightInCents())
                .build();
        return accommodationsRepository.save(accommodation).getId();
    }

    @Override
    public void update(String accommodationId, AccommodationDTO accommodationDto) {
        // validate
        if(!accommodationsRepository.existsById(accommodationId)) {
            throw new RuntimeException("Accommodation with ID: " + accommodationId + " is not found");
        }

        final Accommodation updatedAccommodation = Accommodation
                .builder()
                .ratePerNightInCents(accommodationDto.getRatePerNightInCents())
                .hostId(accommodationDto.getHostId())
                .description(accommodationDto.getDescription())
                .id(accommodationId)
                .build();

        accommodationsRepository.save(updatedAccommodation);
    }

    @Override
    public void delete(String accommodationId) {
        // validate
        accommodationsRepository.deleteById(accommodationId);
    }
}
