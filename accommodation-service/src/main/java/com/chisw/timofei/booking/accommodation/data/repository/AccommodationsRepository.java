package com.chisw.timofei.booking.accommodation.data.repository;

import com.chisw.timofei.booking.accommodation.data.document.Accommodation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author timofei.kasianov 10/2/18
 */
@Repository
public interface AccommodationsRepository extends MongoRepository<Accommodation, String> {
}
