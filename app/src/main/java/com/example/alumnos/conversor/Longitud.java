package com.example.alumnos.conversor;

import android.util.Log;

public class Longitud {
    static public float CambioLongitud(int PosicionSpinner7, int PosicionSpinner8, float UTransFloat) {
        float solucion = 1;
        float UTransfFloat = 0;

        switch (PosicionSpinner7) {

            case 0://mm
                solucion = unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
            case 1://cm
                solucion = unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
            case 2://dm
                solucion = unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
            case 3://m
                solucion = unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
            case 4://dam
                solucion = unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
            case 5://hm
                solucion = unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
            case 6://km
                solucion = unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
            case 7://Millas
                solucion = MillaToX(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
                break;
        }
        return solucion;
    }

    /**
     * Convierte de una unidad a otra proporcionales entre si (10)
     * @param PosicionSpinner7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat Resultado
     * @return
     */
    static public float unidades10 (int PosicionSpinner7, int PosicionSpinner8, float UTransFloat, float UTransfFloat){

        if (PosicionSpinner8==7){
            UTransfFloat = Spinner8_7(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
        }else {
            Log.d("pos2", PosicionSpinner8 + "");
            int saltos = PosicionSpinner7 - PosicionSpinner8;
            Boolean multiplicar;

            Log.d("numero de saltos", saltos + "");

            if (saltos > 0) {//Positivo
                multiplicar = true;
            } else {//Negativo
                multiplicar = false;
            }
            saltos = Math.abs(saltos);
            Log.d("saltos abslutos", saltos + "");
            int i;

            for (i = 0; i < saltos; i++) {
                if (multiplicar == true) {//Positivo/Multiplicar = Bajar unidad
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
    static public float MillaToKm(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat * 1.609f);
        return UTransfFloat;
    }

    /**
     * Convierte de Km a Milla
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float KmToMilla(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat /1.609f);
        return UTransfFloat;
    }

    /**
     * Convierte de Milla a cualquier unidad
     * @param PosicionSpinner7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float MillaToX(int PosicionSpinner7, int PosicionSpinner8, float UTransFloat, float UTransfFloat){

        UTransfFloat=MillaToKm(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        PosicionSpinner7=6;//Posición intermedia (km)
        float solucionMillaToX=unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solucionMillaToX+"");
        return solucionMillaToX;
    }
    /**
     * Convierte cualquier unidad a Milla
     * @param PosicionSpinner7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToMilla(int PosicionSpinner7, int PosicionSpinner8, float UTransFloat, float UTransfFloat){
        PosicionSpinner8=6;
        float solucionEnKm=unidades10(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
        Log.d("resultado bytes", solucionEnKm+"");
        UTransFloat=solucionEnKm;
        float solucionXToMilla=KmToMilla(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", solucionXToMilla+"");
        return solucionXToMilla;
    }
    //LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido KmToMilla
     * @param PosicionSpinner7 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner8 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner8_7(int PosicionSpinner7, int PosicionSpinner8, float UTransFloat, float UTransfFloat){
        Log.d("pos sp 5 en llamada", PosicionSpinner7+"");
        Log.d("pos sp 6 en llamada", PosicionSpinner8+"");

        if (PosicionSpinner7==6){//Posición intermedia (km)
            float solucionXToMilla=KmToMilla(UTransFloat, UTransfFloat);
            UTransfFloat=solucionXToMilla;
        }else{
            UTransfFloat=XToMilla(PosicionSpinner7, PosicionSpinner8, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }
}
