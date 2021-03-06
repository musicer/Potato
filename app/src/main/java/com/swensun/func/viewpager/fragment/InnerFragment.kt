package com.swensun.func.viewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.swensun.potato.R
import com.swensun.swutils.util.Logger
import kotlinx.android.synthetic.main.fragment_inner.*
import org.jetbrains.anko.support.v4.toast

class InnerFragment : BaseFragment() {

    companion object {
        fun newInstance(id: String): InnerFragment {
            val fragment = InnerFragment()
            fragment.arguments = Bundle().apply {
                putString("id", id)
            }
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inner, container, false)
    }

    override fun loadData() {
        val id = arguments?.getString("id")
        tv_content.text = id
        Logger.d("id--: $id")
    }
}