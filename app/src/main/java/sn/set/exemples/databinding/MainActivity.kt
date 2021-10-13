package sn.set.exemples.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import sn.set.exemples.databinding.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    //Liaison de données
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // setContentView(R.layout.activity_main)
        binding.unRv = RendezVous()

        binding.button1.setOnClickListener {
            var str: String = binding.lieuRv.text.toString()
            binding.unRv = RendezVous(
                binding.rvId.text.toString(),
                binding.lieuRv.text.toString(),
                binding.descriptionRv.text.toString(),
                Date(
                    binding.dateRv.year, binding.dateRv.month, binding.dateRv.dayOfMonth
                )
            )
            Toast.makeText(this, binding.unRv.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}