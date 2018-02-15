/*
 * Created by Sohesh_doshi on 15/2/18 7:17 PM
 * Copyright(c) 2018. All rights reserved.
 *
 */

package curcon.promact.com.currencyconvertorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    Button Malaysian;
    Button Indian;
    Button Us;
    Button Bahraini;
    Button Russian;
    Button Hun;
    Button Japanese;
    Button Swiss;
    Button Reset;
    EditText Base_Amount;
    EditText IndianR;
    EditText USR;
    EditText BahrainiR;
    EditText RussianR;
    EditText HungarianR;
    EditText JapanseR;
    EditText SwissR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Malaysian=(Button) findViewById(R.id.Button_Malaysian_id);
        Indian=(Button) findViewById(R.id.Button_Indian_id);
        Us=(Button) findViewById(R.id.Button_Us_id);
        Bahraini=(Button) findViewById(R.id.Button_Bahraini_id);
        Russian=(Button) findViewById(R.id.Button_Rassan_id);
        Hun=(Button) findViewById(R.id.Button_Hun_id);
        Japanese=(Button) findViewById(R.id.Button_Jap_id);
        Swiss=(Button) findViewById(R.id.Button_Swiss_id);
        Reset=(Button) findViewById(R.id.Reset_Button_id);
        Base_Amount=(EditText) findViewById(R.id.Base_Amount_id);
        IndianR=(EditText) findViewById(R.id.indian_Amount_id);
        USR=(EditText) findViewById(R.id.US_Amount_id);
        BahrainiR=(EditText) findViewById(R.id.Bahraini_Amount_id);
        RussianR=(EditText) findViewById(R.id.Russian_Amount_id);
        HungarianR=(EditText) findViewById(R.id.Hungarian_Amount_id);
        JapanseR=(EditText) findViewById(R.id.Japanese_Amount_id);
        SwissR=(EditText) findViewById(R.id.Swiss_Amount_id);
     




        Malaysian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Base_Amount.getText().length()==0 ||Base_Amount.getText().toString().equals("0.0")||Base_Amount.getText().toString().equals("0"))
                {
                    Base_Amount.setError("Enter Valid Input");
                 finish();
                overridePendingTransition( 0, 0);
                startActivity(getIntent());
                overridePendingTransition( 0, 0);


                }
                else
                {


                    double baseamount = Double.parseDouble(Base_Amount.getText().toString());
                    System.out.println(baseamount);
                    IndianR.setText(Double.toString(baseamount*16.4344));
                    USR.setText(Double.toString(baseamount*0.2555));
                    BahrainiR.setText(Double.toString(baseamount*0.0961));
                    RussianR.setText(Double.toString(baseamount*14.6633));
                    HungarianR.setText(Double.toString(baseamount*64.1226));
                    JapanseR.setText(Double.toString(baseamount*27.8328));
                    SwissR.setText(Double.toString(baseamount*0.2388));
                }





            }
        });

        Indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IndianR.getText().length()==0||IndianR.getText().toString().equals("0.0")||IndianR.getText().toString().equals("0"))
                {
                    IndianR.setError("Enter Valid Input");
                  finish();
overridePendingTransition( 0, 0);
startActivity(getIntent());
overridePendingTransition( 0, 0);
                }
                else
                {

                    double baseamount = Double.parseDouble(IndianR.getText().toString());
                    System.out.println(baseamount);
                    Base_Amount.setText(Double.toString(baseamount*0.0608));
                    USR.setText(Double.toString(baseamount*0.0155));
                    BahrainiR.setText(Double.toString(baseamount*0.0058));
                    RussianR.setText(Double.toString(baseamount*0.8941));
                    HungarianR.setText(Double.toString(baseamount*3.9019));
                    JapanseR.setText(Double.toString(baseamount*1.6932));
                    SwissR.setText(Double.toString(baseamount*0.0145));
                }




            }
        });
        Us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(USR.getText().length()==0||USR.getText().toString().equals("0.0")||USR.getText().toString().equals("0"))
                {
                    USR.setError("Enter Valid Input");
                  finish();
overridePendingTransition( 0, 0);
startActivity(getIntent());
overridePendingTransition( 0, 0);
                }
                else{
                    double baseamount = Double.parseDouble(USR.getText().toString());
                    System.out.println(baseamount);
                    Base_Amount.setText(Double.toString(baseamount*3.9126));
                    IndianR.setText(Double.toString(baseamount*64.2903));
                    BahrainiR.setText(Double.toString(baseamount*0.376));
                    RussianR.setText(Double.toString(baseamount*57.4481));
                    HungarianR.setText(Double.toString(baseamount*250.8708));
                    JapanseR.setText(Double.toString(baseamount*108.9071));
                    SwissR.setText(Double.toString(baseamount*0.9339));
                }





            }
        });
        Bahraini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(BahrainiR.getText().length()==0||BahrainiR.getText().toString().equals("0.0")||BahrainiR.getText().toString().equals("0"))
                {
                    BahrainiR.setError("Enter Valid Input");
                  finish();
overridePendingTransition( 0, 0);
startActivity(getIntent());
overridePendingTransition( 0, 0);
                }
                else
                {
                    double baseamount = Double.parseDouble(BahrainiR.getText().toString());
                    System.out.println(baseamount);
                    IndianR.setText(Double.toString(baseamount*170.895));
                    USR.setText(Double.toString(baseamount*2.6595));
                    Base_Amount.setText(Double.toString(baseamount*10.4095));
                    RussianR.setText(Double.toString(baseamount*152.6186));
                    HungarianR.setText(Double.toString(baseamount*666.9613));
                    JapanseR.setText(Double.toString(baseamount*289.5963));
                    SwissR.setText(Double.toString(baseamount*2.4839));
                }





            }
        });
            Russian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RussianR.getText().length()==0||RussianR.getText().toString().equals("0.0")||RussianR.getText().toString().equals("0") )
                {
                    RussianR.setError("Enter Valid Input");
                  finish();
overridePendingTransition( 0, 0);
startActivity(getIntent());
overridePendingTransition( 0, 0);
                }
                else
                {
                    double baseamount = Double.parseDouble(RussianR.getText().toString());
                    System.out.println(baseamount);
                    IndianR.setText(Double.toString(baseamount*1.1197));
                    USR.setText(Double.toString(baseamount*0.01742));
                    Base_Amount.setText(Double.toString(baseamount*0.0682));
                    BahrainiR.setText(Double.toString(baseamount*0.0065));
                    HungarianR.setText(Double.toString(baseamount*4.3702));
                    JapanseR.setText(Double.toString(baseamount*1.8977));
                    SwissR.setText(Double.toString(baseamount*0.0163));
                }





            }
        });
        Hun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(HungarianR.getText().length()==0||HungarianR.getText().toString().equals("0.0")||HungarianR.getText().toString().equals("0"))
                {
                    HungarianR.setError("Enter Valid Input");
                  finish();
overridePendingTransition( 0, 0);
startActivity(getIntent());
overridePendingTransition( 0, 0);
                }
                else
                {
                    double baseamount = Double.parseDouble(HungarianR.getText().toString());
                    System.out.println(baseamount);
                    IndianR.setText(Double.toString(baseamount*0.2561));
                    USR.setText(Double.toString(baseamount*0.0032));
                    Base_Amount.setText(Double.toString(baseamount*0.0156));
                    BahrainiR.setText(Double.toString(baseamount*0.0014));
                    RussianR.setText(Double.toString(baseamount*0.2288));
                    JapanseR.setText(Double.toString(baseamount*0.4344));
                    SwissR.setText(Double.toString(baseamount*0.0037));
                }





            }
        });
        Japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(JapanseR.getText().length()==0||JapanseR.getText().toString().equals("0.0")||JapanseR.getText().toString().equals("0"))
                {
                    JapanseR.setError("Enter Valid Input");
                  finish();
overridePendingTransition( 0, 0);
startActivity(getIntent());
overridePendingTransition( 0, 0);
                }
                else
                {
                    double baseamount = Double.parseDouble(JapanseR.getText().toString());
                    System.out.println(baseamount);
                    IndianR.setText(Double.toString(baseamount*0.587));
                    USR.setText(Double.toString(baseamount*0.0091));
                    Base_Amount.setText(Double.toString(baseamount*0.0358));
                    BahrainiR.setText(Double.toString(baseamount*0.0034));
                    RussianR.setText(Double.toString(baseamount*0.5221));
                    HungarianR.setText(Double.toString(baseamount*2.2851));
                    SwissR.setText(Double.toString(baseamount*0.0085));
                }





            }
        });

        Swiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(SwissR.getText().length()==0 ||SwissR.getText().toString().equals("0.0")||SwissR.getText().toString().equals("0"))
                {
                    SwissR.setError("Enter Valid Input");
                  finish();
overridePendingTransition( 0, 0);
startActivity(getIntent());
overridePendingTransition( 0, 0);
                }
                else
                {
                    double baseamount = Double.parseDouble(SwissR.getText().toString());
                    System.out.println(baseamount);
                    IndianR.setText(Double.toString(baseamount*68.7123));
                    USR.setText(Double.toString(baseamount*1.0706));
                    BahrainiR.setText(Double.toString(baseamount*0.04025));
                    RussianR.setText(Double.toString(baseamount*61.2213));
                    HungarianR.setText(Double.toString(baseamount*267.7758));
                    JapanseR.setText(Double.toString(baseamount*116.6162));
                    Base_Amount.setText(Double.toString(baseamount*4.1875));

                }




            }
        });




        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Base_Amount.setHint("Enter Text/Result");
                IndianR.setHint("Enter Text/Result");
                USR.setHint("Enter Text/Result");
                BahrainiR.setHint("Enter Text/Result");
                RussianR.setHint("Enter Text/Result");
                HungarianR.setHint("Enter Text/Result");
                JapanseR.setHint("Enter Text/Result");
                SwissR.setHint("Enter Text/Result");
                Base_Amount.setText("");
                IndianR.setText("");
                USR.setText("");
                BahrainiR.setText("");
                RussianR.setText("");
                HungarianR.setText("");
                JapanseR.setText("");
                SwissR.setText("");

            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.Reset_Button){
            Base_Amount.setHint("Enter Text/Result");
            IndianR.setHint("Enter Text/Result");
            USR.setHint("Enter Text/Result");
            BahrainiR.setHint("Enter Text/Result");
            RussianR.setHint("Enter Text/Result");
            HungarianR.setHint("Enter Text/Result");
            JapanseR.setHint("Enter Text/Result");
            SwissR.setHint("Enter Text/Result");
            Base_Amount.setText("");
            IndianR.setText("");
            USR.setText("");
            BahrainiR.setText("");
            RussianR.setText("");
            HungarianR.setText("");
            JapanseR.setText("");
            SwissR.setText("");
        }
        return true;
    }
}
