package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Project {
    private String projectName;
    private String announcement;
    private boolean flag;
    private int projectType;
    private Date date;
    private Milestone milestone;

    public Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public Date getDate() {
        return date;
    }




    public static class Builder{
        private Project newProject;

        public Builder() {
            this.newProject = newProject;
        }

        public Builder withProjectName(String projectName){
            newProject.projectName = projectName;
            return this;
        }

        public Builder withAnnouncement(String announcement) {
            newProject.announcement = announcement;
            return this;
        }

        public Builder withFlag(boolean flag) {
            newProject.flag = flag;
            return this;
        }

        public Builder withProjectType(int projectType) {
            newProject.projectType = projectType;
            return this;
        }

        public Project build() {
            return newProject;
        }


    }



}