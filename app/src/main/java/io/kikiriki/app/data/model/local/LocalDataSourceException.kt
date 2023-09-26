package io.kikiriki.app.data.model.local

class LocalDataSourceException(
    val code: Int,
    message: String
) : Exception(message)