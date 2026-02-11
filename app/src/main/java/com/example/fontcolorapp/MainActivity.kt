package com.example.fontcolorapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FontColorApp()
        }
    }
}

@Composable
fun FontColorApp() {

    val context = LocalContext.current

    var textColor by remember { mutableStateOf(Color.Black) }
    var fontStyle by remember { mutableStateOf(FontStyle.Normal) }
    var fontWeight by remember { mutableStateOf(FontWeight.Normal) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Hello Android!",
            fontSize = 24.sp,
            color = textColor,
            fontStyle = fontStyle,
            fontWeight = fontWeight
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            textColor = Color.Red
            Toast.makeText(context, "Text Color Changed to Red", Toast.LENGTH_SHORT).show()
        }) {
            Text("Red Color")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            fontStyle = FontStyle.Italic
            Toast.makeText(context, "Font Changed to Italic", Toast.LENGTH_SHORT).show()
        }) {
            Text("Italic Font")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            fontWeight = FontWeight.Bold
            Toast.makeText(context, "Font Changed to Bold", Toast.LENGTH_SHORT).show()
        }) {
            Text("Bold Font")
        }
    }
}
