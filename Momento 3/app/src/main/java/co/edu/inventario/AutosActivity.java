package co.edu.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.sql.SQLData;

import co.edu.inventario.databinding.ActivityAutosBinding;

public class AutosActivity extends AppCompatActivity {

    private DBautomovil dBautomovil;

    private ActivityAutosBinding activityAutosBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAutosBinding = ActivityAutosBinding.inflate(getLayoutInflater());
        View view = activityAutosBinding.getRoot();
        setContentView(view);
        dBautomovil = new DBautomovil(AutosActivity.this);
    }

    public void obtenerAuto(View view){
        String placa = activityAutosBinding.etPlac.getText().toString();
        SQLiteDatabase db = dBautomovil.getWritableDatabase();
        String sql = String.format("select * from automoviles where placa = '%s'", placa);
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToNext();
        String marca = cursor.getString(2);

        Toast.makeText(this, "Vehiculo encontrado.", Toast.LENGTH_SHORT).show();
        activityAutosBinding.tvMarc.setText(marca);

    }

    public void regresar(View view){
        Intent intent = new Intent(AutosActivity.this, SesionActivity.class);
        startActivity(intent);
    }

}