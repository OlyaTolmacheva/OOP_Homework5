package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
public class StudyGroupService {
    public StudyGroup createNewGroup(Integer numGroup, Teacher teacherOfGroup, Student... students) {
        ArrayList<Student> studentsOfGroup = new ArrayList<>();
        for (Student student: students){
            studentsOfGroup.add(student);
        }
        return new StudyGroup(numGroup, teacherOfGroup, studentsOfGroup);
    }
}
