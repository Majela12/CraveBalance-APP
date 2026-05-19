package com.example.cravebalance.navigation

import android.util.Patterns
import kotlin.io.path.Path

fun validationEmail(email: String): Pair<Boolean, String>{
    return when{
        email.isEmpty() -> Pair(false, "El correo es requerid.")
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> Pair(false, "El correo es invalido")
        //email.endsWith("@test.com") -> Pair(false, "Ese email no es corporativo")
        else -> Pair(true, "")

    }
}

fun validarionPassword(password: String): Pair<Boolean, String>{
    return when{
        password.isEmpty() -> Pair(false, "La contraseña es falsa")
        password.length < 8 -> Pair(false, "La contraseña debe tener al menos 8 caracteres")
        !password.any { it.isDigit()} -> Pair(false, "La contraseña debe tener al menos un numero")
        else ->Pair(true, "")
    }
}

fun validationName(name: String): Pair<Boolean, String>{
    return when{
        name.isEmpty() -> Pair(false, "El nombre es requerido.")
        name.length < 3 -> Pair(false, "El nombre debe tener al menos 3 caracteres")
        else -> Pair(true, "")
    }
}

fun validationConfirmPassword(password: String, confirmPassword: String): Pair<Boolean, String>{
    return when{
        confirmPassword.isEmpty() -> Pair(false, "La contraseña es requerida")
        confirmPassword != password -> Pair(false, "La contraseña no coincide")
        else -> Pair(true, "")
    }
}