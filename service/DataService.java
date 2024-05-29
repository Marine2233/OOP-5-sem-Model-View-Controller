package service;
import java.util.ArrayList;
import java.util.List;
import model.Type;
import model.Teacher;

import model.Student;
import model.User;

/*� Создать класс DataService с методами в по управлению сущностями User
(create, read) и агрегирующий всех пользователей заведенных в системе */
public class DataService {

    private List<User>listUsers = new ArrayList<>();


    public List<User> getListUsers() {
        return listUsers;
    }

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
 private Teacher teacher;
 public Teacher getTeacher() {return getAllTeacher();}

public Teacher getAllTeacher(){
    
    for (User user : listUsers) {
        if (user instanceof Teacher) {
            teacher = (Teacher)user;
        }  
    }return teacher;
 }
}
