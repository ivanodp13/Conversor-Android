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

    Spinner SpinnerMenu;
    int PositionMenu;

    LinearLayout VTemperature;
    LinearLayout VCurrency;
    LinearLayout VData;
    LinearLayout VLength;
    LinearLayout VMass;
    LinearLayout VVolume;
    LinearLayout VAstronomical;
    LinearLayout VPressure;
    LinearLayout VSpeed;
    LinearLayout VArea;

//Menu fin----------------------

//Temperature---------------------------
    Spinner TemperatureSpinner1;
    EditText UTransform_Temp;
    Spinner TemperatureSpinner2;
    TextView UTransformated_Temp;

    int SpinnerPosition1;
    int SpinnerPosition2;
    String Temp_Unit;
//Temperature fin----------------------

//Currency---------------------------
    Spinner CurrencySpinner3;
    EditText UTransform_Cur;
    Spinner CurrencySpinner4;
    TextView UTransformated_Cur;

    int SpinnerPosition3;
    int SpinnerPosition4;
    String Div_Unit;
//Currency fin----------------------

//Data---------------------------

    Spinner DataSpinner5;
    EditText UTransform_Dat;
    Spinner DataSpinner6;
    TextView UTransformated_Dat;

    int SpinnerPosition5;
    int SpinnerPosition6;
    String Dat_Unit;
//Data fin----------------------

//Length---------------------------
    Spinner LengthSpinner7;
    EditText UTransform_Leng;
    Spinner LengthSpinner8;
    TextView UTransformated_Leng;

    int SpinnerPosition7;
    int SpinnerPosition8;
    String Leng_Unit;
//Length fin----------------------

//Mass---------------------------

    Spinner MassSpinner9;
    EditText UTransform_Mas;
    Spinner MassSpinner10;
    TextView UTransformated_Mas;

    int SpinnerPosition9;
    int SpinnerPosition10;
    String Mas_Unit;
//Mass fin----------------------

//Volume---------------------------

    Spinner VolumeSpinner11;
    EditText UTransform_Vol;
    Spinner VolumeSpinner12;
    TextView UTransformated_Vol;

    int SpinnerPosition11;
    int SpinnerPosition12;
    String Vol_Unit;
//Volume fin----------------------

//AstronomicalU---------------------------

    Spinner AstUSpinner13;
    EditText UTransform_AU;
    Spinner AstUSpinner14;
    TextView UTransformated_AU;

    int SpinnerPosition13;
    int SpinnerPosition14;
    String AU_Unit;
//AstronomicalU fin----------------------
//AstronomicalU---------------------------

    Spinner PresSpinner15;
    EditText UTransform_Pres;
    Spinner PresSpinner16;
    TextView UTransformated_Pres;

    int SpinnerPosition15;
    int SpinnerPosition16;
    String Pres_Unit;
//AstronomicalU fin----------------------
//Speed---------------------------

    Spinner SpeSpinner17;
    EditText UTransform_Spe;
    Spinner SpeSpinner18;
    TextView UTransformated_Spe;

    int SpinnerPosition17;
    int SpinnerPosition18;
    String Spe_Unit;
//Speed fin----------------------
//Area---------------------------

    Spinner ArSpinner19;
    EditText UTransform_Ar;
    Spinner ArSpinner20;
    TextView UTransformated_Ar;

    int SpinnerPosition19;
    int SpinnerPosition20;
    String Ar_Unit;
//Area fin----------------------

    String UTrans_Temp;
    String UTrans_Cur;
    String UTrans_Dat;
    String UTrans_Leng;
    String UTrans_Mas;
    String UTrans_Vol;
    String UTrans_AU;
    String UTrans_Pres;
    String UTrans_Spe;
    String UTrans_Ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpinnerMenu =findViewById(R.id.MenuSelection);
        VTemperature =findViewById(R.id.Temperature);
        VCurrency =findViewById(R.id.currency);
        VData =findViewById(R.id.Data);
        VLength =findViewById(R.id.Longth);
        VMass =findViewById(R.id.Mass);
        VVolume =findViewById(R.id.Volume);
        VAstronomical =findViewById(R.id.AstronomicalU);
        VPressure =findViewById(R.id.Pressure);
        VSpeed =findViewById(R.id.Speed);
        VArea=findViewById(R.id.Area);


        TemperatureSpinner1 =findViewById(R.id.TemperatureSpinner1);
        TemperatureSpinner2 =findViewById(R.id.TemperatureSpinner2);
        TemperatureSpinner2.setSelection(1);
        UTransform_Temp =findViewById(R.id.UTransform_Temp);
        UTransformated_Temp =findViewById(R.id.UTransformated_Temp);


        CurrencySpinner3 =findViewById(R.id.CurrencySpinner1);
        CurrencySpinner4 =findViewById(R.id.CurrencySpinner2);
        CurrencySpinner4.setSelection(1);
        UTransform_Cur =findViewById(R.id.UTransform_Div);
        UTransformated_Cur =findViewById(R.id.UTransformated_Div);


        DataSpinner5 =findViewById(R.id.DataSpinner1);
        DataSpinner6 =findViewById(R.id.DataSpinner2);
        DataSpinner6.setSelection(1);
        UTransform_Dat =findViewById(R.id.UTransform_Dat);
        UTransformated_Dat =findViewById(R.id.UTransformated_Dat);


        LengthSpinner7 =findViewById(R.id.LengthSpinner1);
        LengthSpinner8 =findViewById(R.id.LengthSpinner2);
        LengthSpinner8.setSelection(1);
        UTransform_Leng =findViewById(R.id.UTransform_Leng);
        UTransformated_Leng =findViewById(R.id.UTransformated_Leng);

        MassSpinner9 =findViewById(R.id.MassSpinner1);
        MassSpinner10 =findViewById(R.id.MassSpinner2);
        MassSpinner10.setSelection(1);
        UTransform_Mas =findViewById(R.id.UTransform_Mas);
        UTransformated_Mas =findViewById(R.id.UTransformated_Mas);

        VolumeSpinner11 =findViewById(R.id.VolumeSpinner1);
        VolumeSpinner12 =findViewById(R.id.VolumeSpinner2);
        VolumeSpinner12.setSelection(1);
        UTransform_Vol =findViewById(R.id.UTransform_Vol);
        UTransformated_Vol =findViewById(R.id.UTransformated_Vol);

        AstUSpinner13 =findViewById(R.id.AUSpinner1);
        AstUSpinner14 =findViewById(R.id.AUSpinner2);
        AstUSpinner14.setSelection(1);
        UTransform_AU =findViewById(R.id.UTransform_AU);
        UTransformated_AU =findViewById(R.id.UTransformated_AU);

        PresSpinner15=findViewById(R.id.PresSpinner1);
        PresSpinner16=findViewById(R.id.PresSpinner2);
        PresSpinner16.setSelection(1);
        UTransform_Pres =findViewById(R.id.UTransform_Pres);
        UTransformated_Pres =findViewById(R.id.UTransformated_Pres);

        SpeSpinner17 =findViewById(R.id.SpeSpinner1);
        SpeSpinner18 =findViewById(R.id.SpeSpinner2);
        SpeSpinner18.setSelection(1);
        UTransform_Spe =findViewById(R.id.UTransform_Spe);
        UTransformated_Spe =findViewById(R.id.UTransform_Spe);

        ArSpinner19=findViewById(R.id.ArSpinner1);
        ArSpinner20=findViewById(R.id.ArSpinner2);
        ArSpinner20.setSelection(1);
        UTransform_Ar =findViewById(R.id.UTransform_Ar);
        UTransformated_Ar =findViewById(R.id.UTransformated_Ar);



//Menu---------------------------

        SpinnerMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                PositionMenu = position;
                Log.d("PositionMenu" , PositionMenu +"");

            //Menu para cambiar la visibilidad de los diferentes menus de cambio de unidad
                switch (PositionMenu){
                    case 0://Temperature
                        Visibility_Temp();
                        break;
                    case 1://Currency
                        Visibility_Currency();
                        break;
                    case 2://Data
                        Visibility_Data();
                        break;
                    case 3://Length
                        Visibility_Length();
                        break;
                    case 4://Mass
                        Visibility_Mass();
                        break;
                    case 5://Volume
                        Visibility_Volume();
                        break;
                    case 6://Astronómicas
                        Visibility_AU();
                        break;
                    case 7://Pressure
                        Visibility_Pressure();
                        break;
                    case 8://Speed
                        Visibility_Speed();
                        break;
                    case 9://Area
                        Visibility_Area();
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
//Menu fin----------------------

//Listeners de los diferentes Spinners y EditText

//Temperature---------------------------
        //El listener llama al metodo alojado en la clase correspondiente
        TemperatureSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition1 = position;
                //Temperature---------------------------
                UTrans_Temp= send_Temp();
                if (UTrans_Temp.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Temp = Float.parseFloat(UTrans_Temp);

                float UTransfFloat_Temp = Temperature.TemperatureConversion(SpinnerPosition1, SpinnerPosition2, UTransFloat_Temp);
                reception_Temp(UTransfFloat_Temp);
                //Temperature fin----------------------
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //El listener llama al metodo alojado en la clase correspondiente
        TemperatureSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            //Temperature---------------------------
                SpinnerPosition2 = position;
                UTrans_Temp= send_Temp();
                if (UTrans_Temp.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Temp = Float.parseFloat(UTrans_Temp);

                float UTransfFloat_Temp = Temperature.TemperatureConversion(SpinnerPosition1, SpinnerPosition2, UTransFloat_Temp);
                reception_Temp(UTransfFloat_Temp);
            //Temperature fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Temp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Temp_Unit = UTransform_Temp.getText().toString();

                UTrans_Temp= send_Temp();
                float UTransFloat_Temp = Float.parseFloat(UTrans_Temp);

                float UTransfFloat_Temp = Temperature.TemperatureConversion(SpinnerPosition1, SpinnerPosition2, UTransFloat_Temp);
                reception_Temp(UTransfFloat_Temp);
            }
        });
//Temperature fin----------------------

//Currency----------------------
        //El listener llama al metodo alojado en la clase correspondiente
        CurrencySpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition3 = position;
                //Currency---------------------------
                UTrans_Cur = send_Cur();
                if (UTrans_Cur.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Cur = Float.parseFloat(UTrans_Cur);

                float UTransfFloat_Cur = Currency.CurrencyConversion(SpinnerPosition3, SpinnerPosition4, UTransFloat_Cur);
                reception_Cur(UTransfFloat_Cur);
                //Currency fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        CurrencySpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //Currency---------------------------
                SpinnerPosition4 = position;
                UTrans_Cur = send_Cur();
                if (UTrans_Cur.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Cur = Float.parseFloat(UTrans_Cur);

                float UTransfFloat_Cur = Currency.CurrencyConversion(SpinnerPosition3, SpinnerPosition4, UTransFloat_Cur);
                reception_Cur(UTransfFloat_Cur);
            //Currency fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Cur.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Div_Unit = UTransform_Cur.getText().toString();

                UTrans_Cur = send_Cur();
                float UTransFloat_Cur = Float.parseFloat(UTrans_Cur);

                float UTransfFloat_Cur = Currency.CurrencyConversion(SpinnerPosition3, SpinnerPosition4, UTransFloat_Cur);
                reception_Cur(UTransfFloat_Cur);
            }
        });
//Currency fin----------------------

//Data----------------------
        //El listener llama al metodo alojado en la clase correspondiente
        DataSpinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition5 = position;
                //Data---------------------------
                UTrans_Dat= send_Dat();
                if (UTrans_Dat.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Dat = Float.parseFloat(UTrans_Dat);

                float UTransfFloat_Dat = Data.DataConversion(SpinnerPosition5, SpinnerPosition6, UTransFloat_Dat);
                reception_Dat(UTransfFloat_Dat);
                //Data fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        DataSpinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Data---------------------------
                SpinnerPosition6 = position;
                UTrans_Dat= send_Dat();
                if (UTrans_Dat.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Dat = Float.parseFloat(UTrans_Dat);

                float UTransfFloat_Dat = Data.DataConversion(SpinnerPosition5, SpinnerPosition6, UTransFloat_Dat);
                reception_Dat(UTransfFloat_Dat);
                //Data fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Dat.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Dat_Unit = UTransform_Dat.getText().toString();

                UTrans_Dat= send_Dat();
                float UTransFloat_Dat = Float.parseFloat(UTrans_Dat);

                float UTransfFloat_Dat = Data.DataConversion(SpinnerPosition5, SpinnerPosition6, UTransFloat_Dat);
                reception_Dat(UTransfFloat_Dat);
            }
        });
//Data fin----------------------

//Length----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        LengthSpinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition7 = position;
                //Length---------------------------
                UTrans_Leng = send_Leng();
                if (UTrans_Leng.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Leng = Float.parseFloat(UTrans_Leng);

                float UTransfFloat_Leng = Length.LengthConversion(SpinnerPosition7, SpinnerPosition8, UTransFloat_Leng);
                reception_Leng(UTransfFloat_Leng);
                //Length fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        LengthSpinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Length---------------------------
                SpinnerPosition8 = position;
                UTrans_Leng = send_Leng();
                if (UTrans_Leng.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Leng = Float.parseFloat(UTrans_Leng);

                float UTransfFloat_Leng = Length.LengthConversion(SpinnerPosition7, SpinnerPosition8, UTransFloat_Leng);
                reception_Leng(UTransfFloat_Leng);
                //Length fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Leng.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Leng_Unit = UTransform_Leng.getText().toString();

                UTrans_Leng = send_Leng();
                float UTransFloat_Leng = Float.parseFloat(UTrans_Leng);

                float UTransfFloat_Leng = Length.LengthConversion(SpinnerPosition7, SpinnerPosition8, UTransFloat_Leng);
                reception_Leng(UTransfFloat_Leng);
            }
        });
//Length fin----------------------

//Mass----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        MassSpinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition9 = position;
                //Mass---------------------------
                UTrans_Mas= send_Mas();
                if (UTrans_Mas.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Mas = Float.parseFloat(UTrans_Mas);

                float UTransfFloat_Mas = Mass.MassConversion(SpinnerPosition9, SpinnerPosition10, UTransFloat_Mas);
                reception_Mas(UTransfFloat_Mas);
                //Mass fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        MassSpinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Mass---------------------------
                SpinnerPosition10 = position;
                UTrans_Mas= send_Mas();
                if (UTrans_Mas.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Mas = Float.parseFloat(UTrans_Mas);

                float UTransfFloat_Mas = Mass.MassConversion(SpinnerPosition9, SpinnerPosition10, UTransFloat_Mas);
                reception_Mas(UTransfFloat_Mas);
                //Mass fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Mas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Mas_Unit = UTransform_Mas.getText().toString();

                UTrans_Mas= send_Mas();
                float UTransFloat_Mas = Float.parseFloat(UTrans_Mas);

                float UTransfFloat_Mas = Mass.MassConversion(SpinnerPosition9, SpinnerPosition10, UTransFloat_Mas);
                reception_Mas(UTransfFloat_Mas);
            }
        });
//Mass fin----------------------

//Volume----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        VolumeSpinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition11 = position;
                //Volume---------------------------
                UTrans_Vol= send_Vol();
                if (UTrans_Vol.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Vol = Float.parseFloat(UTrans_Vol);

                float UTransfFloat_Vol = Volume.VolumeConversion(SpinnerPosition11, SpinnerPosition12, UTransFloat_Vol);
                reception_Vol(UTransfFloat_Vol);
                //Volume fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        VolumeSpinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Volume---------------------------
                SpinnerPosition12 = position;
                UTrans_Vol= send_Vol();
                if (UTrans_Vol.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Vol = Float.parseFloat(UTrans_Vol);

                float UTransfFloat_Vol = Volume.VolumeConversion(SpinnerPosition11, SpinnerPosition12, UTransFloat_Vol);
                reception_Vol(UTransfFloat_Vol);
                //Volume fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Vol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Vol_Unit = UTransform_Vol.getText().toString();

                UTrans_Vol= send_Vol();
                float UTransFloat_Vol = Float.parseFloat(UTrans_Vol);

                float UTransfFloat_Vol = Volume.VolumeConversion(SpinnerPosition11, SpinnerPosition12, UTransFloat_Vol);
                reception_Vol(UTransfFloat_Vol);
            }
        });
//Volume fin----------------------

//AstronomicalU----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        AstUSpinner13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition13 = position;
                //AstronomicalU---------------------------
                UTrans_AU = send_AU();
                if (UTrans_AU.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_AU = Float.parseFloat(UTrans_AU);

                float UTransfFloat_AU = AstronomicalU.AstronomicalUConversion(SpinnerPosition13, SpinnerPosition14, UTransFloat_AU);
                reception_AU(UTransfFloat_AU);
                //AstronomicalU fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        AstUSpinner14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //AstronomicalU---------------------------
                SpinnerPosition14 = position;
                UTrans_AU = send_AU();
                if (UTrans_AU.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_AU = Float.parseFloat(UTrans_AU);

                float UTransfFloat_AU = AstronomicalU.AstronomicalUConversion(SpinnerPosition13, SpinnerPosition14, UTransFloat_AU);
                reception_AU(UTransfFloat_AU);
                //AstronomicalU fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_AU.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                AU_Unit = UTransform_AU.getText().toString();

                UTrans_AU = send_AU();
                float UTransFloat_AU = Float.parseFloat(UTrans_AU);

                float UTransfFloat_AU = AstronomicalU.AstronomicalUConversion(SpinnerPosition13, SpinnerPosition14, UTransFloat_AU);
                reception_AU(UTransfFloat_AU);
            }
        });
//AstronomicalU fin----------------------

//Pressure----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        PresSpinner15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition15 = position;
                //Pressure---------------------------
                UTrans_Pres= send_Pres();
                if (UTrans_Pres.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Pres = Float.parseFloat(UTrans_Pres);

                float UTransfFloat_Pres = Pressure.PressureConversion(SpinnerPosition15, SpinnerPosition16, UTransFloat_Pres);
                reception_Pres(UTransfFloat_Pres);
                //Pressure fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        PresSpinner16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Pressure---------------------------
                SpinnerPosition16 = position;
                UTrans_Pres= send_Pres();
                if (UTrans_Pres.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Pres = Float.parseFloat(UTrans_Pres);

                float UTransfFloat_Pres = Pressure.PressureConversion(SpinnerPosition15, SpinnerPosition16, UTransFloat_Pres);
                reception_Pres(UTransfFloat_Pres);
                //Pressure fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Pres.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Pres_Unit = UTransform_Pres.getText().toString();

                UTrans_Pres= send_Pres();
                float UTransFloat_Pres = Float.parseFloat(UTrans_Pres);

                float UTransfFloat_Pres = Pressure.PressureConversion(SpinnerPosition15, SpinnerPosition16, UTransFloat_Pres);
                reception_Pres(UTransfFloat_Pres);
            }
        });
//Pressure fin----------------------

//Speed----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        SpeSpinner17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition17 = position;
                //Speed---------------------------
                UTrans_Spe = send_Spe();
                if (UTrans_Spe.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Spe = Float.parseFloat(UTrans_Spe);

                float UTransfFloat_Spe = Speed.SpeedConversion(SpinnerPosition17, SpinnerPosition18, UTransFloat_Spe);
                reception_Spe(UTransfFloat_Spe);
                //Speed fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //El listener llama al metodo alojado en la clase correspondiente
        SpeSpinner18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Speed---------------------------
                SpinnerPosition18 = position;
                UTrans_Spe = send_Spe();
                if (UTrans_Spe.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Spe = Float.parseFloat(UTrans_Spe);

                float UTransfFloat_Spe = Speed.SpeedConversion(SpinnerPosition17, SpinnerPosition18, UTransFloat_Spe);
                reception_Spe(UTransfFloat_Spe);
                //Speed fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Spe.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Spe_Unit = UTransform_Spe.getText().toString();

                UTrans_Spe = send_Spe();
                float UTransFloat_Spe = Float.parseFloat(UTrans_Spe);

                float UTransfFloat_Spe = Speed.SpeedConversion(SpinnerPosition17, SpinnerPosition18, UTransFloat_Spe);
                reception_Spe(UTransfFloat_Spe);
            }
        });
//Speed fin----------------------

//Area----------------------

        //El listener llama al metodo alojado en la clase correspondiente
        ArSpinner19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerPosition19 = position;
                //Area---------------------------
                UTrans_Ar= send_Ar();
                if (UTrans_Ar.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Ar = Float.parseFloat(UTrans_Ar);

                float UTransfFloat_Ar = Area.AreaConversion(SpinnerPosition19, SpinnerPosition20, UTransFloat_Ar);
                reception_Ar(UTransfFloat_Ar);
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
                SpinnerPosition20 = position;
                UTrans_Ar= send_Ar();
                if (UTrans_Ar.isEmpty()) {//Corrección error String vacio
                    return;
                }
                float UTransFloat_Ar = Float.parseFloat(UTrans_Ar);

                float UTransfFloat_Ar = Area.AreaConversion(SpinnerPosition19, SpinnerPosition20, UTransFloat_Ar);
                reception_Ar(UTransfFloat_Ar);
                //Area fin----------------------
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        UTransform_Ar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Ar_Unit = UTransform_Ar.getText().toString();

                UTrans_Ar= send_Ar();
                float UTransFloat_Ar = Float.parseFloat(UTrans_Ar);

                float UTransfFloat_Ar = Area.AreaConversion(SpinnerPosition19, SpinnerPosition20, UTransFloat_Ar);
                reception_Ar(UTransfFloat_Ar);
            }
        });
//Area fin----------------------

    }


//Envio y recepcion de unidades. Envio de la solucion a la vista

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Temp(){
        String UTrans = UTransform_Temp.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Temp(float UTransfFloat) {
        String FinSolTemp = Float.toString(UTransfFloat);
        UTransformated_Temp.setText(FinSolTemp);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Cur(){
        String UTrans = UTransform_Cur.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Cur(float UTransfFloat){
        String FinSolCur = Float.toString(UTransfFloat);
        UTransformated_Cur.setText(FinSolCur);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Dat(){
        String UTrans = UTransform_Dat.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Dat(float UTransfFloat){
        String FinSolDat = Float.toString(UTransfFloat);
        UTransformated_Dat.setText(FinSolDat);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Leng(){
        String UTrans = UTransform_Leng.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Leng(float UTransfFloat){
        String FinSolLeng = Float.toString(UTransfFloat);
        UTransformated_Leng.setText(FinSolLeng);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Mas(){
        String UTrans = UTransform_Mas.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Mas(float UTransfFloat){
        String FinSolMas = Float.toString(UTransfFloat);
        UTransformated_Mas.setText(FinSolMas);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Vol(){
        String UTrans = UTransform_Vol.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Vol(float UTransfFloat){
        String FinSolVol = Float.toString(UTransfFloat);
        UTransformated_Vol.setText(FinSolVol);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_AU(){
        String UTrans = UTransform_AU.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_AU(float UTransfFloat){
        String FinSolAU = Float.toString(UTransfFloat);
        UTransformated_AU.setText(FinSolAU);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Pres(){
        String UTrans = UTransform_Pres.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Pres(float UTransfFloat){
        String FinSolPres = Float.toString(UTransfFloat);
        UTransformated_Pres.setText(FinSolPres);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Spe(){
        String UTrans = UTransform_Spe.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Spe(float UTransfFloat){
        String FinSolVel = Float.toString(UTransfFloat);
        UTransformated_Spe.setText(FinSolVel);
    }

    /**
     * Obtiene el String introducido como el número para ser transformado
     * @return String con el numero a transformar
     */
    public String send_Ar(){
        String UTrans = UTransform_Ar.getText().toString(); //Unidad a Transformar
        return UTrans;
    }
    /**
     * Obtiene el String con la solución final e introduce el texto en el TextView
     */
    public void reception_Ar(float UTransfFloat){
        String FinSolAr = Float.toString(UTransfFloat);
        UTransformated_Ar.setText(FinSolAr);
    }


//Visibilidad de los Spinners segun la selección

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Temp(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VTemperature.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Currency(){
        VTemperature.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VCurrency.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Data(){
        VCurrency.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VData.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Length(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VLength.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Mass(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VMass.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Volume(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VVolume.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_AU(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Pressure(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VPressure.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Speed(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.GONE);
        VSpeed.setVisibility(View.VISIBLE);
    }

    /**
     * Establece como visible la unidad seleccionada
     */
    public void Visibility_Area(){
        VCurrency.setVisibility(View.GONE);
        VData.setVisibility(View.GONE);
        VLength.setVisibility(View.GONE);
        VMass.setVisibility(View.GONE);
        VVolume.setVisibility(View.GONE);
        VAstronomical.setVisibility(View.GONE);
        VTemperature.setVisibility(View.GONE);
        VSpeed.setVisibility(View.GONE);
        VPressure.setVisibility(View.GONE);
        VArea.setVisibility(View.VISIBLE);
    }
}