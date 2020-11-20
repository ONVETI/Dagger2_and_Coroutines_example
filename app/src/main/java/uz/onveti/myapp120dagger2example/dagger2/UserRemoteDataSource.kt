package uz.onveti.myapp120dagger2example.dagger2

import uz.onveti.myapp120dagger2example.retrofit.ApiService
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private var apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()

}