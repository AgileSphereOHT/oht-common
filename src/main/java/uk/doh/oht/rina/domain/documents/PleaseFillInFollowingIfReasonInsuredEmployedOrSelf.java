package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PleaseFillInFollowingIfReasonInsuredEmployedOrSelf implements Serializable {
    private long serialVersionUID = 1L;

    private Date date;
}
