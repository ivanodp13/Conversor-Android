package com.example.alumnos.conversor;

import android.util.Log;
public class Masa {
    static public float CambioMasa(int PosicionSpinner9, int PosicionSpinner10, float UTransFloat) {
        float solucion = 1;
        float UTransfFloat=0;

        switch (PosicionSpinner9) {

            case 0://mg
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 1://cg
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 2://dg
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 3://g
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 4://dag
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 5://hg
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 6://kg
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 7://mag
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 8://q
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 9://t
                solucion = unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
            case 10://Libra
                solucion = LibraToX(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
                break;
        }
        return solucion;
    }

    /**
     * Convierte de una unidad a otra proporcionales entre si (10)
     * @param PosicionSpinner9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat Resultado
     * @return
     */
    static public float unidades10 (int PosicionSpinner9, int PosicionSpinner10, float UTransFloat, float UTransfFloat){

        if (PosicionSpinner10==10){
            UTransfFloat=Spinner10_10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
        }else{
        Log.d("pos2", PosicionSpinner9+"");
        int saltos = PosicionSpinner9 - PosicionSpinner10;
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
//Libra---------------------------------------------------------------

    /**
     * Convierte de Libra a Kg
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float LibraToKg(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat / 2.205f);
        return UTransfFloat;
    }

    /**
     * Convierte de Kg a Libra
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float KgToLibra(float UTransFloat, float UTransfFloat){
        UTransfFloat = (UTransFloat * 2.205f);
        return UTransfFloat;
    }

    /**
     * Convierte de Libra a cualquier unidad
     * @param PosicionSpinner9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float LibraToX(int PosicionSpinner9, int PosicionSpinner10, float UTransFloat, float UTransfFloat){

        UTransfFloat=LibraToKg(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        PosicionSpinner9=6;
        float solucionLibraToKg=unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solucionLibraToKg+"");
        return solucionLibraToKg;
    }
    /**
     * Convierte de cualquier unidad a Libra
     * @param PosicionSpinner9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToLibra(int PosicionSpinner9, int PosicionSpinner10, float UTransFloat, float UTransfFloat){
        PosicionSpinner10=6;//Posición intermedia (kg)
        float solucionEnKg=unidades10(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);

        UTransFloat=solucionEnKg;
        float solucionXToLibras=KgToLibra(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", solucionXToLibras+"");
        return solucionXToLibras;
    }
//LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido XToLibra
     * @param PosicionSpinner9 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner10 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner10_10(int PosicionSpinner9, int PosicionSpinner10, float UTransFloat, float UTransfFloat){
        if (PosicionSpinner9==6){//Posición intermedia (Kg)
            float solucionXToLibra=KgToLibra(UTransFloat, UTransfFloat);
            UTransfFloat=solucionXToLibra;
        }else{
            UTransfFloat=XToLibra(PosicionSpinner9, PosicionSpinner10, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }
}
