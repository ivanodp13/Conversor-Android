package com.example.alumnos.conversor;

public class Pressure {
    static public float PressureConversion(int SpinnerPosition15, int SpinnerPosition16, float UTransFloat) {
        float solution = 1;
        switch (SpinnerPosition15) {

            case 0://Pascal
                solution = Pascal(UTransFloat, SpinnerPosition16);
                break;
            case 1://mmHg
                solution = mmHg(UTransFloat, SpinnerPosition16);
                break;
            case 2://atm
                solution = atm(UTransFloat, SpinnerPosition16);
                break;
        }
        return solution;
    }

    /**
     * Convierte de Pascal a la unidad alojada en el valor de Spinner16
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition16 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Pascal(float UTransFloat, int SpinnerPosition16) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition16 == 2) {//atm
            UTransfFloat = (UTransFloat / 101325);
        }
        if (SpinnerPosition16 == 1) {//mmHg
            UTransfFloat = (UTransFloat / 133.322f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de mmHg a la unidad alojada en el valor de Spinner16
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition16 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float mmHg(float UTransFloat, int SpinnerPosition16) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition16 == 2) {//atm
            UTransfFloat = (UTransFloat / 760);
        }
        if (SpinnerPosition16 == 0) {//Pascal
            UTransfFloat = (UTransFloat * 133.322f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de atm a la unidad alojada en el valor de Spinner16
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition16 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float atm(float UTransFloat, int SpinnerPosition16) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition16 == 1) {//mmHg
            UTransfFloat = (UTransFloat * 760);
        }
        if (SpinnerPosition16 == 0) {//Pascal
            UTransfFloat = (UTransFloat * 101325);
        }
        return UTransfFloat;
    }
}
