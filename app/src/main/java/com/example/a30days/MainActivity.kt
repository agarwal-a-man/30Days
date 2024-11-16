package com.example.a30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30days.data.Tip
import com.example.a30days.data.tips
import com.example.a30days.ui.theme._30DaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = { TopAppBar() }
                    ) { innerPadding ->
                    _30DayTipApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier){
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
        ),
        title = {
            Text(
                text = stringResource(R.string.top_app_bar),
                style = MaterialTheme.typography.headlineMedium,

                )

        },
        modifier = modifier
    )
}

@Composable
fun _30DayTipApp( modifier: Modifier = Modifier) {

    LazyColumn(modifier = modifier) {
        items(tips){tip ->
            TipList(tip = tip,
                modifier=Modifier)

        }
    }
}
@Composable
fun TipList(tip: Tip, modifier: Modifier = Modifier) {
    var enabled by remember { mutableStateOf(false) }
        Card(
            modifier = modifier.padding(16.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness =Spring.StiffnessMedium
                    )
                )
            ) {
            Button(
                onClick = { enabled = !enabled },
                shape = MaterialTheme.shapes.medium,
            ) {
            Column {
                Text(
                    text = stringResource(tip.dayNumber),
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = stringResource(tip.title),
                    style = MaterialTheme.typography.headlineSmall,

                )
                Spacer(modifier = Modifier.padding(8.dp))
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(horizontal = 16.dp)
                        .clip(RoundedCornerShape(8.dp))

                ) {
                    Image(
                        painter = painterResource(tip.imageResourceId),
                        contentDescription = null,
                    )
                }
                if (enabled) {
                    Text(
                        text = stringResource(tip.description),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _30DaysTheme {

           _30DayTipApp()

    }
}