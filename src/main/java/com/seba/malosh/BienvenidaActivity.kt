package com.seba.malosh

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class BienvenidaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        // Configurar la Toolbar como ActionBar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Cambiar el título de la Toolbar
        supportActionBar?.title = "Menú"
    }

    // Inflar el menú
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_navegacion, menu)
        return true
    }

    // Manejar las acciones del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_item_registrar_habitos -> {
                // Acción para Registrar Malos Hábitos
                true
            }
            R.id.menu_item_metas -> {
                // Acción para abrir Metas
                true
            }
            R.id.menu_item_desafios -> {
                // Acción para abrir Desafíos Diarios
                true
            }
            R.id.menu_item_progreso -> {
                // Acción para abrir Progreso
                true
            }
            R.id.menu_item_reflexiones -> {
                // Acción para abrir Reflexiones Diarias
                true
            }
            R.id.menu_item_tus_habitos -> {
                // Acción para abrir Tus Malos Hábitos
                true
            }
            R.id.menu_item_logout -> {
                // Acción para cerrar sesión
                finish() // Cerrar la actividad actual
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
