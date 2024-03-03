package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;
import model.TypeUser;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudyGroupService studyGroupService = new StudyGroupService();
    StudentView studentView = new StudentView();
    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, TypeUser.STUDENT);
    }
    public void getAllStudent() {
        studentView.printOnConsoleArr(dataService.getAllStudent());
    }

    public StudyGroup createGroup(Integer numGroup, Teacher teacher, Student... students) {
        return studyGroupService.createNewGroup(numGroup, teacher, students);
    }


}
