package com.chisw.timofei.booking.accommodation.service.api.read.common;

import java.util.List;

/**
 * @author timofei.kasianov 10/2/18
 */
public interface CommonProvider<DTO, ID> {

    List<DTO> readAll();

    List<DTO> readByIds(List<ID> dtoIds);

    DTO readById(ID dtoId);

}
