package uk.doh.oht.rina.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import uk.doh.oht.rina.domain.common.Properties;

import java.io.Serializable;

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
    private String dueDate;
    private String countryCode;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Traits implements Serializable {
        private long serialVersionUID = 1L;

        private String birthday;
        private String localPin;
        private String surname;
        private String caseId;
        private String name;
        private String flowType;
        private String status;
    }
}
