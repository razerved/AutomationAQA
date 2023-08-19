package steps;

import baseEntities.BaseStep;
import models.Project;

public class ProjectStep extends BaseStep {
    public ProjectStep() {
        super();
    }

    public void AddProject(Project project) {
        addProjectPage.openPageByUrl();

        addProjectPage.getNameInput().sendKeys(project.getProjectName());
        addProjectPage.getAnnouncementTextArea().sendKeys(project.getAnnouncement());

        addProjectPage.getShowAnnouncement().setFlag(project.isFlag());
        addProjectPage.getProjectType().selectByIndex(project.getProjectType());
        addProjectPage.getProjectType().selectByText("Use multiple test suites to manage cases");
        addProjectPage.getProjectType().selectByValue("1");
    }

}
