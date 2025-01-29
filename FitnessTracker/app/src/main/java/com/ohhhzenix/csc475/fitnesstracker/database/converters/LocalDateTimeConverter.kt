package com.ohhhzenix.csc475.fitnesstracker.database.converters

import androidx.room.TypeConverter
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset

class LocalDateTimeConverter {

    @TypeConverter
    fun dateTimeToTimestamp(dateTime: LocalDateTime): Long {
        return dateTime.atZone(ZoneOffset.UTC).toInstant().toEpochMilli()
    }

    @TypeConverter
    fun timestampToDateTime(timestamp: Long): LocalDateTime {
        return Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.UTC).toLocalDateTime()
    }
}