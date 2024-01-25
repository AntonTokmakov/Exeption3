package org.example.castomEcxeption;

import java.io.IOException;

public class InvalidMale extends IOException {

    public InvalidMale(){
        super("Проверьте корректность выбранного пола.\nПример: f");
    }

}
