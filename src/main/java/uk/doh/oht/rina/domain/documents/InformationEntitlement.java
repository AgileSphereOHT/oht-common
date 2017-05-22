package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 22/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InformationEntitlement implements Serializable {
    private long serialVersionUID = 1L;

    private PeriodEntitlement periodEntitlement;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("PeriodEntitlement")
    public PeriodEntitlement getPeriodEntitlement() {
        return periodEntitlement;
    }

    @JsonProperty("PeriodEntitlement")
    public void setPeriodEntitlement(PeriodEntitlement periodEntitlement) {
        this.periodEntitlement = periodEntitlement;
    }
}
