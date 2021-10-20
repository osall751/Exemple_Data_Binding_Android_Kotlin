package sn.set.exemples.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import sn.set.exemples.databinding.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    //Liaison de données
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // setContentView(R.layout.activity_main)
        binding.unRv = RendezVous()

        // getting the recyclerview
        val recyclerview = binding.recyclerview

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class RendezVous
        val data = ArrayList<RendezVous>()

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        binding.button1.setOnClickListener {
            val rv = RendezVous(
                binding.rvId.text.toString(),
                binding.lieuRv.text.toString(),
                binding.descriptionRv.text.toString(),
                Date(
                    binding.dateRv.year, binding.dateRv.month, binding.dateRv.dayOfMonth
                )
            )
            binding.unRv = rv
            data.add(rv)
            binding.unRv = RendezVous(UUID.randomUUID().toString())
            recyclerview.invalidate()
            recyclerview.requestLayout()
        }
    }
}