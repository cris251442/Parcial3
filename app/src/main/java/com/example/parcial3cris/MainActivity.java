package com.example.parcial3cris;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnInsertar, btnBorrar, btnActualizar;
    private EditText etNombre, etApellido, etTelefono, etCorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        btnInsertar = findViewById(R.id.btnInsertar);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnActualizar = findViewById(R.id.btnActualizar);
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etTelefono = findViewById(R.id.etTelefono);
        etCorreo = findViewById(R.id.etCorreo);


        // Establecer clic listeners para los botones
        btnInsertar.setOnClickListener(this);
        btnBorrar.setOnClickListener(this);
        btnActualizar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInsertar:
                // Acción para el botón Insertar
                String nombre = etNombre.getText().toString();
                String apellido = etApellido.getText().toString();
                String telefono = etTelefono.getText().toString();
                String correo = etCorreo.getText().toString();
                // Aquí puedes realizar la acción de inserción en la base de datos o cualquier otra acción
                Toast.makeText(this, "Insertar: Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono + ", Correo: " + correo, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBorrar:
                // Acción para el botón Borrar
                // Aquí puedes realizar la acción de borrado en la base de datos o cualquier otra acción
                Toast.makeText(this, "Borrar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnActualizar:
                // Acción para el botón Actualizar
                // Aquí puedes realizar la acción de actualización en la base de datos o cualquier otra acción
                Toast.makeText(this, "Actualizar", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
