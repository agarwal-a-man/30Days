package com.example.a30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days.R

data class Tip(
    @DrawableRes val imageResourceId: Int,
    @StringRes val dayNumber: Int,
    @StringRes val title: Int,
    @StringRes val description: Int
)
val tips = listOf(
    Tip(R.drawable.pic1, R.string.day_1_number, R.string.day_1_title, R.string.day_1_tip),
    Tip(R.drawable.pic2, R.string.day_2_number, R.string.day_2_title, R.string.day_2_tip),
    Tip(R.drawable.pic3, R.string.day_3_number, R.string.day_3_title, R.string.day_3_tip),
    Tip(R.drawable.pic4, R.string.day_4_number, R.string.day_4_title, R.string.day_4_tip),
    Tip(R.drawable.pic5, R.string.day_5_number, R.string.day_5_title, R.string.day_5_tip),
    Tip(R.drawable.pic6, R.string.day_6_number, R.string.day_6_title, R.string.day_6_tip),
    Tip(R.drawable.pic7, R.string.day_7_number, R.string.day_7_title, R.string.day_7_tip),
    Tip(R.drawable.pic8, R.string.day_8_number, R.string.day_8_title, R.string.day_8_tip),
    Tip(R.drawable.pic9, R.string.day_9_number, R.string.day_9_title, R.string.day_9_tip),
    Tip(R.drawable.pic10, R.string.day_10_number, R.string.day_10_title, R.string.day_10_tip),
    Tip(R.drawable.pic11, R.string.day_11_number, R.string.day_11_title, R.string.day_11_tip),
    Tip(R.drawable.pic12, R.string.day_12_number, R.string.day_12_title, R.string.day_12_tip),
    Tip(R.drawable.pic13, R.string.day_13_number, R.string.day_13_title, R.string.day_13_tip),
    Tip(R.drawable.pic14, R.string.day_14_number, R.string.day_14_title, R.string.day_14_tip),
    Tip(R.drawable.pic15, R.string.day_15_number, R.string.day_15_title, R.string.day_15_tip),
    Tip(R.drawable.pic16, R.string.day_16_number, R.string.day_16_title, R.string.day_16_tip),
    Tip(R.drawable.pic17, R.string.day_17_number, R.string.day_17_title, R.string.day_17_tip),
    Tip(R.drawable.pic18, R.string.day_18_number, R.string.day_18_title, R.string.day_18_tip),
    Tip(R.drawable.pic19, R.string.day_19_number, R.string.day_19_title, R.string.day_19_tip),
    Tip(R.drawable.pic20, R.string.day_20_number, R.string.day_20_title, R.string.day_20_tip),
    Tip(R.drawable.pic21, R.string.day_21_number, R.string.day_21_title, R.string.day_21_tip),
    Tip(R.drawable.pic22, R.string.day_22_number, R.string.day_22_title, R.string.day_22_tip),
    Tip(R.drawable.pic23, R.string.day_23_number, R.string.day_23_title, R.string.day_23_tip),
    Tip(R.drawable.pic24, R.string.day_24_number, R.string.day_24_title, R.string.day_24_tip),
    Tip(R.drawable.pic25, R.string.day_25_number, R.string.day_25_title, R.string.day_25_tip),
    Tip(R.drawable.pic26, R.string.day_26_number, R.string.day_26_title, R.string.day_26_tip),
    Tip(R.drawable.pic27, R.string.day_27_number, R.string.day_27_title, R.string.day_27_tip),
    Tip(R.drawable.pic28, R.string.day_28_number, R.string.day_28_title, R.string.day_28_tip),
    Tip(R.drawable.pic29, R.string.day_29_number, R.string.day_29_title, R.string.day_29_tip),
    Tip(R.drawable.pic30, R.string.day_30_number, R.string.day_30_title, R.string.day_30_tip)
)

