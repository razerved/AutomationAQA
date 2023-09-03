package models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Projects {
    private int offset;
    private int limit;
    private int size;
    private Project[] projects;

}
