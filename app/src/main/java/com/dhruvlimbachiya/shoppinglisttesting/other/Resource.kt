package com.dhruvlimbachiya.shoppinglisttesting.other

/**
 * Created by Dhruv Limbachiya on 18-08-2021.
 */

// A generic class that contains data and status about loading this data.
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(data: T?, message: String?) : Resource<T>(data, message)
}
