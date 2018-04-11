package com.example.ceisutb14.parcialkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos = arrayOf("binario", "octal", "hexadecimal", "Decimal") // <-- Datos del Spinner


        val sourceSpinner = findViewById<Spinner>(R.id.sourceSystem)   // <-- llamamos el Spinner SourceSystem
        val  destiSpinner = findViewById<Spinner>(R.id.destiSystem)     // <-- llamamos el Spinner Destination System
        var boxnumber = findViewById<EditText>(R.id.boxNumber)    // <-- llamamos el numero de entrada a convertir

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, datos) // <-- Ingresamos los datos en los Spinner
        sourceSpinner.adapter = adapter
        destiSpinner.adapter = adapter

        val source = findViewById<Spinner>(R.id.sourceSystem)
        val  destination = findViewById<Spinner>(R.id.sourceSystem)

        val valSource = source.selectedItem.toString()
        val valdestination = destination.selectedItem.toString()

        if (valSource == "binario" && valdestination == "octal"){

            var b = boxnumber.toString()

            val l = java.lang.Long.parseLong(b, 2)
            println("HERE!!!!! "+java.lang.Long.toOctalString(l))

        }else if(valSource == "octal" && valdestination == "binario"){


        }else if(valSource == "binario" && valdestination == "hexadecimal"){




        }else if(valSource == "hexadecimal" && valdestination == "binario"){



        }else if(valSource == "binario" && valdestination == "decimal"){




        }else if(valSource == "decimal" && valdestination == "binario"){




        }else if(valSource == "octal" && valdestination == "hexadecimal"){




        }else if(valSource == "hexadecimal" && valdestination == "octal"){




        }



    }
}
