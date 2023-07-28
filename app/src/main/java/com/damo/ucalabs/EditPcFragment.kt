package com.damo.ucalabs

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import com.damo.ucalabs.databinding.FragmentEditPcBinding

@Suppress("DEPRECATION")
class EditPcFragment : Fragment(){

    private lateinit var mBinding : FragmentEditPcBinding
    private var mActivity: MainActivity? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentEditPcBinding.inflate(inflater,container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //recover main activity
        mActivity = activity as? MainActivity

        //add back arrow in action bar
        mActivity?.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //call menu in fragment
        setHasOptionsMenu(true)

        //change title in action bar
        mActivity?.supportActionBar?.title = getString(R.string.add_new_pc_title)



    }




    private fun hideKeyboard() {
        val imm = mActivity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(mBinding.root.windowToken, 0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        hideKeyboard()
    }

    override fun onDestroy() {
        mActivity?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mActivity?.supportActionBar?.title = getString(R.string.app_name)
        mActivity?.hideFab(true)
        setHasOptionsMenu(false)
        super.onDestroy()
    }

}