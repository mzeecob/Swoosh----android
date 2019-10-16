package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


        //you either use event listener on ID or function on element attributes

//        leagueNextBtn.setOnClickListener {
//            val skillActivity = Intent(this, SkillActivity::class.java)
//            startActivity(skillActivity)
//        }
    }

    fun leagueNextClicked(view: View){
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }
}
