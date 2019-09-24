package com.ibeth.myapplication

import android.content.Intent
import android.os.Bundle

import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

import android.view.MenuItem
import android.view.View

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

import com.google.android.material.navigation.NavigationView

import androidx.drawerlayout.widget.DrawerLayout

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import android.view.Menu

class MainActivity : AppCompatActivity() {

    private var mAppBarConfiguration: AppBarConfiguration? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        mAppBarConfiguration = AppBarConfiguration.Builder(
                R.id.nav_profesionalsummary, R.id.nav_knowledge, R.id.nav_experience,
                R.id.nav_contact)
                .setDrawerLayout(drawer)
                .build()
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration!!)
        NavigationUI.setupWithNavController(navigationView, navController)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        //Captura el punto de georreferencia y lo guarda en la base de datos local *****************
        if (id == R.id.nav_profesionalsummary) {
            val intent = Intent(this@MainActivity, ProfessionalSummary::class.java)
            startActivity(intent)
        } else if (id == R.id.nav_knowledge) {
            val intent = Intent(this@MainActivity, Knowledge::class.java)
            startActivity(intent)
        } else if (id == R.id.nav_experience) {
            val intent = Intent(this@MainActivity, Experience::class.java)
            startActivity(intent)
        } else if (id == R.id.nav_contact) {
            val intent = Intent(this@MainActivity, Contact::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)

    }
}
