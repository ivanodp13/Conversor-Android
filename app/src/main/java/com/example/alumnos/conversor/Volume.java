package com.example.alumnos.conversor;

import android.util.Log;

public class Volume {
    static public float VolumeConversion(int SpinnerPosition11, int SpinnerPosition12, float UTransFloat) {
        float solution = 1;
        float UTransfFloat=0;

        switch (SpinnerPosition11) {

            case 0://ml
                solution = units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
            case 1://cl
                solution = units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
            case 2://dl
                solution = units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
            case 3://l
                solution = units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
            case 4://dal
                solution = units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
            case 5://hl
                solution = units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
            case 6://kl
                solution = units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
            case 7://Galon
                solution = GallonToX(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
                break;
        }
        return solution;
    }

    static public float units10(int SpinnerPosition11, int SpinnerPosition12, float UTransFloat, float UTransfFloat){
        Log.d("posiciondel sp 2 vol", SpinnerPosition12+"");
        if (SpinnerPosition12==7){
            UTransfFloat=Spinner12_7(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
        }else {
            int jumps = SpinnerPosition11 - SpinnerPosition12;
            Boolean multiply;

            Log.d("numero de saltos", jumps+"");

            if (jumps>0){//Positivo
                multiply = true;
            }else{//Negativo
                multiply = false;
            }
            jumps = Math.abs(jumps);
            Log.d("saltos abslutos", jumps+"");
            int i;

            for (i=0; i<jumps; i++){
                if (multiply==true){//Positivo/Multiplicar = Bajar unidad
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
    static public float GallonToL(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat * 3.785f);
        return UTransfFloat;
    }

    /**
     * Convierte de l a galon
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float LToGallon(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat / 3.785f);
        return UTransfFloat;
    }

    /**
     * Convierte de galon a cualquier unidad
     * @param SpinnerPosition11 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition12 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float GallonToX(int SpinnerPosition11, int SpinnerPosition12, float UTransFloat, float UTransfFloat){

        UTransfFloat= GallonToL(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        SpinnerPosition11=3;
        float solutionGallonToX= units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solutionGallonToX+"");
        return solutionGallonToX;
    }
    /**
     * Convierte cualquier unidad a galon
     * @param SpinnerPosition11 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition12 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToGallon(int SpinnerPosition11, int SpinnerPosition12, float UTransFloat, float UTransfFloat){
        SpinnerPosition12=3;
        float solutionInL= units10(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);

        UTransFloat=solutionInL;
        float solutionXToGallon= LToGallon(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", solutionXToGallon+"");
        return solutionXToGallon;
    }
//LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido XToGallon
     * @param SpinnerPosition11 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition12 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner12_7(int SpinnerPosition11, int SpinnerPosition12, float UTransFloat, float UTransfFloat){
        if (SpinnerPosition11==3){//Posición intermedia (l)
            float solutionXToGallon= LToGallon(UTransFloat, UTransfFloat);
            UTransfFloat=solutionXToGallon;
        }else{
            UTransfFloat= XToGallon(SpinnerPosition11, SpinnerPosition12, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }
}
