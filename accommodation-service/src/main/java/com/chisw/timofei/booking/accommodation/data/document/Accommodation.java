package com.chisw.timofei.booking.accommodation.data.document;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author timofei.kasianov 10/2/18
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@Builder
@Document(collection = "accommodations")
@TypeAlias("accommodation")
public class Accommodation {

    @Id
    private final String id;
    private final long ratePerNightInCents;
    private final String description;
    private final String hostId;

}
