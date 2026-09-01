
package com.example.TelaHome


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val PinkPrimary = Color(0xFFE6007E)
val PinkLight = Color(0xFFF7DCE1)
val BackgroundGray = Color(0xFFF2F2F2)



@Composable
fun TelaHome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundGray)
    ) {
        CabecalhoRosa()
        Spacer(modifier = Modifier.height(50.dp))
        SaldoConta()
        Spacer(modifier = Modifier.height(50.dp))
        AcoesRapidas()
        Spacer(modifier = Modifier.height(50.dp))
        BannerInvestimentos()
        Spacer(modifier = Modifier.height(20.dp))
        CartaoMeusCartoes()
        Spacer(modifier = Modifier.height(20.dp))
        CartaoEmprestimo()
    }
}

@Composable
fun CabecalhoRosa() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(PinkPrimary)
            .padding(horizontal = 16.dp, vertical = 30.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Perfil",
                    tint = PinkPrimary
                )
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Visibility, contentDescription = null, tint = Color.White)
                Spacer(modifier = Modifier.width(16.dp))
                Icon(Icons.Default.Build, contentDescription = null, tint = Color.White)
                Spacer(modifier = Modifier.width(16.dp))
                Icon(Icons.Default.Menu, contentDescription = null, tint = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(22.dp),
            color = Color.White
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Seu Score aumentou! Confira.",
                    color = PinkPrimary,
                    fontWeight = FontWeight.Medium
                )
                Icon(Icons.Default.MoreVert, contentDescription = null, tint = Color.DarkGray)
            }
        }
    }
}


@Composable
fun SaldoConta() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = "Saldo em conta", fontSize = 22.sp, color = Color.Gray)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "R$67,67", fontSize = 26.sp, fontWeight = FontWeight.Bold)
        }
        Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color.DarkGray)
    }
}

@Composable
fun AcoesRapidas() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        AcaoCircular(icon = Icons.Default.Diamond, texto = "PIX")
        AcaoCircular(icon = Icons.Default.ArrowDownward, texto = "Trazer dinheiro")
        AcaoCircular(icon = Icons.Default.ShoppingBag, texto = "Pagar")
        AcaoCircular(icon = Icons.Default.Call, texto = "Recarga")
    }
}

@Composable
fun AcaoCircular(icon: ImageVector, texto: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.width(72.dp)
    ) {
        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(RoundedCornerShape(50))
                .background(PinkPrimary),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = icon, contentDescription = texto, tint = Color.White)
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = texto,
            fontSize = 11.sp,
            textAlign = TextAlign.Center,
            color = Color.DarkGray
        )
    }
}

@Composable
fun BannerInvestimentos() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        color = PinkPrimary
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 35.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.TrendingUp,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(32.dp)
                )
                Spacer(modifier = Modifier.width(22.dp))
                Column {
                    Text(
                        text = "Investimentos",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                    Text(
                        text = "Confira as melhores ações do momento!",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}

@Composable
fun CartaoMeusCartoes() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(20.dp),
        color = PinkLight
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Meus cartões", fontWeight = FontWeight.Medium)
            Icon(Icons.Default.CreditCard, contentDescription = null, tint = Color.DarkGray)
        }
    }
}

@Composable
fun CartaoEmprestimo() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(20.dp),
        color = PinkLight
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = "Empréstimo", fontWeight = FontWeight.Medium)
                Text(text = "Valor disponível de até: R$50.000", fontSize = 12.sp, color = Color.Gray)
            }
            Icon(Icons.Default.ChevronRight, contentDescription = null, tint = Color.DarkGray)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TelaHomePreview() {
    TelaHome()
}