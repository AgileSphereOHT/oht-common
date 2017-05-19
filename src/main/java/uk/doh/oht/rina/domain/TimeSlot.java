package uk.doh.oht.rina.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by peterwhitehead on 08/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeSlot implements Serializable {
    private long serialVersionUID = 1L;

    private Date date;
    private Integer number;
}
