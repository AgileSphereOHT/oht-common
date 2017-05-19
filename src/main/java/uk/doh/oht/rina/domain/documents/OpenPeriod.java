package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenPeriod implements Serializable {
    private long serialVersionUID = 1L;

    private String typeOpenPeriod;
    private Date startDate;
}
