package uz.sardor.komilcars.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        binding.merc.setOnClickListener {
        }
        binding.bmw.setOnClickListener{
        }

        binding.signIn.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment2_to_signInFragment)
        }
        binding.signUp.setOnClickListener {
          findNavController().navigate(R.id.action_splashFragment2_to_signUpFragment)
         }
        return binding.root
    }


}