package com.example.alumnos.conversor;

public class Area {
    static public float AreaConversion(int SpinnerPosition19, int SpinnerPosition20, float UTransFloat) {
        float solution = 1;

        switch (SpinnerPosition19) {

            case 0://m2
                solution = m2(UTransFloat, SpinnerPosition20);
                break;
            case 1://km2
                solution = km2(UTransFloat, SpinnerPosition20);
                break;
            case 2://ha
                solution = ha(UTransFloat, SpinnerPosition20);
                break;
            case 3://acre
                solution = acre(UTransFloat, SpinnerPosition20);
                break;
        }
        return solution;
    }
    /*m2 0
     * km2 1
     * ha 2
     * acre 3*/

    /**
     * Convierte de m2 a la unidad alojada en el valor de Spinner20
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition20 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float m2(float UTransFloat, int SpinnerPosition20) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition20 == 1) {//km2
            UTransfFloat = (UTransFloat / 1000000);
        }
        if (SpinnerPosition20 == 2) {//ha
            UTransfFloat = (UTransFloat / 10000);
        }
        if (SpinnerPosition20 == 3) {//acre
            UTransfFloat = (UTransFloat / 4046.856f);
        }

        /*Log.d("Numeroadevolver", UTransfFloat + "");*/
        return UTransfFloat;
    }

    /**
     * Convierte de km2 a la unidad alojada en el valor de Spinner20
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition20 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float km2(float UTransFloat, int SpinnerPosition20) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition20 == 0) {//m2
            UTransfFloat = (UTransFloat * 1000000);
        }
        if (SpinnerPosition20 == 2) {//ha
            UTransfFloat = (UTransFloat * 100);
        }
        if (SpinnerPosition20 == 3) {//acre
            UTransfFloat = (UTransFloat * 247.105f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de ha a la unidad alojada en el valor de Spinner20
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition20 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float ha(float UTransFloat, int SpinnerPosition20) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition20 == 0) {//m2
            UTransfFloat = (UTransFloat * 10000);
        }
        if (SpinnerPosition20 == 1) {//km2
            UTransfFloat = (UTransFloat / 100);
        }
        if (SpinnerPosition20 == 3) {//acre
            UTransfFloat = (UTransFloat * 2.471f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de acres a la unidad alojada en el valor de Spinner20
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition20 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float acre(float UTransFloat, int SpinnerPosition20) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition20 == 0) {//m2
            UTransfFloat = (UTransFloat * 4046.856f);
        }
        if (SpinnerPosition20 == 1) {//km2
            UTransfFloat = (UTransFloat / 247.105f);
        }
        if (SpinnerPosition20 == 2) {//ha
            UTransfFloat = (UTransFloat / 2.471f);
        }
        return UTransfFloat;
    }
}
