package com.chisw.timofei.booking.accommodation.service.impl.read.common;

import com.chisw.timofei.booking.accommodation.service.api.read.common.CommonProvider;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author timofei.kasianov 10/2/18
 */
public abstract class CommonProviderImpl<DOCUMENT, DTO, ID, REPOSITORY extends MongoRepository<DOCUMENT, ID>> implements CommonProvider<DTO, ID> {

    protected final REPOSITORY repository;

    public CommonProviderImpl(REPOSITORY repository) {
        this.repository = repository;
    }

    @Override
    public List<DTO> readAll() {
        return repository
                .findAll()
                .stream()
                .map(this::documentToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<DTO> readByIds(List<ID> dtoIds) {
        return StreamSupport
                .stream(repository.findAllById(dtoIds).spliterator(), false)
                .map(this::documentToDto)
                .collect(Collectors.toList());
    }

    @Override
    public DTO readById(ID dtoId) {
        return repository.findById(dtoId).map(this::documentToDto).orElse(null);
    }

    protected abstract DTO documentToDto(DOCUMENT document);
}
