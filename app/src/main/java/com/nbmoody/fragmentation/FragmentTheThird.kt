package com.nbmoody.fragmentation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_the_third.*
import timber.log.Timber


class FragmentTheThird : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_the_third, container, false)
        Timber.d("onCreateView() called...")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        thirdButton.setOnClickListener {
            Timber.d("firstButton's click listener called...")
            findNavController(nav_host_fragment).navigate(R.id.action_fragmentTheThird_to_fragmentTheFirst)
        }


        Timber.d("onViewCreated() called...")
    }


}
