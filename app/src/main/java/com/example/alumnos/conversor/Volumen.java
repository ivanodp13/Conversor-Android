package com.example.alumnos.conversor;

import android.util.Log;

public class Volumen {
    static public float CambioVolumen(int PosicionSpinner11, int PosicionSpinner12, float UTransFloat) {
        float solucion = 1;
        float UTransfFloat=0;

        switch (PosicionSpinner11) {

            case 0://ml
                solucion = unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
            case 1://cl
                solucion = unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
            case 2://dl
                solucion = unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
            case 3://l
                solucion = unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
            case 4://dal
                solucion = unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
            case 5://hl
                solucion = unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
            case 6://kl
                solucion = unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
            case 7://Galon
                solucion = GalonToX(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
                break;
        }
        return solucion;
    }

    static public float unidades10 (int PosicionSpinner11, int PosicionSpinner12, float UTransFloat, float UTransfFloat){
        Log.d("posiciondel sp 2 vol", PosicionSpinner12+"");
        if (PosicionSpinner12==7){
            UTransfFloat=Spinner12_7(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
        }else {
            int saltos = PosicionSpinner11 - PosicionSpinner12;
            Boolean multiplicar;

            Log.d("numero de saltos", saltos+"");

            if (saltos>0){//Positivo
                multiplicar = true;
            }else{//Negativo
                multiplicar = false;
            }
            saltos = Math.abs(saltos);
            Log.d("saltos abslutos", saltos+"");
            int i;

            for (i=0; i<saltos; i++){
                if (multiplicar==true){//Positivo/Multiplicar = Bajar unidad
                    UTransFloat = UTransFloat *10;
                    Log.d("conversion mult", UTransFloat+"");
                    UTransfFloat=UTransFloat;
                }else{//Negativo/Dividir = Subir unidad
                    UTransFloat = UTransFloat / 10;
                    Log.d("conversion divi", UTransFloat+"");
                    UTransfFloat=UTransFloat;
                }
            }
        }
        return UTransfFloat;
    }
//Galon---------------------------------------------------------------
    /**
     * Convierte de galon a l
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float GalonToL(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat * 3.785f);
        return UTransfFloat;
    }

    /**
     * Convierte de l a galon
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float LToGalon(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat / 3.785f);
        return UTransfFloat;
    }

    /**
     * Convierte de galon a cualquier unidad
     * @param PosicionSpinner11 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner12 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float GalonToX(int PosicionSpinner11, int PosicionSpinner12, float UTransFloat, float UTransfFloat){

        UTransfFloat=GalonToL(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        PosicionSpinner11=3;
        float solucionGalonToX=unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solucionGalonToX+"");
        return solucionGalonToX;
    }
    /**
     * Convierte cualquier unidad a galon
     * @param PosicionSpinner11 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner12 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToGalon(int PosicionSpinner11, int PosicionSpinner12, float UTransFloat, float UTransfFloat){
        PosicionSpinner12=3;
        float solucionEnL=unidades10(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);

        UTransFloat=solucionEnL;
        float solucionXToGalon=LToGalon(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", solucionXToGalon+"");
        return solucionXToGalon;
    }
//LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido XToGalon
     * @param PosicionSpinner11 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner12 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner12_7(int PosicionSpinner11, int PosicionSpinner12, float UTransFloat, float UTransfFloat){
        if (PosicionSpinner11==3){//Posición intermedia (l)
            float solucionXToGalon=LToGalon(UTransFloat, UTransfFloat);
            UTransfFloat=solucionXToGalon;
        }else{
            UTransfFloat=XToGalon(PosicionSpinner11, PosicionSpinner12, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }
}
