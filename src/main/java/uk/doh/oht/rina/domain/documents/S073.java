
package uk.doh.oht.rina.domain.documents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.sql.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class S073 implements Serializable {
    private long serialVersionUID = 1L;

    private Status status;
    private String sedPackage;
    private Address address;
    private InformationRegistration informationRegistration;
    private Integer sedGVer;
    private ConcernsDocument concernsDocument;
    private PeriodEntitlement periodEntitlement;
    private Integer sedVer;
    private Person person;

    private String personFamilyName;
    private String personForename;
    private Date personDateBirth;
    private String personSex;
    private String personFamilyNameAtBirth;
    private String personForenameAtBirth;
    private PINPersonInEachInstitution pINPersonInEachInstitution;
    private IfPINNotProvidedForAnyInstitutionPleaseProvide ifPINNotProvidedForAnyInstitutionPleaseProvide;
    private AdditionalInformationPerson additionalInformationPerson;
    private AddressOfPersonForWhomAnEntitlementDocumentRequete addressOfPersonForWhomAnEntitlementDocumentRequete;
    private InsuredPerson insuredPerson;
    private AddressMainInsuredPerson addressMainInsuredPerson;
    private StartingEndingDateRegistration startingEndingDateRegistration;
    private ReasonForRefusalRegistration reasonForRefusalRegistration;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(final long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(final Status status) {
        this.status = status;
    }

    public String getSedPackage() {
        return sedPackage;
    }

    public void setSedPackage(final String sedPackage) {
        this.sedPackage = sedPackage;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(final Address address) {
        this.address = address;
    }

    @JsonProperty("InformationRegistration")
    public InformationRegistration getInformationRegistration() {
        return informationRegistration;
    }

    @JsonProperty("InformationRegistration")
    public void setInformationRegistration(final InformationRegistration informationRegistration) {
        this.informationRegistration = informationRegistration;
    }

    public Integer getSedGVer() {
        return sedGVer;
    }

    public void setSedGVer(final Integer sedGVer) {
        this.sedGVer = sedGVer;
    }

    @JsonProperty("ConcernsDocument")
    public ConcernsDocument getConcernsDocument() {
        return concernsDocument;
    }

    @JsonProperty("ConcernsDocument")
    public void setConcernsDocument(final ConcernsDocument concernsDocument) {
        this.concernsDocument = concernsDocument;
    }

    @JsonProperty("PeriodEntitlement")
    public PeriodEntitlement getPeriodEntitlement() {
        return periodEntitlement;
    }

    @JsonProperty("PeriodEntitlement")
    public void setPeriodEntitlement(final PeriodEntitlement periodEntitlement) {
        this.periodEntitlement = periodEntitlement;
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

    @JsonProperty("AddressOfPersonForWhomAnEntitlementDocumentRequete")
    public AddressOfPersonForWhomAnEntitlementDocumentRequete getAddressOfPersonForWhomAnEntitlementDocumentRequete() {
        return addressOfPersonForWhomAnEntitlementDocumentRequete;
    }

    @JsonProperty("AddressOfPersonForWhomAnEntitlementDocumentRequete")
    public void setAddressOfPersonForWhomAnEntitlementDocumentRequete(final AddressOfPersonForWhomAnEntitlementDocumentRequete addressOfPersonForWhomAnEntitlementDocumentRequete) {
        this.addressOfPersonForWhomAnEntitlementDocumentRequete = addressOfPersonForWhomAnEntitlementDocumentRequete;
    }

    @JsonProperty("InsuredPerson")
    public InsuredPerson getInsuredPerson() {
        return insuredPerson;
    }

    @JsonProperty("InsuredPerson")
    public void setInsuredPerson(final InsuredPerson insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    @JsonProperty("AddressMainInsuredPerson")
    public AddressMainInsuredPerson getAddressMainInsuredPerson() {
        return addressMainInsuredPerson;
    }

    @JsonProperty("AddressMainInsuredPerson")
    public void setAddressMainInsuredPerson(final AddressMainInsuredPerson addressMainInsuredPerson) {
        this.addressMainInsuredPerson = addressMainInsuredPerson;
    }

    @JsonProperty("StartingEndingDateRegistration")
    public StartingEndingDateRegistration getStartingEndingDateRegistration() {
        return startingEndingDateRegistration;
    }

    @JsonProperty("StartingEndingDateRegistration")
    public void setStartingEndingDateRegistration(final StartingEndingDateRegistration startingEndingDateRegistration) {
        this.startingEndingDateRegistration = startingEndingDateRegistration;
    }

    @JsonProperty("ReasonForRefusalRegistration")
    public ReasonForRefusalRegistration getReasonForRefusalRegistration() {
        return reasonForRefusalRegistration;
    }

    @JsonProperty("ReasonForRefusalRegistration")
    public void setReasonForRefusalRegistration(final ReasonForRefusalRegistration reasonForRefusalRegistration) {
        this.reasonForRefusalRegistration = reasonForRefusalRegistration;
    }
}
