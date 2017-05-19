package uk.doh.oht.rina.domain.notifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by peterwhitehead on 03/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Type implements Serializable {
    private long serialVersionUID = 1L;

    private List<Version> version;
    private String name;
    private String id;
    private String sector;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    class Version implements Serializable {
        private long serialVersionUID = 1L;

        private String version;
        private String activeFrom;
    }
}
