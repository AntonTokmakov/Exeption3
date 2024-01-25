package org.example.view.impl;

import java.util.Scanner;

public class ConsoleReadImpl {

    public String[] getData(){
        System.out.println("Введите Фамилия_Имя_Отчество дата_рождения номер_телефона пол");
        System.out.println("Пример: Токмаков_Антон_Константинович 89618624647 19.01.2000 f");
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().trim().toLowerCase().split(" ");
        return data;
    }
}
