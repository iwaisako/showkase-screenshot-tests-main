package me.vavra.feature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FeatureGreeting() {
    Column {
        Text(
            text = "Hello from Showkase-Paparazzi!!",
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.background(MaterialTheme.colors.surface)
        )
        Text(
            text = "test",
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.background(MaterialTheme.colors.surface)
        )
        Text(
            text = "test!!!!",
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.background(MaterialTheme.colors.surface)
        )
    }
}

@Preview(name = "Hello Greeting", group = "Greetings")
@Composable
fun DefaultPreview() {
    FeatureGreeting()
}