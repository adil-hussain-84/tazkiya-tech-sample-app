package com.tazkiyatech.sampleapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onOpenHifdhRevisionTrackerAppButtonClicked(view: View) {
        launchApplication(
            "com.tazkiyatech.hifdhtracker",
            "Hifdh Revision Tracker"
        )
    }

    fun onOpenHifdhRevisionTesterAppButtonClicked(view: View) {
        launchApplication(
            "com.tazkiyatech.hifdhtester",
            "Hifdh Revision Tester"
        )
    }

    private fun launchApplication(
        applicationId: String,
        applicationName: String
    ) {
        try {
            val intent = packageManager.getLaunchIntentForPackage(applicationId)

            if (intent != null) {
                startActivity(intent)
            } else {
                showInstallScreenForApplication(applicationId, applicationName)
            }
        } catch (e: ActivityNotFoundException) {
            showInstallScreenForApplication(applicationId, applicationName)
        }
    }

    private fun showInstallScreenForApplication(
        applicationId: String,
        applicationName: String
    ) {
        showAppNotInstalledToast(applicationName)

        try {
            val intent = Intent(Intent.ACTION_VIEW)

            intent.data = Uri.parse(
                "market://details?id=$applicationId"
            )

            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            val intent = Intent(Intent.ACTION_VIEW)

            intent.data = Uri.parse(
                "https://play.google.com/store/apps/details?id=$applicationId"
            )

            startActivity(intent)
        }
    }

    private fun showAppNotInstalledToast(applicationName: String) {
        Toast.makeText(
            this,
            getString(R.string.app_not_installed_toast_format, applicationName),
            Toast.LENGTH_LONG
        ).show()
    }
}
