package br.com.mauro.lotteryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.navigation.compose.rememberNavController
import br.com.mauro.lotteryapp.navigation.AppNavGraph
import br.com.mauro.lotteryapp.ui.theme.LotteryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LotteryAppTheme {
                val navController = rememberNavController()
                AppNavGraph(navController)

            }
        }
    }
}
