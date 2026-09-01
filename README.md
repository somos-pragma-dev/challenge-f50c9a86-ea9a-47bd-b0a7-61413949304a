# Desarrollo de una API REST con validación de entidades y documentación

Debes crear una API REST para gestionar productos en un catálogo de e-commerce. La API debe permitir la creación, lectura, actualización y eliminación de productos. Cada producto tiene un nombre, precio, stock y categoría. La API debe validar que los nombres de los productos no sean duplicados y que los precios no sean negativos. Además, debe estar documentada utilizando OpenAPI.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Creación de API REST en Spring Boot |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del modelo de producto

**Objetivo:** Definir el modelo de datos para los productos incluyendo validaciones.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Crea un modelo de datos para los productos con los campos nombre, precio, stock y categoría.
- Aplica validaciones para asegurar que los nombres no sean duplicados y que los precios no sean negativos.

**Entregable:** Modelo de datos de producto con validaciones aplicadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar las validaciones en el modelo de datos.
- Piensa en cómo manejar los errores de validación.

</details>

### Fase 2: Implementación de los endpoints REST

**Objetivo:** Implementar los endpoints REST para crear, leer, actualizar y eliminar productos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Implementa los endpoints REST para las operaciones CRUD de productos.
- Asegura que los endpoints manejen correctamente las validaciones definidas en el modelo de datos.

**Entregable:** Endpoints REST funcionales para la gestión de productos.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo estructurar los endpoints para que sean intuitivos y fáciles de usar.
- Considera cómo manejar los errores de validación en los endpoints.

</details>

### Fase 3: Documentación de la API con OpenAPI

**Objetivo:** Documentar la API utilizando OpenAPI.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Documenta la API utilizando OpenAPI para que sea fácil de entender y usar por otros desarrolladores.
- Asegura que la documentación incluya detalles sobre los endpoints, los parámetros de entrada y los posibles errores.

**Entregable:** Documentación de la API utilizando OpenAPI.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo hacer que la documentación sea clara y concisa.
- Piensa en cómo incluir detalles sobre los posibles errores en la documentación.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un modelo de datos y por qué es importante en una API REST?
- **paraQueSirve**: ¿Para qué sirven las validaciones en una API REST y cómo se aplican?
- **comoSeUsa**: ¿Cómo se utilizan los endpoints REST para realizar operaciones CRUD y manejar errores de validación?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API REST y cómo se pueden evitar?

## Criterios de Evaluacion

- Definición correcta del modelo de datos con validaciones.
- Implementación funcional de los endpoints REST.
- Documentación clara y concisa de la API utilizando OpenAPI.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
