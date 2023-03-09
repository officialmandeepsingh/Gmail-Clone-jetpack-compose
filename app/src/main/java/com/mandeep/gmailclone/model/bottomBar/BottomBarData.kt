package com.mandeep.gmailclone.model.bottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Developed By: offic
 * Project: Gmail Clone
 */
sealed class BottomBarData(
    val icon: ImageVector? = null, val title: String? = null
) {
    object Mail : BottomBarData(Icons.Outlined.Mail, "Mail")
    object Meet : BottomBarData(Icons.Outlined.VideoCall, "Meet")
    object ComposeMail : BottomBarData(Icons.Outlined.Add, "New Mail")


}
