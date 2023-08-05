//  ANTHONY CORDOVA MORENO
//  Kaiser Crespín Chávez
//  Manuel García Cedeño
//  Yazmín Pinela Vargas
//  Joselyn Banchón Yagual


package com.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{
    private Button btn;
    private final String GREETER ="Hola desde el otro sitio";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button)findViewById(R.id.buttonMain);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        //acceder al segundo activity y enviar un String
        Intent intent = new
                Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("greeter",GREETER);//para pasar un valor
        startActivity(intent); //dispara el objeto intent con la acción

    }
}
