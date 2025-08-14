package com.example.businesscardapp

import android.R.attr.contentDescription
import android.R.attr.fontWeight
import android.R.attr.lineHeight
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                }
            }
            Screen()
        }
    }
}
@Composable
fun Screen() {
        Column(
            modifier = Modifier.
            fillMaxWidth().
            fillMaxHeight()
            .background(color = Color.Green.copy(alpha = 0.2f)),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "android logo",
                modifier = Modifier.size(200.dp).padding(bottom = 8.dp)
            )
            Text(
                text = "stringResource(R.string.jennifer_text)",
                fontWeight = FontWeight.Thin,
                fontSize = 40.sp

            )
            Text(
                text = "stringResource(R.string.android_developer_text)",
                fontSize = 18.sp,
                color = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.height(100.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp),

                ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                    ) {
                    Icon(
                        Icons.Default.Call,
                        contentDescription = "Call",
                        tint = Color(0xFF3ddc84)
                    )
                    Spacer(
                        modifier = Modifier.width(8.dp)
                    )
                    Text(
                        text = "+11 (123) 444 555 666",
                        color = Color.Black,
                        textAlign = TextAlign.Justify
                    )
                }
                Spacer(
                    modifier = Modifier.width(16.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Icon(
                        Icons.Default.Share,
                        contentDescription = "Share",
                        tint = Color(0xFF3ddc84)
                    )
                    Spacer(
                        modifier = Modifier.width(8.dp)
                    )
                    Text(
                        text = "@AndroidDev             ",
                        color = Color.Black,
                        textAlign = TextAlign.Justify
                    )
                }
                Spacer(
                    modifier = Modifier.width(16.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Icon(
                        Icons.Default.Email,
                        contentDescription = "Email",
                        tint = Color(0xFF3ddc84)
                    )
                    Spacer(
                        modifier = Modifier.width(16.dp)
                    )
                    Text(
                        text = "jen.doe@gmail.com",
                        color = Color.Black
                    )
                }
            }
        }
    }
@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    BusinessCardAppTheme {
        Screen()
    }
}

