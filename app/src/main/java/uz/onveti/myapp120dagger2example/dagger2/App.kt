package uz.onveti.myapp120dagger2example.dagger2

import android.app.Application

class App : Application() {

    lateinit var daggerApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        daggerApplicationComponent = DaggerApplicationComponent.create()
    }
}