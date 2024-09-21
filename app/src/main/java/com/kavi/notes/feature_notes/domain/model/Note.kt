package com.kavi.notes.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kavi.notes.ui.theme.BabyBlue
import com.kavi.notes.ui.theme.LightGreen
import com.kavi.notes.ui.theme.RedOrange
import com.kavi.notes.ui.theme.RedPink
import com.kavi.notes.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content:String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)
