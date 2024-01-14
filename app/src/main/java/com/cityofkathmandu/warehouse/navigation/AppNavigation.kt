package com.cityofkathmandu.warehouse.navigation

enum class Screen {
    HOME,
    RECEIVE,
    RETURN,
    PICKUP,
    MOVE,
    CYCLECOUNT,
    MORE
}


sealed class NavigationItem(val route: String) {
    object Home : NavigationItem(Screen.HOME.name)
    object Receive : NavigationItem(Screen.RECEIVE.name)
    object Return : NavigationItem(Screen.RETURN.name)
    object Pickup : NavigationItem(Screen.PICKUP.name)
    object Move : NavigationItem(Screen.MOVE.name)
    object CycleCount : NavigationItem(Screen.CYCLECOUNT.name)
    object More : NavigationItem(Screen.MORE.name)
}
