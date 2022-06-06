package co.edu.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import co.edu.inventario.databinding.ActivityRegistroBinding;

public class RegistroActivity extends AppCompatActivity {

    private ActivityRegistroBinding registroBinding;
    DbInventario dbInventario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registroBinding = ActivityRegistroBinding.inflate(getLayoutInflater());
        View view = registroBinding.getRoot();
        setContentView(view);
        dbInventario = new DbInventario(RegistroActivity.this);
    }

    public void registrarUsuario(View view){

        SQLiteDatabase db = dbInventario.getWritableDatabase();
        ContentValues datosUsuario = new ContentValues();
        String nombre = registroBinding.etNombre.getText().toString();
        String correo = registroBinding.etEmail.getText().toString();
        String telefono = registroBinding.etTelefono.getText().toString();
        String contraseña = registroBinding.etPassword.getText().toString();
        datosUsuario.put("nombre", nombre);
        datosUsuario.put("correo", correo);
        datosUsuario.put("telefono", telefono);
        datosUsuario.put("contraseña", contraseña);
        long nuevoUsuario = db.insert("usuarios", null, datosUsuario);
        Toast.makeText(this, "" + nuevoUsuario, Toast.LENGTH_SHORT).show();
    }

    public void regresar(View view){
        Intent intent = new Intent(RegistroActivity.this, MainActivity.class);
        startActivity(intent);
    }

}