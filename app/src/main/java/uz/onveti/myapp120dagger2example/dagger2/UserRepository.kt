package uz.onveti.myapp120dagger2example.dagger2

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import uz.onveti.myapp120dagger2example.model.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private var userRemoteDataSource: UserRemoteDataSource) {

    var list = MutableLiveData<List<User>>()

    init {
        userLoad()
    }

    private fun userLoad() {
        GlobalScope.launch {
            list.postValue(userRemoteDataSource.getUsers())
        }
    }

    fun getUserRemote(): MutableLiveData<List<User>> {
        return list
    }
}