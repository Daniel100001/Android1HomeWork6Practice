package com.example.android1homework6practice.ui.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android1homework6practice.R
import com.example.android1homework6practice.Repositories.CatRepository
import com.example.android1homework6practice.ui.adapters.CatAdapter

class CatFragment : Fragment()  {

    private var recyclerView: RecyclerView? = null
    private var repository = CatRepository()
    private var carAdapter = CatAdapter(repository.getLisOfCat())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView_catFragment)

        initialization()

    }

    private fun initialization() {
        val layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = carAdapter

    }


}