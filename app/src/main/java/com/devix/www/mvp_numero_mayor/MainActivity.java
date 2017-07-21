package com.devix.www.mvp_numero_mayor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements INumeroMayor.View {

    private INumeroMayor.Presenter presenter;
    private EditText edt1, edt2, edt3;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new NumeroMayorPresente(this);
        edt1 = findViewById(R.id.edtOne);
        edt2 = findViewById(R.id.edtDos);
        edt3 = findViewById(R.id.edtTres);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = edt1.getText().toString();
                String b = edt2.getText().toString();
                String c = edt3.getText().toString();
                presenter.convertStringtoInt(a,b,c);

            }
        });


    }

    @Override
    public void showData(int data) {
        Toast.makeText(this, "" + data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
