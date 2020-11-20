package uz.onveti.myapp120dagger2example.dagger2

import dagger.Component
import uz.onveti.myapp120dagger2example.MainActivity
import uz.onveti.myapp120dagger2example.retrofit.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(userViewModel: UserViewModel)

}