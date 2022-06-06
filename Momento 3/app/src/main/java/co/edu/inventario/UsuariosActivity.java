package co.edu.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Currency;

import co.edu.inventario.databinding.ActivityUsuariosBinding;

public class UsuariosActivity extends AppCompatActivity {

    private DbInventario dbInventario;

    private ActivityUsuariosBinding usuariosBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        usuariosBinding = ActivityUsuariosBinding.inflate(getLayoutInflater());
        View view = usuariosBinding.getRoot();
        setContentView(view);
        dbInventario = new DbInventario(UsuariosActivity.this);
    }

    public void obtenerUsuario(View view){
        String email = usuariosBinding.etBuscarUsuario.getText().toString();
        SQLiteDatabase db = dbInventario.getWritableDatabase();
        String sql = String.format("select * from usuarios where correo = '%s'", email);
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToNext();
        int id = cursor.getInt(0);
        String nombre = cursor.getString(1);

        Toast.makeText(this, "Nombre: " + nombre, Toast.LENGTH_SHORT).show();
        usuariosBinding.tvUserEmail.setText(nombre);
    }

    public void regresar(View view){
        Intent intent = new Intent(UsuariosActivity.this, SesionActivity.class);
        startActivity(intent);
    }

}