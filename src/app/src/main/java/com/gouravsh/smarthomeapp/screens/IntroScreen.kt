package com.gouravsh.smarthomeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.SvgDecoder
import com.gouravsh.smarthomeapp.R
import com.gouravsh.smarthomeapp.ui.common.PrimaryButton
import com.gouravsh.smarthomeapp.ui.navigation.NavigationDestination

object IntroDestination : NavigationDestination {
    override val route: String
        get() = "intro"
    override val titleRes: Int
        get() = R.string.intro_title

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun IntroScreen(
    navigateToSignIn: () -> Unit
) {
    val imageLoader = ImageLoader.Builder(LocalContext.current)
        .components {
            add(SvgDecoder.Factory())
        }
        .build()


    Column {
        Box(
            Modifier
                .padding(32.dp),
        ) {
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(modifier = Modifier.height(height = 32.dp))

                Text(
                    text = stringResource(id = IntroDestination.titleRes),
                    style = MaterialTheme.typography.displayLarge,

                    )
                Box(modifier = Modifier.height(height = 48.dp))

                Image(
                    painter = rememberAsyncImagePainter(R.drawable.bulb, imageLoader),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(0.8f),
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary)
                )
                Box(modifier = Modifier.height(height = 48.dp))
                PrimaryButton(
                    text = "LOREM IPSUM", onClick = navigateToSignIn
                )
                Box(modifier = Modifier.height(height = 24.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetuer?",
                    style = MaterialTheme.typography.displaySmall,
                    textAlign = TextAlign.Center
                )

            }
        }
    }
}


