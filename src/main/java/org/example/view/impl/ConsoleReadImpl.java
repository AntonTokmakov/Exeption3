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

//    @Override
//    public String getFirstLastName()  {
//        System.out.println("Введите фамилию, имя и отчество");
//        System.out.println("Пример: Токмаков Антон Константинович");
//        return scan.nextLine();
//    }
//
//    @Override
//    public String getNumber() {
//        System.out.println("Введите номер телефона");
//        System.out.println("Пример: 89618624647 или +79618624647");
//        return scan.nextLine();
//    }
//
//    @Override
//    public String getBirthday() {
//        System.out.println("Введите дату рождения");
//        System.out.println("Пример: 19.01.2000");
//        return scan.nextLine();
//    }
//
//    @Override
//    public String getMale() {
//        System.out.println("Введите ваш пол");
//        System.out.println("Пример: f или m");
//        return scan.nextLine();
//    }
}
