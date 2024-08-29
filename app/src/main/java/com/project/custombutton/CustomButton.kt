package com.project.custombutton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showBackground = true,
    showSystemUi = true)
@Composable
fun MyButton() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Custom Buttons",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1F2D7C)
            ),
            modifier = Modifier.padding(top = 20.dp)
                .height(60.dp)
                .width(150.dp)
        ) {
            Text(text = "Login",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFAC053E)
            ),
            modifier = Modifier.padding(top = 20.dp)
                .height(60.dp)
                .width(150.dp)
        ) {
            Text(text = "Submit",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF4A4C4D)
            ),
            modifier = Modifier.padding(top = 20.dp)
                .height(60.dp)
                .width(150.dp)
        ) {
            Text(text = "Clear",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}