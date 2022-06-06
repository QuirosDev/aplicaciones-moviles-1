package co.edu.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.edu.inventario.databinding.ActivitySesionBinding;

public class SesionActivity extends AppCompatActivity {

    private ActivitySesionBinding sesionBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sesionBinding = ActivitySesionBinding.inflate(getLayoutInflater());
        View view = sesionBinding.getRoot();
        setContentView(view);
    }

    public void buscarUsuario(View view){
        Intent intent = new Intent(SesionActivity.this, UsuariosActivity.class);
        startActivity(intent);
    }

    public void buscarAutomovil(View view){
        Intent intent = new Intent(SesionActivity.this, AutosActivity.class);
        startActivity(intent);

    }

    public void ingresarAutomovil(View view){
        Intent intent = new Intent(SesionActivity.this, RegistrarAutoActivity.class);
        startActivity(intent);
    }

}