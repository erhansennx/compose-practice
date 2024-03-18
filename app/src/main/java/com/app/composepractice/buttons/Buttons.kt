package com.app.composepractice.buttons

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Buttons() {

    Column(modifier = Modifier.padding(15.dp)) {

        Button(onClick = {
            Log.d("ButtonListener","Button Clicked!")},
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text(text = "Rounded Button")
        }

        FilledTonalButton(onClick = {
            Log.d("ButtonListener","FilledTonalButton Clicked!")},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.filledTonalButtonColors(Color.Red)) {
            Text(text = "Filled Tonal Button")
        }

        OutlinedButton(onClick = {
            Log.d("ButtonListener", "OutlinedButton Clicked!")},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(

            )) {
            Text(text = "Outlined Button")
        }

        ElevatedButton(onClick = {
            Log.d("ButtonListener", "ElevatedButton Clicked!")},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Yellow)) {
            Text(text = "Elevated Button")
        }


    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ButtonPreview() {
    Buttons()
}