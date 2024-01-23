package uz.sardor.komilcars.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.sardor.komilcars.R
import uz.sardor.komilcars.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSignInBinding.inflate(inflater, container, false)
        binding.reg.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
        binding.loginButton.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_homeFragment)
        }
        return binding.root
    }

}