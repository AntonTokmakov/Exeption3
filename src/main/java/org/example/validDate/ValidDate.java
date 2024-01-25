package org.example.validDate;

import org.example.castomEcxeption.InvalidArgumentsFirstLastName;
import org.example.castomEcxeption.InvalidData;
import org.example.castomEcxeption.InvalidMale;
import org.example.castomEcxeption.InvalidNumber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class ValidDate {

    public void validFirstLastName(String fio) throws InvalidArgumentsFirstLastName {

        String[] parsFio = fio
                .trim()
                .toLowerCase()
                .split("_");
        if (parsFio.length != 3){
            throw new InvalidArgumentsFirstLastName();
        }
    }

    public void validNumber(String number) throws InvalidNumber {
        number = number.replace("+7", "8");
        if (number.length() != 11){
            throw new InvalidNumber(number.length());
        }
    }

    public void validBirthday(String birthdayString) throws InvalidData {
        LocalDate birthday;
        try {
            birthday = LocalDate.parse(birthdayString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e){
            throw new InvalidData();
        }
        LocalDate minDate = LocalDate.of(1900, 11, 11);
        LocalDate maxDate = LocalDate.now().minusYears(4);

        if (birthday.isBefore(minDate) || birthday.isAfter(maxDate)) {
            throw new IllegalArgumentException("Дата рождения должна быть между 11.11.1900 и " + maxDate);
        }
    }

    public void validMale(String inputMale) throws InvalidMale {
        Character[] masChar = new Character[] {'f', 'm'};
        Boolean isFlag = false;
        for (char male: masChar){
            if (inputMale.equals(male)){
                isFlag = true;
            }
        }
        if (isFlag){
            throw new InvalidMale();
        }
    }
}
