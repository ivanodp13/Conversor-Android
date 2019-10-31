package com.example.alumnos.conversor;

public class Presion {
    static public float CambioPresion(int PosicionSpinner15, int PosicionSpinner16, float UTransFloat) {
        float solucion = 1;
        switch (PosicionSpinner15) {

            case 0://Pascal
                solucion = Pascal(UTransFloat, PosicionSpinner16);
                break;
            case 1://mmHg
                solucion = mmHg(UTransFloat, PosicionSpinner16);
                break;
            case 2://atm
                solucion = atm(UTransFloat, PosicionSpinner16);
                break;
        }
        return solucion;
    }

    /**
     * Convierte de Pascal a la unidad alojada en el valor de Spinner16
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner16 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Pascal(float UTransFloat, int PosicionSpinner16) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner16 == 2) {//atm
            UTransfFloat = (UTransFloat / 101325);
        }
        if (PosicionSpinner16 == 1) {//mmHg
            UTransfFloat = (UTransFloat / 133.322f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de mmHg a la unidad alojada en el valor de Spinner16
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner16 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float mmHg(float UTransFloat, int PosicionSpinner16) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner16 == 2) {//atm
            UTransfFloat = (UTransFloat / 760);
        }
        if (PosicionSpinner16 == 0) {//Pascal
            UTransfFloat = (UTransFloat * 133.322f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de atm a la unidad alojada en el valor de Spinner16
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner16 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float atm(float UTransFloat, int PosicionSpinner16) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner16 == 1) {//mmHg
            UTransfFloat = (UTransFloat * 760);
        }
        if (PosicionSpinner16 == 0) {//Pascal
            UTransfFloat = (UTransFloat * 101325);
        }
        return UTransfFloat;
    }
}
