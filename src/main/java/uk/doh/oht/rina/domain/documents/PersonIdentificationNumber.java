package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonIdentificationNumber implements Serializable {
    private long serialVersionUID = 1L;

    private String country;
    private Institution institution;
    private String sector;
    private String personIdentificationNumber;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    @JsonProperty("Institution")
    public Institution getInstitution() {
        return institution;
    }

    @JsonProperty("Institution")
    public void setInstitution(final Institution institution) {
        this.institution = institution;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(final String sector) {
        this.sector = sector;
    }

    public String getPersonIdentificationNumber() {
        return personIdentificationNumber;
    }

    public void setPersonIdentificationNumber(final String personIdentificationNumber) {
        this.personIdentificationNumber = personIdentificationNumber;
    }
}
