package com.example.alumnos.conversor;

import android.util.Log;

public class Length {
    static public float LengthConversion(int SpinnerPosition7, int SpinnerPosition8, float UTransFloat) {
        float solution = 1;
        float UTransfFloat = 0;

        switch (SpinnerPosition7) {

            case 0://mm
                solution = units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
            case 1://cm
                solution = units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
            case 2://dm
                solution = units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
            case 3://m
                solution = units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
            case 4://dam
                solution = units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
            case 5://hm
                solution = units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
            case 6://km
                solution = units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
            case 7://Millas
                solution = MilleToX(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
                break;
        }
        return solution;
    }

    /**
     * Convierte de una unidad a otra proporcionales entre si (10)
     * @param SpinnerPosition7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat Resultado
     * @return
     */
    static public float units10(int SpinnerPosition7, int SpinnerPosition8, float UTransFloat, float UTransfFloat){

        if (SpinnerPosition8==7){
            UTransfFloat = Spinner8_7(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
        }else {
            Log.d("pos2", SpinnerPosition8 + "");
            int jumps = SpinnerPosition7 - SpinnerPosition8;
            Boolean multiply;

            Log.d("numero de jumps", jumps + "");

            if (jumps > 0) {//Positivo
                multiply = true;
            } else {//Negativo
                multiply = false;
            }
            jumps = Math.abs(jumps);
            Log.d("jumps abslutos", jumps + "");
            int i;

            for (i = 0; i < jumps; i++) {
                if (multiply == true) {//Positivo/Multiplicar = Bajar unidad
                    UTransFloat = UTransFloat * 10;
                    Log.d("conversion mult", UTransFloat + "");
                    UTransfFloat = UTransFloat;
                } else {//Negativo/Dividir = Subir unidad
                    UTransFloat = UTransFloat / 10;
                    Log.d("conversion divi", UTransFloat + "");
                    UTransfFloat = UTransFloat;
                }
            }
        }
        return UTransfFloat;
    }

//bit------------------------------------------------
    /**
     * Convierte de Milla a Km
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float MilleToKm(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat * 1.609f);
        return UTransfFloat;
    }

    /**
     * Convierte de Km a Milla
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float KmToMille(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat /1.609f);
        return UTransfFloat;
    }

    /**
     * Convierte de Milla a cualquier unidad
     * @param SpinnerPosition7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float MilleToX(int SpinnerPosition7, int SpinnerPosition8, float UTransFloat, float UTransfFloat){

        UTransfFloat= MilleToKm(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        SpinnerPosition7=6;//Posición intermedia (km)
        float solutionMillaToX= units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solutionMillaToX+"");
        return solutionMillaToX;
    }
    /**
     * Convierte cualquier unidad a Milla
     * @param SpinnerPosition7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToMille(int SpinnerPosition7, int SpinnerPosition8, float UTransFloat, float UTransfFloat){
        SpinnerPosition8=6;
        float solutionInKm= units10(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
        Log.d("resultado bytes", solutionInKm+"");
        UTransFloat=solutionInKm;
        float solutionXToMilla= KmToMille(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", solutionXToMilla+"");
        return solutionXToMilla;
    }
    //LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido KmToMille
     * @param SpinnerPosition7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner8_7(int SpinnerPosition7, int SpinnerPosition8, float UTransFloat, float UTransfFloat){
        Log.d("pos sp 5 en llamada", SpinnerPosition7+"");
        Log.d("pos sp 6 en llamada", SpinnerPosition8+"");

        if (SpinnerPosition7==6){//Posición intermedia (km)
            float solucionXToMilla= KmToMille(UTransFloat, UTransfFloat);
            UTransfFloat=solucionXToMilla;
        }else{
            UTransfFloat= XToMille(SpinnerPosition7, SpinnerPosition8, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }
}
