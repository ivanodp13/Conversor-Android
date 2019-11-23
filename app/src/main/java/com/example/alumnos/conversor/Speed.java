package com.example.alumnos.conversor;

public class Speed {
    static public float SpeedConversion(int SpinnerPosition17, int SpinnerPosition18, float UTransFloat) {
        float solution = 1;

        switch (SpinnerPosition17) {

            case 0://kph
                solution = kph(UTransFloat, SpinnerPosition18);
                break;
            case 1://mph
                solution = mph(UTransFloat, SpinnerPosition18);
                break;
            case 2://ms
                solution = ms(UTransFloat, SpinnerPosition18);
                break;
            case 3://Nudos
                solution = Nudos(UTransFloat, SpinnerPosition18);
                break;
        }
        return solution;
    }
    /*kph 0
     * mph 1
     * ms 2
     * Nudos 3*/

    /**
     * Convierte de kph a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float kph(float UTransFloat, int SpinnerPosition18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition18 == 1) {//mph
            UTransfFloat = (UTransFloat / 1.609f);
        }
        if (SpinnerPosition18 == 2) {//ms
            UTransfFloat = (UTransFloat / 3.6f);
        }
        if (SpinnerPosition18 == 3) {//Nudos
            UTransfFloat = (UTransFloat / 1.852f);
        }

        /*Log.d("Numeroadevolver", UTransfFloat + "");*/
        return UTransfFloat;
    }

    /**
     * Convierte de mph a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float mph(float UTransFloat, int SpinnerPosition18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition18 == 0) {//kph
            UTransfFloat = (UTransFloat * 1.609f);
        }
        if (SpinnerPosition18 == 2) {//ms
            UTransfFloat = (UTransFloat / 2.237f);
        }
        if (SpinnerPosition18 == 3) {//Nudos
            UTransfFloat = (UTransFloat / 1.151f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de ms a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float ms(float UTransFloat, int SpinnerPosition18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition18 == 0) {//kph
            UTransfFloat = (UTransFloat * 3.6f);
        }
        if (SpinnerPosition18 == 1) {//mph
            UTransfFloat = (UTransFloat * 2.237f);
        }
        if (SpinnerPosition18 == 3) {//Nudos
            UTransfFloat = (UTransFloat * 1.944f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Nudos a la unidad alojada en el valor de Spinner18
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition18 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Nudos(float UTransFloat, int SpinnerPosition18) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition18 == 0) {//kph
            UTransfFloat = (UTransFloat * 1.852f);
        }
        if (SpinnerPosition18 == 1) {//mph
            UTransfFloat = (UTransFloat / 1.151f);
        }
        if (SpinnerPosition18 == 2) {//ms
            UTransfFloat = (UTransFloat / 1.944f);
        }
        return UTransfFloat;
    }
}
