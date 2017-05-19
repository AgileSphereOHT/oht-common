package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InsuredPerson implements Serializable {
    private long serialVersionUID = 1L;

    private String personFamilyName;
    private String personForename;
    private Date personDateBirth;
    private String personSex;
    private String personFamilyNameAtBirth;
    private String personForenameAtBirth;
    private PINPersonInEachInstitution pINPersonInEachInstitution;
    private IfPINNotProvidedForAnyInstitutionPleaseProvide ifPINNotProvidedForAnyInstitutionPleaseProvide;
    private AdditionalInformationPerson additionalInformationPerson;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getPersonFamilyName() {
        return personFamilyName;
    }

    public void setPersonFamilyName(final String personFamilyName) {
        this.personFamilyName = personFamilyName;
    }

    public String getPersonForename() {
        return personForename;
    }

    public void setPersonForename(final String personForename) {
        this.personForename = personForename;
    }

    public Date getPersonDateBirth() {
        return personDateBirth;
    }

    public void setPersonDateBirth(final Date personDateBirth) {
        this.personDateBirth = personDateBirth;
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(final String personSex) {
        this.personSex = personSex;
    }

    public String getPersonFamilyNameAtBirth() {
        return personFamilyNameAtBirth;
    }

    public void setPersonFamilyNameAtBirth(final String personFamilyNameAtBirth) {
        this.personFamilyNameAtBirth = personFamilyNameAtBirth;
    }

    public String getPersonForenameAtBirth() {
        return personForenameAtBirth;
    }

    public void setPersonForenameAtBirth(final String personForenameAtBirth) {
        this.personForenameAtBirth = personForenameAtBirth;
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

    @JsonProperty("AdditionalInformationPerson")
    public AdditionalInformationPerson getAdditionalInformationPerson() {
        return additionalInformationPerson;
    }

    @JsonProperty("AdditionalInformationPerson")
    public void setAdditionalInformationPerson(final AdditionalInformationPerson additionalInformationPerson) {
        this.additionalInformationPerson = additionalInformationPerson;
    }
}

