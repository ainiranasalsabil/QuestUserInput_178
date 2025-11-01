package com.example.questuserinput_178

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource

@Composable
fun FormPendaftaranDataDiri(modifier: Modifier = Modifier) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    val gender = listOf("Laki-laki", "Perempuan")
    val status = listOf("Janda", "Lajang", "Duda")
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(dimensionResource(R.dimen.tinggi_header))
                .background(Color.Blue),
    contentAlignment = Alignment.Center
    )

}