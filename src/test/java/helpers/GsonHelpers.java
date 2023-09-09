package helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Project;

public class GsonHelpers {
    private static Gson gson = new Gson();

    public GsonHelpers() {
        /*gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();*/
    }


    public static Project getProjectFromJson(String json){
        return gson.fromJson(json, Project.class);
    }


}
