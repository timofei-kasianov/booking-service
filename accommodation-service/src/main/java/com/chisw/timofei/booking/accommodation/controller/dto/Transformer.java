package com.chisw.timofei.booking.accommodation.controller.dto;

import com.chisw.timofei.booking.accommodation.controller.dto.search.AccommodationSearchRequest;
import com.chisw.timofei.booking.accommodation.service.api.dto.AccommodationDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.AddressDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.HostDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.search.AccommodationSearchRequestDTO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author timofei.kasianov 10/3/18
 */
public class Transformer {

    public static AccommodationSearchRequestDTO toAccommodationSearchRequestDto(AccommodationSearchRequest request) {
        return AccommodationSearchRequestDTO
                .builder()
                .availableFromTimestamp(request.getAvailableFromTimestamp())
                .availableToTimestamp(request.getAvailableToTimestamp())
                .description(request.getDescription())
                .hostIds(request.getHostIds())
                .maxRateInCents(request.getMaxRateInCents())
                .minRateInCents(request.getMinRateInCents())
                .build();
    }

    public static AccommodationDTO toAccommodationDto(AccommodationViewDTO viewDto) {
        return AccommodationDTO
                .builder()
                .id(viewDto.getId())
                .hostId(viewDto.getHostId())
                .description(viewDto.getDescription())
                .ratePerNightInCents(viewDto.getRatePerNightInCents())
                .build();
    }

    public static AccommodationViewDTO toAccommodationViewDto(AccommodationDTO dto) {
        return AccommodationViewDTO
                .builder()
                .id(dto.getId())
                .hostId(dto.getHostId())
                .description(dto.getDescription())
                .ratePerNightInCents(dto.getRatePerNightInCents())
                .build();
    }

    public static List<AccommodationViewDTO> toAccommodationViewDtoList(List<AccommodationDTO> dtos) {
        return dtos.stream().map(Transformer::toAccommodationViewDto).collect(Collectors.toList());
    }

    public static HostViewDTO toHostViewDto(HostDTO dto) {
        return HostViewDTO
                .builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .address(toAddressViewDto(dto.getAddress()))
                .build();
    }

    public static HostDTO toHostDto(HostViewDTO viewDto) {
        return HostDTO
                .builder()
                .id(viewDto.getId())
                .title(viewDto.getTitle())
                .description(viewDto.getDescription())
                .address(toAddressDto(viewDto.getAddress()))
                .build();
    }

    public static List<HostViewDTO> toHostViewDtoList(List<HostDTO> dtos) {
        return dtos.stream().map(Transformer::toHostViewDto).collect(Collectors.toList());
    }

    private static AddressViewDTO toAddressViewDto(AddressDTO dto) {
        return AddressViewDTO
                .builder()
                .country(dto.getCountry())
                .city(dto.getCity())
                .line1(dto.getLine1())
                .line2(dto.getLine2())
                .build();
    }

    private static AddressDTO toAddressDto(AddressViewDTO viewDto) {
        return AddressDTO
                .builder()
                .country(viewDto.getCountry())
                .city(viewDto.getCity())
                .line1(viewDto.getLine1())
                .line2(viewDto.getLine2())
                .build();
    }

}
