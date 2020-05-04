package com.example.apintilie_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.apintilie_app.HomeFragmentDirections
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.launch

class HomeFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recycler_notes.setHasFixedSize(true)
        recycler_notes.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)



        launch {
            context?.let {
                val notes = NoteDatabase(it).getNoteDao().getNotes()
                recycler_notes.adapter = NotesAdapter(notes)

            }
        }



        addbutton.setOnClickListener {
            val action = HomeFragmentDirections.actionAddNote()
            Navigation.findNavController(it).navigate(action)
        }
    }
}
