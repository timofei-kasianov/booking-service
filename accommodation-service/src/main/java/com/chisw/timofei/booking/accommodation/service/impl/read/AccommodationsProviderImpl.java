package com.chisw.timofei.booking.accommodation.service.impl.read;

import com.chisw.timofei.booking.accommodation.data.document.Accommodation;
import com.chisw.timofei.booking.accommodation.data.repository.AccommodationsRepository;
import com.chisw.timofei.booking.accommodation.service.api.dto.AccommodationDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.search.AccommodationSearchRequestDTO;
import com.chisw.timofei.booking.accommodation.service.api.read.AccommodationsProvider;
import com.chisw.timofei.booking.accommodation.service.impl.read.common.CommonProviderImpl;
import com.chisw.timofei.booking.accommodation.integration.ReservationRestServiceClient;
import com.chisw.timofei.booking.reservation.controller.api.dto.ReservationDTO;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author timofei.kasianov 10/2/18
 */
@Service
@Slf4j
@Transactional(readOnly = true)
public class AccommodationsProviderImpl
        extends CommonProviderImpl<Accommodation, AccommodationDTO, String, AccommodationsRepository>
        implements AccommodationsProvider {

    private final ReservationRestServiceClient reservationRestServiceClient;

    public AccommodationsProviderImpl(AccommodationsRepository repository, ReservationRestServiceClient reservationRestServiceClient) {
        super(repository);
        this.reservationRestServiceClient = reservationRestServiceClient;
    }

    @Override
    public List<AccommodationDTO> search(AccommodationSearchRequestDTO searchRequest) {
        // for test
        final ResponseEntity<List<ReservationDTO>> reservationsResponse;

        try {
            reservationsResponse = reservationRestServiceClient.list();
        } catch (Exception ex) {
            throw new RuntimeException("An error occurred during communication with the 'reservation-service'", ex);
        }

        final List<ReservationDTO> reservations = Optional
                .ofNullable(reservationsResponse.getBody())
                .orElse(new ArrayList<>());
        log.info(" *** Retrieved reservations count: {}", reservations.size());
        return Lists.newArrayList(
                new AccommodationDTO("accommodation-id", 1L, "description", "host-id")
        );
    }

    @Override
    protected AccommodationDTO documentToDto(Accommodation accommodation) {
        return AccommodationDTO
                .builder()
                .id(accommodation.getId())
                .description(accommodation.getDescription())
                .hostId(accommodation.getHostId())
                .ratePerNightInCents(accommodation.getRatePerNightInCents())
                .build();
    }
}
