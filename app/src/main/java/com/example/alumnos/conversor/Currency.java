package com.example.alumnos.conversor;

import android.util.Log;

public class Currency {

    static public float CurrencyConversion(int SpinnerPosition3, int SpinnerPosition4, float UTransFloat) {
        float solution = 1;

        switch (SpinnerPosition3) {

            case 0://Euros
                solution = Euros(UTransFloat, SpinnerPosition4);
                break;
            case 1://Dollars
                solution = Dollars(UTransFloat, SpinnerPosition4);
                break;
            case 2://Pounds
                solution = Pounds(UTransFloat, SpinnerPosition4);
                break;
            case 3://Yen
                solution = Yen(UTransFloat, SpinnerPosition4);
                break;
            case 4://MexicanP
                solution = MexicanP(UTransFloat, SpinnerPosition4);
                break;
            case 5://Pesetas
                solution = Pesetas(UTransFloat, SpinnerPosition4);
                break;
            case 6://Bitcoin
                solution = Bitcoin(UTransFloat, SpinnerPosition4);
                break;
        }
        return solution;
    }
    /*Euros0
     * Dolares1
     * Libras2
     * Yenes3
     * PesosMex4
     * Pesetas5
     * Bitcoin6*/

    /**
     * Convierte de Euros a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Euros (float UTransFloat, int SpinnerPosition4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 1.15f);
        }
        if (SpinnerPosition4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 166.386f);
        }
        if (SpinnerPosition4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.88f);
        }
        if (SpinnerPosition4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 125.46f);
        }
        if (SpinnerPosition4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 21.88f);
        }
        if (SpinnerPosition4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.00033f);
        }
        Log.d("unidadtrans" , UTransfFloat + "");
        return UTransfFloat;
    }

    /**
     * Convierte de Dollars a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Dollars(float UTransFloat, int SpinnerPosition4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.87f);
        }
        if (SpinnerPosition4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 145.23f);
        }
        if (SpinnerPosition4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.76f);
        }
        if (SpinnerPosition4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 109.49f);
        }
        if (SpinnerPosition4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 19.09f);
        }
        if (SpinnerPosition4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.00029f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Pounds a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Pounds(float UTransFloat, int SpinnerPosition4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 1.14f);
        }
        if (SpinnerPosition4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 189.93f);
        }
        if (SpinnerPosition4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 1.30f);
        }
        if (SpinnerPosition4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 143.20f);
        }
        if (SpinnerPosition4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 25);
        }
        if (SpinnerPosition4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.00038f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Yen a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Yen(float UTransFloat, int SpinnerPosition4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.0079f);
        }
        if (SpinnerPosition4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 1.32f);
        }
        if (SpinnerPosition4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 0.0091f);
        }
        if (SpinnerPosition4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.0069f);
        }
        if (SpinnerPosition4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 0.17f);
        }
        if (SpinnerPosition4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.0000027f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de MexicanP a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float MexicanP(float UTransFloat, int SpinnerPosition4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.045f);
        }
        if (SpinnerPosition4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 7.598f);
        }
        if (SpinnerPosition4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 0.052f);
        }
        if (SpinnerPosition4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.04f);
        }
        if (SpinnerPosition4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 5.73f);
        }
        if (SpinnerPosition4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.000015f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Pesetas a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Pesetas (float UTransFloat, int SpinnerPosition4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.006f);
        }
        if (SpinnerPosition4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 0.131f);
        }
        if (SpinnerPosition4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 0.0068f);
        }
        if (SpinnerPosition4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.0052f);
        }
        if (SpinnerPosition4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 0.754f);
        }
        if (SpinnerPosition4 == 6) {//Bitcoin
            UTransfFloat = ((UTransFloat * 0.006f)*0.00033f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Bitcoin a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Bitcoin (float UTransFloat, int SpinnerPosition4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 2986.22f);
        }
        if (SpinnerPosition4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 65352.43f);
        }
        if (SpinnerPosition4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 3421.45f);
        }
        if (SpinnerPosition4 == 2) {//libras
            UTransfFloat = (UTransFloat * 2613.59f);
        }
        if (SpinnerPosition4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 374593.34f);
        }
        if (SpinnerPosition4 == 5) {//pesetas
            UTransfFloat = ((UTransFloat * 2986.22f)*166.386f);
        }
        return UTransfFloat;
    }

}
