package com.example.composeuiux

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimationOne(modifier: Modifier = Modifier) {
    var isExpanded by remember { mutableStateOf(false) }
   Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.Red, shape = MaterialTheme.shapes.large)
            .clickable { isExpanded = !isExpanded })
    AnimatedVisibility(visible = isExpanded,
enter = fadeIn()+ slideInHorizontally(), exit = slideOutVertically(
    targetOffsetY = { -it-500},
    animationSpec = tween(100))
        ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.Blue, shape = MaterialTheme.shapes.large))
    }
}
    }