package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment.adapter.HorizontalAdapter
import com.example.recyclerviewassignment.adapter.VerticalAdapter
import com.example.recyclerviewassignment.model.MockModel
import com.example.recyclerviewassignment.databinding.ActivityMainBinding
import com.example.recyclerviewassignment.model.ParentModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var horizontalAdapter: HorizontalAdapter
    private lateinit var verticalAdapter: VerticalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Horizontal views mock data
        val horizontalItems = listOf(
            MockModel("Hv 1"),
            MockModel("HV 2"),
            MockModel("HV 3"),
            MockModel("HV 4"),
            MockModel("HV 5")
        )

        //vertical views mock data
        val verticalItems = listOf(
            MockModel("Vertical view 1"),
            MockModel("Vertical view 2"),
            MockModel("Vertical view 3"),
            MockModel("Vertical view 4"),
            MockModel("Vertical view 5")
        )

        //Adding data to parent model
        val parentModel = ArrayList<ParentModel>()
        parentModel.add(ParentModel(horizontalItems))
        parentModel.add(ParentModel(verticalItems))

        //Initializing horizontal recyclerview
        horizontalAdapter = HorizontalAdapter(horizontalItems)
        binding.rvHorizontal.adapter = horizontalAdapter
        binding.rvHorizontal.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        //Initializing vertical recyclerview
        verticalAdapter = VerticalAdapter(verticalItems)
        binding.rvVertical.adapter = verticalAdapter
        binding.rvVertical.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}