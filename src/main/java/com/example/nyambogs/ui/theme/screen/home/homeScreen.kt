package com.example.nyambogs.ui.theme.screen.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nyambogs.R
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    val context = LocalContext.current
    Box(){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "background image",

            contentScale = ContentScale.FillBounds)
    }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        TopAppBar(title = { Text(text = "Jenco Investments Ltd") },
            navigationIcon = { IconButton(onClick = {}){
                Icon(imageVector = Icons.Filled.Home, contentDescription = "Home") } },
            actions = { IconButton(onClick = {})

            { Icon(imageVector = Icons.Filled.Search, contentDescription = "Search" ) }
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu" )
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Person" )},
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Green,
                navigationIconContentColor = Color.White,
                titleContentColor = Color.White,
                actionIconContentColor = Color.White
            )
        )
        Row {
            Card(modifier = Modifier.padding(10.dp).clickable {

            },
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(
                    Color.Green)) { Box(modifier = Modifier.height(100.dp).padding(25.dp), contentAlignment = Alignment.Center){ Text(text = "Student",
                color = Color.Black) } }

            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(  Color.Green)){
                Box(modifier = Modifier.height(100.dp).padding(25.dp), contentAlignment = Alignment.Center){ Text(text = "Teachers", color = Color.Black) } }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(  Color.Green)){
                Box(modifier = Modifier.height(100.dp).padding(25.dp), contentAlignment = Alignment.Center){ Text(text = "Classes", color = Color.Black) } }

        }
        Row { Card(modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                Color.Green)) { Box(modifier = Modifier.height(100.dp).padding(25.dp), contentAlignment = Alignment.Center){ Text(text = "Fee ",
            color = Color.Black) } }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(25.dp),
                colors = CardDefaults.cardColors(  Color.Green)){
                Box(modifier = Modifier.height(100.dp).padding(25.dp), contentAlignment = Alignment.Center){ Text(text = "Exam", color = Color.Black) } }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(  Color.Green)){
                Box(modifier = Modifier.height(100.dp).padding(25.dp), contentAlignment = Alignment.Center){ Text(text = "Notification", color = Color.Black) } } }

    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}
