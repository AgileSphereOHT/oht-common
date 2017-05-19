package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressMainInsuredPerson implements Serializable {
    private long serialVersionUID = 1L;

    private Address address;
    private Date residenceInThisCountrySince;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(final Address address) {
        this.address = address;
    }

    public Date getResidenceInThisCountrySince() {
        return residenceInThisCountrySince;
    }

    public void setResidenceInThisCountrySince(final Date residenceInThisCountrySince) {
        this.residenceInThisCountrySince = residenceInThisCountrySince;
    }
}
