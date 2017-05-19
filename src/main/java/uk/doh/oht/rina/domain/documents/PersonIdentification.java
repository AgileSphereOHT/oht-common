package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonIdentification implements Serializable {
    private long serialVersionUID = 1L;

    private String familyName;
    private String forename;
    private String sex;
    private PINPersonInEachInstitution pinPersonInEachInstitution;
    private IfPINNotProvidedForEveryInstitutionPleaseProvide ifPINNotProvidedForEveryInstitutionPleaseProvide;
    private Date dateBirth;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(final String familyName) {
        this.familyName = familyName;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(final String forename) {
        this.forename = forename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(final String sex) {
        this.sex = sex;
    }

    @JsonProperty("PINPersonInEachInstitution")
    public PINPersonInEachInstitution getPinPersonInEachInstitution() {
        return pinPersonInEachInstitution;
    }

    @JsonProperty("PINPersonInEachInstitution")
    public void setPinPersonInEachInstitution(final PINPersonInEachInstitution pinPersonInEachInstitution) {
        this.pinPersonInEachInstitution = pinPersonInEachInstitution;
    }

    @JsonProperty("IfPINNotProvidedForEveryInstitutionPleaseProvide")
    public IfPINNotProvidedForEveryInstitutionPleaseProvide getIfPINNotProvidedForEveryInstitutionPleaseProvide() {
        return ifPINNotProvidedForEveryInstitutionPleaseProvide;
    }

    @JsonProperty("IfPINNotProvidedForEveryInstitutionPleaseProvide")
    public void setIfPINNotProvidedForEveryInstitutionPleaseProvide(final IfPINNotProvidedForEveryInstitutionPleaseProvide ifPINNotProvidedForEveryInstitutionPleaseProvide) {
        this.ifPINNotProvidedForEveryInstitutionPleaseProvide = ifPINNotProvidedForEveryInstitutionPleaseProvide;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(final Date dateBirth) {
        this.dateBirth = dateBirth;
    }
}
