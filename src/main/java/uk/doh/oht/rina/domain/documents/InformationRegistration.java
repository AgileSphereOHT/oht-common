package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InformationRegistration implements Serializable {
    private long serialVersionUID = 1L;

    private String entitlementDocument;
    private String informationRegistration;
    private PeriodEntitlement periodEntitlement;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getEntitlementDocument() {
        return entitlementDocument;
    }

    public void setEntitlementDocument(final String entitlementDocument) {
        this.entitlementDocument = entitlementDocument;
    }

    public String getInformationRegistration() {
        return informationRegistration;
    }

    public void setInformationRegistration(final String informationRegistration) {
        this.informationRegistration = informationRegistration;
    }

    @JsonProperty("PeriodEntitlement")
    public PeriodEntitlement getPeriodEntitlement() {
        return periodEntitlement;
    }

    @JsonProperty("PeriodEntitlement")
    public void setPeriodEntitlement(final PeriodEntitlement periodEntitlement) {
        this.periodEntitlement = periodEntitlement;
    }
}
