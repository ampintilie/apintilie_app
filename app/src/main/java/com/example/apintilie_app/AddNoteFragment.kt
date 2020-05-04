package com.example.apintilie_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_add_note.*
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass.
 */
class AddNoteFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_note, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        savebutton.setOnClickListener {
            val noteTitle = edit_title.text.toString().trim()
            val noteBody = edit_note.text.toString().trim()

            if (noteTitle.isEmpty()) {
                edit_title.error = "Title is required"
                edit_title.requestFocus()
                return@setOnClickListener
            }
            if (noteBody.isEmpty()) {
                edit_note.error = "Note is required"
                edit_note.requestFocus()
                return@setOnClickListener
            }
            launch {
                val note = Note(noteTitle, noteBody)
                context?.let {
                    NoteDatabase(it).getNoteDao().addNote(note)
                    it.toast("Note Saved")
                }
            }


        }


    }

}
