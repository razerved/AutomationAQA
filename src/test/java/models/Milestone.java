package models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Milestone {

    private String name;

    public Milestone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
