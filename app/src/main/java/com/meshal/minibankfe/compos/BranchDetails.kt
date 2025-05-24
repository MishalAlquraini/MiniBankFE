package com.meshal.minibankfe.compos

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.meshal.minibankfe.viewmodel.BranchViewModel

@Composable
fun BranchDetails(modifier: Modifier = Modifier,
                  branchViewModel: BranchViewModel = viewModel()
)
{
    val modelView = branchViewModel.selectedBranch
    val favBranch = branchViewModel.favoriteBranch

    Log.d("DEBUG", "Loaded selected branch: ${modelView?.name}")

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ){
        if (modelView != null) {
            Text(
                text = modelView.name,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = modelView.type.toString(),
                color = Color.Gray,
                style = MaterialTheme.typography.titleMedium
                )
            Text(
                text = modelView.address,
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "🕐 ${modelView.hours}",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = modifier.height(5.dp))

            Text(
                text = "📞 ${modelView.phone}",
                style = MaterialTheme.typography.bodyMedium
            )

            val isFavorite = modelView == favBranch
            Button(
                onClick = {branchViewModel.markAsFavorite(modelView)},
                enabled = !isFavorite,
            ) {
                Text(text = if (isFavorite) "🌟 Favorite Branch" else "Mark as Favorite")
            }



        } else{
            Text(text = "No branch selected.")
        }
    }

}