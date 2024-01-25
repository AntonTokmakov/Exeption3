package org.example.castomEcxeption;

import java.io.IOException;

public class InvalidArgumentsFirstLastName extends IOException {

    public InvalidArgumentsFirstLastName(){
        super("Ошибка: Проверьте корректность ввода ФИО. Не все аргументы присутствуют.");
    }

}
