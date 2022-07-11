package com.nyawera.mytwittercontact

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nyawera.mytwittercontact.MainActivity
import com.nyawera.mytwittercontact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displTweets()
    }
    fun displTweets(){
        var twitter1=twitter("Tut","@tut21","July 8","i am happy to be alive#YOLO",300,500)
        var twitter2=twitter("Miryann","@miryann23","June 8","I love kotlin# programming",300,700)
        var twitter3=twitter("Akuot","@akuotphilip","may 10","it is cold#winter",200,800)
        var twitter4=twitter("Tessa","@tessamarie","Jan 20","i love school#education",500,700)
        var twitter5=twitter("Naima","@naimamima","july1","how do you call a function? #questions",600,700)
        var twitter6=twitter("Anjela","@anjelamunde","July 12","cant wait for the weekend#itsMonday",500,600)

        var twitterList = listOf(twitter1,twitter2,twitter3,twitter4,twitter5,twitter6)
        var twitterAdapter = TwitterRecyclerViewAdapter(twitterList)
        binding.rvTwitter.layoutManager= LinearLayoutManager(this)
        binding.rvTwitter.adapter = twitterAdapter
    }

}






