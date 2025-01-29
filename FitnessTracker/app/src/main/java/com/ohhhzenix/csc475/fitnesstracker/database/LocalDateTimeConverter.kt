package com.ohhhzenix.csc475.fitnesstracker.database

import androidx.room.TypeConverter
import java.time.LocalDateTime

class LocalDateTimeConverter {

    @TypeConverter
    fun dateTimeToString(dateTime: LocalDateTime): String {
        return dateTime.toString()
    }

    @TypeConverter
    fun stringToDateTime(string: String): LocalDateTime {
        return LocalDateTime.parse(string)
    }
}