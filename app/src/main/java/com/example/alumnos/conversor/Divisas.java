package com.example.alumnos.conversor;

import android.util.Log;

public class Divisas {

    static public float CambioDivisa(int PosicionSpinner3, int PosicionSpinner4, float UTransFloat) {
        float solucion = 1;

        switch (PosicionSpinner3) {

            case 0://Euros
                solucion = Euros(UTransFloat, PosicionSpinner4);
                break;
            case 1://Dolares
                solucion = Dolares(UTransFloat, PosicionSpinner4);
                break;
            case 2://Libras
                solucion = Libras(UTransFloat, PosicionSpinner4);
                break;
            case 3://Yenes
                solucion = Yenes(UTransFloat, PosicionSpinner4);
                break;
            case 4://PMexicano
                solucion = PMexicano(UTransFloat, PosicionSpinner4);
                break;
            case 5://Pesetas
                solucion = Pesetas(UTransFloat, PosicionSpinner4);
                break;
            case 6://Bitcoin
                solucion = Bitcoin(UTransFloat, PosicionSpinner4);
                break;
        }
        return solucion;
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
     * @param PosicionSpinner4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Euros (float UTransFloat, int PosicionSpinner4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 1.15f);
        }
        if (PosicionSpinner4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 166.386f);
        }
        if (PosicionSpinner4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.88f);
        }
        if (PosicionSpinner4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 125.46f);
        }
        if (PosicionSpinner4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 21.88f);
        }
        if (PosicionSpinner4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.00033f);
        }
        Log.d("unidadtrans" , UTransfFloat + "");
        return UTransfFloat;
    }

    /**
     * Convierte de Dolares a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Dolares (float UTransFloat, int PosicionSpinner4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.87f);
        }
        if (PosicionSpinner4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 145.23f);
        }
        if (PosicionSpinner4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.76f);
        }
        if (PosicionSpinner4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 109.49f);
        }
        if (PosicionSpinner4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 19.09f);
        }
        if (PosicionSpinner4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.00029f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Libras a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Libras (float UTransFloat, int PosicionSpinner4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 1.14f);
        }
        if (PosicionSpinner4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 189.93f);
        }
        if (PosicionSpinner4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 1.30f);
        }
        if (PosicionSpinner4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 143.20f);
        }
        if (PosicionSpinner4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 25);
        }
        if (PosicionSpinner4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.00038f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Yenes a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Yenes (float UTransFloat, int PosicionSpinner4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.0079f);
        }
        if (PosicionSpinner4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 1.32f);
        }
        if (PosicionSpinner4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 0.0091f);
        }
        if (PosicionSpinner4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.0069f);
        }
        if (PosicionSpinner4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 0.17f);
        }
        if (PosicionSpinner4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.0000027f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de PMexicano a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float PMexicano (float UTransFloat, int PosicionSpinner4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.045f);
        }
        if (PosicionSpinner4 == 5) {//pesetas
            UTransfFloat = (UTransFloat * 7.598f);
        }
        if (PosicionSpinner4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 0.052f);
        }
        if (PosicionSpinner4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.04f);
        }
        if (PosicionSpinner4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 5.73f);
        }
        if (PosicionSpinner4 == 6) {//Bitcoin
            UTransfFloat = (UTransFloat * 0.000015f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Pesetas a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Pesetas (float UTransFloat, int PosicionSpinner4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 0.006f);
        }
        if (PosicionSpinner4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 0.131f);
        }
        if (PosicionSpinner4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 0.0068f);
        }
        if (PosicionSpinner4 == 2) {//libras
            UTransfFloat = (UTransFloat * 0.0052f);
        }
        if (PosicionSpinner4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 0.754f);
        }
        if (PosicionSpinner4 == 6) {//Bitcoin
            UTransfFloat = ((UTransFloat * 0.006f)*0.00033f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Bitcoin a la unidad alojada en el valor de Spinner4
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner4 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Bitcoin (float UTransFloat, int PosicionSpinner4) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner4 == 0) {//Euros
            UTransfFloat = (UTransFloat * 2986.22f);
        }
        if (PosicionSpinner4 == 4) {//PMex
            UTransfFloat = (UTransFloat * 65352.43f);
        }
        if (PosicionSpinner4 == 1) {//dolares
            UTransfFloat = (UTransFloat * 3421.45f);
        }
        if (PosicionSpinner4 == 2) {//libras
            UTransfFloat = (UTransFloat * 2613.59f);
        }
        if (PosicionSpinner4 == 3) {//yenes
            UTransfFloat = (UTransFloat * 374593.34f);
        }
        if (PosicionSpinner4 == 5) {//pesetas
            UTransfFloat = ((UTransFloat * 2986.22f)*166.386f);
        }
        return UTransfFloat;
    }

}
