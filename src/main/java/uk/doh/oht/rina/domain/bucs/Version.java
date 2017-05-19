package uk.doh.oht.rina.domain.bucs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import uk.doh.oht.rina.domain.common.Organisation;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by peterwhitehead on 03/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Version implements Serializable {
    private long serialVersionUID = 1L;

    private Date date;
    private String id;
    private User user;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    class User implements Serializable {
        private long serialVersionUID = 1L;

        private String name;
        private Organisation organisation;
        private String id;
        private String type;
    }
}
