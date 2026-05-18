# Pasos del Laboratorio 3 - JustDoIt

## Bitácora cronológica

Este archivo registra de forma ordenada los pasos realizados durante el Laboratorio 3 del curso **Programación Web II**. Su propósito es servir como apoyo para la documentación final y para la exportación a PDF.

## 1. Apertura del proyecto en IntelliJ

Se abrió el proyecto Spring Boot **JustDoIt** en IntelliJ IDEA para revisar su estructura inicial, identificar sus paquetes principales y confirmar que la aplicación correspondía al laboratorio asignado.

## 2. Diagnóstico del repositorio

Se revisó la configuración Git del proyecto para identificar el repositorio remoto original y preparar el cambio hacia un repositorio propio del estudiante.

## 3. Creación del repositorio propio

Se creó un repositorio propio en GitHub para alojar el laboratorio:

<https://github.com/omarin0508/justdoit-lab3-oscar.git>

## 4. Push inicial

Se reemplazó el remote original por el repositorio propio y se realizó el push inicial. Con esto se dejó una copia base del proyecto JustDoIt disponible en GitHub.

## 5. Diagnóstico de estructura MVC

Se revisó la arquitectura del proyecto y se identificó que la aplicación sigue el patrón MVC:

- **Model:** entidades como `User` y `Task`.
- **View:** plantillas Thymeleaf ubicadas en `src/main/resources/templates`.
- **Controller:** controladores Spring MVC, incluyendo `UserTasksController`.

## 6. Implementación de ruta `/user/tasks/report`

Se agregó la ruta `/user/tasks/report` reutilizando el controlador `UserTasksController.java`.

## 7. Creación del fragmento `user-info.html`

Se creó el fragmento Thymeleaf `src/main/resources/templates/fragments/user-info.html` para reutilizar información del usuario dentro de las vistas.

## 8. Creación de vista tabular

Se creó el template `src/main/resources/templates/usertasks-report.html` para mostrar las tareas del usuario en una tabla.

## 9. Validación local

Se validó la compilación con:

```powershell
.\mvnw.cmd -DskipTests compile
```

El resultado fue:

```text
BUILD SUCCESS
```

También se probaron las rutas:

- `/user/tasks`
- `/user/tasks/report`

## 10. Capturas de evidencia

Las capturas finales se almacenaron en:

```text
Laboratorio-3-JustDoIt/evidencias/
```

Evidencias incluidas:

- `01-proyecto-abierto-intellij.png`
- `02-repositorio-propio-github.png`
- `03-push-inicial-exitoso.png`
- `04-usertasks-original.png`
- `05-reporte-tareas-tabla.png`
