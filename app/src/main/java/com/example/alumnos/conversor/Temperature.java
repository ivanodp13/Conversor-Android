package com.example.alumnos.conversor;

import android.util.Log;

public class Temperature {
    static public float TemperatureConversion(int SpinnerPosition1, int SpinnerPosition2, float UTransFloat) {
        float solution = 1;

        switch (SpinnerPosition1) {

            case 0://Celsius
                solution = Celsius(UTransFloat, SpinnerPosition2);
                break;
            case 1://Fahrenheit
                solution = Fahrenheit(UTransFloat, SpinnerPosition2);
                break;
            case 2://Kelvin
                solution = Kelvin(UTransFloat, SpinnerPosition2);
                break;
            case 3://Rankine
                solution = Rankine(UTransFloat, SpinnerPosition2);
                break;
        }
        return solution;
    }
    /*Celsius0
     * Fahrenheit1
     * Kelvin2
     * Rankine3*/

    /**
     * Convierte de Fahrenheit a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Fahrenheit(float UTransFloat, int SpinnerPosition2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition2 == 0) {//Celsius
            UTransfFloat = ((UTransFloat - 32) * (5f / 9f));
        }
        if (SpinnerPosition2 == 3) {//Rankine
            UTransfFloat = UTransFloat + 459.67f;
        }
        if (SpinnerPosition2 == 2) {//Kelvin
            UTransfFloat = (((UTransFloat - 32) * (5f / 9f)) + 273.15f);
        }

        /*Log.d("Numeroadevolver", UTransfFloat + "");*/
        return UTransfFloat;
    }

    /**
     * Convierte de Rankine a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Rankine(float UTransFloat, int SpinnerPosition2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition2 == 0) {//Celsius
            UTransfFloat = ((UTransFloat - 491.67f) * (5f / 9f));
        }
        if (SpinnerPosition2 == 1) {//Fahrenheit
            UTransfFloat = UTransFloat - 459.67f;
        }
        if (SpinnerPosition2 == 2) {//Kelvin
            UTransfFloat = (UTransFloat * (5f / 9f));
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Kelvin a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Kelvin(float UTransFloat, int SpinnerPosition2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition2 == 0) {//Celsius
            UTransfFloat = UTransFloat - 273.15f;
        }
        if (SpinnerPosition2 == 1) {//Fahrenheit
            UTransfFloat = (((UTransFloat - 273.15f) * (9f / 5f)) + 32);
        }
        if (SpinnerPosition2 == 3) {//Rankine
            UTransfFloat = UTransFloat * 1.8f;
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Celsius a la unidad alojada en el valor de Spinner2
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition2 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Celsius(float UTransFloat, int SpinnerPosition2) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition2 == 1) {//Fahrenheit
            UTransfFloat = ((UTransFloat * (9f / 5f)) + 32);
        }
        if (SpinnerPosition2 == 3) {//Rankine
            UTransfFloat = ((UTransFloat * (9f / 5f)) + 491.67f);
        }
        if (SpinnerPosition2 == 2) {//Kelvin
            UTransfFloat = (UTransFloat + 273.15f);
        }
        return UTransfFloat;
    }
}
