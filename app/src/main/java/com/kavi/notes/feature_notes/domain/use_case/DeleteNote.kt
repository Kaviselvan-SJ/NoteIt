package com.kavi.notes.feature_notes.domain.use_case

import com.kavi.notes.feature_notes.domain.model.Note
import com.kavi.notes.feature_notes.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}