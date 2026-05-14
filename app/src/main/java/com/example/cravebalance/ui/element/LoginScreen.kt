package com.example.cravebalance.ui.element

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit,
    onNavigateToRegister: () -> Unit,
    onNavigateToRecover: () -> Unit
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val backgroundColor = Color(0xFFD6E9AF)
    val orangeColor = Color(0xFFF6921E)
    val bannerGreen = Color(0xFF8DB04B)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 5.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Top Border
            AppleBorder()

            Spacer(modifier = Modifier.height(20.dp))

            // Main Title
            Text(
                text = "CRAVE BALANCE",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Logo Section
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(160.dp)
            ) {
                Text(
                    text = "🍎",
                    fontSize = 100.sp,
                    modifier = Modifier.offset(y = (-10).dp)
                )

                Surface(
                    color = bannerGreen,
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.offset(y = 30.dp)
                ) {
                    Text(
                        text = "CRAVE BALANCE",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            // Form Fields
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                LoginField(label = "Correo Electronico:", value = email, onValueChange = { email = it }, orangeColor = orangeColor)
                
                Column {
                    LoginField(label = "Contraseña:", value = password, onValueChange = { password = it }, orangeColor = orangeColor, isPassword = true, placeholder = "******")
                    
                    Text(
                        text = "Olvidé mi contraseña",
                        color = orangeColor,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp)
                            .clickable { onNavigateToRecover() },
                        textAlign = TextAlign.End
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            // Action Button
            Button(
                onClick = { onLoginSuccess() },
                colors = ButtonDefaults.buttonColors(containerColor = orangeColor),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .width(160.dp)
                    .height(45.dp)
            ) {
                Text(
                    text = "Entrar",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Navigation Link (Bottom)
            Text(
                text = "¿No tienes cuenta? Registrate",
                color = orangeColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable { 
                    onNavigateToRegister() 
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Bottom Border
            AppleBorder()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LoginField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    orangeColor: Color,
    isPassword: Boolean = false,
    placeholder: String = "",
) {
    Column {
        Text(
            text = label,
            color = orangeColor,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Spacer(modifier = Modifier.height(5.dp))
        TextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            visualTransformation = if (isPassword) PasswordVisualTransformation() else androidx.compose.ui.text.input.VisualTransformation.None,
            placeholder = if (placeholder.isNotEmpty()) {
                { Text(text = placeholder, color = orangeColor.copy(alpha = 0.3f)) }
            } else null,
            singleLine = true
        )
    }
}

@Composable
private fun AppleBorder() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(12) {
            Text(
                text = "🍏",
                fontSize = 16.sp,
                modifier = Modifier.alpha(0.5f)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    MaterialTheme {
        LoginScreen(
            onLoginSuccess = {},
            onNavigateToRegister = {},
            onNavigateToRecover = {}
        )
    }
}
