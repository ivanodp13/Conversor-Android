package com.example.alumnos.conversor;

public class AstronomicalU {
    static public float AstronomicalUConversion(int SpinnerPosition13, int SpinnerPosition14, float UTransFloat) {
        float solution = 1;
        switch (SpinnerPosition13) {

            case 0://AstronomicU
                solution = AstronomicU(UTransFloat, SpinnerPosition14);
                break;
            case 1://LightY
                solution = LightY(UTransFloat, SpinnerPosition14);
                break;
            case 2://Parsec
                solution = Parsec(UTransFloat, SpinnerPosition14);
                break;
        }
        return solution;
    }

    /**
     * Convierte de AstronomicU a la unidad alojada en el valor de Spinner14
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition14 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float AstronomicU(float UTransFloat, int SpinnerPosition14) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition14 == 2) {//Parsec
            UTransfFloat = (UTransFloat / 206264.806f);
        }
        if (SpinnerPosition14 == 1) {//LightY
            UTransfFloat = (UTransFloat / 63241.077f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de LightY a la unidad alojada en el valor de Spinner14
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition14 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float LightY(float UTransFloat, int SpinnerPosition14) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition14 == 2) {//Parsec
            UTransfFloat = (UTransFloat / 3.262f);
        }
        if (SpinnerPosition14 == 0) {//AstronomicU
            UTransfFloat = (UTransFloat * 63241.077f);
        }
        return UTransfFloat;
    }

    /**
     * Convierte de Parsec a la unidad alojada en el valor de Spinner14
     * @param UTransFloat Numero a convertir
     * @param SpinnerPosition14 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @return Solución
     */
    static public float Parsec(float UTransFloat, int SpinnerPosition14) { //Unidad seleccionada
        float UTransfFloat=0;
        if (SpinnerPosition14 == 1) {//LightY
            UTransfFloat = (UTransFloat * 3.262f);
        }
        if (SpinnerPosition14 == 0) {//AstronomicU
            UTransfFloat = (UTransFloat * 206264.806f);
        }
        return UTransfFloat;
    }
}
