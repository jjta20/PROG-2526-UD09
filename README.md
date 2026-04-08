# ⚠️ Unidad 9: Excepciones y ficheros de texto - Soluciones

¡Hola de nuevo, estudiantes! 👋

Bienvenidos al repositorio con las **soluciones a las actividades de la Unidad 9**. 

Hasta ahora, nuestros programas eran un poco "frágiles": si el usuario metía una letra en lugar de un número, el programa explotaba. Además, cuando cerrábamos la ejecución, todos los datos se perdían para siempre. En este tema hemos aprendido a blindar nuestro código con el **tratamiento de excepciones** y a dar persistencia a los datos usando **ficheros de texto**.

---

## 🎯 ¿Qué conceptos ponemos en práctica aquí?

En estos ejercicios hemos aprendido a manejar lo inesperado y a interactuar con el disco duro:

*   🛡️ **Captura de excepciones (`try-catch`)**: Evitar que el programa se cuelgue interceptando errores como `ArithmeticException` o `InputMismatchException`.
*   🧹 **El bloque `finally`**: Asegurarnos de que ciertas líneas de código se ejecutan siempre (ideal para cerrar archivos).
*   🤾 **Lanzamiento y propagación (`throw` y `throws`)**: Aprender a avisar de que un método es "peligroso" y crear nuestras propias excepciones de usuario (como evitar edades negativas).
*   📖 **Lectura de ficheros (`FileReader` y `BufferedReader`)**: Extraer información de archivos de texto (carácter a carácter o línea a línea gracias al búfer).
*   📝 **Escritura de ficheros (`FileWriter` y `BufferedWriter`)**: Guardar información en el disco duro, controlando si sobrescribimos o añadimos texto (`append`).
*   ♻️ **Apertura con recursos (`try-with-resources`)**: La forma moderna y elegante (desde Java 7) de manejar ficheros para que se cierren solos automáticamente.

---

## 🚀 Índice de actividades

A continuación, tenéis el resumen de los ejercicios resueltos en este proyecto:

| Ejercicio | Temática | Conceptos clave trabajados |
| :---: | :--- | :--- |
| **1** | ⌨️ **Entrada segura** | Creación del método `leerEntero()`. Captura de errores de formato por teclado, uso de `throws` y repetición mediante recursividad. |
| **2 y 3** | 👁️ **Lector de código** | Lectura del archivo `Main.java`. Comparación de rendimiento leyendo con `FileReader` desnudo frente al uso eficiente de `BufferedReader`. |
| **4** | 🧮 **Procesador de datos** | Lectura de `NumerosReales.txt`. Extracción de datos, uso de `String.split()` y `String.valueOf()`, cálculo de medias y cierre manual con `finally`. |
| **7** | ✍️ **Escribiendo el Quijote** | Escritura en un archivo. Guardado de la primera línea carácter a carácter y la segunda del tirón. Uso clásico de `try-catch-finally`. |
| **8** | 👯 **El clonador de archivos** | Lectura y escritura simultánea. Programa que pide un nombre y crea una copia con el prefijo `copia_de_`. Uso moderno de **`try-catch-resources`**. |

---

## 🛠️ ¿Cómo usar este repositorio?

1. **Explora las dos caras de la moneda:** Abrid primero el ejercicio 1 para entender bien cómo evitar que el programa muera. Luego pasad a los ejercicios de ficheros (2 al 8) donde la excepción `IOException` es la protagonista.
2. **Provoca el caos (con cuidado):** Ejecutad el ejercicio 2 pero cambiad a propósito el nombre del archivo en el código a uno que no exista. ¡Fijaos cómo salta la `FileNotFoundException` y cómo el `catch` salva la situación mostrando un mensaje amigable!
3. **Analiza el cierre de recursos:** Comparad la actividad 7 con la actividad 8. Observad cuánto código nos ahorramos en la 8 al usar los paréntesis del `try-with-resources` para evitar el bloque `finally` y el método `close()`.

> **💡 Consejo del profe:** 
> *Jamás dejéis un bloque `catch` vacío. Si atrapáis un error y no hacéis nada (ni siquiera un `System.out.println`), estaréis creando un "agujero negro" de fallos muy difícil de rastrear (los famosos errores silenciosos). En cuanto a los ficheros, recordad: archivo que se abre, archivo que se cierra.*

---
*Profe: Javier Torre Antúnez | IES Newton-Salas* 🏫