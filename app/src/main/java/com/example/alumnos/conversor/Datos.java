package com.example.alumnos.conversor;

import android.util.Log;

public class Datos {

    static public float CambioDatos(int PosicionSpinner5, int PosicionSpinner6, float UTransFloat) {
        float solucion = 1;
        float UTransfFloat=0;
        Log.d("posiciondel sp 1 inicio", PosicionSpinner5+"");
        Log.d("posiciondel sp 2 inicio", PosicionSpinner6+"");

        switch (PosicionSpinner5) {

            case 0://bits
                solucion = bitToX(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
            case 1://Bytes
                solucion = unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
            case 2://Kilobytes
                solucion = unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
            case 3://Megabytes
                solucion = unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
            case 4://Gigabytes
                solucion = unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
            case 5://Terabytes
                solucion = unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
            case 6://Petabytes
                solucion = unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
            case 7://Hexabytes
                solucion = unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
                break;
        }
        return solucion;
    }

    /**
     * Convierte de una unidad a otra proporcionales entre si (1000)
     * @param PosicionSpinner5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat Resultado
     * @return
     */
    static public float unidades1024 (int PosicionSpinner5, int PosicionSpinner6, float UTransFloat, float UTransfFloat){
        Log.d("posiciondel sp 2 dat", PosicionSpinner6+"");
        if (PosicionSpinner6==0){
            UTransfFloat = Spinner6_0(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
        }else{
            Log.d("posiciondel sp 1 dat", PosicionSpinner5+"");
            int saltos = PosicionSpinner5 - PosicionSpinner6;
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
            //float UTransfFloat;

            for (i=0; i<saltos; i++){
                if (multiplicar==true){//Positivo/Multiplicar = Bajar unidad
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
     * @param PosicionSpinner5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float bitToX(int PosicionSpinner5, int PosicionSpinner6, float UTransFloat, float UTransfFloat){

        UTransfFloat=bitToByte(UTransFloat, UTransfFloat);
        UTransFloat=UTransfFloat;
        Log.d("resultado", UTransFloat+"");

        PosicionSpinner5=1;
        float solucionbitToX=unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);

        Log.d("resultado bitToX", solucionbitToX+"");
        return solucionbitToX;
    }
    /**
     * Convierte cualquier unidad a bit
     * @param PosicionSpinner5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float XToBit(int PosicionSpinner5, int PosicionSpinner6, float UTransFloat, float UTransfFloat){
        PosicionSpinner6=1;//Posición intermedia (bit)
        float solucionEnBytes=unidades1024(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
        Log.d("resultado bytes", solucionEnBytes+"");
        UTransFloat=solucionEnBytes;
        float solucionXTobit=ByteToBit(UTransFloat, UTransfFloat);

        Log.d("resultado XToBit", solucionXTobit+"");
        return solucionXTobit;
    }
//LLamadas---------------------------------------------------------------
    /**
     * Si la unidad seleccionada es la posición intermedia, lo transforma. Si no, llama al métido XToBit
     * @param PosicionSpinner5 Posición que tiene el Spinner de la izquierda y unidad desde la que se va a convertir
     * @param PosicionSpinner6 Posición que tiene el Spinner de la derecha y unidad a la que se va a convertir
     * @param UTransFloat Numero a convertir
     * @param UTransfFloat resultado
     * @return resultado
     */
    static public float Spinner6_0(int PosicionSpinner5, int PosicionSpinner6, float UTransFloat, float UTransfFloat){
        Log.d("pos sp 5 en llamada", PosicionSpinner5+"");
        Log.d("pos sp 6 en llamada", PosicionSpinner6+"");

        if (PosicionSpinner5==1){ //Posición intermedia (bit)
            float solucionXTobit=ByteToBit(UTransFloat, UTransfFloat);
            UTransfFloat=solucionXTobit;
        }else{
            UTransfFloat=XToBit(PosicionSpinner5, PosicionSpinner6, UTransFloat, UTransfFloat);
        }
        return UTransfFloat;
    }

}
