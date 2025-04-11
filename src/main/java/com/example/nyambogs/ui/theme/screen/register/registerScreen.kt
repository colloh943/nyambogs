package com.example.nyambogs.ui.theme.screen.register

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.natalie.data.AuthViewModel

import com.example.nyambogs.R


import com.google.android.play.core.integrity.p

@Composable
fun RegisterScreen(navController: NavController){
    var authViewModel: AuthViewModel = viewModel ()
    var firstname by remember { mutableStateOf(value = "") }
    var lastname by remember { mutableStateOf(value = "") }
    var email by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }
    val context = LocalContext.current


//    Box(){
//        Image(painter = painterResource(id = R.drawable.background),
//            contentDescription = "background image",
//
//            contentScale = ContentScale.FillBounds)
//    }

    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center) {
        Text(
            text = "Register Here!!",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.background(Color.Red).fillMaxWidth().padding(20.dp)

        )
        Spacer(modifier = Modifier.height(8.dp))
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier.wrapContentHeight().fillMaxWidth().height(80.dp))
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = firstname,
            onValueChange = {newFirstName -> firstname = newFirstName},
            label = { Text(text = "enter first name") },
            placeholder = { Text(text = "please enter first name") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally), leadingIcon = {Icon(
                Icons.Default.Person, contentDescription = "person Icon")})
        Spacer(modifier = Modifier.height(8.dp))


        OutlinedTextField(
            value = lastname,
            onValueChange = {newLastName->lastname=newLastName},
            label = { Text(text = "enter lastname name") },
            placeholder = { Text(text = "please enter last name") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally), leadingIcon = {Icon(
                Icons.Default.Person, contentDescription = "person Icon")})


        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {newemail->email=newemail},
            label = { Text(text = "enter your email") },
            placeholder = { Text(text = "please enter your email") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally), leadingIcon ={ Icon(Icons.Default.Email, contentDescription = "Email Icon") } )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {newpassword->password=newpassword},
            label = { Text(text = "enter your password") },
            placeholder = { Text(text = "please enter your password") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally), leadingIcon = {Icon(
                Icons.Default.Lock, contentDescription = "password Icon")})
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            authViewModel.signup(firstname,lastname,email,password,navController,context)
        }, modifier = Modifier.align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(
            Color.Cyan) ) { Text(text = "Register") }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = buildAnnotatedString { append("If already registered, login here") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally).clickable {

            })









    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())
}