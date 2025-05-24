package com.meshal.minibankfe.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.meshal.minibankfe.data.BranchModel
import com.meshal.minibankfe.repository.BranchRepository

class BranchViewModel : ViewModel() {
    var branchListState by mutableStateOf(BranchRepository.dummyBranchModels)
        private set

    var selectedBranch by mutableStateOf<BranchModel?>(null)
    var favoriteBranch by mutableStateOf<BranchModel?>(null)

    fun selectBranch(branch : BranchModel){
        selectedBranch = branch
        Log.d("DEBUG", "Selected branch: ${branch.name}")
    }
    fun markAsFavorite (branch: BranchModel){
        favoriteBranch = branch
    }
}