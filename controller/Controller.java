package controller;
import java.util.List;
// import java.util.Scanner;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.StudentGroupService;

import view.StudentView;
/*— Создать метод в Контроллере, в котором агрегируются функции
 получения списка студентов (их id) и преподавателя (его id)
 и формирования учебной группы, путём вызова метода из сервиса; */
import view.TeacherView;

public class Controller {
    // private Scanner sc;
   private StudentView sw = new StudentView();
   private TeacherView teacherView = new TeacherView();
   private DataService dataService = new DataService();
   private StudentGroupService service = new StudentGroupService();


   public void modyfy(){
    System.out.println("Изменение данных: \n");
    dataService.modyfyFName();
    // dataService.modyfyName();
    // dataService.modyfyLastName();
   }

   public void getStudGroup(){
    
    List<Student>listUserST = dataService.getAllStudent();
    printTeacher();
    Teacher teacher = dataService.getTeacher();
    service.creatSG(teacher,listUserST);
    System.out.println(teacher);
    printStudents();
    

   }

   public void creatTeacher(String fName, String name, String lastName){
    dataService.creat(fName, name, lastName, Type.Teacher);
   }

   public void createStudent(String fName, String name, String lastName){
    dataService.creat(fName, name, lastName, Type.Student);
   }

    public void printStudents(){
        for (User user : dataService.getAllStudent()) {
            sw.printOnConsole((Student)user);
        }
    }

    public void printTeacher(){
        for(User user: dataService.getAllTeacher()){
            teacherView.printTeacher((Teacher)user);
        }
    }
}
