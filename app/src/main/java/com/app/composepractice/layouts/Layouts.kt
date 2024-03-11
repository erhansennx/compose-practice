package com.app.composepractice.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Layouts() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CustomTextUnderline("Usage Column")
        ColumnUsage()
        Spacer(modifier = Modifier.padding(15.dp))
        // Spacer is a composable that can be used when you want to add an additional space between composables.

        CustomTextUnderline("Usage Row")
        RowUsage()
        Spacer(modifier = Modifier.padding(15.dp))

        CustomTextUnderline("Usage Box")
        BoxUsage()
    }
}

@Composable
fun ColumnUsage() {
    // A Column will show each child below the previous children.
    // It’s similar to a LinearLayout with vertical orientation.
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "First Child!",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            textDecoration = TextDecoration.None,
            // modifier = Modifier.align(Alignment.Start),
            color = Color.Black
        )
        Text(
            text = "Second Child!",
            fontWeight = FontWeight.Normal,
            fontSize = 26.sp,
            // modifier = Modifier.align(Alignment.End),
            color = Color.DarkGray
        )
    }
}

@Composable
fun RowUsage() {
    // A Row will show each child next to the previous children.
    // It’s similar to a LinearLayout with a horizontal orientation.
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Text(
            text = "First Child!",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            // modifier = Modifier.align(Alignment.Start),
            color = Color.Black
        )
        Text(
            text = "Second Child!",
            fontWeight = FontWeight.Normal,
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 10.dp),
            // modifier = Modifier.align(Alignment.End),
            color = Color.DarkGray
        )
    }
}

@Composable
fun BoxUsage() {
    // The children of the Box layout will be stacked over each other.
    Box {
        Text(
            text = "First Child!",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            textDecoration = TextDecoration.None,
            // modifier = Modifier.align(Alignment.Start),
            color = Color.Black
        )
        Text(
            text = "Second Child!",
            fontWeight = FontWeight.Normal,
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 10.dp, top = 20.dp),
            // modifier = Modifier.align(Alignment.End),
            color = Color.DarkGray
        )
    }
}

@Composable
fun CustomTextUnderline(textString: String) {
    Text(text = textString, fontSize = 36.sp, textDecoration = TextDecoration.Underline)
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LayoutsPreview() {
    Layouts()
}
