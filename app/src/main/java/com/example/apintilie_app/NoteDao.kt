package com.example.apintilie_app

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.apintilie_app.Note

@Dao
interface NoteDao {
    @Insert
    suspend fun addNote(note: Note)

    @Query("SELECT * FROM note ORDER BY id DESC")
    suspend fun getNotes() : List<Note>

    @Insert
    suspend fun addMultipleNotes(vararg note: Note)
}