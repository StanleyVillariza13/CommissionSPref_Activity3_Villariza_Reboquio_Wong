package com.example.commission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName, etAmount, etSold, etCommission, etVat, btnResult, TextViewResult;
        etName = findViewById(R.id.et_name);
        etAmount = findViewById(R.id.amount);
        etSold = findViewById(R.id.sold);
        etCommission = findViewById(R.id.commission);
        etVat = findViewById(R.id.vat);
        Button btn_result = findViewById(R.id.result);
        TextView textview_result = findViewById(R.id.txtresult);
        TextView textview_name = findViewById(R.id.name);
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double amount = Double.valueOf(etAmount.getText().toString());
                Double sold = Double.valueOf(etSold.getText().toString());
                Double commission = Double.valueOf(etCommission.getText().toString());
                Double vat = Double.valueOf(etVat.getText().toString());


                Double Vat = (amount * sold) * .10 ;
                Double CommissionNetPay = ((amount * sold) * (commission * .01)) - Vat;

                String name = etName.getText().toString();

                textview_name.setText(name);
                textview_result.setText(""+CommissionNetPay);

            }

        });
    }
}

