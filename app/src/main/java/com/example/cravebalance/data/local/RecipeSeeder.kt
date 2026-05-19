package com.example.cravebalance.data.local

import com.example.cravebalance.R
import com.example.cravebalance.data.Recipe

object RecipeSeeder {

    suspend fun seedDatabase(recipeDao: RecipeDao) {

        if (recipeDao.getAllRecipes().isNotEmpty()) {
            return
        }

        val recipes = listOf(

            // CHOCOLATE

            Recipe(
                title = "Smoothie de chocolate ANTI-ANTOJOS",

                cravingType = "Chocolate",

                ingredients =
                    "1 taza de blueberries congeladas\n" +
                            "1 pizca de sal (opcional)\n" +
                            "1 taza de leche de almendra\n" +
                            "1/2 taza de leche de coco entera\n" +
                            "1 cucharada de cacao crudo orgánico en polvo\n" +
                            "1 cucharada de aceite de coco\n" +
                            "1 puño grande de almendras o semillas\n" +
                            "1/4 cucharadita de extracto de vainilla\n" +
                            "1/2 cucharada de miel orgánica",

                duration = "5 minutos",

                steps =
                    "Pon todos los ingredientes en la licuadora\n" +
                            "Licúa hasta que la mezcla esté espumosa\n" +
                            "Verifica la textura\n" +
                            "Sirve y disfruta",

                imageRes = R.drawable.smoothiechocolate
            ),

            Recipe(
                title = "Pudín rápido de chocolate hecho con yogur",

                cravingType = "Chocolate",

                ingredients =
                    "150 g de yogur griego blanco descremado\n" +
                            "2 cucharaditas de cacao\n" +
                            "20 g de proteína o xilitol\n" +
                            "100 g de fruta congelada o fresca",

                duration = "5 minutos",

                steps =
                    "Pon todos los ingredientes en una licuadora\n" +
                            "Bate a velocidad media\n" +
                            "Continúa hasta que quede homogéneo\n" +
                            "Añade más endulzante si deseas",

                imageRes = R.drawable.pudinchocolate
            ),

            Recipe(
                title = "Parfait Saludable de Yogur Griego y Cacao",

                cravingType = "Chocolate",

                ingredients =
                    "1 taza de yogur griego natural\n" +
                            "1/8 taza de cacao en polvo sin azúcar\n" +
                            "1 cucharada de miel\n" +
                            "1/2 taza de granola\n" +
                            "1/2 plátano en rodajas\n" +
                            "1/4 taza de fresas\n" +
                            "1/4 taza de arándanos\n" +
                            "1/8 cucharadita de vainilla\n" +
                            "Sal al gusto",

                duration = "15-20 minutos",

                steps =
                    "Mezcla yogur, cacao, miel y vainilla\n" +
                            "Coloca una capa de yogur en el vaso\n" +
                            "Agrega granola\n" +
                            "Añade frutas\n" +
                            "Repite las capas\n" +
                            "Agrega una pizca de sal\n" +
                            "Sirve o refrigera",

                imageRes = R.drawable.yogurtcacao
            ),

            // MÁS RECETAS DE CHOCOLATE

            Recipe(
                title = "Paletas heladas de chocolate, plátano y dulce de leche",
                cravingType = "Chocolate",
                ingredients =
                    "Chocolate negro\n" +
                            "Plátano\n" +
                            "Yogur\n" +
                            "Jarabe de arce\n" +
                            "Leche o nata\n" +
                            "Cacao en polvo\n" +
                            "Moldes para paletas",
                duration = "10 minutos",
                steps =
                    "Pela los plátanos y añade 240g de pulpa a la batidora con el resto de ingredientes\n" +
                            "Bate a alta velocidad durante 40 segundos hasta que esté suave\n" +
                            "Vierte la mezcla en los moldes llenándolos un poco más de la mitad\n" +
                            "Coloca una cucharadita de la mezcla en espiral por encima y mezcla con un palillo\n" +
                            "Vierte el resto de la mezcla hasta llenar los moldes por completo\n" +
                            "Inserta los palitos de helado erguidos en el centro\n" +
                            "Congela durante al menos 6 horas o toda la noche\n" +
                            "Pasa el molde por agua tibia un minuto para desmoldar suavemente",
                imageRes = R.drawable.paletaschocolateplatano
            ),

            Recipe(
                title = "Trufas de aguacate y chocolate sin azúcar",
                cravingType = "Chocolate",
                ingredients =
                    "1 aguacate pequeño y maduro (120gr)\n" +
                            "100 gr de chocolate sin azúcar\n" +
                            "1 cucharadita de stevia en polvo (opcional)\n" +
                            "1 cucharadita de esencia de vainilla\n" +
                            "Cacao en polvo sin azúcar para decorar",
                duration = "12 minutos",
                steps =
                    "Trocea el chocolate y fúndelo al baño maría hasta que no tenga grumos\n" +
                            "Aparta del fuego y deja templar un poco\n" +
                            "Saca la pulpa del aguacate y machácala con un tenedor hasta hacer puré\n" +
                            "Añade el chocolate fundido y mezcla bien con una espátula\n" +
                            "Guarda el bol en el congelador durante unos 30 minutos para que tome consistencia\n" +
                            "Forma bolitas con las manos o dos cucharillas\n" +
                            "Deja reposar en la nevera 20 minutos, cubre con cacao en polvo y sirve",
                imageRes = R.drawable.trufasaguacate
            ),

            Recipe(
                title = "Nutella casera sin azúcar",
                cravingType = "Chocolate",
                ingredients =
                    "150 gr de avellanas tostadas sin piel\n" +
                            "100 ml de leche desnatada o vegetal\n" +
                            "30 gr de aceite de coco\n" +
                            "50 gr de cacao en polvo sin azúcar\n" +
                            "1 cucharada rasa de stevia o sucralosa (opcional)",
                duration = "10 minutos",
                steps =
                    "Tritura las avellanas en la picadora a máxima potencia hasta formar una pasta cremosa\n" +
                            "Coloca la crema de avellanas y los demás ingredientes en un cazo a fuego medio-bajo\n" +
                            "Remueve constantemente con una espátula hasta que la crema espese un poco\n" +
                            "Sirve en botes de cristal y deja atemperar por 10 minutos\n" +
                            "Guarda en la nevera durante al menos 2 horas para que endurezca",
                imageRes = R.drawable.nutellacasera
            ),

            // SAL

            Recipe(
                title = "Garbanzos tostados",

                cravingType = "Sal",

                ingredients =
                    "1 taza de garbanzos crudos\n" +
                            "Zumo de medio limón\n" +
                            "1 cucharadita de pimentón dulce\n" +
                            "1 cucharadita de ajo en polvo\n" +
                            "1 cucharadita de comino\n" +
                            "1 cucharadita de curry",

                duration = "40 minutos",

                steps =
                    "Deja los garbanzos en remojo toda la noche\n" +
                            "Precalienta el horno a 200 grados\n" +
                            "Mezcla garbanzos con limón y especias\n" +
                            "Colócalos en una bandeja\n" +
                            "Hornea durante 40 minutos\n" +
                            "Prueba y sirve",

                imageRes = R.drawable.garbanzostostados
            ),

            Recipe(
                title = "Palomitas de maíz con levadura nutricional",

                cravingType = "Sal",

                ingredients =
                    "100 g de maíz para palomitas\n" +
                            "15 g de aceite de oliva\n" +
                            "30 g de levadura nutricional",

                duration = "56 minutos",

                steps =
                    "Calienta el aceite en una sartén\n" +
                            "Agrega el maíz y tapa\n" +
                            "Espera a que exploten las palomitas\n" +
                            "Remueve constantemente\n" +
                            "Añade levadura nutricional\n" +
                            "Mezcla y sirve",

                imageRes = R.drawable.palomitaslevadura
            ),

            // MÁS RECETAS DE SAL

            Recipe(
                title = "Huevos duros sazonados",
                cravingType = "Sal",
                ingredients =
                    "2 huevos duros\n" +
                            "1 cucharada de mantequilla\n" +
                            "1/8 cucharadita de condimento criollo\n" +
                            "1/4 cucharadita de ajo en polvo\n" +
                            "Una pizca de pimienta roja molida",
                duration = "5 minutos",
                steps =
                    "Pela los huevos duros, córtalos por la mitad y colócalos en un plato\n" +
                            "En un tazón pequeño, agrega la mantequilla, el condimento criollo, el ajo en polvo y la pimienta roja\n" +
                            "Calienta en el microondas hasta que la mantequilla se derrita y revuelve para combinar\n" +
                            "Rocíe la mezcla de mantequilla uniformemente sobre los huevos duros y sirve",
                imageRes = R.drawable.huevosdurossazonados

            ),

            Recipe(
                title = "Palitos crujientes de calabacín con salsa de yogur",
                cravingType = "Sal",
                ingredients =
                    "2 calabacines\n" +
                            "4 cdas. colmadas de harina de garbanzo\n" +
                            "1 cdita. de ajo en polvo\n" +
                            "1 cdita. de cebolla en polvo\n" +
                            "1/2 taza de bebida vegetal\n" +
                            "2 tazas de copos de maíz tostados sin azúcar (triturados)\n" +
                            "Poca sal\n" +
                            "1 cdita. de pimentón ahumado\n" +
                            "Orégano seco al gusto",
                duration = "15-30 minutos",
                steps =
                    "Lava y corta el calabacín en forma de palitos\n" +
                            "Mezcla en un bol la harina de garbanzo, ajo, cebolla y bebida vegetal hasta lograr una crema espesa\n" +
                            "Añade los palitos de calabacín al bol y cúbrelos muy bien con la mezcla\n" +
                            "En otro cuenco, mezcla los copos triturados, sal, pimentón y orégano\n" +
                            "Reboza cada palito y colócalo preparado para su cocción\n" +
                            "Para horno: Hornea 30 min a 180º calor arriba y abajo (activa el aire los últimos 5 min)\n" +
                            "Para freidora de aire: Cocina de 12-15 min a 200º sin amontonar, pulverizando con aceite y moviendo a la mitad",
                imageRes = R.drawable.palitoscalabacin
            ),

            Recipe(
                title = "Salsa de yogur con ajo y hierbas",
                cravingType = "Sal",
                ingredients =
                    "1/3 taza de aceite de oliva virgen extra\n" +
                            "3 dientes de ajo picados\n" +
                            "1 puñado de hojas y tallos tiernos de perejil (finamente picados)\n" +
                            "1 cucharadita de pimienta negra recién molida\n" +
                            "1 cucharadita de pimentón picante\n" +
                            "1/4 cucharadita de pimienta de cayena\n" +
                            "3/4 cucharadita de sal kosher\n" +
                            "2 tazas de yogur griego",
                duration = "8 minutos",
                steps =
                    "Calienta el aceite en una cacerola a fuego medio-alto durante 3 minutos\n" +
                            "Simultáneamente, añade el ajo, perejil, pimienta, pimentón, cayena y sal a un bol\n" +
                            "Vierte el aceite caliente en el bol y deja reposar la mezcla durante 5 minutos\n" +
                            "Coloca el yogur en un plato hondo y espolvorea con una pizca de sal\n" +
                            "Rocía con el aceite saborizado por encima y sirve con verduras crudas, galletas saladas o pan",
                imageRes = R.drawable.salsayogurajohierbas
            ),

            Recipe(
                title = "Chips de algas tostadas",
                cravingType = "Sal",
                ingredients =
                    "1 paquete de láminas yaki nori (papel sushi)\n" +
                            "1 cucharada de tamari o aminos líquidos\n" +
                            "1 cucharada de aceite de sésamo",
                duration = "15 minutos",
                steps =
                    "Precalienta el horno a 150ºC con el ventilador activado\n" +
                            "Mezcle el tamari y el aceite de sésamo en un tazón pequeño\n" +
                            "Cepille el lado brillante de la lámina de nori con la mezcla cubriendo hasta los bordes\n" +
                            "Coloque otra lámina encima con el lado rugoso hacia abajo y repita hasta hacer una pila de 3 o 4 hojas\n" +
                            "Colócalo sobre una bandeja forrada con papel de horno y añade otro papel encima para evitar que se rice\n" +
                            "Hornea durante 10-15 minutos hasta que quede crujiente en los bordes\n" +
                            "Corte con un cuchillo grande y afilado en forma de chips y disfruta de inmediato",
                imageRes = R.drawable.chipsalgastostadas
            ),

            Recipe(
                title = "Frutos secos especiados con romero",
                cravingType = "Sal",
                ingredients =
                    "2 tazas de nueces sin sal\n" +
                            "1.5 cucharaditas de ralladura de naranja\n" +
                            "1 cucharada de romero fresco finamente picado\n" +
                            "2 cucharadas de jarabe de arce\n" +
                            "1/2 cucharadita de sal marina\n" +
                            "1/4 cucharadita de pimienta de cayena\n" +
                            "6 tiras de tocino en cubos y cocinadas crujientes (opcional)",
                duration = "35 minutos",
                steps =
                    "Precalienta el horno a 175 °C\n" +
                            "En un bol grande, añade todos los ingredientes y mezcla bien hasta cubrir los frutos secos por completo\n" +
                            "Extiende las nueces sobre una bandeja para hornear de forma uniforme\n" +
                            "Hornea durante 25 a 30 minutos, revisándolas periódicamente y girando la bandeja a la mitad\n" +
                            "Transfiere los frutos secos a un bol con una espátula y déjalos enfriar completamente\n" +
                            "Una vez fríos, remúvelos con una cucharada para separarlos y añade más sal al gusto si lo deseas",
                imageRes = R.drawable.frutossecosromero
            ),

            Recipe(
                title = "Tapenade de aceitunas negras",
                cravingType = "Sal",
                ingredients =
                    "150 g de aceitunas negras sin hueso\n" +
                            "80 ml de aceite de oliva virgen extra\n" +
                            "10 alcaparras\n" +
                            "4 hojas de albahaca\n" +
                            "1 filete de anchoa\n" +
                            "0.5 diente de ajo",
                duration = "10 minutos",
                steps =
                    "Parte el diente de ajo a la mitad y quítale el germen interior\n" +
                            "Pica las hojas de albahaca fresca finamente con un cuchillo\n" +
                            "En un mortero o procesador añade el ajo, albahaca, alcaparras, anchoa y aceitunas negras\n" +
                            "Añade dos cucharadas de aceite de oliva e inicia a machacar o triturar groseramente\n" +
                            "Agrega poco a poco el resto del aceite en un chorro fino hasta emulsionar manteniendo una textura gruesa\n" +
                            "Reservamos en el frío y servimos acompañado de pan tostado",
                imageRes = R.drawable.tapenadeaceitunas
            ),

            Recipe(
                title = "Chips de rábano asado crujientes",
                cravingType = "Sal",
                ingredients =
                    "1 libra de rábanos (aproximadamente 2 manojos)\n" +
                            "3 cucharadas de aceite de oliva\n" +
                            "1 pizca de sal y pimienta\n" +
                            "1 pizca de hojuelas de pimiento rojo (opcional)",
                duration = "20 minutos",
                steps =
                    "Precalentar el horno a 200 grados Celsius (400 grados Fahrenheit)\n" +
                            "Separe los bulbos de rábano de las hojas y lávelos bien para eliminar la tierra\n" +
                            "Corte los bulbos de rábano en rodajas finas de aproximadamente 1/2 cm de grosor\n" +
                            "En una bandeja para hornear mediana, agrega el aceite de oliva junto con los rábanos\n" +
                            "Mezcla bien para cubrir de aceite y espolvorea la sal, pimienta y hojuelas de pimiento\n" +
                            "Asa los rábanos durante 10-15 minutos, removiéndolos a la mitad del tiempo, y sirve inmediatamente",
                imageRes = R.drawable.chipsrabanoasado
            ),

            Recipe(
                title = "Rollitos de pepino",
                cravingType = "Sal",
                ingredients =
                    "1 pepino inglés grande\n" +
                            "6-8 lonchas de jamón o pavo\n" +
                            "1/4 taza de mayonesa\n" +
                            "2 cucharadas de mostaza Dijon\n" +
                            "1 cucharadita de jugo de limón\n" +
                            "1 cucharada de cebollino picado",
                duration = "10 minutos",
                steps =
                    "Utiliza una mandolina o pelador de verduras para cortar el pepino en tiras finas y largas\n" +
                            "Seca muy bien las tiras de pepino usando papel de cocina absorbente\n" +
                            "En un tazón pequeño, mezcla la mayonesa, la mostaza Dijon y el jugo de limón hasta homogeneizar\n" +
                            "Extiende una tira de pepino sobre una superficie plana y unta una capa fina de la mezcla\n" +
                            "Coloca una loncha de jamón o pavo encima de la tira untada\n" +
                            "Enrolla suavemente formando una espiral apretada, asegúrala con un palillo y decora con cebollino",
                imageRes = R.drawable.rollitospepino
            ),

            // RECETAS DE AZÚCAR

            Recipe(
                title = "Manzana asada con canela",
                cravingType = "Azúcar",
                ingredients =
                    "1 manzana roja\n" +
                            "Agua mineral natural\n" +
                            "Aceite de coco\n" +
                            "Canela en polvo\n" +
                            "Aroma de vainilla",
                duration = "20 minutos",
                steps =
                    "Cortar las manzanas en trozos del mismo tamaño (con o sin piel)\n" +
                            "Ponga las piezas de manzana en una sartén con 2 cucharadas de agua, cubre y cocine a fuego medio unos 5 minutos hasta que se ablanden ligeramente\n" +
                            "Agregue 1 cucharada de aceite de coco a la sartén y cocine durante 5 minutos más removiendo ocasionalmente\n" +
                            "Agregue una cucharada de pasta de dátil líquida o edulcorante al gusto junto con la canela, una pizca de sal y la vainilla\n" +
                            "Cocine durante unos 5 minutos más, removiendo cada minuto hasta que alcancen la suavidad deseada, retire del fuego y sirva",
                imageRes = R.drawable.manzanaasadacanela
            ),

            Recipe(
                title = "Pudín cremoso de chía y frutos rojos",
                cravingType = "Azúcar",
                ingredients =
                    "500 ml de leche de almendras (o la de tu preferencia)\n" +
                            "90 g de semillas de chía\n" +
                            "1 cucharadita de aroma de vainilla\n" +
                            "2 cucharadas de edulcorante vegetal Stevia\n" +
                            "Frutas rojas (fresas, arándanos, moras o frambuesas) para servir",
                duration = "10 minutos (más 4-6 horas de reposo)",
                steps =
                    "Divide las semillas de chía equitativamente en los vasos o recipientes (aprox. 22 gramos por recipiente)\n" +
                            "Mezcla el edulcorante vegetal y el aroma de vainilla con la leche de almendras\n" +
                            "Vierte la mezcla líquida en cada recipiente sobre las semillas de chía\n" +
                            "Tapa con papel film y deja reposar en la nevera durante 4-6 horas (o de un día para otro)\n" +
                            "Remueve la mezcla varias veces durante la primera hora para impregnar las semillas por igual\n" +
                            "A la hora de servir, añade las frutas rojas frescas por encima",
                imageRes = R.drawable.pudinchiafrutosrojos
            ),

            Recipe(
                title = "Chips de coco",
                cravingType = "Azúcar",
                ingredients =
                    "0.5 porción de coco fresco\n" +
                            "0.25 taza de agua de coco\n" +
                            "2 cucharadas de panela molida",
                duration = "2 horas",
                steps =
                    "Retira el agua del coco introduciendo un cuchillo con cuidado en uno de sus huecos, vacía 0.25 tazas en un recipiente y reserva\n" +
                            "Quema el coco a fuego directo en el fogón hasta que la corteza quede negra y deja enfriar por 30 minutos\n" +
                            "Rompe la cáscara del coco con un martillo, saca la pulpa blanca y obtén lajitas delgadas usando un pelapapas\n" +
                            "Agrega las lajitas a una sartén con el agua de coco y la panela, y saltea hasta que esta se disuelva y el agua se evapore\n" +
                            "Forra una bandeja con papel de aluminio, coloca las lajitas de coco e introduce al horno\n" +
                            "Revisa y revuelve tras la primera hora, horneando por otros 30 minutos o hasta que tome un color dorado sin quemarse",
                imageRes = R.drawable.chipscoco
            ),

            Recipe(
                title = "Galletas de plátano y avena",
                cravingType = "Azúcar",
                ingredients =
                    "2 plátanos grandes machacados\n" +
                            "1 1/2 tazas de avena instantánea o en copos\n" +
                            "1/2 taza de chispas de chocolate (opcional)\n" +
                            "1 cucharada de linaza molida (opcional)\n" +
                            "1 cucharada de semillas de chía (opcional)",
                duration = "20 minutos",
                steps =
                    "Precaliente el horno a 350 grados Fahrenheit (175 grados Celsius)\n" +
                            "Tritura los plátanos grandes en un bol hasta que queden completamente machacados\n" +
                            "Añade la avena al bol junto con los ingredientes opcionales elegidos (chispas, linaza o chía) y mezcla muy bien\n" +
                            "Forra una bandeja de horno con papel pergamino y coloca cucharadas de masa separadas (salen unas 12)\n" +
                            "Presione suavemente la masa de cada galleta hacia abajo para darles forma\n" +
                            "Hornear durante 13-15 minutos hasta que los bordes inferiores queden ligeramente dorados, y deja enfriar en una rejilla",
                imageRes = R.drawable.galletasplatanoavena
            ),

            Recipe(
                title = "Bombones helados de yogur y arándanos",
                cravingType = "Azúcar",
                ingredients =
                    "150 g de arándanos\n" +
                            "160 g de yogur natural\n" +
                            "150 g de chocolate semiamargo",
                duration = "2 horas y 15 minutos",
                steps =
                    "En un bol coloca los arándanos junto con el yogur y mezcla bien hasta cubrirlos por completo\n" +
                            "Coloca porciones de una cucharada colmada formando pequeños montoncitos sobre una fuente con papel manteca o placa antiadherente\n" +
                            "Lleva la fuente al congelador (freezer) durante 2 horas hasta que los montoncitos estén completamente congelados\n" +
                            "Funde el chocolate semiamargo al baño maría o en el microondas antes de retirar los bombones del frío\n" +
                            "Saca los bombones del congelador, sumerge cada uno en el chocolate fundido usando un tenedor para cubrirlos y escurre el exceso\n" +
                            "Coloca los bombones inmediatamente de nuevo sobre la fuente y congélalos otra vez hasta el momento de servir",
                imageRes = R.drawable.bombonesyogurarandanos
            ),

            Recipe(
                title = "Tostadas francesas con mermelada de arándanos",
                cravingType = "Azúcar",
                ingredients =
                    "1 huevo (55 g)\n" +
                            "1/2 taza de arándanos (75 g)\n" +
                            "2 rebanadas de pan de molde (80 g)\n" +
                            "2 cucharadas de leche (30 g)\n" +
                            "1 sobre de stevia u otro edulcorante (1 g)\n" +
                            "Canela en polvo y/o esencia de vainilla (opcional)",
                duration = "10 minutos",
                steps =
                    "En un recipiente bate el huevo con la leche y, opcionalmente, agrega la canela y la esencia de vainilla\n" +
                            "Remoja completamente las rebanadas de pan de molde en la mezcla batida\n" +
                            "Para el coulis, cocina los arándanos en el microondas de 1 a 3 minutos (o en olla a fuego bajo) hasta que revienten, machácalos y añade la stevia\n" +
                            "Calienta una sartén antiadherente a fuego medio y coloca las rebanadas de pan una vez que tome temperatura\n" +
                            "Tosta el pan durante 2-3 minutos por lado, retira y sirve acompañado del coulis de arándanos",
                imageRes = R.drawable.tostadasfrancesasarandanos
            ),

            Recipe(
                title = "Pudín proteico de vainilla con fresas",
                cravingType = "Azúcar",
                ingredients =
                    "1/4 taza de fresas (37 g)\n" +
                            "1 taza de leche (240 g)\n" +
                            "1 scoop de proteína en polvo de vainilla (34 g)\n" +
                            "2 cucharadas de maicena (20 g)\n" +
                            "2 sobres de stevia (2 g)\n" +
                            "1 cucharadita de esencia de vainilla (5 g)\n" +
                            "Una pizca de sal",
                duration = "15 minutos (más tiempo de refrigeración opcional)",
                steps =
                    "Hervir 3/4 de la leche en una olla a fuego medio-alto hasta que entre en ebullición\n" +
                            "Mientras tanto, mezcla en un recipiente el cuarto restante de leche fría con la maicena, los sobres de stevia y una pizca de sal\n" +
                            "Cuando la leche de la olla hierva, agrega la mezcla de maicena en forma de hilo batiendo constantemente con una varilla hasta espesar\n" +
                            "Añade la esencia de vainilla, mezcla bien, retira del fuego y deja entibiar\n" +
                            "Incorpora el scoop de proteína en polvo batiendo enérgicamente con la varilla y lleva a refrigerar de 2 a 4 horas (u omite si lo deseas caliente)\n" +
                            "Cortar las fresas en trozos pequeños, mézclalas con el pudín de vainilla frío y sirve",
                imageRes = R.drawable.pudinproteicofresas
            ),

            Recipe(
                title = "Donuts de manzana y avena",
                cravingType = "Azúcar",
                ingredients =
                    "1 huevo (55 g)\n" +
                            "1 clara de huevo (40 g)\n" +
                            "6 cucharadas de harina de avena (48 g)\n" +
                            "1 manzana (160 g)\n" +
                            "1/2 cucharadita de canela (1 g)\n" +
                            "Stevia al gusto (opcional)",
                duration = "15 minutos",
                steps =
                    "Si no tienes harina de avena, licúa copos de avena hasta pulverizarlos por completo\n" +
                            "Coloca la harina de avena junto con la canela (y stevia si deseas) en un recipiente y mézclalos bien\n" +
                            "Añade el huevo entero y la clara adicional al recipiente, y vuelve a mezclar todo con un tenedor\n" +
                            "Retira el corazón de la manzana y corta el resto de la fruta en rodajas medianas\n" +
                            "Calienta una sartén antiadherente a fuego medio mientras bañas completamente las rodajas de manzana en la mezcla\n" +
                            "Coloca las rodajas bañadas en la sartén caliente, cocina por 2 minutos de cada lado (puedes tapar la sartén) y sirve con canela extra",
                imageRes = R.drawable.donutsmanzanaavena
            ),

            Recipe(
                title = "Tarta de queso y yogur griego sin azúcar",
                cravingType = "Azúcar",
                ingredients =
                    "500 g de queso fresco tipo Philadelphia light\n" +
                            "300 ml de yogur griego natural desnatado\n" +
                            "4 huevos\n" +
                            "1 cucharada rasa de stevia en polvo\n" +
                            "Esencia de vainilla, ralladura de limón o canela al gusto (opcional)",
                duration = "10 minutos (más 60-70 min de horneado)",
                steps =
                    "Precalentamos el horno a 170º y forramos la base de un molde con papel de hornear, engrasando los laterales\n" +
                            "En un bol grande, batimos suavemente el queso con el yogur griego y la stevia usando varillas manuales\n" +
                            "Añadimos los huevos uno a uno batiendo continuamente e incorporamos los saborizantes opcionales (vainilla, limón o canela)\n" +
                            "Vertemos la masa homogénea en el molde y horneamos durante 60-70 minutos a 170º hasta dorar la superficie\n" +
                            "Entreabrimos la puerta del horno unos minutos antes de sacarla, dejamos enfriar en una rejilla y refrigeramos 2 horas para dar consistencia",
                imageRes = R.drawable.tartaquesoyogur
            ),

            Recipe(
                title = "Shake de avena y frambuesas",
                cravingType = "Azúcar",
                ingredients =
                    "1/2 taza de avena en hojuelas\n" +
                            "1/2 taza de pulpa de frambuesa o frambuesas congeladas\n" +
                            "1/2 taza de leche\n" +
                            "1/2 taza de yogur de vainilla bajo en grasa",
                duration = "5 minutos",
                steps =
                    "Coloca todos los ingredientes (avena, frambuesas, leche y yogur) en el vaso de la licuadora\n" +
                            "Procesa la mezcla a alta velocidad durante un tiempo aproximado de 4 minutos\n" +
                            "Sirve rápidamente en un vaso alto para disfrutar de su textura cremosa y fresca",
                imageRes = R.drawable.shakeavenaframbuesas
            ),

            // RECETAS DE LECHE

            Recipe(
                title = "Latte de leche dorada con anacardos",
                cravingType = "Leche",
                ingredients =
                    "1 taza de anacardos (tostados o crudos, sin remojar)\n" +
                            "6 tazas de agua\n" +
                            "2 cucharaditas de canela\n" +
                            "1 trozo de jengibre fresco pelado de 5 cm (o 2 cdas. de pasta de jengibre)\n" +
                            "1/4 taza de miel\n" +
                            "Una pizca generosa de sal\n" +
                            "Cúrcuma al gusto",
                duration = "10 minutos",
                steps =
                    "Licúa los anacardos y el agua en una licuadora de alta potencia por 1-2 minutos hasta obtener una mezcla suave\n" +
                            "Mezcla e incorpora bien la cúrcuma, la canela, el jengibre, la miel y la pizca de sal\n" +
                            "Prueba la preparación, ajusta la sazón a tu gusto y sírvelo inmediatamente frío o caliente",
                imageRes = R.drawable.lattelechedoradaanacardos
            ),

            Recipe(
                title = "Crema de girasol con hierbas",
                cravingType = "Leche",
                ingredients =
                    "1 1/2 tazas de semillas de girasol (remojadas toda la noche o hervidas)\n" +
                            "1 taza de anacardos (remojados toda la noche o hervidos)\n" +
                            "1/2 taza de crema de soja para cocinar (u otra crema o leche vegetal)\n" +
                            "1 cucharada de mostaza\n" +
                            "3 cucharadas de copos de levadura nutricional\n" +
                            "1 cucharadita de pimienta de cayena\n" +
                            "Sal del Himalaya y pimienta negra recién molida al gusto\n" +
                            "5 hojas de cebolleta (solo la parte verde) picadas",
                duration = "10 minutos (más tiempo de remojo)",
                steps =
                    "Remoja las semillas y anacardos toda la noche o hiérvelos juntos en una cacerola con agua por 15 minutos\n" +
                            "Lava y pica finamente la parte verde de las cebolletas y resérvala dentro de un bol mediano\n" +
                            "Escurre muy bien las semillas junto con los frutos secos y colócalos en una licuadora de alta velocidad\n" +
                            "Agrega la crema de soja, la mostaza, la levadura nutricional, la pimienta de cayena, la sal y la pimienta\n" +
                            "Licúa durante 30 a 45 segundos, raspa los laterales del vaso de la licuadora y procesa de nuevo hasta que quede cremosa\n" +
                            "Vierte la crema al bol con la cebolleta, integra bien usando un tenedor y sirve o guarda tapado en el frigorífico",
                imageRes = R.drawable.cremagirasolhierbas
            ),

            Recipe(
                title = "Batido de almendras tostadas con glaseado",
                cravingType = "Leche",
                ingredients =
                    "4 bolas de helado de vainilla\n" +
                            "1/2 cucharadita de extracto de almendra\n" +
                            "4 cucharadas de mezcla de almendras tostadas y procesadas\n" +
                            "3/4 taza de leche entera (aproximadamente de 1/2 a 1 taza)\n" +
                            "1/2 taza de almendras laminadas\n" +
                            "1/4 taza de pasta de almendras",
                duration = "10 minutos",
                steps =
                    "Coloca las almendras laminadas en una sartén seca a fuego medio y tuéstalas removiendo constantemente hasta dorar\n" +
                            "Corta la pasta de almendras, ponla en un procesador junto a las almendras tostadas frías y tritura hasta lograr una textura arenosa\n" +
                            "Agrega al vaso de la licuadora el helado de vainilla, 4 cucharadas de la mezcla triturada, el extracto y la leche entera\n" +
                            "Licúa brevemente para incorporar todo evitando procesar en exceso para que el helado no llegue a cortarse\n" +
                            "Vierte el batido cremoso en un vaso alto y decora la parte superior con un extra de las almendras trituradas",
                imageRes = R.drawable.batidoalmendrastostadas
            ),

            Recipe(
                title = "Yogur de coco y vainilla",
                cravingType = "Leche",
                ingredients =
                    "270 ml de crema de coco entera (en lata)\n" +
                            "1/2 cucharadita de gelatina de vacas alimentadas con pasto\n" +
                            "1/2 cucharadita de harina de arrurruz (fécula)\n" +
                            "1 1/2 cucharadas de jugo de limón o lima\n" +
                            "1 cucharadita de miel sin procesar\n" +
                            "1 cucharadita de extracto de vainilla orgánico\n" +
                            "1 cápsula de probióticos sin lácteos",
                duration = "12-24 horas de fermentación",
                steps =
                    "Vierte la crema de coco en una cacerola pequeña, espolvorea la gelatina junto con el arrurruz y bate firmemente\n" +
                            "Calienta a fuego medio batiendo de continuo hasta que esté muy caliente (justo antes de hervir) y deja entibiar 15 minutos\n" +
                            "Añade el jugo de cítrico, la miel y la vainilla mezclando bien, asegurando que la temperatura baje a menos de 37°C\n" +
                            "Abre la cápsula de probiótico, vierte el polvo en la mezcla e introduce todo dentro de un frasco de cristal templado\n" +
                            "Coloca el frasco en un ambiente cálido (yogurtera o bolsa térmica) cerrado herméticamente de 12 a 24 horas para fermentar\n" +
                            "Retira la tapa, revuelve uniformemente y refrigera de 5 a 6 horas para que cuaje antes de consumir con frutas o nueces",
                imageRes = R.drawable.yogurcocovainilla
            ),

            Recipe(
                title = "Avena nocturna inspirada en Tres Leches",
                cravingType = "Leche",
                ingredients =
                    "1 taza de leche entera\n" +
                            "1 taza de leche evaporada entera\n" +
                            "3 cucharadas más 2 cucharaditas de leche condensada azucarada\n" +
                            "2 cucharadas de semillas de chía\n" +
                            "2 cucharaditas de extracto de vainilla\n" +
                            "1/4 cucharadita de sal\n" +
                            "2 tazas de copos de avena tradicionales\n" +
                            "1/4 cucharadita de canela molida\n" +
                            "1/2 taza de fresas frescas en rodajas",
                duration = "10 minutos (más 8 horas de refrigeración)",
                steps =
                    "En un bol mediano, bate la leche entera, la leche evaporada, las 3 cucharadas de leche condensada, la chía, la vainilla y la sal\n" +
                            "Incorpora los copos de avena tradicionales a la mezcla líquida y remueve bien para integrar los ingredientes\n" +
                            "Vierte la mezcla distribuyéndola equitativamente en 4 frascos pequeños, tápalos y refrigera por al menos 8 horas\n" +
                            "Justo antes de servir, rocía cada frasco con media cucharadita de leche condensada, canela molida y rodajas de fresas",
                imageRes = R.drawable.avenatresleches
            ),

            Recipe(
                title = "Queso feta de almendras fácil",
                cravingType = "Leche",
                ingredients =
                    "2 tazas de almendras fileteadas (sin pelar)\n" +
                            "2 cucharadas de vinagre de vino blanco\n" +
                            "2 cucharaditas de jugo de limón fresco\n" +
                            "1 cucharadita de sal\n" +
                            "1 cucharada de aceite de coco refinado derretido",
                duration = "10 minutos (más tiempo de remojo)",
                steps =
                    "Remoja las almendras en agua hirviendo durante 30 a 45 minutos y escúrrelas por completo al finalizar\n" +
                            "Agrega las almendras, 1/3 de taza de agua, el vinagre, el jugo de limón y la sal al vaso de un procesador de alimentos\n" +
                            "Licúa a velocidad alta hasta obtener una pasta compacta y ligeramente granulada con textura de queso feta\n" +
                            "Añade el aceite de coco refinado derretido, mezcla brevemente y presiona la masa firmemente en un recipiente\n" +
                            "Tapa y refrigera durante al menos 4 horas (o toda la noche) y desmenúzalo con un tenedor antes de consumirlo",
                imageRes = R.drawable.quesofetaalmendras
            ),

            Recipe(
                title = "Natillas saludables con leche de almendras",
                cravingType = "Leche",
                ingredients =
                    "1 litro de leche de almendras\n" +
                            "6 yemas de huevo\n" +
                            "50 g de azúcar moreno\n" +
                            "40 g de maicena\n" +
                            "1 rama de canela\n" +
                            "5 ml de extracto de vainilla",
                duration = "15 minutos (más 1 hora de reposo)",
                steps =
                    "Vierte la leche de almendras en una cacerola con la rama de canela, calienta a fuego suave y apaga al romper a hervir\n" +
                            "Deja reposar la leche tapada durante una hora completa para que se infusione adecuadamente con la canela\n" +
                            "En un bol aparte, bate enérgicamente las yemas de huevo junto con la maicena hasta formar una crema fina y sin grumos\n" +
                            "Retira la canela, vuelve a calentar la leche a fuego bajo e incorpora la mezcla de las yemas poco a poco\n" +
                            "Añade la vainilla y el azúcar moreno, removiendo constantemente con suavidad hasta que la preparación espese de forma homogénea\n" +
                            "Retira la mezcla del fuego, viértela inmediatamente en los vasos para natilla y sírvelas solas o con galletas",
                imageRes = R.drawable.natillaslechealmendras
            ),

            Recipe(
                title = "Crema de aguacate y coco",
                cravingType = "Leche",
                ingredients =
                    "400 ml de crema de coco\n" +
                            "3 aguacates\n" +
                            "1/2 cebolla\n" +
                            "1 diente de ajo\n" +
                            "4 tazas de agua\n" +
                            "1 cucharada de mantequilla\n" +
                            "1/2 lima\n" +
                            "1/2 ramillete de perejil\n" +
                            "1 cucharadita de semillas de sésamo o chía\n" +
                            "Sal y pimienta al gusto",
                duration = "10 minutos",
                steps =
                    "Derrite la mantequilla en una olla grande, sofríe la cebolla picada durante 5 minutos y luego añade el ajo picado\n" +
                            "Cuando la cebolla tome un tono transparente, incorpora el aguacate cortado en cubos pequeños\n" +
                            "Agrega las 4 tazas de agua junto con el perejil, exprime la media lima y sazona al gusto con sal y pimienta\n" +
                            "En cuanto la mezcla rompa a hervir, cocina por dos minutos adicionales, retira del fuego e integra la crema de coco\n" +
                            "Procesa toda la sopa en una batidora o licuadora hasta lograr una crema homogénea y sírvela caliente o refrigérala",
                imageRes = R.drawable.cremaaguacatecoco
            ),

            Recipe(
                title = "Leche de sésamo con vainilla",
                cravingType = "Leche",
                ingredients =
                    "1/3 taza de semillas de sésamo blanco sin tostar\n" +
                            "2 tazas de agua\n" +
                            "3/4 cucharadita de extracto de vainilla\n" +
                            "1/2 cucharada de aceite de coco sin refinar\n" +
                            "2 cucharadas de jarabe de arce puro\n" +
                            "1/4 cucharadita de sal marina",
                duration = "30 minutos (más tiempo de remojo)",
                steps =
                    "Coloca las semillas de sésamo en la jarra de la licuadora, cúbrelas con 1/2 taza de agua y remoja de 30 a 60 minutos\n" +
                            "Licúa las semillas junto con el agua de remojo a alta velocidad durante un tiempo aproximado de 40 segundos\n" +
                            "Añade la vainilla, el aceite de coco, el jarabe de arce, la sal marina y las 1 1/2 tazas de agua restantes al vaso\n" +
                            "Procesa todo junto hasta que quede perfectamente liso y filtra la leche pasando el líquido por un colador de malla fina",
                imageRes = R.drawable.lechesesamovainilla
            ),

            Recipe(
                title = "Helado de kéfir de mango y coco",
                cravingType = "Leche",
                ingredients =
                    "350 g de trozos de mango congelado\n" +
                            "100–150 ml de kéfir (de 1/3 a 2/3 de taza)\n" +
                            "Coco rallado al gusto\n" +
                            "Pistachos picados (opcional)\n" +
                            "Un chorrito de jugo de lima (opcional)",
                duration = "5 minutos (más tiempo de congelación opcional)",
                steps =
                    "Añade los trozos de mango congelado directamente al vaso de una batidora o licuadora de alta velocidad\n" +
                            "Vierte los primeros 100 ml de kéfir e inicia el licuado, agregando más líquido si necesitas ajustar la consistencia\n" +
                            "Si buscas una textura más firme para comer con cuchara, congela el helado obtenido durante al menos una hora\n" +
                            "Sirve el helado en recipientes individuales y espolvorea por encima coco rallado, pistachos y un chorrito de lima",
                imageRes = R.drawable.heladokefirmangococo
            ),

            // RECETAS DE PAN

            Recipe(
                title = "Pan de yogur sin carbohidratos",
                cravingType = "Pan",
                ingredients =
                    "1 taza de yogur griego (natural, preferiblemente entero)\n" +
                            "2 huevos\n" +
                            "1/2 cucharadita de levadura en polvo",
                duration = "30 minutos",
                steps =
                    "Precalienta el horno a 175°C (350°F) y engrasa ligeramente un molde para pan pequeño\n" +
                            "En un bol, mezcla bien el yogur griego, los huevos y la levadura en polvo hasta que no queden grumos\n" +
                            "Vierte la masa homogénea dentro del molde preparado\n" +
                            "Hornea de 25 a 30 minutos hasta que la superficie esté dorada y un palillo salga limpio\n" +
                            "Deja enfriar por completo dentro del molde antes de cortarlo en rebanadas y servir",
                imageRes = R.drawable.panyogursincarbohidratos
            ),

            Recipe(
                title = "Pan nube (Cloud bread)",
                cravingType = "Pan",
                ingredients =
                    "3 huevos medianos (M)\n" +
                            "1/2 cucharadita de bicarbonato\n" +
                            "Un pellizco de sal\n" +
                            "100 g de queso crema\n" +
                            "Un chorrito de jugo de limón (opcional)",
                duration = "35 minutos",
                steps =
                    "Separa minuciosamente las claras de las yemas de los tres huevos\n" +
                            "Monta las claras a punto de nieve junto con el bicarbonato y la pizca de sal, y reserva en un bol\n" +
                            "Precalienta el horno a 150°C y engrasa un molde para cupcakes si es metálico\n" +
                            "Bate las yemas junto con el queso crema y el chorrito de limón opcional\n" +
                            "Incorpora las claras montadas a la mezcla de yemas de forma envolvente y con suavidad para no perder aire\n" +
                            "Reparte la masa en los moldes (puedes añadir semillas por encima) y hornea a 150°C durante 25 minutos\n" +
                            "Deja reposar 5 minutos con el horno apagado y la puerta entreabierta antes de retirar",
                imageRes = R.drawable.pannubecloudbread
            ),

            Recipe(
                title = "Mug cake de pan de ajo en microondas",
                cravingType = "Pan",
                ingredients =
                    "1 huevo\n" +
                            "1 cucharada de ajo en polvo\n" +
                            "1 cucharada de orégano\n" +
                            "1 cucharada de levadura química (tipo Royal)\n" +
                            "1 cucharada sopera de harina de trigo\n" +
                            "15 g de queso parmesano o mozzarella rallado (opcional)\n" +
                            "Aceite de oliva o mantequilla (para engrasar)\n" +
                            "Sal al gusto",
                duration = "3 minutos",
                steps =
                    "Engrasa el interior de una taza grande apta para microondas con un poco de aceite o mantequilla\n" +
                            "Añade a la taza el huevo, el ajo en polvo, el orégano, la sal y la levadura, y remueve con un tenedor\n" +
                            "Incorpora la cucharada de harina y el queso rallado, mezclando de nuevo hasta obtener una masa uniforme\n" +
                            "Cocina en el microondas a máxima potencia durante un tiempo estimado de 90 a 180 segundos\n" +
                            "Retira la taza, deja reposar un par de minutos, desmolda el pan y córtalo en rebanadas listas para comer o tostar",
                imageRes = R.drawable.mugcakepanajomicroondas
            ),

            Recipe(
                title = "Pan de calabacín",
                cravingType = "Pan",
                ingredients =
                    "100 g de calabacín (lavado)\n" +
                            "2 huevos\n" +
                            "30 g de almendra molida\n" +
                            "40 g de queso mozzarella\n" +
                            "Sal al gusto",
                duration = "15 minutos",
                steps =
                    "Ralla el calabacín y colócalo sobre un paño limpio presionando con fuerza para extraer todo el exceso de líquido\n" +
                            "En un bol mediano, mezcla el calabacín escurrido junto con los huevos, la almendra molida, la mozzarella y la sal\n" +
                            "Forra tu sandwichera o grill con papel de horno y extiende la masa de forma uniforme por la superficie\n" +
                            "Cocina a máxima potencia hasta que esté bien hecho, corta por la mitad, añade tus rellenos favoritos y sirve",
                imageRes = R.drawable.pancalabacin
            ),

            Recipe(
                title = "Arepas de zanahoria y chía",
                cravingType = "Pan",
                ingredients =
                    "1 taza de harina de maíz blanco P.A.N.\n" +
                            "1 taza de semillas de chía\n" +
                            "1/2 taza de avena molida\n" +
                            "1/2 taza de avena entera en hojuelas\n" +
                            "1 zanahoria\n" +
                            "1/2 cucharadita de sal rosa\n" +
                            "2 tazas de agua\n" +
                            "Salmón ahumado y aguacate (para el relleno)",
                duration = "30 minutos",
                steps =
                    "Ralla la zanahoria por el lado más fino del rallador y colócala en un recipiente grande\n" +
                            "Añade la harina de maíz, las semillas de chía, la avena entera, la avena molida y la media cucharadita de sal rosa\n" +
                            "Vierte las dos tazas de agua poco a poco y amasa firmemente hasta lograr una textura compacta y manejable\n" +
                            "Divide la masa, forma bolas del mismo tamaño y aplánalas suavemente con las manos dándoles forma de arepa\n" +
                            "Cocina en una sartén a fuego medio hasta que doren por ambos lados, ábrelas y rellénalas con salmón y aguacate",
                imageRes = R.drawable.arepaszanahoriachia
            ),

            Recipe(
                title = "Pan de lentejas",
                cravingType = "Pan",
                ingredients =
                    "400 g de lentejas crudas\n" +
                            "3 cucharadas de aceite\n" +
                            "1/2 taza de agua (aproximadamente)\n" +
                            "1 cucharadita de sal\n" +
                            "1 cucharada de levadura seca\n" +
                            "1 huevo (opcional)\n" +
                            "1 cucharada de miel (opcional)\n" +
                            "Semillas al gusto (opcional)",
                duration = "50 minutos (más tiempo de remojo)",
                steps =
                    "Deja remojar las lentejas en abundante agua durante toda la noche y escúrrelas completamente al día siguiente\n" +
                            "Coloca en la licuadora las lentejas, la sal, la levadura, el aceite y los opcionales (huevo y miel) si deseas usarlos\n" +
                            "Procesa todo virtiendo el agua poco a poco hasta obtener una consistencia cremosa pero espesa\n" +
                            "Vierte la mezcla en un molde de budín previamente aceitado, decora con semillas y deja reposar por 1 hora\n" +
                            "Hornea a temperatura moderada por unos 30 minutos o hasta que al pinchar con un palillo este salga seco",
                imageRes = R.drawable.panlentejas
            ),

            Recipe(
                title = "Galletas de linaza",
                cravingType = "Pan",
                ingredients =
                    "1/4 taza de linaza molida\n" +
                            "1/3 taza de harina integral\n" +
                            "1 cucharada de almidón de maíz\n" +
                            "1/2 cucharadita de sal\n" +
                            "1/4 cucharadita de ajo en polvo (opcional)\n" +
                            "3 cucharadas de aceite de oliva virgen extra\n" +
                            "1/2 taza de agua fría",
                duration = "40 minutos (más tiempo de reposo)",
                steps =
                    "Precalienta el horno a 175°C (350°F) y prepara dos bandejas para hornear forradas con papel pergamino\n" +
                            "En un bol, mezcla de forma homogénea la linaza molida, la harina integral, el almidón de maíz, la sal y el ajo en polvo\n" +
                            "Añade el aceite de oliva junto con el agua fría al bol y bate firmemente con unas varillas para integrar todo\n" +
                            "Divide la masa en las dos bandejas y utiliza el dorso de una cuchara para extenderla en capas muy finas\n" +
                            "Hornea por 35 minutos, apaga el horno y deja las galletas dentro con la puerta cerrada durante 20 minutos más\n" +
                            "Retira del horno, permite que se enfríen a temperatura ambiente y pártelas en trozos antes de servir",
                imageRes = R.drawable.galletaslinaza
            ),

            Recipe(
                title = "Masa de pizza con base de garbanzos",
                cravingType = "Pan",
                ingredients =
                    "200 g de garbanzos cocidos\n" +
                            "1 huevo\n" +
                            "1 cucharadita de sal\n" +
                            "Tomate natural triturado (topping)\n" +
                            "Queso o mozzarella rallada sin lactosa (topping)\n" +
                            "Pechuga de pavo troceada (topping)\n" +
                            "Burrata sin lactosa y albahaca fresca (topping)",
                duration = "25 minutos",
                steps =
                    "Tritura por completo los garbanzos cocidos junto con el huevo entero y la cucharadita de sal hasta unificar la masa\n" +
                            "Extiende la masa en forma circular sobre una bandeja con papel vegetal previamente engrasado sin dejar huecos\n" +
                            "Lleva la base al horno precalentado a 200°C por unos 10 minutos hasta que quede sólida y se pueda despegar\n" +
                            "Saca del horno, unta el tomate triturado, añade la mozzarella y el pavo, y hornea durante 5 minutos adicionales\n" +
                            "Retira la pizza del horno y sirve los toppings frescos por encima: la burrata desmigada y las hojas de albahaca",
                imageRes = R.drawable.masapizzabasegarbanzos
            ),

            Recipe(
                title = "Pan de plátano macho verde sin harina",
                cravingType = "Pan",
                ingredients =
                    "1 plátano macho verde\n" +
                            "2 huevos\n" +
                            "1/4 cucharadita de polvo para hornear\n" +
                            "Sal al gusto\n" +
                            "Semillas para espolvorear (opcional)",
                duration = "30 minutos",
                steps =
                    "Pela el plátano macho verde, córtalo en trozos medianos y colócalo en el vaso de la licuadora\n" +
                            "Añade los huevos enteros, el polvo de hornear y la sal, y licúa a velocidad alta hasta obtener una crema líquida uniforme\n" +
                            "Aceita un molde para horno, vuelca toda la preparación dentro y espolvorea con semillas si lo deseas\n" +
                            "Lleva al horno precalentado a 200°C por unos 20 minutos hasta que la superficie y los laterales estén dorados\n" +
                            "Verifica con un palillo que el interior esté seco, deja enfriar unos minutos y desmolda con cuidado",
                imageRes = R.drawable.panplatanomachoverde
            ),

            Recipe(
                title = "Wraps de espinacas, queso feta y claras de huevo",
                cravingType = "Pan",
                ingredients =
                    "16 oz de claras de huevo (1 envase)\n" +
                            "1 taza de queso cottage (requesón)\n" +
                            "4 tazas de espinacas baby frescas (en tiras)\n" +
                            "1/2 taza de tomates secos en juliana con su aceite\n" +
                            "1 cucharada de condimento italiano\n" +
                            "1 cucharadita de hojuelas de pimiento rojo\n" +
                            "1 cucharadita de ajo en polvo, sal y pimienta negra al gusto\n" +
                            "1/4 taza de queso parmesano y 1/4 taza de queso feta desmenuzado\n" +
                            "6 panes lavash integrales (o tortillas)\n" +
                            "Ingredientes extra para untar y rellenar (queso cottage, parmesano, espinacas y feta extra)",
                duration = "40 minutos",
                steps =
                    "Sofreír las espinacas baby en una sartén con el aceite de tomate seco hasta que se ablanden, añade los tomates y deja enfriar\n" +
                            "Licúa las claras de huevo con la taza de queso cottage, condimento italiano, pimiento, ajo en polvo, sal y pimienta\n" +
                            "Extiende las espinacas y tomates salteados sobre una bandeja con papel de horno, vierte el licuado de huevo y espolvorea el parmesano y el feta\n" +
                            "Hornea a 175°C (350°F) por 30 minutos, retira el papel, deja enfriar unos minutos y corta la base horneada en 6 trozos iguales\n" +
                            "Mezcla los ingredientes de la sección 'Untar' hasta formar una crema y extiéndela en el centro de cada uno de los 6 panes lavash\n" +
                            "Arma los wraps colocando espinacas frescas, queso feta extra y un trozo de la tortilla de huevo; dobla bien y dora en la sartén",
                imageRes = R.drawable.wrapsespinacasfeta
            ),

            // RECETAS DE HIELO

            Recipe(
                title = "Granizado de Hibisco (Flor de Jamaica) y Limón",
                cravingType = "Hielo",
                ingredients =
                    "1 taza de flores secas de hibisco (flor de jamaica)\n" +
                            "4 tazas de agua (para la infusión)\n" +
                            "El jugo de 2 a 3 limones frescos (aproximadamente 1/4 de taza)\n" +
                            "2 a 3 cucharadas de miel, agave o azúcar al gusto\n" +
                            "3 a 4 tazas de hielo en cubos",
                duration = "15 minutos",
                steps =
                    "Hierve el agua: En una olla pequeña, pon a hervir las 4 tazas de agua. Al romper hervor, apaga el fuego y añade la taza de flores secas de hibisco\n" +
                            "Infusiona: Tapa la olla y deja reposar de 10 a 15 minutos para extraer todo el color y sus propiedades\n" +
                            "Cuela: Pasa la infusión por un colador fino a una jarra o recipiente, desechando las flores\n" +
                            "Saboriza: Agrega el jugo de limón y el endulzante de tu elección a la infusión aún tibia (así se disolverá fácilmente). Mezcla bien y deja enfriar en la nevera\n" +
                            "Graniza: En una licuadora potente, añade la infusión fría de jamaica con limón y las 3 a 4 tazas de hielo. Licúa a velocidad alta hasta lograr la consistencia de 'nieve' o frappé",
                imageRes = R.drawable.granizadohibiscolimon
            ),

            Recipe(
                title = "Licuado de frutos rojos, espinaca y chía",
                cravingType = "Hielo",
                ingredients =
                    "1 taza de frutos rojos (fresas, frambuesas, arándanos)\n" +
                            "1 taza de espinaca fresca\n" +
                            "1 cucharada de semillas de chía\n" +
                            "1 taza de leche de almendra (o cualquier otra leche vegetal)\n" +
                            "1 cucharada de colágeno (opcional para dar beneficios extra)\n" +
                            "1 cucharada de miel (opcional)",
                duration = "6 minutos",
                steps =
                    "Preparación previa: Coloca las semillas de chía en un vaso con un poco de agua y déjalas reposar durante al menos 10 minutos. Esto permitirá que se hidraten y adquieran una textura gelatinosa\n" +
                            "Mezcla los ingredientes: Coloca los frutos rojos, la espinaca y la leche de almendra en una licuadora\n" +
                            "Añade las semillas de chía hidratadas y, si deseas, la miel para endulzar\n" +
                            "Licúa todos los ingredientes a alta velocidad hasta obtener una mezcla homogénea y sin grumos\n" +
                            "Vierte el licuado en un vaso y disfruta de inmediato",
                imageRes = R.drawable.licuadofrutosrojosatole
            ),

            Recipe(
                title = "Frozen de Sandía y Menta",
                cravingType = "Hielo",
                ingredients =
                    "2 tazas de sandía congelada\n" +
                            "1/2 tazas de agua\n" +
                            "5 hojas de menta fresca\n" +
                            "Jugo de 1/2 lima",
                duration = "5 minutos",
                steps =
                    "Licúa todos los ingredientes en una batidora o licuadora potente hasta obtener una mezcla granulada\n" +
                            "Decora con hojas de menta fresca adicional por encima (opcional) y consume de inmediato",
                imageRes = R.drawable.frozensandiamenta
            ),

            Recipe(
                title = "Helado saludable con remolacha",
                cravingType = "Hielo",
                ingredients =
                    "4 bananas o plátanos maduros y congelados\n" +
                            "80g de remolacha cocida\n" +
                            "30g de arándanos congelados\n" +
                            "1/4 cucharadita de extracto o esencia de vainilla",
                duration = "5 minutos",
                steps =
                    "Coloca los plátanos congelados, la remolacha cocida, los arándanos congelados y la esencia de vainilla en el procesador o licuadora\n" +
                            "Tritura firmemente todos los ingredientes hasta lograr la consistencia cremosa de un helado\n" +
                            "Para servir puedes agregar un poco de polen o cualquier topping de tu preferencia que te guste",
                imageRes = R.drawable.heladosaludableremolacha
            ),

            Recipe(
                title = "Matcha Bingsu (Postre de hielo raspado con té verde)",
                cravingType = "Hielo",
                ingredients =
                    "Hielo de matcha: Agua de 3/4 C enfriada a 80 °C / 176 °F con 1-2 cucharaditas de matcha en polvo al gusto\n" +
                            "Toppings preferidos (opcional)\n" +
                            "Leche condensada (opcional)",
                duration = "5 minutos (más tiempo de congelación)",
                steps =
                    "Prepara el bloque de hielo de matcha: Añade el polvo de matcha a un vaso, frasco o bol\n" +
                            "Vierte el agua hervida y enfriada a 80 °C sobre el matcha\n" +
                            "Batir el matcha con fuerza hasta que haga espuma y déjalo enfriar por completo\n" +
                            "Transfiere el matcha enfriado a un recipiente apto para el congelador o a moldes para hielo (preferiblemente los moldes de tu máquina de hielo raspado) y congélalo hasta que esté totalmente sólido\n" +
                            "Rallar el hielo: Retire el bloque de matcha congelado y déjelo reposar a temperatura ambiente durante unos 10 minutos para facilitar el raspado\n" +
                            "Coloca el bloque de hielo de matcha en la máquina para hacer hielo raspado\n" +
                            "Ralla el hielo de matcha dentro de un recipiente frío, siguiendo las instrucciones del fabricante de la máquina\n" +
                            "Sírvelo inmediatamente con los ingredientes que prefieras y un chorrito de leche condensada",
                imageRes = R.drawable.matchabingsuhielo
            ),

            Recipe(
                title = "Smoothie de naranjas con semillas de chía",
                cravingType = "Hielo",
                ingredients =
                    "2 zanahorias\n" +
                            "2 manzanas\n" +
                            "4 naranjas\n" +
                            "2 cucharaditas de semillas de chía\n" +
                            "4-5 cubitos de hielo\n" +
                            "Azúcar (si es necesario)",
                duration = "10 minutos",
                steps =
                    "Pelar y trocear meticulosamente todas las zanahorias, manzanas y naranjas\n" +
                            "Licuar los trozos de fruta en la batidora de vaso, añadir los cubitos de hielo y volver a batir con energía\n" +
                            "Al final del proceso, se añaden las 2 cucharaditas de semillas de chía y el batido ya está listo para servir",
                imageRes = R.drawable.smoothienaranjaschia
            ),

            Recipe(
                title = "Granizado de Kiwi y Agua de Coco",
                cravingType = "Hielo",
                ingredients =
                    "1 litro de agua de coco natural\n" +
                            "1 limón\n" +
                            "1/2 taza de espinacas frescas\n" +
                            "1 pepino persa con cáscara\n" +
                            "2 kiwis pelados\n" +
                            "Hielos al gusto",
                duration = "5 minutos",
                steps =
                    "En el vaso de una licuadora, agrega el agua de coco natural, las espinacas frescas, el pepino con cáscara, los kiwis pelados y el jugo de 1 limón\n" +
                            "Licúa todo perfectamente por un espacio de 40 segundos hasta obtener una mezcla suave y uniforme\n" +
                            "Sirve en un vaso con hielos y tómalo justo después de licuarlo para aprovechar todas sus propiedades\n" +
                            "Importante: No lo cueles bajo ninguna circunstancia, la fibra es clave para obtener todos sus beneficios",
                imageRes = R.drawable.granizadokiwiaguacoco
            ),

            Recipe(
                title = "Postre helado saludable",
                cravingType = "Hielo",
                ingredients =
                    "Rodajas de banano\n" +
                            "Yogurt griego\n" +
                            "Pistachos o otros toppings como fresa nueces o arandanos (opcional)\n" +
                            "Chocolate derretido",
                duration = "10 minutos (más 2 horas de congelación)",
                steps =
                    "Sobre una superficie con papel vegetal (indispensable para que no se pegue), pon rodajas de banano de manera que lo puedan cubrir todo\n" +
                            "Luego agrega una capa generosa de yogurt griego sobre las rodajas de banano, esparciéndolo completamente hasta cubrirlo\n" +
                            "Pon un poquito de chocolate derretido encima esparciéndolo en zigzag formando líneas sobre la 'cama' que ya tenemos de banano y yogurt\n" +
                            "Añade unos cuantos pistachos troceados o los toppings que tú quieras por la superficie\n" +
                            "Lleva al congelador durante una o dos horas seguidas y estará listo para cortar y disfrutar",
                imageRes = R.drawable.postreheladosaludable
            ),

            Recipe(
                title = "Paletas Crujientes de Té de Jengibre y Limón",
                cravingType = "Hielo",
                ingredients =
                    "400 ml de agua\n" +
                            "El zumo de 2 limones\n" +
                            "El zumo de 2 limas\n" +
                            "3 ramas de hierbabuena\n" +
                            "1/2 cucharadita de jengibre fresco rallado (opcional)\n" +
                            "2 cucharadas soperas de miel cruda\n" +
                            "1 cucharadita de edulcorante (para corregir la acidez)",
                duration = "15 minutos (más tiempo de congelación)",
                steps =
                    "Ponemos a calentar el agua en un cazo junto con la miel, los zumos de limón y lima, y la ralladura opcional de jengibre fresco\n" +
                            "Cuando empiece a hervir, lo probamos con cuidado y, si nos parece muy ácido, añadimos el edulcorante o más miel (esto va un poco a gusto de cada uno)\n" +
                            "Retiramos inmediatamente del fuego, le añadimos las 3 ramas de hierbabuena y tapamos el cazo para que infusione unos tres o cuatro minutos\n" +
                            "Retiramos la hierbabuena por completo y dejamos reposar la mezcla líquida a temperatura ambiente hasta que esté totalmente fría\n" +
                            "Lo vertemos con cuidado en los moldes para polos, colocando unas rodajitas de lima dentro de cada uno de ellos\n" +
                            "Los dejamos introducidos en el congelador hasta que esté totalmente sólido y congelado antes de desmoldar",
                imageRes = R.drawable.poloscrujientesjengibrelimon
            ),

            Recipe(
                title = "Helado de piña y espirulina azul",
                cravingType = "Hielo",
                ingredients =
                    "300 g de piña congelada (puede comprarse ya congelada)\n" +
                            "2 cucharadas de espirulina azul (algas)",
                duration = "15 minutos",
                steps =
                    "Pela, corta y congela la piña previamente (o utiliza la piña congelada comprada de paquete)\n" +
                            "Antes de triturar, deja las frutas 10 minutos enteros en la nevera (es decir, del congelador las pasamos a la nevera temporalmente para que no estén excesivamente duras)\n" +
                            "Aprovecha ese tiempo para preparar el recipiente final donde vas a conservar el helado en el congelador, ya que sale mucha cantidad\n" +
                            "Añade la piña reposada y las 2 cucharadas de espirulina al vaso y comienza a batir con muchísima paciencia\n" +
                            "Al estar tan duras las frutas costará un poco al principio pero la crema saldrá. Abre de vez en cuando la batidora para ayudarte empujando con una cuchara (siempre con el cuidado de que no toque las aspas)",
                imageRes = R.drawable.heladopinaspirulinaazul
            )



        )

        recipes.forEach {

            recipeDao.insertRecipe(it)
        }
    }
}