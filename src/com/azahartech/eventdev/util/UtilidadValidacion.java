package com.azahartech.eventdev.util;

import java.time.LocalDate;

public class UtilidadValidacion {
    public static boolean esEmailValido(String email) {
        if (email.contains("@") && !email.startsWith("@")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPuntuacionValida(int puntuacion) {
        if (puntuacion > 5 || puntuacion < 0) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean esFechaFutura(LocalDate fecha){
            if(fecha.isAfter(LocalDate.now())){
                return true;
            }else{
                return false;
            }

    }
}

