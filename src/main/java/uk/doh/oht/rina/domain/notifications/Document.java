package uk.doh.oht.rina.domain.notifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import uk.doh.oht.rina.domain.common.Receiver;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 03/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document implements Serializable {
    private long serialVersionUID = 1L;

    private Receiver receiver;
    private String name;
    private String type;
}
