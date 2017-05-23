package uk.doh.oht.rina.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import uk.doh.oht.rina.domain.common.Properties;
import uk.doh.oht.rina.domain.documents.Address;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by peterwhitehead on 03/05/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenCaseSearchResult implements Serializable {
    private long serialVersionUID = 1L;

    private String processDefinitionId;
    private Traits traits;
    private String id;
    private String applicationRoleId;
    private Properties properties;
    private String status;
    private Date dueDate;
    private String countryCode;
    private String countryDescription;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Traits implements Serializable {
        private long serialVersionUID = 1L;

        private Address address;
        private String gender;
        private Date birthday;
        private String localPin;
        private String surname;
        private String caseId;
        private String name;
        private String flowType;
        private String status;
    }

    @JsonIgnore
    public String getFormattedAddress() {
        final StringBuilder stringBuilder = new StringBuilder();
        final Address address = traits.getAddress();
        if (address.getStreet() != null) { stringBuilder.append(address.getStreet()).append("<br>"); }
        if (address.getTown() != null) { stringBuilder.append(address.getTown()).append("<br>"); }
        if (address.getRegion() != null) { stringBuilder.append(address.getRegion()).append("<br>"); }
        if (address.getPostalCode() != null) { stringBuilder.append(address.getPostalCode()).append("<br>"); }
        if (countryDescription != null) { stringBuilder.append(countryDescription).append("<br>"); }
        return StringUtils.removeEnd(stringBuilder.toString(), "<br>");
    }
}
