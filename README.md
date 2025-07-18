# practica-oop2-dp

# Ejercicios de Patrones de Diseño

## COMPOSITE

### Ejercicio 1 - Sistema de Archivos

Un sistema de archivos permite organizar archivos en carpetas. Tanto los archivos como las carpetas tienen un nombre y
pueden calcular su tamaño. Los archivos tienen un tamaño fijo, mientras que las carpetas calculan su tamaño sumando el
tamaño de todos sus elementos contenidos.

**Consigna:**
a) Dibuje el diagrama de clases utilizando el patrón Composite que permita representar esta estructura jerárquica.
b) Implemente en pseudocódigo el método `calcularTamaño()` tanto para archivos como para carpetas.
c) Escriba un programa principal que cree la siguiente estructura:

- Carpeta "Documentos" que contiene:
    - Archivo "informe.pdf" (500KB)
    - Carpeta "Imágenes" que contiene:
        - Archivo "foto1.jpg" (200KB)
        - Archivo "foto2.jpg" (350KB)
- Calcule el tamaño total de "Documentos"

### Ejercicio 2 - Organización Empresarial

Una empresa tiene una estructura organizacional donde existen empleados individuales y departamentos. Los departamentos
pueden contener otros departamentos o empleados. Tanto empleados como departamentos tienen un nombre y pueden calcular
su presupuesto total.

**Consigna:**
a) Diseñe el diagrama de clases usando Composite para representar esta estructura.
b) Implemente el método `calcularPresupuesto()` en pseudocódigo.
c) Agregue al diagrama una clase `Consultor` que es un tipo especial de empleado con tarifa por hora.
d) Escriba un main que cree un departamento "Tecnología" con 2 empleados fijos y 1 consultor, y calcule el presupuesto
total.

## TEMPLATE METHOD

### Ejercicio 1 - Procesamiento de Datos

Un sistema procesa diferentes tipos de archivos de datos (CSV y JSON). El procesamiento sigue siempre los mismos pasos:
abrir archivo, leer datos, procesar datos, y generar reporte. Sin embargo, la forma de leer y procesar los datos varía
según el tipo de archivo.

**Consigna:**
a) Refactorice el siguiente código usando Template Method:

```java
public class ProcesadorCsv {
    public void procesar(String archivo) {
        System.out.println("Abriendo archivo: " + archivo);
        // leer CSV
        System.out.println("Leyendo datos CSV separados por comas");
        // procesar
        System.out.println("Procesando datos tabulares");
        System.out.println("Generando reporte");
    }
}

public class ProcesadorJson {
    public void procesar(String archivo) {
        System.out.println("Abriendo archivo: " + archivo);
        // leer JSON
        System.out.println("Parseando estructura JSON");
        // procesar
        System.out.println("Procesando objetos JSON");
        System.out.println("Generando reporte");
    }
}
```

b) El código cliente debe quedar:

```java
ProcesadorDatos procesador = new ProcesadorCsv();
procesador.

procesar("datos.csv");
```

### Ejercicio 2 - Algoritmos de Ordenamiento

Se necesita implementar diferentes algoritmos de ordenamiento (BubbleSort y QuickSort) que siguen el mismo patrón:
inicializar, ordenar usando el algoritmo específico, y mostrar resultado.

**Consigna:**
a) Diseñe las clases usando Template Method donde el método `ordenar()` sea el template.
b) Implemente en pseudocódigo los métodos abstractos para cada algoritmo.
c) Agregue un método `validarDatos()` que se ejecute antes del ordenamiento y sea común para ambos algoritmos.
d) Escriba un main que use ambos algoritmos con el mismo array de números.

## ADAPTER

### Ejercicio 1 - Integración de Sistemas de Pago

Un e-commerce utiliza su propia interfaz `ProcesadorPago` con el método `procesarPago(double monto, String tarjeta)`.
Necesita integrar dos sistemas externos de pago:

- PayPal: tiene el método `realizarPago(String email, double cantidad)`
- Stripe: tiene el método `charge(double amount, String cardToken)`

**Consigna:**
a) Dibuje el diagrama de clases usando el patrón Adapter para integrar ambos sistemas.
b) Implemente en pseudocódigo los adaptadores necesarios.
c) Escriba un programa principal que procese pagos usando ambos sistemas a través de la misma interfaz.

### Ejercicio 2 - Reproductor Multimedia

Un reproductor multimedia trabaja con la interfaz `ReproductorAudio` que tiene el método `reproducir(String archivo)`.
Se necesita integrar una biblioteca externa de MP3 que tiene la siguiente interfaz:

```java
public class BibliotecaMP3 {
    public void cargarArchivo(String ruta) { ...}

    public void iniciarReproduccion() { ...}

    public void detenerReproduccion() { ...}
}
```

**Consigna:**
a) Diseñe el patrón Adapter para integrar esta biblioteca.
b) Implemente el adaptador en pseudocódigo.
c) Extienda la solución para soportar también archivos WAV con una biblioteca que tiene el método
`playWav(String filename)`.

## DECORATOR

### Ejercicio 1 - Notificaciones

Un sistema de notificaciones básico envía mensajes de texto. Se necesita poder agregar funcionalidades adicionales como:
cifrado, compresión, y logging. Estas funcionalidades pueden combinarse de diferentes formas.

**Consigna:**
a) Diseñe el diagrama de clases usando Decorator.
b) Implemente en pseudocódigo los decoradores de cifrado y compresión.
c) Escriba un main que cree una notificación con texto, cifrado y logging.
d) Agregue un decorador `FormateoHtml` que convierta el texto a HTML.

### Ejercicio 2 - Bebidas de Café

Una cafetería vende café básico al que se le pueden agregar diferentes ingredientes: leche, azúcar, crema, canela. Cada
ingrediente tiene un precio adicional. Se necesita calcular el precio total y obtener la descripción completa de la
bebida.

**Consigna:**
a) Implemente el patrón Decorator para este sistema.
b) Cada decorador debe modificar tanto el precio como la descripción.
c) Escriba un programa que cree un café con leche, azúcar y canela, y muestre el precio total y descripción.
d) Agregue la funcionalidad de aplicar descuentos como otro decorador.

## OBSERVER

### Ejercicio 1 - Sistema de Subastas

En un sistema de subastas online, cuando se realiza una nueva oferta, se debe notificar a todos los participantes
interesados. Los participantes pueden ser: compradores registrados, sistema de auditoría, y servicio de email.

**Consigna:**
a) Diseñe el diagrama de clases usando Observer.
b) Implemente en pseudocódigo el método que notifica una nueva oferta.
c) Escriba un main donde se registren 3 observadores y se realicen 2 ofertas.
d) Agregue un observador `SistemaEstadisticas` que lleve el conteo de ofertas realizadas.

### Ejercicio 2 - Monitoreo de Servidor

Un sistema de monitoreo de servidores debe alertar cuando el uso de CPU supera ciertos umbrales. Los observadores pueden
ser: sistema de alertas por email, dashboard web, y log de eventos.

**Consigna:**
a) Implemente el patrón Observer donde el sujeto sea `MonitorCpu`.
b) Cada observador debe reaccionar de forma diferente al cambio de estado.
c) Agregue la funcionalidad de que los observadores puedan suscribirse solo a ciertos tipos de alerta (crítica,
advertencia, info).
d) Escriba un programa que simule cambios en el uso de CPU y muestre las notificaciones.

## STRATEGY

### Ejercicio 1 - Cálculo de Impuestos

Un sistema de facturación debe calcular impuestos según diferentes regímenes: IVA General (21%), IVA Reducido (10.5%), y
Exento (0%). El cálculo puede cambiar según el tipo de producto y cliente.

**Consigna:**
a) Diseñe el diagrama de clases usando Strategy.
b) Implemente en pseudocódigo las diferentes estrategias de cálculo.
c) Escriba un main que calcule el impuesto de 3 productos con diferentes estrategias.
d) Agregue una estrategia `ImpuestoExportacion` que aplique reglas especiales para productos de exportación.

### Ejercicio 2 - Algoritmos de Búsqueda

Una aplicación necesita buscar elementos en diferentes tipos de estructuras de datos usando distintos algoritmos:
búsqueda lineal, búsqueda binaria, y búsqueda por hash.

**Consigna:**
a) Implemente el patrón Strategy para los algoritmos de búsqueda.
b) Cada estrategia debe retornar la posición del elemento encontrado o -1 si no existe.
c) Agregue métricas de rendimiento (tiempo de ejecución) a cada estrategia.
d) Escriba un programa que compare los tres algoritmos buscando el mismo elemento.

## PROXY

### Ejercicio 1 - Cache de Imágenes

Una aplicación web necesita mostrar imágenes que se cargan desde URLs remotas. Para mejorar el rendimiento, se requiere
implementar un sistema de cache que almacene las imágenes ya descargadas.

**Consigna:**
a) Diseñe el patrón Proxy para implementar el cache de imágenes.
b) El proxy debe verificar si la imagen ya está en cache antes de descargarla.
c) Implemente en pseudocódigo el método `mostrarImagen(String url)`.
d) Agregue funcionalidad de logging que registre cada acceso a imágenes.

### Ejercicio 2 - Control de Acceso a Base de Datos

Un sistema necesita controlar el acceso a operaciones sensibles de base de datos. Solo usuarios con permisos de
administrador pueden realizar operaciones de eliminación.

**Consigna:**
a) Implemente un proxy que controle el acceso a la clase `BaseDatos`.
b) El proxy debe verificar permisos antes de ejecutar operaciones.
c) Las operaciones de lectura son permitidas para todos los usuarios.
d) Escriba un programa que demuestre el control de acceso con diferentes tipos de usuario.
e) Agregue un proxy adicional que registre todas las operaciones realizadas (audit log).