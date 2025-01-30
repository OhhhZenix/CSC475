package com.ohhhzenix.csc475.fitnesstracker.database.converters

import androidx.room.TypeConverter
import java.time.LocalDateTime

class LocalDateTimeConverter {

    @TypeConverter
    fun serialize(dateTime: LocalDateTime): String {
        return dateTime.toString()
    }

    @TypeConverter
    fun deserialize(dateTime: String): LocalDateTime {
        return LocalDateTime.parse(dateTime)
    }
}