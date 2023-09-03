package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;


@Data
public class Project {

    @SerializedName(value = "name")
    @JsonProperty("name")
    private String projectName;

    private String announcement;

    @SerializedName(value = "show_announcement")
    @JsonProperty("show_announcement")
    private boolean flag;

    @SerializedName(value = "suite_mode")
    @JsonProperty("suite_mode")
    private int projectType;

}