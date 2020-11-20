package uz.onveti.myapp120dagger2example.dagger2

import androidx.lifecycle.MutableLiveData
import uz.onveti.myapp120dagger2example.model.User
import javax.inject.Inject

class UserViewModel @Inject constructor(private var userRepository: UserRepository) {

    fun getUserRepository(): MutableLiveData<List<User>> {
        return userRepository.getUserRemote()
    }
}