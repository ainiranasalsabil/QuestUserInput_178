package com.example.questuserinput_178

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun FormPendaftaranDataDiri(modifier: Modifier = Modifier) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    val gender = listOf("Laki-laki", "Perempuan")
    val status = listOf("Janda", "Lajang", "Duda")

    // Kolom utama
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(dimensionResource(R.dimen.tinggi_header))
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Formulir Pendaftaran",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_header)))

        // Kartu utama
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .wrapContentHeight(),
            elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.elevasi_card))
        ) {
            Column(
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_card)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium))
            ) {
                // Input Nama
                OutlinedTextField(
                    value = textNama,
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Nama Lengkap") },
                    onValueChange = { textNama = it }
                )

                // Jenis Kelamin
                Text("Jenis Kelamin", fontWeight = FontWeight.SemiBold)
                Column {
                    gender.forEach { item ->
                        Row(
                            modifier = Modifier
                                .selectable(
                                    selected = textJK == item,
                                    onClick = { textJK = item }
                                )
                                .padding(vertical = dimensionResource(R.dimen.padding_tipis)),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = textJK == item,
                                onClick = { textJK = item }
                            )
                            Text(item)
                        }
                    }
                }

                // Status Perkawinan
                Text("Status Perkawinan", fontWeight = FontWeight.SemiBold)
                Column {
                    status.forEach { item ->
                        Row(
                            modifier = Modifier
                                .selectable(
                                    selected = textStatus == item,
                                    onClick = { textStatus = item }
                                )
                                .padding(vertical = dimensionResource(R.dimen.padding_tipis)),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = textStatus == item,
                                onClick = { textStatus = item }
                            )
                            Text(item)
                        }
                    }
                }

                // Input Alamat
                OutlinedTextField(
                    value = textAlamat,
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Alamat Lengkap") },
                    onValueChange = { textAlamat = it }
                )

                // Tombol Submit
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(R.dimen.tinggi_tombol)),
                    enabled = textNama.isNotEmpty() && textAlamat.isNotEmpty(),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("Submit", color = Color.White)
                }
            }
        }
    }
}
