package com.chisw.timofei.booking.accommodation.data.document;

import com.chisw.timofei.booking.accommodation.data.document.embeddable.Address;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author timofei.kasianov 10/2/18
 */
@AllArgsConstructor()
@Getter
@Builder
@EqualsAndHashCode()
@Document(collection = "hosts")
@TypeAlias("host")
public class Host {

    @Id
    private final String id;
    private final String title;
    private final String description;
    private final Address address;

}
