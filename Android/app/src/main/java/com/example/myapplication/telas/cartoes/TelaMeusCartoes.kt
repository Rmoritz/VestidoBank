package com.example.myapplication.telas.cartoes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

private val Background = Color(0xFFF0F1F5)
private val VestidoPink = Color(0xFFE31A6B)
private val CardIconBackground = Color(0xFFF3DEDE)
private val TextColor = Color(0xFF050505)

@Composable
fun TelaMeusCartoes(
    onBack: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .verticalScroll(rememberScrollState())
            .padding(
                start = 25.dp,
                end = 12.dp,
                top = 43.dp,
                bottom = 18.dp
            )
    ) {
        IconButton(
            onClick = onBack,
            modifier = Modifier.size(43.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Voltar",
                tint = TextColor,
                modifier = Modifier.size(38.dp)
            )
        }

        Spacer(modifier = Modifier.height(13.dp))

        Text(
            text = "Meus cartões",
            color = TextColor,
            fontSize = 25.sp,
            fontWeight = FontWeight.Normal
        )

        Spacer(modifier = Modifier.height(13.dp))

        Row {
            PinkChip(text = "Cartãozinho")
            Spacer(modifier = Modifier.width(14.dp))
            PinkChip(text = "Adicionais")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ActionItem(
                modifier = Modifier.weight(1f),
                iconRes = R.drawable.ic_vestido_mais,
                title = "Criar cartão\nvirtual",
                iconSize = 34.dp
            )

            ActionItem(
                modifier = Modifier.weight(1f),
                iconRes = R.drawable.ic_vestido_cadeado,
                title = "Bloquear\ncartões",
                iconSize = 31.dp
            )

            ActionItem(
                modifier = Modifier.weight(1f),
                iconRes = R.drawable.ic_vestido_carteira,
                title = "Adicionar à\ncarteira",
                iconSize = 34.dp
            )

            ActionItem(
                modifier = Modifier.weight(1f),
                iconRes = R.drawable.ic_vestido_ajustes,
                title = "Ajustar limites",
                iconSize = 34.dp
            )
        }

        Spacer(modifier = Modifier.height(41.dp))

        Text(
            text = "Virtuais (3)",
            color = TextColor,
            fontSize = 22.sp,
            fontWeight = FontWeight.Normal
        )

        Spacer(modifier = Modifier.height(6.dp))

        VirtualCardsBox()

        Spacer(modifier = Modifier.height(42.dp))

        Text(
            text = "Físico",
            color = TextColor,
            fontSize = 22.sp,
            fontWeight = FontWeight.Normal
        )

        Spacer(modifier = Modifier.height(7.dp))

        PhysicalCardBox()
    }
}

@Composable
private fun PinkChip(
    text: String
) {
    Box(
        modifier = Modifier
            .height(34.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(VestidoPink)
            .padding(horizontal = 18.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
private fun ActionItem(
    modifier: Modifier = Modifier,
    iconRes: Int,
    title: String,
    iconSize: Dp
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {},
            modifier = Modifier.size(59.dp),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = VestidoPink),
            contentPadding = PaddingValues(0.dp),
            elevation = null
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = title,
                tint = TextColor,
                modifier = Modifier.size(iconSize)
            )
        }

        Spacer(modifier = Modifier.height(7.dp))

        Text(
            text = title,
            color = TextColor,
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            lineHeight = 17.sp,
            fontWeight = FontWeight.Normal,
            maxLines = 2
        )
    }
}

@Composable
private fun VirtualCardsBox() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(282.dp)
            .clip(RoundedCornerShape(11.dp))
            .background(VestidoPink)
    ) {
        CardRow(
            modifier = Modifier.weight(1f),
            title = "Cartão virtual",
            finalNumber = "4587",
            subtitle = "Compras online"
        )

        HorizontalDivider(
            thickness = 1.dp,
            color = Color.White
        )

        CardRow(
            modifier = Modifier.weight(1f),
            title = "Cartão virtual",
            finalNumber = "7214",
            subtitle = "Assinaturas"
        )

        HorizontalDivider(
            thickness = 1.dp,
            color = Color.White
        )

        CardRow(
            modifier = Modifier.weight(1f),
            title = "Cartão virtual",
            finalNumber = "9031",
            subtitle = "Uso temporário"
        )
    }
}

@Composable
private fun PhysicalCardBox() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(98.dp)
            .clip(RoundedCornerShape(11.dp))
            .background(VestidoPink)
            .padding(horizontal = 22.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CardIcon()

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = "Cartão físico",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = "•••• 1024",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = "Crédito e débito",
                color = Color.White.copy(alpha = 0.82f),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
private fun CardRow(
    modifier: Modifier = Modifier,
    title: String,
    finalNumber: String,
    subtitle: String
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 22.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CardIcon()

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = title,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = "•••• $finalNumber",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = subtitle,
                color = Color.White.copy(alpha = 0.82f),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
private fun CardIcon(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(51.dp)
            .clip(CircleShape)
            .background(CardIconBackground),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_vestido_cartao),
            contentDescription = "Cartão",
            tint = TextColor,
            modifier = Modifier.size(35.dp)
        )
    }
}

@Preview(
    showBackground = true,
    widthDp = 393,
    heightDp = 852
)
@Composable
private fun TelaMeusCartoesPreview() {
    TelaMeusCartoes()
}
