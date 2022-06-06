package co.edu.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import co.edu.inventario.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private DbInventario dbInventario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);
        dbInventario = new DbInventario(MainActivity.this);
    }

    public void registrarUsuario(View view){
        Intent intent = new Intent(MainActivity.this, RegistroActivity.class);
        startActivity(intent);
    }

    public void iniciarSesion(View view){
        String email = mainBinding.etCorreo.getText().toString();
        String contraseña = mainBinding.etContrasena.getText().toString();

        if (email.isEmpty() && contraseña.isEmpty()){
            Toast.makeText(this, "Debe llenar todos los campos.", Toast.LENGTH_SHORT).show();
        }
        else{
            SQLiteDatabase db = dbInventario.getWritableDatabase();
            String sql = String.format("select * from usuarios where correo = '%s' and contraseña = '%s' ", email, contraseña);
            Cursor cursor = db.rawQuery(sql, null);
            if (cursor.getCount()>0){
                Toast.makeText(this, "Usuario Correcto.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SesionActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "El Usuario no Existe.", Toast.LENGTH_SHORT).show();
            }
        }

    }

}