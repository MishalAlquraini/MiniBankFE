package com.meshal.minibankfe.compos

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.meshal.minibankfe.data.BranchModel

@Composable
fun BranchCard(
    modifier: Modifier = Modifier,
    branch: BranchModel,
    onClick: (BranchModel) -> Unit = {})
{
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(100.dp)
            .clickable { onClick(branch) }
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)

        ){
            Text(text = branch.name)
            Text(text = branch.type.toString())

        }
    }
}