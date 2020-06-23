package com.example.testapplication

import android.R.layout
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick


class MainActivity : AppCompatActivity() {

    @BindView(R.id.constrain_pending_cases)
    @JvmField
    var clPendingCases: ConstraintLayout? = null

    @BindView(R.id.constrain_tasks)
    @JvmField
    var clTasks: ConstraintLayout? = null

    @BindView(R.id.constrain_settings)
    @JvmField
    var clSettings: ConstraintLayout? = null

//    @BindView(R.id.temp)
//    @JvmField
//    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this);
    }


    @OnClick(R.id.constrain_pending_cases,R.id.constrain_tasks,R.id.constrain_settings)
    fun clickItem(view: View?){
        when(view?.id) {
            R.id.constrain_pending_cases -> {
                val intentPending = Intent(this, PendingCasesActivity::class.java)
                startActivity(intentPending)
            }
              R.id.constrain_settings-> {
                  val intentSettings = Intent(this, SettingsActivity::class.java)
                  startActivity(intentSettings)
              }

            }
        }
    }
