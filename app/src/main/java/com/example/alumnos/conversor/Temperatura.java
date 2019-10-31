package com.example.alumnos.conversor;

import android.util.Log;

public class Temperatura {
    static public float CambioTemperatura(int PosicionSpinner1, int PosicionSpinner2, float UTransFloat) {
        float solucion = 1;

        switch (PosicionSpinner1) {

            case 0://Celsius
                solucion = Celsius(UTransFloat, PosicionSpinner2);
                break;
            case 1://Fahrenheit
                solucion = Fahrenheit(UTransFloat, PosicionSpinner2);
                break;
            case 2://Kelvin
                solucion = Kelvin(UTransFloat, PosicionSpinner2);
                break;
            case 3://Rankine
                solucion = Rankine(UTransFloat, PosicionSpinner2);
                break;
        }
        return solucion;
    }
    /*Celsius0
     * Fahrenheit1
     * Kelvin2
     * Rankine3*/

    /**
     * Convierte de Fahrenheit a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Fahrenheit(float UTransFloat, int PosicionSpinner2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner2 == 0) {//Celsius
            UTransfFloat = ((UTransFloat - 32) * (5f / 9f));
        }
        if (PosicionSpinner2 == 3) {//Rankine
            UTransfFloat = UTransFloat + 459.67f;
        }
        if (PosicionSpinner2 == 2) {//Kelvin
            UTransfFloat = (((UTransFloat - 32) * (5f / 9f)) + 273.15f);
        }

        /*Log.d("Numeroadevolver", UTransfFloat + "");*/
        return UTransfFloat;
    }

    /**
     * Convierte de Rankine a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Rankine(float UTransFloat, int PosicionSpinner2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner2 == 0) {//Celsius
            UTransfFloat = ((UTransFloat - 491.67f) * (5f / 9f));
        }
        if (PosicionSpinner2 == 1) {//Fahrenheit
            UTransfFloat = UTransFloat - 459.67f;
        }
        if (PosicionSpinner2 == 2) {//Kelvin
            UTransfFloat = (UTransFloat * (5f / 9f));
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Kelvin a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Kelvin(float UTransFloat, int PosicionSpinner2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner2 == 0) {//Celsius
            UTransfFloat = UTransFloat - 273.15f;
        }
        if (PosicionSpinner2 == 1) {//Fahrenheit
            UTransfFloat = (((UTransFloat - 273.15f) * (9f / 5f)) + 32);
        }
        if (PosicionSpinner2 == 3) {//Rankine
            UTransfFloat = UTransFloat * 1.8f;
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Celsius a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Celsius(float UTransFloat, int PosicionSpinner2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner2 == 1) {//Fahrenheit
            UTransfFloat = ((UTransFloat * (9f / 5f)) + 32);
        }
        if (PosicionSpinner2 == 3) {//Rankine
            UTransfFloat = ((UTransFloat * (9f / 5f)) + 491.67f);
        }
        if (PosicionSpinner2 == 2) {//Kelvin
            UTransfFloat = (UTransFloat + 273.15f);
        }
        return UTransfFloat;
    }
}
