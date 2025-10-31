package com.example.questuserinput_178

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable

fun FormDataDiri(modifier: Modifier
){
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }

    val gender:List<String> = listOf("Laki-laki","Perempuan")

    Column(modifier =Modifier.padding(top =50.dp),
        verticalArrangement = Arrangement.Top,

        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),

            label = {Text(text = "Nama Lengkap")},

            onValueChange = {
                textNama = it
            }
        )

        Row {

        }
    }

}