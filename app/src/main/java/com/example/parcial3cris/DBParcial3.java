package com.example.parcial3cris;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBParcial3 extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ParcialDB";
    private static final int DATABASE_VERSION = 1;

    // Nombre de la tabla
    private static final String TABLE_CONTACTOS = "contactos";

    // Nombres de las columnas
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NOMBRE = "nombre";
    private static final String COLUMN_APELLIDOS = "apellidos";
    private static final String COLUMN_TELEFONO = "telefono";
    private static final String COLUMN_CORREO = "correo";

    public DBParcial3 (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crear la tabla "Contactos"
        String CREATE_CONTACTOS_TABLE = "CREATE TABLE " + TABLE_CONTACTOS + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_NOMBRE + " TEXT,"
                + COLUMN_APELLIDOS + " TEXT,"
                + COLUMN_TELEFONO + " TEXT,"
                + COLUMN_CORREO + " TEXT"
                + ")";
        db.execSQL(CREATE_CONTACTOS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Actualizar la tabla si hay cambios en la estructura
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTOS);
        onCreate(db);
    }
}
