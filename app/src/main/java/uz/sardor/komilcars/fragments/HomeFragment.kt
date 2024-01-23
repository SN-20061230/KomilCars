package uz.sardor.komilcars.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager

import uz.sardor.komilcars.R
import uz.sardor.komilcars.adapters.CarAdapter
import uz.sardor.komilcars.databinding.FragmentHomeBinding
import uz.sardor.komilcars.model.Car

class HomeFragment : Fragment() {
    val list1 = mutableListOf<Car>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater,container,false)
        list1.add(Car(R.drawable.merc,"Mercedes-benz","GlS-450","$200000",R.drawable.like_unfilled))
        val adapter = CarAdapter(list1,object : CarAdapter.CarInterface{
            override fun OnItemClick(car: Car) {

            }

        })
        val layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.offeredRV.adapter = adapter
        binding.offeredRV.layoutManager = layoutManager
        return binding.root
    }


}