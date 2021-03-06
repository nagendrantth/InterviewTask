package com.example.interviewtask.ui

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.interviewtask.databinding.FragmentDetailsBinding
import androidx.navigation.NavArgs as NavArgs

class StockersDetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    private val args: StockersDetailsFragmentArgs by navArgs()
    /*var displayName: String? = null
    private var score: Int? = null
    var profileImage: String? = null
    var createDate: Int? = null
    var lastDate: Int? = null
    var Link: String? = null
    var Licence: String? = null*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*displayName = arguments?.getString("display_name")
        score = arguments?.getInt("score")
        profileImage = arguments?.getString("profile_image")
        createDate = arguments?.getInt("create_date")
        lastDate = arguments?.getInt("last_date")
        Link = arguments?.getString("link")
        Licence = arguments?.getString("licence")*/
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //initBindings()
        /*profileImage?.let { binding.profileImage.loadImage(it) }
        displayName?.let { binding.displayName.setText("User Name: ${displayName}") }
        createDate?.let { binding.createDateTxt.setText("Creation Date: ${createDate}") }
        lastDate?.let { binding.lastDateTxt.setText("Last Activity Date: ${lastDate}") }
        Licence?.let { binding.licenceTxt.setText("Content Licence: ${Licence}") }
        Link?.let { binding.linkTxt.setText("Referal Link: ${Link}") }
        score?.let { binding.scoreTxt.setText("Score: ${score}") }*/
        args.profileImage?.let { binding.profileImage.loadImage(args.profileImage) }
        args.displayName?.let { binding.displayName.setText("User Name: ${args.displayName}") }
        args.createDate?.let { binding.createDateTxt.setText("Creation Date: ${args.createDate}") }
        args.lastDate?.let { binding.lastDateTxt.setText("Last Activity Date: ${args.lastDate}") }
        args.licence?.let { binding.licenceTxt.setText("Content Licence: ${args.licence}") }
        args.link?.let { binding.linkTxt.setText("Referal Link: ${args.link}") }
        args.score?.let { binding.scoreTxt.setText("Score: ${args.score}") }
    }
}
