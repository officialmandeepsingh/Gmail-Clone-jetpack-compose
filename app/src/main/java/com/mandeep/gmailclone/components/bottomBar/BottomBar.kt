package com.mandeep.gmailclone.components.bottomBar

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.mandeep.gmailclone.model.bottomBar.BottomBarData

/**
 * Developed By: offic
 * Project: Gmail Clone
 */

@Composable
fun BottomBar() {
    val bottomBarsItems = listOf(
        BottomBarData.Mail,
        BottomBarData.Meet,
        BottomBarData.ComposeMail,
    )
    //backgroundColor = colorResource(id = R.color.white),contentColor = colorResource(id = R.color.black)
    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black
    ) {
        bottomBarsItems.forEach { item ->
            BottomNavigationItem(
                label = { Text(text = item.title!!) },
                alwaysShowLabel = true,
                selected = false,
                onClick = { },
                icon = {
                    Icon(
                        imageVector = item.icon!!,
                        contentDescription = item.title
                    )
                },
            )
        }
    }
}