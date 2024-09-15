package com.example.composeuiux

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AnimationThree(modifier: Modifier = Modifier) {
    val infiniteTextTransition = rememberInfiniteTransition(
        label = "Infinite Text Transition"
    )
    val animateColor by infiniteTextTransition.animateColor(
        initialValue = Color(0xFF66DDAD),
        targetValue = Color(0xFFC71BC7),
        animationSpec = infiniteRepeatable(
            animation = tween(1000),
            repeatMode = RepeatMode.Reverse
        ),
        label = "Color Animation"
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Ansh/yug/Arpit/Ayush/Atharva",
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.Bold,
            color = animateColor
        )
        Box(
            modifier = Modifier
                .padding(16.dp)
                .size(200.dp)
                .background(animateColor, MaterialTheme.shapes.extraLarge),
            contentAlignment = Alignment.Center
        ) {
Text(text = "Ayush Bhaii", style = MaterialTheme.typography.displayMedium)
        }
    }
}