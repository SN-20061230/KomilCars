package uz.sardor.komilcars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.interpolator.view.animation.FastOutLinearInInterpolator
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import androidx.navigation.fragment.findNavController
import uz.sardor.komilcars.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSplashBinding.inflate(inflater,container,false)

        binding.mercedes.setOnClickListener {
        }
        binding.bmw.setOnClickListener{
        }

        binding.signIn.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment2_to_homeFragment)
        }
        return binding.root
    }


}