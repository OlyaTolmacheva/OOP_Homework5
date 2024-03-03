package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private Integer numGroup;
    private Teacher teacherOfGroup;
    private List<Student> studentsOfGroup;

    public StudyGroup(Integer numGroup, Teacher teacherOfGroup, List<Student> studentsOfGroup) {
        this.numGroup = numGroup;
        this.teacherOfGroup = teacherOfGroup;
        this.studentsOfGroup = studentsOfGroup;

    }
    public Teacher getTeacherOfGroup() {
        return teacherOfGroup;
    }

    public List<Student> getStudentsOfGroup() {
        return studentsOfGroup;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "numGroup=" + numGroup +
                ", teacherOfGroup=" + teacherOfGroup +
                ", studentsOfGroup=" + studentsOfGroup +
                '}';
    }
}
