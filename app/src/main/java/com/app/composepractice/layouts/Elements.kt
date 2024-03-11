package com.app.composepractice.layouts

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Elements() {
    Column(modifier = Modifier.fillMaxSize()) {
        SurfaceUsage()
        Spacer(modifier = Modifier.padding(10.dp))
        ShapeUsage()
    }
}


@Composable
fun SurfaceUsage() {
    // Surface is a basic building block for displaying content
    // and can be used to wrap other composable to provide
    // a background color, elevation, padding, and other layout properties.
    Surface(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
            .height(150.dp),
        shape = RoundedCornerShape(15),
        contentColor = Color.Red,
        border = BorderStroke(2.dp, Color.Red),
        onClick = {
            Log.d("Click Listener", "Clicked surface.")
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Test Text", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ShapeUsage() {

    // A Shape can be used to draw a Composable in specific shape.
    // - RectangleShape, CircleShape, RoundedCornerShape, CutCornerShape

    Row {
        Box(modifier = Modifier
            .size(100.dp)
            .padding(15.dp)
            .clip(CircleShape)
            .background(Color.Blue)) {

        }

        Box(modifier = Modifier
            .size(100.dp)
            .padding(15.dp)
            .clip(RectangleShape)
            .background(Color.Blue)) {

        }

        Box(modifier = Modifier
            .size(100.dp)
            .padding(15.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Color.Blue)) {

        }

        Box(modifier = Modifier
            .size(100.dp)
            .padding(15.dp)
            .clip(CutCornerShape(18.dp))
            .background(Color.Blue)) {

        }
    }



}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ElementsPreview() {
    Elements()
}