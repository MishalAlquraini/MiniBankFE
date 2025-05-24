package com.meshal.minibankfe.repository

import com.meshal.minibankfe.data.BranchModel
import com.meshal.minibankfe.data.BranchType

object BranchRepository {
    var dummyBranchModels = listOf(
        BranchModel(
            1,
            "Kuwait City",
            BranchType.fullBranch,
            "Sharaq Block 2",
            "2098890",
            "7 Hours",
            "https://www.google.com/maps/place/NBK+Headquarters+Branch/@29.3778737,47.9894097,17z/data=!3m1!4b1!4m6!3m5!1s0x3fcf84983b2217a1:0xebb47292f199d957!8m2!3d29.3778691!4d47.9919846!16s%2Fg%2F11g7_fdswb?entry=ttu&g_ep=EgoyMDI1MDUxNS4xIKXMDSoASAFQAw%3D%3D",
            87255528
        ),
        BranchModel(
            2,
            "Abdullah Al-Salem",
            BranchType.fullBranch,
            "Abdullah Al-Salem Block 1",
            "222209",
            "7 Hours",
            "https://www.google.com/maps/place/NBK+Headquarters+Branch/@29.3778737,47.9894097,17z/data=!3m1!4b1!4m6!3m5!1s0x3fcf84983b2217a1:0xebb47292f199d957!8m2!3d29.3778691!4d47.9919846!16s%2Fg%2F11g7_fdswb?entry=ttu&g_ep=EgoyMDI1MDUxNS4xIKXMDSoASAFQAw%3D%3D",
            87255528
        ),
        BranchModel(
            3,
            "Mubarek Al-Kabeer",
            BranchType.privateBranch,
            "block 5",
            "2333333",
            "7 Hours",
            "https://www.google.com/maps/place/NBK+Headquarters+Branch/@29.3778737,47.9894097,17z/data=!3m1!4b1!4m6!3m5!1s0x3fcf84983b2217a1:0xebb47292f199d957!8m2!3d29.3778691!4d47.9919846!16s%2Fg%2F11g7_fdswb?entry=ttu&g_ep=EgoyMDI1MDUxNS4xIKXMDSoASAFQAw%3D%3D",
            87255528
        )
    )
}