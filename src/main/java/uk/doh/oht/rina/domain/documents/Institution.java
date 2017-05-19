package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Institution implements Serializable {
    private long serialVersionUID = 1L;

    private String institutionID;
    private String institutionName;
}
