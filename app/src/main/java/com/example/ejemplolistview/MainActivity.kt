package com.example.ejemplolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //main Activity


        var frutas: ArrayList<String>
        frutas = ArrayList()
        frutas.add("Manzana")
        frutas.add("Sandia")
        frutas.add("Durazno")
        frutas.add("Platano")

        val grid: GridView = findViewById(R.id.grid)

        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)

        grid.adapter = adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position), Toast.LENGTH_LONG).show()
        }

    }
}