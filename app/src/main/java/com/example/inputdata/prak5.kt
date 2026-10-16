package com.example.inputdata

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateOf(value ="") }
    var textAlamat by remember { mutableStateOf(value ="") }
    var textJK by remember { mutableStateOf(value ="") }

    var nama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value ="") }
    var textJK by remember { mutableStateOf(value ="") }
    val gender:List<String> =  listOf("Laki-Laki", "Perempuan")
}