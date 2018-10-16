package com.chisw.timofei.booking.accommodation.service.api.write;

import com.chisw.timofei.booking.accommodation.service.api.dto.HostDTO;

/**
 * @author timofei.kasianov 10/2/18
 */
public interface HostsManagement {

    String create(HostDTO hostDto);

    void update(String hostId, HostDTO hostDto);

    void delete(String hostId);

}
