package com.info.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.info.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun hesapla(view : View){
        if (binding.radioButtonart.isChecked){
            number1 = binding.number1Text.text.toString().toIntOrNull()
            number2 = binding.number2Text.text.toString().toIntOrNull()
            if (number1 == null || number2 == null){
                Toast.makeText(this,"Lütfen Boş Alanları Doldurun",Toast.LENGTH_SHORT).show()
            }else{
                result = number1!! + number2!!
                binding.textView.text = "$result"
            }

        }else if (binding.radioButtoneksi.isChecked){

            number1 = binding.number1Text.text.toString().toIntOrNull()
            number2 = binding.number2Text.text.toString().toIntOrNull()
            if (number1 == null || number2 == null){
                Toast.makeText(this,"Lütfen Boş Alanları Doldurun",Toast.LENGTH_SHORT).show()
            }else{
                result = number1!! + number2!!
                binding.textView.text = "$result"
            }
        }else if (binding.radioButtoncarpma.isChecked){
            number1 = binding.number1Text.text.toString().toIntOrNull()
            number2 = binding.number2Text.text.toString().toIntOrNull()
            if (number1 == null || number2 == null){
                Toast.makeText(this,"Lütfen Boş Alanları Doldurun",Toast.LENGTH_SHORT).show()
            }else{
                result = number1!! + number2!!
                binding.textView.text = "$result"
            }
        }else if (binding.radioButtonbolme.isChecked){
            number1 = binding.number1Text.text.toString().toIntOrNull()
            number2 = binding.number2Text.text.toString().toIntOrNull()
            if (number1 == null || number2 == null){
                Toast.makeText(this,"Lütfen Boş Alanları Doldurun",Toast.LENGTH_SHORT).show()
            }else{

                result = number1!! + number2!!
                binding.textView.text = "$result"
            }
        }else{
            Toast.makeText(this,"Lütfen Bir İşlem Seçin",Toast.LENGTH_LONG).show()
        }
    }
}