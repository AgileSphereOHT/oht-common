package uk.doh.oht.db.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import uk.doh.oht.validation.StartDateFormDate;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by peterwhitehead on 04/05/2017.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationData implements Serializable {
    private long registrationId;
    private UserDetails userDetails;
    private List<Address> addresses;
    private String benefitType;
    private String issueType;
    private String registrationStatus;
    private String country;
    private Date entitlementDate;
    private StartDateFormDate startDate;
    private String hasForeignPension;
    private String requestedBy;
    private Date dueDate;
    private StartDateFormDate s073StartDate;
    private String caseId;
    private String modifiedByUserId;

    @JsonIgnore
    public String getForeignAddress() {
        return getAddress("Foreign");
    }

    @JsonIgnore
    public String getCurrentAddress() {
        return getAddress("National");
    }

    @JsonIgnore
    public String getAddress(final String addressType) {
        for (final Address address : addresses) {
            if (addressType.equalsIgnoreCase(address.getType())) {
                return formatAddress(address);
            }
        }
        return null;
    }

    @JsonIgnore
    private String formatAddress(final Address address) {
        final StringBuilder stringBuilder = new StringBuilder();
        try {
            if (address.getLineOne() != null) {
                stringBuilder.append(Integer.valueOf(address.getLineOne().trim())).append(" ");
            }
        } catch (NumberFormatException e) {
            if (address.getLineOne() != null) { stringBuilder.append(address.getLineOne()).append("<br>"); }
        }
        if (address.getLineTwo() != null) { stringBuilder.append(address.getLineTwo()).append("<br>"); }
        if (address.getLineThree() != null) { stringBuilder.append(address.getLineThree()).append("<br>"); }
        if (address.getLineFour() != null) { stringBuilder.append(address.getLineFour()).append("<br>"); }
        if (address.getLineFive() != null) { stringBuilder.append(address.getLineFive()).append("<br>"); }
        if (address.getLineSix() != null) { stringBuilder.append(address.getLineSix()).append("<br>"); }
        if (address.getPostcode() != null) { stringBuilder.append(address.getPostcode()).append("<br>"); }
        if (address.getCountry() != null) { stringBuilder.append(address.getCountry()).append("<br>"); }
        return StringUtils.removeEnd(stringBuilder.toString(), "<br>");
    }
}
