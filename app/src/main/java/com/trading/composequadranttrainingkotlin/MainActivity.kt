package com.trading.composequadranttrainingkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trading.composequadranttrainingkotlin.ui.theme.ComposeQuadrantTrainingKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTrainingKotlinTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantTrainingScreen()
                }
            }
        }
    }
}

@Composable
fun QuadrantTrainingScreen() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.weight(1f),
        ) {
            QuadrantItem(
                title = stringResource(R.string.first_title_text),
                text = stringResource(R.string.first_body_text),
                backgroundColor = Color(0xFFBBDEFB),
                modifier = Modifier.weight(1f)
            )
            QuadrantItem(
                title = stringResource(R.string.second_title_text),
                text = stringResource(R.string.second_body_text),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.weight(1f),
        ) {
            QuadrantItem(
                title = stringResource(R.string.third_title_text),
                text = stringResource(R.string.third_body_text),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuadrantItem(
                title = stringResource(R.string.fourth_title_text),
                text = stringResource(R.string.fourth_body_text),
                backgroundColor = Color(0xFFBBDEFB),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantItem(
    title: String,
    text: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(backgroundColor)
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp) // Add padding to the title
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(
    showBackground = true
)
@Composable
fun PreviewQuadrantTraining() {
    ComposeQuadrantTrainingKotlinTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            QuadrantTrainingScreen()
        }
    }
}