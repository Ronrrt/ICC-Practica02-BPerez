# Introducción a Ciencias de la Computación — Práctica 2

## 👥 Datos identificadores

* **Alumno:** Brandon Pérez Hernandez
* **Profesor:** Salvador López Mendoza
* **Ayudante:** Yanahí Demerio Torres
* **Ayudante de Laboratorio:** Rosa Victoria Villa Padilla
* **Fecha de Entrega:** 13 de noviembre de 2026 a las 23:59pm

## Objetivo
El objetivo de esta práctica es que el alumno ejercite la teoría acerca del uso y aplicación de las instrucciones condicionales dentro de un programa, así como de la creación y uso de objetos de clases existentes.

## 🛠️ Contenido de la Práctica

El proyecto se compone de un unico programa principal integrado dentro de la estructura BPerez/practica02/src/icc/

## 1. Simulacion de inversion

## Descripción general
En una institución bancaria se requiere hacer cierto manejo de fechas para determinar, por ejemplo, la fecha final de una inversión de dinero. Por ello el propósito de este programa es ser una clase para crear y manejar fechas.

## Comportamiento
1. La clase `Fecha` incluye los siguientes métodos:
   * **(a)** Crear una fecha inicial. Uno sin parámetros, otro que tome tres enteros (día, mes, año); y un tercero con tres datos: dos enteros (día y año) y una cadena para el nombre del mes.
   * **(b)** Asignar valor a los campos de una fecha.
   * **(c)** Obtener los campos de una fecha.
   * **(d)** Obtener la diferencia, en días, entre dos fechas.
   * **(e)** Dada una fecha inicial y un número entero que representa una cantidad de días, obtener la fecha que corresponde, por ejemplo: con 3-9-2013 y 5, deberá dar 8-9-2013. Con la misma fecha inicial y -2 se debe obtener 1-9-2013.
   * **(f)** Determinar si dos fechas son iguales.
   * **(g)** Devolver el número correspondiente a un mes a partir de que reciba una cadena con su nombre.
   * **(h)** Devolver la cadena correspondiente a un mes a partir de que reciba un número.
   * **(i)** Dada una fecha, especificar los días transcurridos en el año. Por ejemplo, 30 de diciembre de 2013, debe devolver 364.
   * **(j)** Representar una fecha en el formato `dd/mes/aaaa`, donde `dd` es el día, `mes` es el nombre del mes y `aaaa` son cuatro dígitos que representan el año.
2. La clase `TiempoDeInversion`, realiza el método `main` en donde realiza lo siguiente:
   * **(a)** Dar bienvenida y solicitar el nombre del inversionista.
   * **(b)** Recabar el nombre del inversionista.
   * **(c)** Saludar al inversionista y preguntar por el monto a invertir.
   * **(d)** Recabar monto.
   * **(e)** Preguntar por una fecha inicio de inversión.
   * **(f)** Recabar fecha inicio de inversión.
   * **(g)** Preguntar por una fecha fin de inversión.
   * **(h)** Recabar fecha fin de inversión.
   * **(i)** Mostrar al usuario cuántos días sería su inversión, y mostrar su rendimiento al 12%.
   * **(j)** Preguntar si desea hacer otra simulación, en caso de que responda sí, volver al paso 3(c), en otro caso, salir de la simulación.

## Salida 

```bash
Bienvenido, cual es su nombre?
Alberto
Buenas tardes Alberto.
Digame, cuál es su problema en la vida?
Odio tener clase los viernes
MMMM... ya veo
Y digame ...
Por qué dice "odio tener clases los viernes"?
Porque no puedo concentrarme y el fin de semana me parece muy corto.
Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.
```

## 💻 Requisitos del Sistema e Instalación
* **Java SDK:** OpenJDK 25 o superior
* **Documentación:** Todo el código fuente está documentado siguiendo el estándar **Javadoc**.

*Facultad de Ciencias, UNAM — 2026*
