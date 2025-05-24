package com.meshal.minibankfe.compos

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.composable
import com.meshal.minibankfe.viewmodel.BranchViewModel

enum class NavRoutesEnum(val value: String) {
    NAV_ROUTE_BRANCH_LIST("branchlist"),
    NAV_ROUTE_BRANCH_DETAILS("branchdetails");
}


@Composable
fun BranchNavHost(modifier: Modifier = Modifier,
                  navController: NavHostController = rememberNavController(),
                  startDestination: String = NavRoutesEnum.NAV_ROUTE_BRANCH_LIST.value,
                  branchViewModel: BranchViewModel = viewModel()
)
{
   NavHost(modifier = modifier, navController = navController, startDestination = startDestination) {

       composable(NavRoutesEnum.NAV_ROUTE_BRANCH_LIST.value){
           BranchList(
               branchViewModel = branchViewModel,
               onCardClicked = { branch ->
                   branchViewModel.selectBranch(branch)
                   navController.navigate(NavRoutesEnum.NAV_ROUTE_BRANCH_DETAILS.value)
               }
           )
       }

       composable(NavRoutesEnum.NAV_ROUTE_BRANCH_DETAILS.value){
           BranchDetails(
               branchViewModel = branchViewModel
           )
       }

   }
}