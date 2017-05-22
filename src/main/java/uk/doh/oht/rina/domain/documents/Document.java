package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document implements Serializable {
    private long serialVersionUID = 1L;

    private S073 s073;

    private S072 s072;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("S073")
    public S073 getS073() {
        return s073;
    }

    @JsonProperty("S073")
    public void setS073(final S073 s073) {
        this.s073 = s073;
    }

    @JsonProperty("S072")
    public S072 getS072() {
        return s072;
    }

    @JsonProperty("S072")
    public void setS072(S072 s072) {
        this.s072 = s072;
    }
}
