package Lesson5;

import java.time.Year;
import java.util.Calendar;

public class Worker {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private int wage;
    private int birthYear;

    public Worker(String fullName1, String postion1, String email1, String number1,
                  int wage1, int age1) {
        this.fullName = fullName1;
        this.position = postion1;
        this.email = email1;
        this.number = number1;
        this.wage = wage1;
        this.birthYear = Calendar.getInstance().get(Calendar.YEAR) - age1;
    }

    public void printWorker() {
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Должность: " + this.position);
        System.out.println("Электронная почта: " + this.email);
        System.out.println("Номер телефона: " + this.number);
        System.out.println("Заработная плата: " + this.wage);
        int age = Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
        System.out.println("Возраст: " + age);
    }
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }
}
