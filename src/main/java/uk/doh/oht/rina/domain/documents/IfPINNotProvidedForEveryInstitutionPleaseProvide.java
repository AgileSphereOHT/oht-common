package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IfPINNotProvidedForEveryInstitutionPleaseProvide implements Serializable {
    private long serialVersionUID = 1L;

    private PlaceBirth placeBirth;

    @JsonProperty("PlaceBirth")
    public PlaceBirth getPlaceBirth() {
        return placeBirth;
    }

    @JsonProperty("PlaceBirth")
    public void setPlaceBirth(final PlaceBirth placeBirth) {
        this.placeBirth = placeBirth;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }
}
