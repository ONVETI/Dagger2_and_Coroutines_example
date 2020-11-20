package uz.onveti.myapp120dagger2example.retrofit

import retrofit2.http.GET
import uz.onveti.myapp120dagger2example.model.User

interface ApiService {


    @GET("users")
    suspend fun getUsers(): List<User>

}