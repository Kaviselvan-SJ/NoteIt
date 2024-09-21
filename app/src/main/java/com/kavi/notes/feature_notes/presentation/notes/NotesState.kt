package com.kavi.notes.feature_notes.presentation.notes

import com.kavi.notes.feature_notes.domain.model.Note
import com.kavi.notes.feature_notes.domain.util.NoteOrder
import com.kavi.notes.feature_notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)