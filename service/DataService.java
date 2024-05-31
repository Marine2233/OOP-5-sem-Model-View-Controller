package service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Type;
import model.Teacher;

import model.Student;
import model.User;

/*� Создать класс DataService с методами в по управлению сущностями User
(create, read) и агрегирующий всех пользователей заведенных в системе */
public class DataService {

    private List<User>listUsers = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public List<User> getListUsers() {return listUsers;}

    public void creat(String fName, String name, String lastName,Type type ){
       int id = getId(type);
        if (Type.Student==type) {
            Student student = new Student(id, fName, name, lastName);
            listUsers.add(student); 
        }

        if(Type.Teacher == type){
            Teacher teacher = new Teacher(id, fName, name, lastName);
            listUsers.add(teacher);
        }
    }
 private int getId(Type type){
    int id = 0;
    for (User user : listUsers) {
        if(user instanceof Teacher && Type.Teacher == type){
            id = ((Teacher)user).getTeacherId();
        }
        if(user instanceof Student && Type.Student == type){
            id = ((Student )user).getStudentId();
        }
    }return ++id;
 }

 public List<Student> getAllStudent(){
    List<Student>listUser = new ArrayList<>();
    for (User user : listUsers) {
        if(user instanceof Student){
            listUser.add((Student)user);
        }
    }
    return listUser;
 }

 public Teacher getTeacher(){
    for (Teacher teacher: getAllTeacher()) {
        System.out.println("Введите ID преподавателя: ");
        int id = sc.nextInt();
        if(teacher.getTeacherId() == id){
            return teacher;
        } 
    }return null;
 }

public List<Teacher> getAllTeacher(){
    List<Teacher>listTeacher = new ArrayList<>();
    for (User user : listUsers) {
        if (user instanceof Teacher) {
            listTeacher.add((Teacher)user);
        }  
    }return listTeacher;
 }
 public void modyfyFName(){
    System.out.println("Введите фамилию преподавателя: ");
    for (User user: listUsers) {
        String consol = sc.nextLine();
        if (user instanceof Teacher && user.getfName().equalsIgnoreCase(consol)) {
            String newFname = "";
            System.out.println("Введите новую фамилию: ");
            newFname =sc.nextLine();
            user.setfName(newFname);  
        }   
    }
}
public void modyfyName(){
    System.out.println("Введите имя преподавателя: ");
    String consol = sc.nextLine();
    for (User user: listUsers) {
        if (user instanceof Teacher && user.getName() == consol) {
            System.out.println("Введите новое имя: ");
            consol = sc.nextLine();
            user.setName(consol);  
        }   
    }
}
public void modyfyLastName(){
    System.out.println("Введите отчество преподавателя: ");
    String consol = sc.nextLine();
    for (User user: listUsers) {
        if (user instanceof Teacher && user.getLastName() == consol) {
            System.out.println("Введите новоое отчество: ");
            consol = sc.nextLine();
            user.setLastName(consol);
              
        }   
    }
}
}
