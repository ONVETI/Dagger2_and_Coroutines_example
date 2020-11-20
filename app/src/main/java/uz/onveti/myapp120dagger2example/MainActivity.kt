package uz.onveti.myapp120dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import uz.onveti.myapp120dagger2example.adapter.UserRvAdxapter
import uz.onveti.myapp120dagger2example.dagger2.App
import uz.onveti.myapp120dagger2example.dagger2.UserViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userViewModel: UserViewModel

    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as App).daggerApplicationComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userViewModel.getUserRepository().observe(this, Observer {
            Log.d(TAG, "onCreate: $it")
            rv_id.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            rv_id.adapter = UserRvAdxapter(it)
        })
    }
}