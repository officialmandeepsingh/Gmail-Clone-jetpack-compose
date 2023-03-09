package com.mandeep.gmailclone.components.drawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mandeep.gmailclone.model.drawer.DrawerMenuData

/**
 * Developed By: offic
 * Project: Gmail Clone
 */

@Composable
fun DrawerMenu(scrollState: ScrollState) {
    val menuList = listOf(
        DrawerMenuData.DividerOne,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.DividerTwo,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.DividerThree,
        DrawerMenuData.Setting,
        DrawerMenuData.Help
    )

    Column(modifier = Modifier.verticalScroll(scrollState)) {

        Text(
            text = "Gmail",
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        menuList.forEach { item ->
            when {
                item.isDivider -> Divider(modifier = Modifier.padding(vertical = 10.dp))
                item.isHeader -> {
                    Text(
                        text = item.title!!,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 10.dp),
                        fontWeight = FontWeight.Light
                    )
                }
                else -> DrawerItem(item = item)
            }
        }

    }
}

@Composable
fun DrawerItem(item: DrawerMenuData) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 8.dp),


        ) {
            if (item.icon != null && item.title != null) {
                Image(
                    imageVector = item.icon,
                    contentDescription = item.title,
                    modifier = Modifier.weight(0.5f)
                )

                Text(text = item.title, modifier = Modifier.weight(2.0f))
            }
        }

    }
}