package org.example.castomEcxeption;

import java.io.IOException;

public class InvalidData extends IOException {
    public InvalidData(){
        super("Введенная дата не соответствует формату dd.MM.yyyy");
    }
}
