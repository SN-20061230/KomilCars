package uz.sardor.komilcars.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.sardor.komilcars.R
import uz.sardor.komilcars.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        val binding = FragmentSplashBinding.inflate(inflater, container, false)




        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(uz.sardor.komilcars.R.id.action_splashFragment2_to_signInFragment)
        }, 3800)
        return binding.root


//
//        binding.merc.setOnClickListener {
//        }
//        binding.bmw.setOnClickListener{
//        }
//
//        binding.signIn.setOnClickListener {
//            findNavController().navigate(R.id.action_splashFragment2_to_signInFragment)
//        }
//        binding.signUp.setOnClickListener {
//          findNavController().navigate(R.id.action_splashFragment2_to_signUpFragment)
//         }
        return binding.root
    }


}