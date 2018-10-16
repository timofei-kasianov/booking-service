package com.chisw.timofei.booking.accommodation.service.api.read;

import com.chisw.timofei.booking.accommodation.service.api.dto.AccommodationDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.search.AccommodationSearchRequestDTO;
import com.chisw.timofei.booking.accommodation.service.api.read.common.CommonProvider;

import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
public interface AccommodationsProvider extends CommonProvider<AccommodationDTO, String> {

    List<AccommodationDTO> search(AccommodationSearchRequestDTO searchRequest);

}
