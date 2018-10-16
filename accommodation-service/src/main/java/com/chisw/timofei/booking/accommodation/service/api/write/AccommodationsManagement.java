package com.chisw.timofei.booking.accommodation.service.api.write;

import com.chisw.timofei.booking.accommodation.service.api.dto.AccommodationDTO;

/**
 * @author timofei.kasianov 10/2/18
 */
public interface AccommodationsManagement {

    String create(AccommodationDTO accommodationDto);

    void update(String accommodationId, AccommodationDTO accommodationDto);

    void delete(String accommodationId);

}
