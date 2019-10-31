package com.example.alumnos.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//Menu---------------------------

    Spinner MenuSpinner;
    int PosicionMenu;

    LinearLayout VTemperatura;
    LinearLayout VDivisas;
    LinearLayout VDatos;
    LinearLayout VLongitud;
    LinearLayout VMasa;
    LinearLayout VVolumen;
    LinearLayout VAstronomicas;
    LinearLayout VPresion;
    LinearLayout VVelocidad;
    LinearLayout VArea;

//Menu fin----------------------

//Temperatura---------------------------
    Spinner TemperaturaSpinner1;
    EditText UTransformar_Temp;
    Spinner TemperaturaSpinner2;
    TextView UTransformada_Temp;

    int PosicionSpinner1;
    int PosicionSpinner2;
    String Unidad_Temp;
//Temperatura fin----------------------

//Divisas---------------------------
    Spinner DivisasSpinner3;
    EditText UTransformar_Div;
    Spinner DivisasSpinner4;
    TextView UTransformada_Div;

    int PosicionSpinner3;
    int PosicionSpinner4;
    String Unidad_Div;
//Divisas fin----------------------

//Datos---------------------------

    Spinner DatosSpinner5;
    EditText UTransformar_Dat;
    Spinner DatosSpinner6;
    TextView UTransformada_Dat;

    int PosicionSpinner5;
    int PosicionSpinner6;
    String Unidad_Dat;
//Datos fin----------------------

//Longitud---------------------------
    Spinner LongitudSpinner7;
    EditText UTransformar_Long;
    Spinner LongitudSpinner8;
    TextView UTransformada_Long;

    int PosicionSpinner7;
    int PosicionSpinner8;
    String Unidad_Long;
//Longitud fin----------------------

//Masa---------------------------

    Spinner MasaSpinner9;
    EditText UTransformar_Mas;
    Spinner MasaSpinner10;
    TextView UTransformada_Mas;

    int PosicionSpinner9;
    int PosicionSpinner10;
    String Unidad_Mas;
//Masa fin----------------------

//Volumen---------------------------

    Spinner VolumenSpinner11;
    EditText UTransformar_Vol;
    Spinner VolumenSpinner12;
    TextView UTransformada_Vol;

    int PosicionSpinner11;
    int PosicionSpinner12;
    String Unidad_Vol;
//Volumen fin----------------------

//UAstronomicas---------------------------

    Spinner UAstSpinner13;
    EditText UTransformar_UA;
    Spinner UastSpinner14;
    TextView UTransformada_UA;

    int PosicionSpinner13;
    int PosicionSpinner14;
    String Unidad_UA;
//UAstronomicas fin----------------------
//UAstronomicas---------------------------

    Spinner PresSpinner15;
    EditText UTransformar_Pres;
    Spinner PresSpinner16;
    TextView UTransformada_Pres;

    int PosicionSpinner15;
    int PosicionSpinner16;
    String Unidad_Pres;
//UAstronomicas fin----------------------
//Velocidad---------------------------

    Spinner VelSpinner17;
    EditText UTransformar_Vel;
    Spinner VelSpinner18;
    TextView UTransformada_Vel;

    int PosicionSpinner17;
    int PosicionSpinner18;
    String Unidad_Vel;
//Velocidad fin----------------------
//Area---------------------------

    Spinner ArSpinner19;
    EditText UTransformar_Ar;
    Spinner ArSpinner20;
    TextView UTransformada_Ar;

    int PosicionSpinner19;
    int PosicionSpinner20;
    String Unidad_Ar;
//Area fin----------------------

    String UTrans_Temp;
    String UTrans_Div;
    String UTrans_Dat;
    String UTrans_Long;
    String UTrans_Mas;
    String UTrans_Vol;
    String UTrans_UA;
    String UTrans_Pres;
    String UTrans_Vel;
    String UTrans_Ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuSpinner=findViewById(R.id.MenuSeleccion);
        VTemperatura=findViewById(R.id.Temperatura);
        VDivisas=findViewById(R.id.Divisas);
        VDatos=findViewById(R.id.Datos);
        VLongitud=findViewById(R.id.Longitud);
        VMasa=findViewById(R.id.Masa);
        VVolumen=findViewById(R.id.Volumen);
        VAstronomicas=findViewById(R.id.UAstronomicas);
        VPresion=findViewById(R.id.Presion);
        VVelocidad=findViewById(R.id.Velocidad);
        VArea=findViewById(R.id.Area);


        TemperaturaSpinner1=findViewById(R.id.TemperaturaSpinner1);
        TemperaturaSpinner2=findViewById(R.id.TemperaturaSpinner2);
        TemperaturaSpinner2.setSelection(1);
        UTransformar_Temp=findViewById(R.id.UTransformar_Temp);
        UTransformada_Temp=findViewById(R.id.UTransformada_Temp);


        DivisasSpinner3=findViewById(R.id.DivisasSpinner1);
        DivisasSpinner4=findViewById(R.id.DivisasSpinner2);
        DivisasSpinner4.setSelection(1);
        UTransformar_Div=findViewById(R.id.UTransformar_Div);
        UTransformada_Div=findViewById(R.id.UTransformada_Div);


        DatosSpinner5=findViewById(R.id.DatosSpinner1);
        DatosSpinner6=findViewById(R.id.DatosSpinner2);
        DatosSpinner6.setSelection(1);
        UTransformar_Dat=findViewById(R.id.UTransformar_Dat);
        UTransformada_Dat=findViewById(R.id.UTransformada_Dat);


        LongitudSpinner7=findViewById(R.id.LongSpinner1);
        LongitudSpinner8=findViewById(R.id.LongSpinner2);
        LongitudSpinner8.setSelection(1);
        UTransformar_Long=findViewById(R.id.UTransformar_Long);
        UTransformada_Long=findViewById(R.id.UTransformada_Long);

        MasaSpinner9=findViewById(R.id.MasSpinner1);
        MasaSpinner10=findViewById(R.id.MasSpinner2);
        MasaSpinner10.setSelection(1);
        UTransformar_Mas=findViewById(R.id.UTransformar_Mas);
        UTransformada_Mas=findViewById(R.id.UTransformada_Mas);

        VolumenSpinner11=findViewById(R.id.VolSpinner1);
        VolumenSpinner12=findViewById(R.id.VolSpinner2);
        VolumenSpinner12.setSelection(1);
        UTransformar_Vol=findViewById(R.id.UTransformar_Vol);
        UTransformada_Vol=findViewById(R.id.UTransformada_Vol);

        UAstSpinner13=findViewById(R.id.UASpinner1);
        UastSpinner14=findViewById(R.id.UASpinner2);
        UastSpinner14.setSelection(1);
        UTransformar_UA=findViewById(R.id.UTransformar_UA);
        UTransformada_UA=findViewById(R.id.UTransformada_UA);

        PresSpinner15=findViewById(R.id.PresSpinner1);
        PresSpinner16=findViewById(R.id.PresSpinner2);
        PresSpinner16.setSelection(1);
        UTransformar_Pres=findViewById(R.id.UTransformar_Pres);
        UTransformada_Pres=findViewById(R.id.UTransformada_Pres);

        VelSpinner17=findViewById(R.id.VelSpinner1);
        VelSpinner18=findViewById(R.id.VelSpinner2);
        VelSpinner18.setSelection(1);
        UTransformar_Vel=findViewById(R.id.UTransformar_Vel);
        UTransformada_Vel=findViewById(R.id.UTransformada_Vel);

        ArSpinner19=findViewById(R.id.ArSpinner1);
        ArSpinner20=findViewById(R.id.ArSpinner2);
        ArSpinner20.setSelection(1);
        UTransformar_Ar=findViewById(R.id.UTransformar_Ar);
        UTransformada_Ar=findViewById(R.id.UTransformada_Ar);



//Menu---------------------------

        MenuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionMenu = position;
                Log.d("PosicionMenu" ,PosicionMenu+"");

            //Menu para cambiar la visibilidad de los diferentes menus de cambio de unidad
                switch (PosicionMenu){
                    case 0://Temperatura
                        Visibilidad_Temp();
                        break;
                    case 1://Divisas
                        Visibilidad_Div();
                        break;
                    case 2://Datos
                        Visibilidad_Dat();
                        break;
                    case 3://Longitud
                        Visibilidad_Long();
                        break;
                    case 4://Masa
                        Visibilidad_Mas();
                        break;
                    case 5://Volumen
                        Visibilidad_Vol();
                        break;
                    case 6://Astronómicas
                        Visibilidad_UA();
                        break;
                    case 7://Presion
                        Visibilidad_Presion();
                        break;
                    case 8://Velocidad
                        Visibilidad_Velocidad();
                        break;
                    case 9://Area
                        Visibilidad_Area();
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
//Menu fin----------------------

//Listeners de los diferentes Spinners y EditText

//Temperatura---------------------------
        //El listener llama al metodo alojado en la clase correspondiente
        TemperaturaSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner1 = position;
                //Temperatura---------------------------
                UTrans_Temp=envio_Temp();
                if (UTrans_Temp.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Temp = Float.parseFloat(UTrans_Temp);

                float UTransfFloat_Temp = Temperatura.CambioTemperatura(PosicionSpinner1, PosicionSpinner2, UTransFloat_Temp);
                recepcion_Temp(UTransfFloat_Temp);
                //Temperatura fin----------------------
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //El listener llama al metodo alojado en la clase correspondiente
        TemperaturaSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            //Temperatura---------------------------
                PosicionSpinner2 = position;
                UTrans_Temp=envio_Temp();
                if (UTrans_Temp.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Temp = Float.parseFloat(UTrans_Temp);

                float UTransfFloat_Temp = Temperatura.CambioTemperatura(PosicionSpinner1, PosicionSpinner2, UTransFloat_Temp);
                recepcion_Temp(UTransfFloat_Temp);
            //Temperatura fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Temp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Temp = UTransformar_Temp.getText().toString();

                UTrans_Temp=envio_Temp();
                float UTransFloat_Temp = Float.parseFloat(UTrans_Temp);

                float UTransfFloat_Temp = Temperatura.CambioTemperatura(PosicionSpinner1, PosicionSpinner2, UTransFloat_Temp);
                recepcion_Temp(UTransfFloat_Temp);
            }
        });
//Temperatura fin----------------------

//Divisas----------------------
        //El listener llama al metodo alojado en la clase correspondiente
        DivisasSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner3 = position;
                //Divisas---------------------------
                UTrans_Div=envio_Div();
                if (UTrans_Div.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Div = Float.parseFloat(UTrans_Div);

                float UTransfFloat_Div = Divisas.CambioDivisa(PosicionSpinner3, PosicionSpinner4, UTransFloat_Div);
                recepcion_Div(UTransfFloat_Div);
                //Divisas fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        DivisasSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //Divisas---------------------------
                PosicionSpinner4 = position;
                UTrans_Div=envio_Div();
                if (UTrans_Div.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Div = Float.parseFloat(UTrans_Div);

                float UTransfFloat_Div = Divisas.CambioDivisa(PosicionSpinner3, PosicionSpinner4, UTransFloat_Div);
                recepcion_Div(UTransfFloat_Div);
            //Divisas fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Div.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Div = UTransformar_Div.getText().toString();

                UTrans_Div=envio_Div();
                float UTransFloat_Div = Float.parseFloat(UTrans_Div);

                float UTransfFloat_Div = Divisas.CambioDivisa(PosicionSpinner3, PosicionSpinner4, UTransFloat_Div);
                recepcion_Div(UTransfFloat_Div);
            }
        });
//Divisas fin----------------------

//Datos----------------------
        //El listener llama al metodo alojado en la clase correspondiente
        DatosSpinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner5 = position;
                //Datos---------------------------
                UTrans_Dat=envio_Dat();
                if (UTrans_Dat.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Dat = Float.parseFloat(UTrans_Dat);

                float UTransfFloat_Dat = Datos.CambioDatos(PosicionSpinner5, PosicionSpinner6, UTransFloat_Dat);
                recepcion_Dat(UTransfFloat_Dat);
                //Datos fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        DatosSpinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Datos---------------------------
                PosicionSpinner6 = position;
                UTrans_Dat=envio_Dat();
                if (UTrans_Dat.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Dat = Float.parseFloat(UTrans_Dat);

                float UTransfFloat_Dat = Datos.CambioDatos(PosicionSpinner5, PosicionSpinner6, UTransFloat_Dat);
                recepcion_Dat(UTransfFloat_Dat);
                //Datos fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Dat.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Dat = UTransformar_Dat.getText().toString();

                UTrans_Dat=envio_Dat();
                float UTransFloat_Dat = Float.parseFloat(UTrans_Dat);

                float UTransfFloat_Dat = Datos.CambioDatos(PosicionSpinner5, PosicionSpinner6, UTransFloat_Dat);
                recepcion_Dat(UTransfFloat_Dat);
            }
        });
//Datos fin----------------------

//Longitud----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        LongitudSpinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner7 = position;
                //Longitud---------------------------
                UTrans_Long=envio_Long();
                if (UTrans_Long.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Long = Float.parseFloat(UTrans_Long);

                float UTransfFloat_Long = Longitud.CambioLongitud(PosicionSpinner7, PosicionSpinner8, UTransFloat_Long);
                recepcion_Long(UTransfFloat_Long);
                //Longitud fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        LongitudSpinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Longitud---------------------------
                PosicionSpinner8 = position;
                UTrans_Long=envio_Long();
                if (UTrans_Long.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Long = Float.parseFloat(UTrans_Long);

                float UTransfFloat_Long = Longitud.CambioLongitud(PosicionSpinner7, PosicionSpinner8, UTransFloat_Long);
                recepcion_Long(UTransfFloat_Long);
                //Longitud fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Long.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Long = UTransformar_Long.getText().toString();

                UTrans_Long=envio_Long();
                float UTransFloat_Long = Float.parseFloat(UTrans_Long);

                float UTransfFloat_Long = Longitud.CambioLongitud(PosicionSpinner7, PosicionSpinner8, UTransFloat_Long);
                recepcion_Long(UTransfFloat_Long);
            }
        });
//Longitud fin----------------------

//Masa----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        MasaSpinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner9 = position;
                //Masa---------------------------
                UTrans_Mas=envio_Mas();
                if (UTrans_Mas.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Mas = Float.parseFloat(UTrans_Mas);

                float UTransfFloat_Mas = Masa.CambioMasa(PosicionSpinner9, PosicionSpinner10, UTransFloat_Mas);
                recepcion_Mas(UTransfFloat_Mas);
                //Masa fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        MasaSpinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Masa---------------------------
                PosicionSpinner10 = position;
                UTrans_Mas=envio_Mas();
                if (UTrans_Mas.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Mas = Float.parseFloat(UTrans_Mas);

                float UTransfFloat_Mas = Masa.CambioMasa(PosicionSpinner9, PosicionSpinner10, UTransFloat_Mas);
                recepcion_Mas(UTransfFloat_Mas);
                //Masa fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Mas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Mas = UTransformar_Mas.getText().toString();

                UTrans_Mas=envio_Mas();
                float UTransFloat_Mas = Float.parseFloat(UTrans_Mas);

                float UTransfFloat_Mas = Masa.CambioMasa(PosicionSpinner9, PosicionSpinner10, UTransFloat_Mas);
                recepcion_Mas(UTransfFloat_Mas);
            }
        });
//Masa fin----------------------

//Volumen----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        VolumenSpinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner11 = position;
                //Volumen---------------------------
                UTrans_Vol=envio_Vol();
                if (UTrans_Vol.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Vol = Float.parseFloat(UTrans_Vol);

                float UTransfFloat_Vol = Volumen.CambioVolumen(PosicionSpinner11, PosicionSpinner12, UTransFloat_Vol);
                recepcion_Vol(UTransfFloat_Vol);
                //Volumen fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        VolumenSpinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Volumen---------------------------
                PosicionSpinner12 = position;
                UTrans_Vol=envio_Vol();
                if (UTrans_Vol.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Vol = Float.parseFloat(UTrans_Vol);

                float UTransfFloat_Vol = Volumen.CambioVolumen(PosicionSpinner11, PosicionSpinner12, UTransFloat_Vol);
                recepcion_Vol(UTransfFloat_Vol);
                //Volumen fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Vol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Vol = UTransformar_Vol.getText().toString();

                UTrans_Vol=envio_Vol();
                float UTransFloat_Vol = Float.parseFloat(UTrans_Vol);

                float UTransfFloat_Vol = Volumen.CambioVolumen(PosicionSpinner11, PosicionSpinner12, UTransFloat_Vol);
                recepcion_Vol(UTransfFloat_Vol);
            }
        });
//Volumen fin----------------------

//UAstronomicas----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        UAstSpinner13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner13 = position;
                //UAstronomicas---------------------------
                UTrans_UA=envio_UA();
                if (UTrans_UA.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_UA = Float.parseFloat(UTrans_UA);

                float UTransfFloat_UA = UAstronomicas.CambioUAstronomicas(PosicionSpinner13, PosicionSpinner14, UTransFloat_UA);
                recepcion_UA(UTransfFloat_UA);
                //UAstronomicas fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        UastSpinner14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //UAstronomicas---------------------------
                PosicionSpinner14 = position;
                UTrans_UA=envio_UA();
                if (UTrans_UA.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_UA = Float.parseFloat(UTrans_UA);

                float UTransfFloat_UA = UAstronomicas.CambioUAstronomicas(PosicionSpinner13, PosicionSpinner14, UTransFloat_UA);
                recepcion_UA(UTransfFloat_UA);
                //UAstronomicas fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_UA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_UA = UTransformar_UA.getText().toString();

                UTrans_UA=envio_UA();
                float UTransFloat_UA = Float.parseFloat(UTrans_UA);

                float UTransfFloat_UA = UAstronomicas.CambioUAstronomicas(PosicionSpinner13, PosicionSpinner14, UTransFloat_UA);
                recepcion_UA(UTransfFloat_UA);
            }
        });
//UAstronomicas fin----------------------

//Presion----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        PresSpinner15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner15 = position;
                //Presion---------------------------
                UTrans_Pres=envio_Pres();
                if (UTrans_Pres.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Pres = Float.parseFloat(UTrans_Pres);

                float UTransfFloat_Pres = Presion.CambioPresion(PosicionSpinner15, PosicionSpinner16, UTransFloat_Pres);
                recepcion_Pres(UTransfFloat_Pres);
                //Presion fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        PresSpinner16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Presion---------------------------
                PosicionSpinner16 = position;
                UTrans_Pres=envio_Pres();
                if (UTrans_Pres.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Pres = Float.parseFloat(UTrans_Pres);

                float UTransfFloat_Pres = Presion.CambioPresion(PosicionSpinner15, PosicionSpinner16, UTransFloat_Pres);
                recepcion_Pres(UTransfFloat_Pres);
                //Presion fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Pres.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Pres = UTransformar_Pres.getText().toString();

                UTrans_Pres=envio_Pres();
                float UTransFloat_Pres = Float.parseFloat(UTrans_Pres);

                float UTransfFloat_Pres = Presion.CambioPresion(PosicionSpinner15, PosicionSpinner16, UTransFloat_Pres);
                recepcion_Pres(UTransfFloat_Pres);
            }
        });
//Presion fin----------------------

//Velocidad----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        VelSpinner17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner17 = position;
                //Velocidad---------------------------
                UTrans_Vel=envio_Vel();
                if (UTrans_Vel.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Vel = Float.parseFloat(UTrans_Vel);

                float UTransfFloat_Vel = Velocidad.CambioVelocidad(PosicionSpinner17, PosicionSpinner18, UTransFloat_Vel);
                recepcion_Vel(UTransfFloat_Vel);
                //Velocidad fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        VelSpinner18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Velocidad---------------------------
                PosicionSpinner18 = position;
                UTrans_Vel=envio_Vel();
                if (UTrans_Vel.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Vel = Float.parseFloat(UTrans_Vel);

                float UTransfFloat_Vel = Velocidad.CambioVelocidad(PosicionSpinner17, PosicionSpinner18, UTransFloat_Vel);
                recepcion_Vel(UTransfFloat_Vel);
                //Velocidad fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Vel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Vel = UTransformar_Vel.getText().toString();

                UTrans_Vel=envio_Vel();
                float UTransFloat_Vel = Float.parseFloat(UTrans_Vel);

                float UTransfFloat_Vel = Velocidad.CambioVelocidad(PosicionSpinner17, PosicionSpinner18, UTransFloat_Vel);
                recepcion_Vel(UTransfFloat_Vel);
            }
        });
//Velocidad fin----------------------

//Area----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        ArSpinner19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PosicionSpinner19 = position;
                //Area---------------------------
                UTrans_Ar=envio_Ar();
                if (UTrans_Ar.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Ar = Float.parseFloat(UTrans_Ar);

                float UTransfFloat_Ar = Area.CambioArea(PosicionSpinner19, PosicionSpinner20, UTransFloat_Ar);
                recepcion_Ar(UTransfFloat_Ar);
                //Area fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        ArSpinner20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Area---------------------------
                PosicionSpinner20 = position;
                UTrans_Ar=envio_Ar();
                if (UTrans_Ar.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Ar = Float.parseFloat(UTrans_Ar);

                float UTransfFloat_Ar = Area.CambioArea(PosicionSpinner19, PosicionSpinner20, UTransFloat_Ar);
                recepcion_Ar(UTransfFloat_Ar);
                //Area fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransformar_Ar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Unidad_Ar = UTransformar_Ar.getText().toString();

                UTrans_Ar=envio_Ar();
                float UTransFloat_Ar = Float.parseFloat(UTrans_Ar);

                float UTransfFloat_Ar = Area.CambioArea(PosicionSpinner19, PosicionSpinner20, UTransFloat_Ar);
                recepcion_Ar(UTransfFloat_Ar);
            }
        });
//Area fin----------------------

    }


//Envio y recepcion de unidades. Envio de la solucion a la vista

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Temp (){
        String UTrans = UTransformar_Temp.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Temp (float UTransfFloat) {
        String SolFinTemp = Float.toString(UTransfFloat);
        UTransformada_Temp.setText(SolFinTemp);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Div (){
        String UTrans = UTransformar_Div.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Div (float UTransfFloat){
        String SolFinDiv = Float.toString(UTransfFloat);
        UTransformada_Div.setText(SolFinDiv);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Dat (){
        String UTrans = UTransformar_Dat.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Dat (float UTransfFloat){
        String SolFinDat = Float.toString(UTransfFloat);
        UTransformada_Dat.setText(SolFinDat);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Long (){
        String UTrans = UTransformar_Long.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Long (float UTransfFloat){
        String SolFinLong = Float.toString(UTransfFloat);
        UTransformada_Long.setText(SolFinLong);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Mas (){
        String UTrans = UTransformar_Mas.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Mas (float UTransfFloat){
        String SolFinMas = Float.toString(UTransfFloat);
        UTransformada_Mas.setText(SolFinMas);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Vol (){
        String UTrans = UTransformar_Vol.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Vol (float UTransfFloat){
        String SolFinVol = Float.toString(UTransfFloat);
        UTransformada_Vol.setText(SolFinVol);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_UA (){
        String UTrans = UTransformar_UA.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_UA (float UTransfFloat){
        String SolFinUA = Float.toString(UTransfFloat);
        UTransformada_UA.setText(SolFinUA);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Pres (){
        String UTrans = UTransformar_Pres.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Pres (float UTransfFloat){
        String SolFinPres = Float.toString(UTransfFloat);
        UTransformada_Pres.setText(SolFinPres);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Vel (){
        String UTrans = UTransformar_Vel.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Vel (float UTransfFloat){
        String SolFinVel = Float.toString(UTransfFloat);
        UTransformada_Vel.setText(SolFinVel);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String envio_Ar (){
        String UTrans = UTransformar_Ar.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void recepcion_Ar (float UTransfFloat){
        String SolFinAr = Float.toString(UTransfFloat);
        UTransformada_Ar.setText(SolFinAr);
    }


//Visibilidad de los Spinners segun la selección

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Temp (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Div (){
        VTemperatura.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VDivisas.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Dat (){
        VDivisas.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VDatos.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Long (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VLongitud.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Mas (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VMasa.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Vol (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VVolumen.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_UA (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Presion (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VPresion.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Velocidad (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibilidad_Area (){
        VDivisas.setVisibility(View.GONE);
        VDatos.setVisibility(View.GONE);
        VLongitud.setVisibility(View.GONE);
        VMasa.setVisibility(View.GONE);
        VVolumen.setVisibility(View.GONE);
        VAstronomicas.setVisibility(View.GONE);
        VTemperatura.setVisibility(View.GONE);
        VVelocidad.setVisibility(View.GONE);
        VPresion.setVisibility(View.GONE);
        VArea.setVisibility(View.VISIBLE);
    }
}