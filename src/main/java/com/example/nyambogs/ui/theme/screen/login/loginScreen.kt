package com.example.nyambogs.ui.theme.screen.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nyambogs.R

@Composable
fun LoginActivityScreen(navController: NavController) {
    var email by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }
    Box(){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "background image",

            contentScale = ContentScale.FillBounds)
    }

    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center) {
        Text(
            text = "login here",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.background(Color.Red).fillMaxWidth().padding(20.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier.wrapContentHeight().fillMaxWidth().height(80.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { newemail -> email = newemail },
            label = { Text(text = "enter your email") },
            placeholder = { Text(text = "please enter your email") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally),leadingIcon ={ Icon(Icons.Default.Email, contentDescription = "Email Icon") } )

        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { newpassword -> password = newpassword },
            label = { Text(text = "enter your password") },
            placeholder = { Text(text = "please enter your password") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally), leadingIcon = {Icon(
                Icons.Default.Lock, contentDescription = "password Icon")}

        )
        Button(
            onClick = {}, modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally).width(500.dp),


            colors = ButtonDefaults.buttonColors(
                Color.Green
            )
        ) { Text(text = "login") }
        Spacer(modifier = Modifier.width(10.dp))

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {

        LoginActivityScreen(rememberNavController())
    }
