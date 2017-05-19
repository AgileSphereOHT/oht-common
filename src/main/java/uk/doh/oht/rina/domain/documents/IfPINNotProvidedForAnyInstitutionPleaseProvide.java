package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IfPINNotProvidedForAnyInstitutionPleaseProvide implements Serializable {
    private long serialVersionUID = 1L;

    private PlaceBirth placeBirth;
    private String fatherFamilyNameAtBirth;
    private String forenameFather;
    private String motherFamilyNameAtBirth;
    private String forenameMother;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("PlaceBirth")
    public PlaceBirth getPlaceBirth() {
        return placeBirth;
    }

    @JsonProperty("PlaceBirth")
    public void setPlaceBirth(final PlaceBirth placeBirth) {
        this.placeBirth = placeBirth;
    }

    public String getFatherFamilyNameAtBirth() {
        return fatherFamilyNameAtBirth;
    }

    public void setFatherFamilyNameAtBirth(final String fatherFamilyNameAtBirth) {
        this.fatherFamilyNameAtBirth = fatherFamilyNameAtBirth;
    }

    public String getForenameFather() {
        return forenameFather;
    }

    public void setForenameFather(final String forenameFather) {
        this.forenameFather = forenameFather;
    }

    public String getMotherFamilyNameAtBirth() {
        return motherFamilyNameAtBirth;
    }

    public void setMotherFamilyNameAtBirth(final String motherFamilyNameAtBirth) {
        this.motherFamilyNameAtBirth = motherFamilyNameAtBirth;
    }

    public String getForenameMother() {
        return forenameMother;
    }

    public void setForenameMother(final String forenameMother) {
        this.forenameMother = forenameMother;
    }
}
