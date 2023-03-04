package com.septemblue.entities

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

//kotlin object that represents how our database table looks like

object NoteEntity : Table<Nothing>("note") {
    val id = int("id").primaryKey()
    val note = varchar("note")
}