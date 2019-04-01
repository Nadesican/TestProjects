package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }
    fun onMensLeagueClicked(view: View){
        womensLeagueBtn.isChecked = false;
        coedLeagueBtn.isChecked = false;

        selectedLeague = "mens"
    }
    fun onWomensLeagueClicked(view: View){
        mensLeagueBtn.isChecked = false;
        coedLeagueBtn.isChecked = false;

        selectedLeague = "womens"
    }
    fun onCoedLeagueClicked(view: View){
        mensLeagueBtn.isChecked = false;
        womensLeagueBtn.isChecked = false;

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view: View){

        if (selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_LONG).show()
        }

    }
}
