package br.com.mauro.lotteryapp.navigation

import java.time.temporal.TemporalAmount

sealed class Routes (val route:String){

    object Input: Routes("input")

    object Result: Routes("result/{${Args.AMOUNT}}"){

        object Args {
            const val AMOUNT = "amount"
        }

        fun createRoute(amount: Int) = "result/$amount"

    }

}