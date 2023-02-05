package com.example.bottomnavigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdemo.databinding.FragmentNotificationsBinding

/**
 * A simple [Fragment] subclass.
 */
class NotificationsFragment : Fragment() {

    lateinit var binding: FragmentNotificationsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotificationsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    fun setupViews()
    {
        binding.btnNotificationDetails.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_notificationDetailsFragment)
        }
    }

}
