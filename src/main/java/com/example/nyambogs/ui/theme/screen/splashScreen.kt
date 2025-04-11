package com.example.nyambogs.ui.theme.screen

import android.text.Layout
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.nyambogs.R
import com.example.nyambogs.ui.theme.screen.login.LoginActivityScreen


@Composable
fun SplashScreen(onNavigateToNext: () -> Unit){
    val splashScreenDuration = 3000L
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(splashScreenDuration)
        onNavigateToNext()
    }
    Box(){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "background image",

            contentScale = ContentScale.FillBounds)
    }
    Box(modifier = Modifier.fillMaxSize()
        .background(Color.White),
       contentAlignment= Alignment.Center){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.logo_2),
               contentDescription = "App Logo",
               modifier = Modifier.size(150.dp) )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Welcom to Jenco App")

            Spacer(modifier = Modifier.height(40.dp))



            CircularProgressIndicator(
                color = Color.Cyan,
                strokeWidth = 5.dp,
                modifier = Modifier.size(40.dp)
            )

        }
    }
}




//@Composable
//fun SplashScreenPreview() {
//    SplashScreenPreview()
//}@Preview(showBackground = true, showSystemUi = true)