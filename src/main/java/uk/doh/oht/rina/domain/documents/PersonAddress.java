package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonAddress implements Serializable {
    private long serialVersionUID = 1L;

    private Address address;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
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
}
