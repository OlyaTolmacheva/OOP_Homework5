package service;

import model.Student;
import model.Teacher;
import model.TypeUser;
import model.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    List<User> users = new ArrayList<>();
    public void create(String firstName, String secondName, String lastName, TypeUser type) {
        int id = getFreeId(type);
        if (type == TypeUser.STUDENT)
            users.add(new Student(firstName, secondName,lastName, id));
        else if (type == TypeUser.TEACHER)
            users.add(new Teacher(firstName, secondName,lastName, id));
    }
    private int getFreeId(TypeUser typeUser) {
        for (int i = users.size()-1; i >= 0 ; i--) {
            User user = users.get(i);
            if (user instanceof Student && typeUser == typeUser.STUDENT)
                return ((Student)user).getStudentId()+1;
            if (user instanceof Teacher && typeUser == typeUser.TEACHER)
                return ((Teacher)user).getTeacherId()+1;
        }
        return 1; //если за цикл не было return, значит, ни студент, ни учитель еще не создан, этот первый и id=1
    }
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                students.add((Student)user);
        }
        return students;
    }
}
