package com.iessanalbertomagno.dam2.trabajocards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iessanalbertomagno.dam2.trabajocards.data.Receta
import com.iessanalbertomagno.dam2.trabajocards.data.listaRecetas
import com.iessanalbertomagno.dam2.trabajocards.ui.theme.TrabajoCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrabajoCardsTheme {
                // A surface container using the 'background' color from the theme
                LazyColumn(modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    items(listaRecetas) {
                        receta -> TargetaRecetas(receta = receta)
                    }
                }
            }
        }
    }
}

@Composable
fun TargetaRecetas(receta: Receta) {
    Card (colors = CardDefaults.cardColors(
        Color.LightGray),
        modifier = Modifier.size(width = 400.dp, height = 190.dp)
    ) {
        Row () {
            Column (modifier = Modifier.padding(20.dp)) {
                Image(painter = painterResource(id = receta.foto),
                    contentDescription = "Receta",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape))
            }

            Column () {
                Text(text = receta.name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center)
                Text(text = "Puntuacion: " + receta.puntuacion)
                Text(text = "Tiempo de preparacion: " + receta.tiempo)
                Text(text = receta.descripcion)
            }
        }
    }
}