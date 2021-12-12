package dev.dayaonweb.composemeup.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dayaonweb.composemeup.R
import dev.dayaonweb.composemeup.ui.models.Screen

@Composable
fun Onboarding(
    screens: List<Screen> = emptyList()
) {
    val testScreens = listOf(
        Screen(
            image = R.drawable.ic_launcher_foreground,
            title = "Test title screen 1",
            subtitle = "Test subtitle screen 1"
        ),
        Screen(
            image = R.drawable.ic_launcher_foreground,
            title = "Test title screen 2",
            subtitle = "Test subtitle screen 2"
        ),
        Screen(
            image = R.drawable.ic_launcher_foreground,
            title = "Test title screen 3",
            subtitle = "Test subtitle screen 3"
        )
    )
    LazyRow(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            testScreens.forEach { screen ->
                OnboardScreenCard(screen = screen)
            }
        }
    }

}

@Preview
@Composable
fun OnboardScreenCard(
    screen: Screen = Screen(
        image = R.drawable.ic_launcher_foreground,
        title = "Test title screen",
        subtitle = "Test subtitle screen"
    )
) {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = screen.image),
            contentDescription = "image description",
        )
        Text(text = screen.title, style = MaterialTheme.typography.h4)
        Text(text = screen.subtitle, style = MaterialTheme.typography.subtitle1)
    }
}