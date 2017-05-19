package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person implements Serializable {
    private long serialVersionUID = 1L;

    private AdditionalInformationPerson additionalInformationPerson;
    private PersonIdentification personIdentification;
    private PINPersonInEachInstitution pINPersonInEachInstitution;
    private IfPINNotProvidedForAnyInstitutionPleaseProvide ifPINNotProvidedForAnyInstitutionPleaseProvide;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("AdditionalInformationPerson")
    public AdditionalInformationPerson getAdditionalInformationPerson() {
        return additionalInformationPerson;
    }

    @JsonProperty("AdditionalInformationPerson")
    public void setAdditionalInformationPerson(final AdditionalInformationPerson additionalInformationPerson) {
        this.additionalInformationPerson = additionalInformationPerson;
    }

    @JsonProperty("PersonIdentification")
    public PersonIdentification getPersonIdentification() {
        return personIdentification;
    }

    @JsonProperty("PersonIdentification")
    public void setPersonIdentification(final PersonIdentification personIdentification) {
        this.personIdentification = personIdentification;
    }

    @JsonProperty("PINPersonInEachInstitution")
    public PINPersonInEachInstitution getPINPersonInEachInstitution() {
        return pINPersonInEachInstitution;
    }

    @JsonProperty("PINPersonInEachInstitution")
    public void setPINPersonInEachInstitution(final PINPersonInEachInstitution pINPersonInEachInstitution) {
        this.pINPersonInEachInstitution = pINPersonInEachInstitution;
    }

    @JsonProperty("IfPINNotProvidedForAnyInstitutionPleaseProvide")
    public IfPINNotProvidedForAnyInstitutionPleaseProvide getIfPINNotProvidedForAnyInstitutionPleaseProvide() {
        return ifPINNotProvidedForAnyInstitutionPleaseProvide;
    }

    @JsonProperty("IfPINNotProvidedForAnyInstitutionPleaseProvide")
    public void setIfPINNotProvidedForAnyInstitutionPleaseProvide(final IfPINNotProvidedForAnyInstitutionPleaseProvide ifPINNotProvidedForAnyInstitutionPleaseProvide) {
        this.ifPINNotProvidedForAnyInstitutionPleaseProvide = ifPINNotProvidedForAnyInstitutionPleaseProvide;
    }
}

