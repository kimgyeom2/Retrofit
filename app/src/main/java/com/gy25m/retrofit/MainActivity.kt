package com.gy25m.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.gy25m.retrofit.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)





        binding.btn1.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                var service=ApiClient.retrofit
                try {
                    val response = service.getPersons()
                    Log.i("zzz",response.toString())
                    if (response.isNotEmpty()) {
                        binding.recycler.adapter =MyAdapter(response)

                    }
                }catch (e:Exception){
                    Toast.makeText(this@MainActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


}