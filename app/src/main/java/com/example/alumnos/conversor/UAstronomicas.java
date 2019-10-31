package com.example.alumnos.conversor;

public class UAstronomicas {
    static public float CambioUAstronomicas(int PosicionSpinner13, int PosicionSpinner14, float UTransFloat) {
        float solucion = 1;
        switch (PosicionSpinner13) {

            case 0://UAstronomica
                solucion = UAstronomica(UTransFloat, PosicionSpinner14);
                break;
            case 1://ALuz
                solucion = ALuz(UTransFloat, PosicionSpinner14);
                break;
            case 2://Parsec
                solucion = Parsec(UTransFloat, PosicionSpinner14);
                break;
        }
        return solucion;
    }

    /**
     * Convierte de UAstronomica a la unidad alojada en el valor de Spinner14
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner14 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float UAstronomica(float UTransFloat, int PosicionSpinner14) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner14 == 2) {//Parsec
            UTransfFloat = (UTransFloat / 206264.806f);
        }
        if (PosicionSpinner14 == 1) {//ALuz
            UTransfFloat = (UTransFloat / 63241.077f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de ALuz a la unidad alojada en el valor de Spinner14
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner14 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float ALuz(float UTransFloat, int PosicionSpinner14) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner14 == 2) {//Parsec
            UTransfFloat = (UTransFloat / 3.262f);
        }
        if (PosicionSpinner14 == 0) {//UAstronomica
            UTransfFloat = (UTransFloat * 63241.077f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Parsec a la unidad alojada en el valor de Spinner14
     * @param UTransFloat Numero a convertir
     * @param PosicionSpinner14 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Parsec(float UTransFloat, int PosicionSpinner14) { //Unidad seleccionada
        float UTransfFloat=0;
        if (PosicionSpinner14 == 1) {//ALuz
            UTransfFloat = (UTransFloat * 3.262f);
        }
        if (PosicionSpinner14 == 0) {//UAstronomica
            UTransfFloat = (UTransFloat * 206264.806f);
        }
        return UTransfFloat;
    }
}
