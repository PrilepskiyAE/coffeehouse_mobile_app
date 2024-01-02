package com.coffeehouse.ch_mobile.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

class TopLevelNavigation(private val navController: NavHostController) {
    fun navigateTo(destination: TopLevelDestination) {
        navController.navigate(destination.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}
data class TopLevelDestination(
    val route: String,
    @DrawableRes
    val iconId: Int,
    @StringRes
    val iconTextId: Int,
)