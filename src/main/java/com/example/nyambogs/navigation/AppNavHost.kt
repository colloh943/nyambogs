package com.example.nyambogs.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nyambogs.ui.theme.screen.SplashScreen
import com.example.nyambogs.ui.theme.screen.home.HomeScreen
import com.example.nyambogs.ui.theme.screen.login.LoginActivityScreen
import com.example.nyambogs.ui.theme.screen.register.RegisterScreen
import com.example.nyambogs.ui.theme.screen.students.AddstudentScreen


@Composable
fun AppNavHost(navController: NavHostController = rememberNavController(), startDestination:String = ROUTES_SPLASH){

  NavHost(navController = navController , startDestination = startDestination) {
      composable ( ROUTES_SPLASH)  { SplashScreen {navController.navigate(ROUTES_REGISTER){popUpTo(ROUTES_SPLASH){inclusive=true} } } }
      composable (ROUTES_REGISTER) {RegisterScreen(navController) }
      composable ( ROUTES_LOGIN ) { LoginActivityScreen(navController) }
      composable (ROUTES_HOME ) { HomeScreen(navController) }
      composable ( ROUTES_ADD_STUDENT)  { AddstudentScreen(navController) }


  }

}