package com.mandeep.gmailclone.components.topbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mandeep.gmailclone.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Developed By: offic
 * Project: Gmail Clone
 */

@Composable
fun TopBar(scaffoldState: ScaffoldState, coroutineScope: CoroutineScope) {
    Box(modifier = Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 6.dp
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {

                IconButton(onClick = {
                    coroutineScope.launch { scaffoldState.drawerState.open() }
                }) {
                    Icon(Icons.Default.Menu, "Menu")
                }

                Text(text = "Search in mails...", modifier = Modifier.weight(2.0f))

                Image(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(0.dp, Color.Gray, CircleShape),
                    contentScale = ContentScale.Inside,
                    painter = painterResource(id = R.drawable.user_profile),
                    contentDescription = "User Profile",

                    )
            }
        }
    }
}