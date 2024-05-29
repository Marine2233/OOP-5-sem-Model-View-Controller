package service;

import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;
/* Создать класс УчебнаяГруппаСервис, в котором реализована функция 
(входные параметры - (Teacher, List<Student>))
 формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его; */
public class StudentGroupService {

    private StudentGroup sg;
    
    public StudentGroup getSg() {
        return sg;
    }

    public StudentGroup creatSG(Teacher teacher, List<Student>listStudents){
        sg = new StudentGroup(teacher, listStudents);
        return sg;
        
    }
}
