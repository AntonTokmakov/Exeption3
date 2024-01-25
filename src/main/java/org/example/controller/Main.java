package org.example.controller;

import org.example.castomEcxeption.InvalidArgumentsFirstLastName;
import org.example.castomEcxeption.InvalidData;
import org.example.castomEcxeption.InvalidMale;
import org.example.castomEcxeption.InvalidNumber;
import org.example.model.FileWriterWin;
import org.example.model.impl.FileWriterImpl;
import org.example.validDate.ValidDate;
import org.example.view.impl.ConsoleReadImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileWriterWin writer = new FileWriterImpl();
        ConsoleReadImpl date = new ConsoleReadImpl();
        ValidDate valid = new ValidDate();


        while (true) {
            ArrayList<String> list = new ArrayList<>(Arrays.asList(date.getData()));

            if (list.size() != 4) {
                try {
                    throw new IOException("Неверное количество данных, попробуйте ещё раз.");
                } catch (IOException e) {
                    System.out.println(e);
                    continue;
                }
            }
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.contains("_"))
                        return 1;
                    if (o2.contains("_"))
                        return 1;
                    if (o1.length() < o2.length())
                        return 1;
                    if (o1.length() > o2.length())
                        return -1;
                    return 0;
                }
            });

            try {
                valid.validFirstLastName(list.get(0));
                valid.validNumber(list.get(1));
                valid.validBirthday(list.get(2));
                valid.validMale(list.get(3));
            } catch (InvalidArgumentsFirstLastName e) {
                System.out.println(e);
            } catch (InvalidData e) {
                System.out.println(e);
            } catch (InvalidNumber e) {
                System.out.println(e);
            } catch (InvalidMale e) {
                System.out.println(e);
            }

//            try {
//                Files.write(Paths.get("data"), );
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

//            File file = new File("C:\\Users\\Anton\\Downloads\\pr");
            try (FileWriter writer1 = new FileWriter("result.txt", true)) {
                writer1.append(String.join(" ", list));
            } catch (IOException e) {
                System.out.println(e.getStackTrace());
            }

        }
    }
}
