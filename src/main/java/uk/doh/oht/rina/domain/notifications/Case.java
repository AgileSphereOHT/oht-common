package uk.doh.oht.rina.domain.notifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import uk.doh.oht.rina.domain.common.Subject;
import uk.doh.oht.rina.domain.common.Properties;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 03/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Case implements Serializable {
    private long serialVersionUID = 1L;

    private Subject subject;
    private String id;
    private Type type;
    private Properties properties;
}
