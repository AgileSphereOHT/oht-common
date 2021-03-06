package uk.doh.oht.db.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 05/05/2017.
 */
@Builder
@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDetail implements Serializable {
    private String type;
    private String details;
}
