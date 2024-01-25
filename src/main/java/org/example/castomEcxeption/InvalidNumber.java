package org.example.castomEcxeption;

import java.io.IOException;

public class InvalidNumber extends IOException {

    public InvalidNumber(int lenght){
        super("Проверьте данные номера телефона. Он должен содержать 11 чисел, а не " + lenght);
    }

}
