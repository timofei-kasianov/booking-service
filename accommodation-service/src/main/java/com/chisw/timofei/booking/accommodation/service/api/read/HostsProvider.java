package com.chisw.timofei.booking.accommodation.service.api.read;

import com.chisw.timofei.booking.accommodation.service.api.dto.HostDTO;
import com.chisw.timofei.booking.accommodation.service.api.dto.search.HostSearchRequestDTO;
import com.chisw.timofei.booking.accommodation.service.api.read.common.CommonProvider;

import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
public interface HostsProvider extends CommonProvider<HostDTO, String> {

    List<HostDTO> search(HostSearchRequestDTO request);

}
