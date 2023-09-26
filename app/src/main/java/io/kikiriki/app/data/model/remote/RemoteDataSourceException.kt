package io.kikiriki.app.data.model.remote

class RemoteDataSourceException(
    val code: Int,
    message: String,
    val httpCode: Int?
) : Exception(message)