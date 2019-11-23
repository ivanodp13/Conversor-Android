package com.example.alumnos.conversor;

import android.util.Log;

public class Data {

    static public float DataConversion(int SpinnerPosition5, int SpinnerPosition6, float UTransFloat) {
        float solution = 1;
        float UTransfFloat=0;
        Log.d("posiciondel sp 1 inicio", SpinnerPosition5+"");
        Log.d("posiciondel sp 2 inicio", SpinnerPosition6+"");

        switch (SpinnerPosition5) {

            case 0://bits
                solution = bitToX(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
            case 1://Bytes
                solution = units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
            case 2://Kilobytes
                solution = units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
            case 3://Megabytes
                solution = units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
            case 4://Gigabytes
                solution = units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
            case 5://Terabytes
                solution = units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
            case 6://Petabytes
                solution = units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
            case 7://Hexabytes
                solution = units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
                break;
        }
        return solution;
    }

    /**
     * Convierte de una unidad a otra proporcionales entre si (1000)
     * @param SpinnerPosition5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat Resultado
     * @return
     */
    static public float units1024(int SpinnerPosition5, int SpinnerPosition6, float UTransFloat, float UTransfFloat){
        Log.d("posiciondel sp 2 dat", SpinnerPosition6+"");
        if (SpinnerPosition6==0){
            UTransfFloat = Spinner6_0(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
        }else{
            Log.d("posiciondel sp 1 dat", SpinnerPosition5+"");
            int jumps = SpinnerPosition5 - SpinnerPosition6;
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
            //float UTransfFloat;

            for (i=0; i<jumps; i++){
                if (multiply==true){//Positivo/Multiplicar = Bajar unidad
                    UTransFloat = UTransFloat *1000;
                    Log.d("conversion mult", UTransFloat+"");
                    UTransfFloat=UTransFloat;
                }else{//Negativo/Dividir = Subir unidad
                    UTransFloat = UTransFloat / 1000;
                    Log.d("conversion divi", UTransFloat+"");
                    UTransfFloat=UTransFloat;
                }
            }
        }
        return UTransfFloat;
    }

//bit------------------------------------------------

    /**
     * Convierte de bit a Byte
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float bitToByte(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat / 8);
        return UTransfFloat;
    }

    /**
     * Convierte de Byte a bit
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float ByteToBit(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat * 8);
        return UTransfFloat;
    }

    /**
     * Convierte de bits a cualquier unidad
     * @param SpinnerPosition5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float bitToX(int SpinnerPosition5, int SpinnerPosition6, float UTransFloat, float UTransfFloat){

        UTransfFloat=bitToByte(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        SpinnerPosition5=1;
        float solutionbitToX= units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solutionbitToX+"");
        return solutionbitToX;
    }
    /**
     * Convierte cualquier unidad a bit
     * @param SpinnerPosition5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToBit(int SpinnerPosition5, int SpinnerPosition6, float UTransFloat, float UTransfFloat){
        SpinnerPosition6=1;//Posición intermedia (bit)
        float solutionInBytes= units1024(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
        Log.d("resultado bytes", solutionInBytes+"");
        UTransFloat=solutionInBytes;
        float XTobitSolution=ByteToBit(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", XTobitSolution+"");
        return XTobitSolution;
    }
//LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido XToBit
     * @param SpinnerPosition5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param SpinnerPosition6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner6_0(int SpinnerPosition5, int SpinnerPosition6, float UTransFloat, float UTransfFloat){
        Log.d("pos sp 5 en llamada", SpinnerPosition5+"");
        Log.d("pos sp 6 en llamada", SpinnerPosition6+"");

        if (SpinnerPosition5==1){ //Posición intermedia (bit)
            float solucionXTobit=ByteToBit(UTransFloat, UTransfFloat);
            UTransfFloat=solucionXTobit;
        }else{
            UTransfFloat=XToBit(SpinnerPosition5, SpinnerPosition6, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }

}
