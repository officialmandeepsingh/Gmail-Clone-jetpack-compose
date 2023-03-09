package com.mandeep.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mandeep.gmailclone.components.bottomBar.BottomBar
import com.mandeep.gmailclone.components.drawer.DrawerMenu
import com.mandeep.gmailclone.components.topbar.TopBar
import com.mandeep.gmailclone.ui.theme.GmailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(scaffoldState, coroutineScope) },
        drawerContent = { DrawerMenu(scrollState) },
        drawerElevation = 30.dp,
        bottomBar = { BottomBar()}
    ) {
        LazyColumn() {
            items(50) { index ->
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 5.dp),
                    text = "Email $index",
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCloneTheme {
        HomeScreen()
    }
}