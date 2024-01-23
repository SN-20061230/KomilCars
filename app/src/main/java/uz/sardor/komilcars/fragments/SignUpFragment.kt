package uz.sardor.komilcars.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.sardor.komilcars.R
import uz.sardor.komilcars.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSignUpBinding.inflate(inflater, container, false)
        binding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_homeFragment)
        }
        binding.log.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
        }
        return binding.root
    }


}