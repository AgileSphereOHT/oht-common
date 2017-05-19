package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationPeriod implements Serializable {
    private long serialVersionUID = 1L;

    private OpenPeriod openPeriod;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("OpenPeriod")
    public OpenPeriod getOpenPeriod() {
        return openPeriod;
    }

    @JsonProperty("OpenPeriod")
    public void setOpenPeriod(final OpenPeriod openPeriod) {
        this.openPeriod = openPeriod;
    }
}
