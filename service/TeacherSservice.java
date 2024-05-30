package service;

import java.util.Scanner;

import model.Teacher;
import model.User;

public class TeacherSservice {
// private Scanner sc;
private DataService dataService;
private Scanner sc = new Scanner(System.in);


public void removeFName(){
    // Scanner sc = new Scanner(System.in);
    System.out.println("Введите фамилию преподавателя: ");
    String consol = sc.nextLine();
    for (User user: dataService.getListUsers()) {
        if (user instanceof Teacher && user.getfName() == consol) {
            System.out.println("Введите новую фамилию: ");
            consol = sc.nextLine();
            user.setfName(consol);  
        }   
    }
}
public void removeName(){
    // Scanner sc = new Scanner(System.in);

    System.out.println("Введите имя преподавателя: ");
    String consol = sc.nextLine();
    for (User user: dataService.getListUsers()) {
        if (user instanceof Teacher && user.getName() == consol) {
            System.out.println("Введите новое имя: ");
            consol = sc.nextLine();
            user.setName(consol);  
        }   
    }
}
public void removeLastName(){
    // Scanner sc = new Scanner(System.in);

    System.out.println("Введите отчество преподавателя: ");
    String consol = sc.nextLine();
    for (User user: dataService.getListUsers()) {
        if (user instanceof Teacher && user.getLastName() == consol) {
            System.out.println("Введите новоое отчество: ");
            consol = sc.nextLine();
            user.setLastName(consol);  
        }   
    }
}
}
    

