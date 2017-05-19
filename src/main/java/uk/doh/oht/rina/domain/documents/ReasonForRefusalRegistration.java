package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by peterwhitehead on 18/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReasonForRefusalRegistration implements Serializable {
    private long serialVersionUID = 1L;

    private String reason;
    private int choiceSelect = -1;
    private PleaseFillInFollowingIfReasonInsuredEmployedOrSelf pleaseFillInFollowingIfReasonInsuredEmployedOrSelf;
    private String pleaseFillInFollowingIfReasonOtherReason;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public int getChoiceSelect() {
        return choiceSelect;
    }

    public void setChoiceSelect(int choiceSelect) {
        this.choiceSelect = choiceSelect;
    }

    @JsonProperty("PleaseFillInFollowingIfReasonInsuredEmployedOrSelf")
    public PleaseFillInFollowingIfReasonInsuredEmployedOrSelf getPleaseFillInFollowingIfReasonInsuredEmployedOrSelf() {
        return pleaseFillInFollowingIfReasonInsuredEmployedOrSelf;
    }

    @JsonProperty("PleaseFillInFollowingIfReasonInsuredEmployedOrSelf")
    public void setPleaseFillInFollowingIfReasonInsuredEmployedOrSelf(final PleaseFillInFollowingIfReasonInsuredEmployedOrSelf pleaseFillInFollowingIfReasonInsuredEmployedOrSelf) {
        this.pleaseFillInFollowingIfReasonInsuredEmployedOrSelf = pleaseFillInFollowingIfReasonInsuredEmployedOrSelf;
    }

    public String getPleaseFillInFollowingIfReasonOtherReason() {
        return pleaseFillInFollowingIfReasonOtherReason;
    }

    public void setPleaseFillInFollowingIfReasonOtherReason(final String pleaseFillInFollowingIfReasonOtherReason) {
        this.pleaseFillInFollowingIfReasonOtherReason = pleaseFillInFollowingIfReasonOtherReason;
    }
}
