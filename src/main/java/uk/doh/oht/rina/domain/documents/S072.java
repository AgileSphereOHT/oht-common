
package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class S072 implements Serializable {
    private long serialVersionUID = 1L;

    private String sedPackage;
    private PersonAddress personAddress;
    private StatusOfPersonForWhomAnEntitlementDocument statusOfPersonForWhomAnEntitlementDocument;
    private InformationEntitlement informationEntitlement;
    private Integer sedGVer;
    private Integer sedVer;
    private Person person;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getSedPackage() {
        return sedPackage;
    }

    public void setSedPackage(final String sedPackage) {
        this.sedPackage = sedPackage;
    }

    @JsonProperty("PersonAddress")
    public PersonAddress getPersonAddress() {
        return personAddress;
    }

    @JsonProperty("PersonAddress")
    public void setPersonAddress(final PersonAddress personAddress) {
        this.personAddress = personAddress;
    }

    public Integer getSedGVer() {
        return sedGVer;
    }

    public void setSedGVer(final Integer sedGVer) {
        this.sedGVer = sedGVer;
    }

    public Integer getSedVer() {
        return sedVer;
    }

    public void setSedVer(final Integer sedVer) {
        this.sedVer = sedVer;
    }

    @JsonProperty("Person")
    public Person getPerson() {
        return person;
    }

    @JsonProperty("Person")
    public void setPerson(final Person person) {
        this.person = person;
    }

    @JsonProperty("StatusOfPersonForWhomAnEntitlementDocument")
    public StatusOfPersonForWhomAnEntitlementDocument getStatusOfPersonForWhomAnEntitlementDocument() {
        return statusOfPersonForWhomAnEntitlementDocument;
    }

    @JsonProperty("StatusOfPersonForWhomAnEntitlementDocument")
    public void setStatusOfPersonForWhomAnEntitlementDocument(final StatusOfPersonForWhomAnEntitlementDocument statusOfPersonForWhomAnEntitlementDocument) {
        this.statusOfPersonForWhomAnEntitlementDocument = statusOfPersonForWhomAnEntitlementDocument;
    }

    @JsonProperty("InformationEntitlement")
    public InformationEntitlement getInformationEntitlement() {
        return informationEntitlement;
    }

    @JsonProperty("InformationEntitlement")
    public void setInformationEntitlement(final InformationEntitlement informationEntitlement) {
        this.informationEntitlement = informationEntitlement;
    }
}
