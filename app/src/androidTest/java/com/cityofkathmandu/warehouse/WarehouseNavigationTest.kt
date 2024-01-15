package com.cityofkathmandu.warehouse

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.cityofkathmandu.warehouse.navigation.AppNavHost
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class WarehouseNavigationTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()
    private lateinit var navController: TestNavHostController

    @Before
    fun setupAppNavHost(){
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(ComposeNavigator())
            AppNavHost(navController = navController)
        }
    }

    @Test
    fun verify_startDestination(){
        navController.assertCurrentRouteName("HOME")
    }

    @Test
    fun clickReceive_navigateToReceiveScreen() {
        composeTestRule.onNodeWithContentDescription("Receive")
            .performClick()

        navController.assertCurrentRouteName("RECEIVE")
    }

    @Test
    fun clickReturn_navigateToReturnScreen() {
        composeTestRule.onNodeWithContentDescription("Return")
            .performClick()

        navController.assertCurrentRouteName("RETURN")
    }

    @Test
    fun clickPickup_navigateToPickupScreen() {
        composeTestRule.onNodeWithContentDescription("Pickup")
            .performClick()

        navController.assertCurrentRouteName("PICKUP")
    }

    @Test
    fun clickMove_navigateToMoveScreen() {
        composeTestRule.onNodeWithContentDescription("Move")
            .performClick()

        navController.assertCurrentRouteName("MOVE")
    }

    @Test
    fun clickCycleCount_navigateToCycleCountScreen() {
        composeTestRule.onNodeWithContentDescription("Cycle Count")
            .performClick()

        navController.assertCurrentRouteName("CYCLECOUNT")
    }

    @Test
    fun clickMore_navigateToMoreScreen() {
        composeTestRule.onNodeWithContentDescription("More")
            .performClick()

        navController.assertCurrentRouteName("MORE")
    }




}