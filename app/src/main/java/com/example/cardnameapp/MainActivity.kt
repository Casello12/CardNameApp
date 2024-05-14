package com.example.cardnameapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardnameapp.ui.theme.CardNameAppTheme

val LightPastelGreen = Color(0xFFD9E6DC)
val AndroidGreen = Color(0xFFA4C639)
val DarkerGreen = Color(0xFF013220)


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardNameAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = LightPastelGreen) {
                    CardContent()
                }
            }
        }
    }
}

@Composable
fun CardContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Spacer untuk menempatkan logo, nama, dan jabatan di tengah secara vertikal
        Spacer(modifier = Modifier.weight(1f))

        // Logo and Name
        Column(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_android_22),
                contentDescription = "Android Logo",
                modifier = Modifier.size(72.dp)
            )
            Text(
                text = "Rifaldi Hafiz",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Software Developer",
                fontSize = 16.sp,
                color = DarkerGreen,
                textAlign = TextAlign.Center
            )
        }

        // Spacer untuk menempatkan logo, nama, dan jabatan di tengah secara vertikal
        Spacer(modifier = Modifier.weight(1f))

        // Contact Information
        Column(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ContactInfo(iconId = R.drawable.ic_phone, info = "+62 895-3912-54661")
            Spacer(modifier = Modifier.height(8.dp))
            ContactInfo(iconId = R.drawable.ic_email, info = "aldirifaldi821@gmail.com")
        }
    }
}

@Composable
fun ContactInfo(iconId: Int, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = info, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CardNameAppTheme {
        Surface(color = LightPastelGreen) {
            CardContent()
        }
    }
}