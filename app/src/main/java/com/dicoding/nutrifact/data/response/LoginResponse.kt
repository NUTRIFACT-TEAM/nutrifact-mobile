package com.dicoding.nutrifact.data.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(

	@field:SerializedName("status")
	val status: Int? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("data")
	val data: LoginData? = null,

)

data class LoginData(

	@field:SerializedName("token")
	val token: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

)

data class User(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("name")
	val name: String? = null,


	@field:SerializedName("email")
	val email: String? = null
)
