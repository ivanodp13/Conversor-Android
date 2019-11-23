package com.example.alumnos.conversor;

import android.util.Log;
public class Mass {
    static public float MassConversion(int SpinnerPosition9, int SpinnerPosition10, float UTransFloat) {
        float solution = 1;
        float UTransfFloat=0;

        switch (SpinnerPosition9) {

            case 0://mg
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 1://cg
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 2://dg
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 3://g
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 4://dag
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 5://hg
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 6://kg
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 7://mag
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 8://q
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 9://t
                solution = units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
            case 10://Libra
                solution = WPoundToX(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
                break;
        }
        return solution;
    }

    /**
     * Convierte de una unidad a otra proporcionales entre si (10)
     * @param SpinnerPosition9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat Resultado
     * @return
     */
    static public float units10(int SpinnerPosition9, int SpinnerPosition10, float UTransFloat, float UTransfFloat){

        if (SpinnerPosition10==10){
            UTransfFloat=Spinner10_10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
        }else{
        Log.d("pos2", SpinnerPosition9+"");
        int jumps = SpinnerPosition9 - SpinnerPosition10;
        Boolean multiply;

        Log.d("numero de jumps", jumps+"");

            if (jumps>0){//Positivo
                multiply = true;
            }else{//Negativo
                multiply = false;
            }
            jumps = Math.abs(jumps);
            Log.d("jumps abslutos", jumps+"");
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
//Libra---------------------------------------------------------------

    /**
     * Convierte de Libra a Kg
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float PoundToKg(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat / 2.205f);
        return UTransfFloat;
    }

    /**
     * Convierte de Kg a Libra
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float KgToPound(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat * 2.205f);
        return UTransfFloat;
    }

    /**
     * Convierte de Libra a cualquier unidad
     * @param SpinnerPosition9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float WPoundToX(int SpinnerPosition9, int SpinnerPosition10, float UTransFloat, float UTransfFloat){

        UTransfFloat= PoundToKg(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        SpinnerPosition9=6;
        float solutionPoundToKg= units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solutionPoundToKg+"");
        return solutionPoundToKg;
    }
    /**
     * Convierte de cualquier unidad a Libra
     * @param SpinnerPosition9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToPound(int SpinnerPosition9, int SpinnerPosition10, float UTransFloat, float UTransfFloat){
        SpinnerPosition10=6;//Posición intermedia (kg)
        float solutionInKg= units10(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);

        UTransFloat=solutionInKg;
        float solutionXToPound= KgToPound(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", solutionXToPound+"");
        return solutionXToPound;
    }
//LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido XToPound
     * @param SpinnerPosition9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner10_10(int SpinnerPosition9, int SpinnerPosition10, float UTransFloat, float UTransfFloat){
        if (SpinnerPosition9==6){//Posición intermedia (Kg)
            float solutionXToPound= KgToPound(UTransFloat, UTransfFloat);
            UTransfFloat=solutionXToPound;
        }else{
            UTransfFloat= XToPound(SpinnerPosition9, SpinnerPosition10, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }
}
