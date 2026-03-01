package br.com.mauro.lotteryapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LotteryBall(number: Int) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(70.dp)
            .clip(CircleShape)

            .background(MaterialTheme.colorScheme.primary)
    ) {
        Text(
            text = number.toString(),
            style =
                MaterialTheme.typography.headlineSmall,
            color =
                MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Preview
@Composable
fun LotteryBallPreview(
    modifier: Modifier =
        Modifier
) {
    LotteryBall(7)
}