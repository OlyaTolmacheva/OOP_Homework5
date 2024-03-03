import controller.Controller;
import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        /*
        controller.createStudent("1", "1","1");
        controller.createStudent("2", "2","2");
        controller.getAllStudent();
        controller.createStudent("3", "3", "3");
        controller.createStudent("4", "4","4");
        controller.getAllStudent();
        */
        //Студенты первой группы
        Student student1 = new Student("Иванов", "Иван","Иванович", 1);
        Student student2 = new Student("Исаев", "Иса","Исаевич", 2);
        Student student3 = new Student("Иванова", "Инна","Игоревна", 3);
        //Преподаватель первой группы
        Teacher teacher1 = new Teacher("Петров", "Петр", "Петрович", 11);
        //Первая группа
        StudyGroup group1 = controller.createGroup(1, teacher1, student1, student2, student3);
        System.out.println(group1.toString());


    }
}