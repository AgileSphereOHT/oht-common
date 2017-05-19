package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PINPersonInEachInstitution implements Serializable {
    private long serialVersionUID = 1L;

    private List<PersonIdentificationNumber> personIdentificationNumberList = new ArrayList<>();

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("PersonIdentificationNumberList")
    public List<PersonIdentificationNumber> getPersonIdentificationNumberList() {
        return personIdentificationNumberList;
    }

    @JsonProperty("PersonIdentificationNumberList")
    public void setPersonIdentificationNumberList(final List<PersonIdentificationNumber> personIdentificationNumberList) {
        this.personIdentificationNumberList = personIdentificationNumberList;
    }
}