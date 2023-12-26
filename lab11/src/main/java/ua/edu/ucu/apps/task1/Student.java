package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Singular;
import lombok.experimental.SuperBuilder;
import lombok.ToString;

@ToString(callSuper = true)
@SuperBuilder
public class Student extends User {
    @Singular ("mark")
    private List<Integer> grades;
}
