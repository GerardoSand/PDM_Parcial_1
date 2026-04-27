package com.pdm0126.parcial1

import android.R
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.currentCompositionContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun Menu() {

    val pupusaImg =
        "https://comedera.com/wp-content/uploads/sites/9/2023/05/Pupusas-de-quesoshutterstock_1803502444.jpg"
    val cafeImg = "https://i.blogs.es/139e0f/cafe-americano2/840_560.jpeg"
    val chocoImg =
        "https://cocinaconcoqui.com/wp-content/uploads/2025/12/chocolate-calientecasero-500x500.jpg"
    val cocaImg =
        "https://d23esi1h40dfmi.cloudfront.net/wpcontent/uploads/2025/08/01124509/00732.jpg"

    val menu = listOf(
        Producto(1, "Pupusa de queso", 0.75, pupusaImg, TipoProducto.PUPUSA),
        Producto(2, "Pupusa de frijol con queso", 0.75, pupusaImg, TipoProducto.PUPUSA),
        Producto(3, "Pupusa revuelta", 1.00, pupusaImg, TipoProducto.PUPUSA),
        Producto(4, "Pupusa de chicharrón", 1.00, pupusaImg, TipoProducto.PUPUSA),
        Producto(5, "Pupusa de loroco con queso", 1.00, pupusaImg, TipoProducto.PUPUSA),
        Producto(6, "Pupusa de ayote", 0.75, pupusaImg, TipoProducto.PUPUSA),
        Producto(7, "Pupusa de espinaca", 0.85, pupusaImg, TipoProducto.PUPUSA),
        Producto(8, "Pupusa de jalapeño con queso", 1.00, pupusaImg, TipoProducto.PUPUSA),
        Producto(9, "Café", 1.00, cafeImg, TipoProducto.BEBIDA),
        Producto(10, "Chocolate", 1.50, chocoImg, TipoProducto.BEBIDA),
        Producto(11, "Coca-Cola", 1.25, cocaImg, TipoProducto.BEBIDA)
    )

    var NumBCoca: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPQueso: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPFrijol: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPRevueltas: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPChicharron: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPLQ: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPAyote: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPEspinaca: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumPJP: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumBCafe: Int by rememberSaveable() { mutableIntStateOf(0) }
    var NumBChocolate: Int by rememberSaveable() { mutableIntStateOf(0) }

    LazyColumn(Modifier.fillMaxWidth()) {
        item {

            Text(text = " ${menu.getOrNull(0)?.nombre}       $${menu.getOrNull(0)?.precio} ")
            Button(
                onClick = { NumPQueso++ }
            ) {
                NumPQueso
            }
        }

        item {
            Text(text = " ${menu.getOrNull(1)?.nombre}      $${menu.getOrNull(1)?.precio}")
            Button(
                onClick = { NumPFrijol++ }
            ) {
                NumPFrijol
            }
        }

        item {
            Text(text = " ${menu.getOrNull(2)?.nombre}      $${menu.getOrNull(2)?.precio}")
            Button(
                onClick = { NumPRevueltas++ }
            ) {
                NumPRevueltas
            }
        }

        item {
            Text(text = " ${menu.getOrNull(3)?.nombre}      $${menu.getOrNull(3)?.precio}")
            Button(
                onClick = { NumPChicharron++ }
            ) {
                NumPChicharron
            }
        }

        item {
            Text(text = " ${menu.getOrNull(4)?.nombre}      $${menu.getOrNull(4)?.precio}")
            Button(
                onClick = { NumPLQ++ }
            ) {
                NumPLQ
            }
        }

        item {
            Text(text = " ${menu.getOrNull(5)?.nombre}      $${menu.getOrNull(5)?.precio}")
            Button(
                onClick = { NumPAyote++ }
            ) {
                NumPAyote
            }
        }
        item {
            Text(text = " ${menu.getOrNull(6)?.nombre}      $${menu.getOrNull(6)?.precio}")
            Button(
                onClick = { NumPEspinaca++ }
            ) {
                NumPEspinaca
            }
        }
        item {
            Text(text = " ${menu.getOrNull(7)?.nombre}      $${menu.getOrNull(7)?.precio}")
            Button(
                onClick = { NumPJP++ }
            ) {
                NumPJP
            }
        }
        item {
            Text(text = " ${menu.getOrNull(8)?.nombre}      $${menu.getOrNull(8)?.precio}")
            Button(
                onClick = { NumBCafe++ }
            ) {
                NumBCafe
            }
        }
        item {
            Text(text = " ${menu.getOrNull(9)?.nombre}      $${menu.getOrNull(9)?.precio}")
            Button(
                onClick = { NumBChocolate++ }
            ) {
                NumBChocolate
            }
        }
        item {
            Text(text = " ${menu.getOrNull(10)?.nombre}      $${menu.getOrNull(10)?.precio}")
            Button(
                onClick = { NumBCoca++ }
            ) {
                NumBCoca
            }
        }

        item {
            var Total: Int by rememberSaveable() { mutableIntStateOf(0)}

            Total = NumPQueso + NumPFrijol + NumPRevueltas + NumPChicharron + NumPLQ + NumPAyote + NumPEspinaca + NumPJP + NumBCafe + NumBChocolate + NumBCoca

        }
    }
}