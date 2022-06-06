package co.edu.inventario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;



public class DbInventario extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Usuarios";

    public DbInventario(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios (id INTEGER primary key autoincrement, " +
                "nombre varchar(50)," +
                "correo varchar(50)," +
                "telefono int," +
                "contraseña varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists usuarios");
        onCreate(db);
    }
}
