package com.elitcoder.loginpagekotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyApp() {
    //This Column is for Orientation :
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //This is for image :
        Image(
            painter = painterResource(id = R.drawable.login_logo),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )//Here use modifier for custom size
        //This is for Space after one view :
        Spacer(modifier = Modifier.height(15.dp))
        //This is like edittext for input :
        OutlinedTextField(value = "", onValueChange = {}, placeholder = {
            Text(text = "Enter Your Email")
        }, maxLines = 1)//Here we use placeholder for hint...
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(value = "", onValueChange = {}, placeholder = {
            Text(text = "Enter Your Password")
        }, maxLines = 1)
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(15.dp))
        //This is like textView for show text :
        Text(text = "Forgot Password?")
    }

}