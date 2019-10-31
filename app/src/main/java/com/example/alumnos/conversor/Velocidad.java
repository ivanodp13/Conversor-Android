package com.example.alumnos.conversor;

public class Velocidad {
    static public float CambioVelocidad(int PosicionSpinner17, int PosicionSpinner18, float UTransFloat) {
        float solucion = 1;

        switch (PosicionSpinner17) {

            case 0://kph
                solucion = kph(UTransFloat, PosicionSpinner18);
                break;
            case 1://mph
                solucion = mph(UTransFloat, PosicionSpinner18);
                break;
            case 2://ms
                solucion = ms(UTransFloat, PosicionSpinner18);
                break;
            case 3://Nudos
                solucion = Nudos(UTransFloat, PosicionSpinner18);
                break;
        }
        return solucion;
    }
    /*kph 0
     * mph 1
     * ms 2
     * Nudos 3*/

    /**
     * Convierte de kph a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float kph(float UTransFloat, int PosicionSpinner18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner18 == 1) {//mph
            UTransfFloat = (UTransFloat / 1.609f);
        }
        if (PosicionSpinner18 == 2) {//ms
            UTransfFloat = (UTransFloat / 3.6f);
        }
        if (PosicionSpinner18 == 3) {//Nudos
            UTransfFloat = (UTransFloat / 1.852f);
        }

        /*Log.d("Numeroadevolver", UTransfFloat + "");*/
        return UTransfFloat;
    }

    /**
     * Convierte de mph a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float mph(float UTransFloat, int PosicionSpinner18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner18 == 0) {//kph
            UTransfFloat = (UTransFloat * 1.609f);
        }
        if (PosicionSpinner18 == 2) {//ms
            UTransfFloat = (UTransFloat / 2.237f);
        }
        if (PosicionSpinner18 == 3) {//Nudos
            UTransfFloat = (UTransFloat / 1.151f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de ms a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float ms(float UTransFloat, int PosicionSpinner18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner18 == 0) {//kph
            UTransfFloat = (UTransFloat * 3.6f);
        }
        if (PosicionSpinner18 == 1) {//mph
            UTransfFloat = (UTransFloat * 2.237f);
        }
        if (PosicionSpinner18 == 3) {//Nudos
            UTransfFloat = (UTransFloat * 1.944f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Nudos a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Nudos(float UTransFloat, int PosicionSpinner18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner18 == 0) {//kph
            UTransfFloat = (UTransFloat * 1.852f);
        }
        if (PosicionSpinner18 == 1) {//mph
            UTransfFloat = (UTransFloat / 1.151f);
        }
        if (PosicionSpinner18 == 2) {//ms
            UTransfFloat = (UTransFloat / 1.944f);
        }
        return UTransfFloat;
    }
}
