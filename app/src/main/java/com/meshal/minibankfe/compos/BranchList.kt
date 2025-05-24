package com.meshal.minibankfe.compos

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.meshal.minibankfe.data.BranchModel
import com.meshal.minibankfe.viewmodel.BranchViewModel


@Composable
fun BranchList(
    modifier: Modifier = Modifier,
    onCardClicked: (BranchModel) -> Unit = {},
    branchViewModel: BranchViewModel = viewModel()
) {
    LazyColumn(modifier = modifier) {
        items(branchViewModel.branchListState) { branch ->
            BranchCard(branch = branch, onClick = onCardClicked)
        }
    }
}
