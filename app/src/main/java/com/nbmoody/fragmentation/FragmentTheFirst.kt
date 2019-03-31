package com.nbmoody.fragmentation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_the_first.*
import timber.log.Timber


class FragmentTheFirst : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_the_first, container, false)
        Timber.d("onCreateView() called...")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstButton.setOnClickListener {
            Timber.d("firstButton's click listener called...")
            findNavController(nav_host_fragment).navigate(R.id.action_fragmentTheFirst_to_fragmentTheSecond)
        }

        Timber.d("onViewCreated() called...")
    }


}
