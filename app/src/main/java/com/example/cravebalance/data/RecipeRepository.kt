package com.example.cravebalance.data

import com.example.cravebalance.R

object RecipeRepository {

    val recipes = listOf(


        Recipe(
            title = "Smoothie de chocolate ANTI-ANTOJOS",


            cravingType = "Chocolate",


            ingredients = listOf(
                "1 taza de blueberries congeladas",
                "1 pizca de sal (opcional)",
                "1 taza de leche de almendra (o cualquier leche vegetal sin endulzar)",
                "1/2 taza de leche de coco entera (opcional, es para hacerlo más cremoso) ",
                "1 cucharada de cacao crudo orgánico en polvo (si no consigues orgánico, no te preocupes, sólo asegúrate que sea cacao y no esté endulzado)",
                " 1 cucharada de aceite de coco",
                "1 puño grande de almendras, nueces o semillas de tu preferencia (girasol,\n" +
                        "calabaza, hemp, chia, linaza etc)\n",
                "1/4 cucharadita de extracto de vainilla (sin alcohol)",
                "1/2 cucharada de miel orgánica\n" +
                        "(opcional)\n"
            ),


            duration = "5 minutos",


            steps = listOf(


                "Pon todos los ingredientes en la licuadora y licúa hasta que la mezcla esté espumosa.",


                "Fíjate bien que la textura no tenga una apariencia demasiado espesa al final, ¡pruébala y sirve!.",


                ),


            imageRes = R.drawable.smoothiechocolate
        ),


        Recipe(
            title = "Pudín rápido de chocolate hecho con yogur",


            cravingType = "Chocolate",


            ingredients = listOf(
                "150 g de yogur griego blanco descremado",
                "2 cucharaditas de cacao",
                "20 g de proteína, xilitol u otro edulcorante",
                "100 g de fruta congelada o fresca (cerezas, arándanos, frambuesas, etc.)"
            ),


            duration = "5 minutos",


            steps = listOf(


                "Pon todos los ingredientes en una licuadora.",


                "Bate a velocidad media hasta que el pudín esté suave y homogéneo y no se vean grumos de cacao.",


                "Para un sabor más dulce, añade proteína, xilitol u otro edulcorante."
            ),


            imageRes = R.drawable.pudinchocolate
        ),


        Recipe(
            title = "Parfait Saludable de Yogur Griego y Cacao",


            cravingType = "Chocolate",


            ingredients = listOf(
                "1 tazas de yogur griego natural",
                "⅛ taza de cacao en polvo sin azúcar",
                "1 cucharadas miel o sirope de agave",
                "½ taza de granola",
                "½ plátano en rodajas",
                "¼ taza de fresas en rodajas",
                "¼ taza de arándanos",
                "⅛ cucharadita de extracto de vainilla",
                "sal al gusto"
            ),


            duration = "15-20 minutos",


            steps = listOf(


                "En un bol grande, mezcla el yogur griego, el cacao en polvo, la miel (o sirope de agave) y el extracto de vainilla hasta que estén bien combinados y suaves.",


                "En copas o vasos, coloca una capa de la mezcla de yogur en el fondo.",


                "Agrega una capa de granola sobre el yogur.",


                "Añade una capa de rodajas de plátano, fresas y arándanos.",


                "Repite las capas hasta que los vasos estén llenos, terminando con una capa de frutas en la parte superior.",


                "Espolvorea un poco de sal al gusto sobre las frutas para realzar los sabores.",


                "Sirve inmediatamente o refrigera por un máximo de 1 hora antes de servir."


            ),


            imageRes = R.drawable.yogurtcacao
        ),


        Recipe(
            title = "Garbanzos tostados",


            cravingType = "Sal",


            ingredients = listOf(
                "1 taza de garbanzos crudos, 200 gramos",
                "El zumo de medio limón",
                "1 cucharadita de pimentón dulce",
                "1 cucharadita de ajo en polvo",
                "1 cucharadita de comino en polvo",
                "1 cucharadita de curry"
            ),


            duration = "40 minutos",


            steps = listOf(


                "Dejamos los garbanzos en remojo la noche anterior.",


                "Al día siguiente precalentamos el horno a 200 grados.",


                "Ponemos los garbanzos en un bol y añadimos el zumo de medio limón, las especias y lo mezclamos todo con ayuda de nuestras manos.",


                "Echamos los garbanzos sobre una bandeja con papel de hornear y los colocamos en la parte central del horno.",


                "Dejamos que los garbanzos se tuesten durante unos 40 ó 45 minutos a 200 grados (el tiempo de horneado puede variar en función de el horno, como en cualquier receta).",


                "Se puede sacarlos y probarlos sin miedo a abrir el horno."
            ),


            imageRes = R.drawable.garbanzostostados
        ),


        Recipe(
            title = "Palomitas de maíz con levadura nutricional",


            cravingType = "Sal",


            ingredients = listOf(
                "Maíz para palomitas 100 g",
                "Aceite de oliva virgen extra 15 g",
                "Levadura nutricional 30 g"
            ),


            duration = "56 minutos",


            steps = listOf(
                "En un cazo (o una sartén) hondo poner el aceite de oliva a fuego medio.",
                "Volcar los granos de maíz y tapar hasta que empiecen a explotar. Remover con cuidado para que los granos tomen el suave sabor del aceite. Esperar hasta que se hagan todas las palomitas (aproximadamente unos 4 minutos).",
                "La coccion dura aproximadamente 46 minutos",
                "Una vez listas, en el mismo recipiente, incorporar la levadura nutricional. Remover constantemente con una espátula para adherir los ingredientes a las palomitas."
            ),


            imageRes = R.drawable.palomitaslevadura
        )



    )

}