package dev.dayaonweb.composemeup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dayaonweb.composemeup.ui.theme.ComposeMeUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMeUpTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    var shouldShowHomeScreen by rememberSaveable { mutableStateOf(false) }
    if (shouldShowHomeScreen)
        HomeScreen()
    else
        LoginScreen {
            shouldShowHomeScreen = false
        }
}

@Preview(showBackground = true)
@Composable
fun LoginScreen(
    onContinueBtnClick: () -> Unit = {}
) {
    Column{
        Text(
            modifier = Modifier
                .fillMaxSize(),
            text = "Login Screen",
        )
    }
}

@Composable
fun HomeScreen() {

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
