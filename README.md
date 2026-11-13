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

## Simulacion de inversion

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
  
## Main
public static void main (String [] args){

        // 1.Constructores y toString()

        Fecha fechaDefault = new Fecha();
        System.out.println("Fecha por default: " + fechaDefault); 
        
        Fecha fechaNum = new Fecha(15, 8, 2023);
        System.out.println("Fecha con numeros (15/8/2023): " + fechaNum);
        
        Fecha fechaText = new Fecha(20, "Noviembre", 2024);
        System.out.println("Fecha con texto (20/Noviembre/2024): " + fechaText);

        // 2. obtener() y asignar()

        fechaDefault.asignarFecha(10, 12, 2026);
        System.out.println("Nueva fecha : " + fechaDefault.obtenerDia() + "/" + 
        fechaDefault.obtenerMes() + "/" + fechaDefault.obtenerAnio());

        // 3.validar()

        System.out.print("Validar 29/2/2024 ¿Valido? ");
        System.out.println(fechaDefault.validar(29, 2, 2024)); 
        
        System.out.print("Validar 29/2/2023 ¿Valido? ");
        System.out.println(fechaDefault.validar(29, 2, 2023)); 
        
        System.out.print("Validar 31/4/2026 ¿Valido? ");
        System.out.println(fechaDefault.validar(31, 4, 2026));

        // 4.diferencia()

        Fecha fecha1 = new Fecha(1, 1, 2026);
        System.out.println("Diferencia entre 01/01/2026 y 10/01/2026: " + fecha1.diferencia(10, 1, 2026) + " dias");

        // 5.sumarDias()

        Fecha fecha2 = new Fecha(28, 2, 2024); 
        System.out.println("Fecha original: " + fecha2);
        fecha2.sumarDias(28, 2, 2024, 5); 
        System.out.println("Fecha despues de la suma: " + fecha2);

        // 6.equals()

        Fecha fecha3 = new Fecha(15, 5, 2026);
        Fecha fecha4 = new Fecha(15, 5, 2026);
        System.out.println("Son iguales (15/5/2026) y (15/5/2026)? " + fecha3.equals(fecha4));

        // 7. mestoNum() y NumtoMes()
        System.out.println(fechaDefault.mestoNum("Octubre"));
        System.out.println("NumtoMes(4): " + fechaDefault.NumtoMes(4));

        // 8.esBisiesto()
        System.out.println("Es 2024 bisiesto? " + fechaDefault.esBisiesto(2024));
        System.out.println("Es 2026 bisiesto? " + fechaDefault.esBisiesto(2026));

        // 9. diasTranscurridosAnio() y fechatoDia()
        System.out.println("Dias transcurridos al 15 de Marzo 2024 : " + 
                     fechaDefault.diasTranscuridosAnio(15, "Marzo", 2024));
        System.out.println("Fecha a dias absolutos (01/01/2026): " + fechaDefault.fechatoDia(1, 1, 2026));
  
## Salida 

```bash
Fecha por default: 1/enero/2026
Fecha con numeros (15/8/2023): 15/agosto/2023
Mes no valido
Mes no valido
Fecha con texto (20/Noviembre/2024): 20/unknown/2024
Nueva fecha : 10/12/2026
Validar 29/2/2024 ¿Valido? true
Validar 29/2/2023 ¿Valido? Dia no valido
false
Validar 31/4/2026 ¿Valido? Dia no valido
false
Diferencia entre 01/01/2026 y 10/01/2026: 9 dias
Fecha original: 28/febrero/2024
Fecha despues de la suma: 4/marzo/2024
Son iguales (15/5/2026) y (15/5/2026)? true
Mes no valido
-1
NumtoMes(4): abril
Es 2024 bisiesto? true
Es 2026 bisiesto? false
Mes no valido
Dias transcurridos al 15 de Marzo 2024 : 15
Fecha a dias absolutos (01/01/2026): 739982

```

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
Brandon
Buenas Brandon
Digame, cuanto es el monto que se quiere invertir?
300
Antes de ingresar la fecha de inicio de la inversion
Elige un formato valido
> "dia/mes(palabra)/anio" si este es el que deseas presiona 1
> "dia/mes(numero)/anio" si este es el que deseas presiona 2
> Mismo formato que la opcion 1 pero los valores por default son los iniciales de este anio si este es el que deseas presiona 3
1
Eligio el formato NO.1
Inserte fecha de inicio de la inversion
Inserte dia:
12
Inserte mes (palabra):
enero
Inserte anio:
2000
Tu fecha inicial es: 12/enero/2000
antes de ingresar la fecha de fin de la inversion
Elige un formato valido
> "dia/mes(palabra)/anio" si este es el que deseas presiona 1
> "dia/mes(numero)/anio" si este es el que deseas presiona 2
> Mismo formato que la opcion 1 pero los valores por default son los iniciales de este anio si este es el que deseas presiona 3
3
Eligio el formato NO.3
Como se eligio la opcion 3 los valores se pondran por default en fechas iniciales de este anio
Tu fecha final es:1/1/2026
Sus dias de inversion serian:9485
Su rendimiento al 12% es:935.5068493150685
¿Quieres hacer otra simulacion?
Elige si o no
si
Buenas Brandon
Digame, cuanto es el monto que se quiere invertir?
3559
Antes de ingresar la fecha de inicio de la inversion
Elige un formato valido
> "dia/mes(palabra)/anio" si este es el que deseas presiona 1
> "dia/mes(numero)/anio" si este es el que deseas presiona 2
> Mismo formato que la opcion 1 pero los valores por default son los iniciales de este anio si este es el que deseas presiona 3
2
Eligio el formato NO.2
Inserte fecha de inicio de la inversion
Inserte dia
1
Inserte mes(numero)
1
Inserte anio
2026
Tu fecha inicial es:1/1/2026
antes de ingresar la fecha de fin de la inversion
Elige un formato valido
> "dia/mes(palabra)/anio" si este es el que deseas presiona 1
> "dia/mes(numero)/anio" si este es el que deseas presiona 2
> Mismo formato que la opcion 1 pero los valores por default son los iniciales de este anio si este es el que deseas presiona 3
1
Eligio el formato NO.1
Inserte fecha de fin de la inversion
Inserte dia
23
Inserte mes(palabra)
septiembre
Inserte anio:
2000
Tu fecha final es:23/septiembre/2000
Sus dias de inversion serian:9230
Su rendimiento al 12% es:10799.858630136985
¿Quieres hacer otra simulacion?
Elige si o no
no

```

## 💻 Instrucciones de Compilación y Ejecución
Se puede compilar y ejecutar el programa desde la terminal usando cualquiera de las dos opciones siguientes:

* **Opción 1:** Ubicado en la carpeta raíz del proyecto (practica02)
  * 1). Compilar todos los archivos:
    ```bash
    javac src/icc/*.java
    ```
  * 2). Ejecutar el simulador de inversión:
    ```bash
    java -cp src icc.TiempoDeInversion
    ```
* **Opción 2:** Ubicado dentro de la carpeta src
  * 1). Compilar todos los archivos:
    ```bash
    javac icc/*.java
    ```
  * 2). (Si quieres compilar un archivo de forma individual, puedes usar: `javac icc/Fecha.java` o `javac icc/TiempoDeInversion.java`)
  * 
  * 3). Ejecutar el simulador de inversión:
    ```bash
    java icc.TiempoDeInversion
    ```
## 💻 Requisitos del Sistema e Instalación
* **Java SDK:** OpenJDK 25 o superior
* **Documentación:** Todo el código fuente está documentado siguiendo el estándar **Javadoc**.

*Facultad de Ciencias, UNAM — 2026*
