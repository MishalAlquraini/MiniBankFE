package com.meshal.minibankfe.data


enum class BranchType {
    fullBranch, digitalBranch, privateBranch
}

data class BranchModel(
    val id: Int,
    val name: String,
    val type: BranchType,
    val address: String,
    val phone: String,
    val hours: String,
    val location: String,
    val imageUri: Int
)
