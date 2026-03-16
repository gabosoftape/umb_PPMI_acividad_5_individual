# FoodExpress - Proyecto de Registro de Clientes

Este proyecto es una aplicación Android desarrollada en **Kotlin** para la gestión de registros de clientes interesados en un restaurante. El proyecto cumple con requisitos académicos de navegación entre pantallas, paso de parámetros y validación de datos.

## 📱 Pantallas de la Aplicación

1.  **Pantalla de Inicio (MainActivity):** Presentación de la marca "FoodExpress" con un banner y botón de acceso.
2.  **Formulario de Registro (FormularioActivity):** Captura de datos (Nombre, Email, Teléfono) y preferencia de comida.
3.  **Confirmación (ConfirmacionActivity):** Visualización de los datos recibidos y opción de cierre.

## 🛠️ Componentes Utilizados

- **Layouts:** `LinearLayout` (Principal), `ScrollView` (para el formulario), `MaterialCardView` (para el resumen).
- **Widgets:**
  - `MaterialButton`: Botones modernos con bordes redondeados.
  - `TextInputEditText`: Campos de entrada con etiquetas flotantes.
  - `RadioGroup` / `RadioButton`: Selección de tipo de comida.
  - `ImageView`: Banner del restaurante.
  - `TextView`: Títulos y etiquetas de información.

## ⚙️ Funcionalidad Técnica

### 1. Pasaje de Datos con Intents
En `FormularioActivity`, los datos se empaquetan en un `Intent` usando `putExtra`:
```kotlin
val intent = Intent(this, ConfirmacionActivity::class.java).apply {
    putExtra("EXTRA_NOMBRE", nombre)
    // ... otros datos
}
startActivity(intent)
```

En `ConfirmacionActivity`, se recuperan con `getStringExtra`:
```kotlin
val nombre = intent.getStringExtra("EXTRA_NOMBRE")
```

### 2. Validaciones
Se utiliza una estructura `if` para verificar que los campos no estén vacíos. Si falta algún dato, se muestra un mensaje emergente (**Toast**):
```kotlin
if (nombre.isEmpty()) {
    Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
}
```

### 3. Cierre de Aplicación
Se utiliza `finishAffinity()` para cerrar todas las actividades de la pila y salir completamente de la app.

## 🚀 Cómo Ejecutar el Proyecto

1.  **Abrir en Android Studio:** Selecciona `File > Open` y busca la carpeta `restaurant`.
2.  **Sincronizar Gradle:** Haz clic en el icono del elefante (Sync Project with Gradle Files).
3.  **Conectar Dispositivo:** Conecta un celular físico con depuración USB activa o inicia un Emulador (Pixel 5, por ejemplo).
4.  **Ejecutar:** Presiona el botón verde de "Run" (flecha) en la barra superior.

---
**Desarrollado por:** Dumar Pabón Curso: Desarrollo Móvil 1 - Actividad 5 - UNIVERSIDAD MANUELA BELTRAN 
