package co.edu.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import co.edu.inventario.databinding.ActivityRegistrarAutoBinding;

public class RegistrarAutoActivity extends AppCompatActivity {

    private ActivityRegistrarAutoBinding registrarAutoBinding;
    DBautomovil dBautomovil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registrarAutoBinding = ActivityRegistrarAutoBinding.inflate(getLayoutInflater());
        View view = registrarAutoBinding.getRoot();
        setContentView(view);
        dBautomovil = new DBautomovil(RegistrarAutoActivity.this);
    }

    public void registrarAuto(View view){
        SQLiteDatabase db = dBautomovil.getWritableDatabase();
        ContentValues datosAutomovil = new ContentValues();
        String placa = registrarAutoBinding.etPlaca.getText().toString();
        String marca = registrarAutoBinding.etMarca.getText().toString();
        String modelo = registrarAutoBinding.etModelo.getText().toString();
        String referencia = registrarAutoBinding.etReferencia.getText().toString();
        datosAutomovil.put("placa", placa);
        datosAutomovil.put("marca", marca);
        datosAutomovil.put("modelo", modelo);
        datosAutomovil.put("referencia", referencia);
        long nuevoAtomovil = db.insert("automoviles", null, datosAutomovil);
        Toast.makeText(this, "Automovil Guardado Con Exito" + nuevoAtomovil, Toast.LENGTH_SHORT).show();
    }

    public void regresar(View view){
        Intent intent = new Intent(RegistrarAutoActivity.this, SesionActivity.class);
        startActivity(intent);
    }

}