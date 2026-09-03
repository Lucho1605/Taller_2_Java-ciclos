# Taller 2: Estructuras Repetitivas 

## 1. Información 

* **Nombre completo:** Luis Alejandro Acuña Aldana 
* **Programa académico:** Tecnología en desarrollo de software 
* **Fecha de entrega:** 4/septiembre/2026

---

## 2. Detalle de la Actividad

En este taller se implementaron programas en Java utilizando estructuras de control repetitivas (`for`, `while`, `do-while`), organizados por niveles de complejidad.

### Nivel Inicial

#### Ejercicio 1
* **Area de una circunferencia:**
  > Solicitar por teclado el radio de un círculo, guardarlo en un double, y calcular el área del círculo (el
area de un circulo es 2*PI*radio). Escribir luego el área por consola. Comprobar que sale con
decimales, si es que se da el caso.
* **Explicación del código:**
  El programa solicita al usuario el radio de una circunferencia para calcular y mostrar el área en consola mediante una estructura secuencial directa.
  
  * **Variables utilizadas:**
    * `sc` (`Scanner`): Objeto para capturar la entrada de datos por teclado.
    * `pi` (`double`): Almacena la constante aproximada de $\pi$ ($3.14$).
    * `ra` (`double`): Almacena el valor del radio ingresado por el usuario.
    * `are` (`double`): Almacena el resultado del cálculo del área.
  * **Estructura de control:** Se implementó una **estructura secuencial** (no requiere ciclos `for`, `while` o `do-while`), ejecutando la fórmula indicada en el enunciado de manera directa.
  * *Nota adicional:* Se mantuvo la fórmula indicada en la guía ($2 \cdot \pi \cdot r$), respetando la instrucción original a pesar de que la fórmula matemática estándar del área es $\pi \cdot r^2$.

* **Código fuente:**
 El código desarrollado para el ejercicio es el siguiente:

  <details>
<summary><b>Ver código fuente</b></summary>

```java
import java.util.Scanner;

/**
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_1_NIVEL_INICIAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double pi, ra, are;
        pi = 3.14;
        
        System.out.println("Sistema para calcular el area de un circulo...");
        System.out.println("porfavor digite el radio de la circunferencia: ");
        ra = sc.nextDouble();
        
        are = 2 * pi * ra;
        System.out.println("el area de el circulo, deacuerdo a el radio introducido es: " + are);
    }
}
```
#### Ejercicio 2
* **Buenos dias, buenas tardes, buenas noches:**
  > Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o
buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
* **Explicación del código:**
  El programa solicita al usuario la hora actual (en formato de 24 horas) para determinar y mostrar el saludo correspondiente ("buenos días", "buenas tardes" o "buenas noches") mediante condicionales anidados.
  
  * **Variables utilizadas:**
    * `sc` (`Scanner`): Objeto para capturar la entrada de datos por teclado.
    * `hor` (`int`): Variable entera que almacena la hora ingresada por el usuario.
  * **Estructura de control:** Se implementó una **estructura condicional** (`if - else if`), evaluando rangos de horas para definir el saludo adecuado sin requerir estructuras de ciclos (`for`, `while` o `do-while`).

* **Código fuente:**
 El código desarrollado para el ejercicio es el siguiente:

    <details>
<summary><b>Ver código fuente</b></summary>

```java
import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_2_NIVEL_INICIAL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hor; 
        System.out.println("que horas son? ");
        hor = sc.nextInt();
        if (hor>5 && hor<13){
            System.out.println("buenos dias!!");
    }
        else if (hor>12 && hor<21){
            System.out.println("buenas tardes!!");
}
        else if (hor>20){
            System.out.println("buenas noches!!");
    }
        else if (hor<6){
            System.out.println("buenas noches!!");
}
}
}
```
---

### Nivel Medio

#### Ejercicio 3
* **Media:**
  >  Programa que pide por teclado 5 números, y en el caso en el que el primero introducido sea igual al
último, nos muestra la media de ambos. En caso contrario, no se mostrará nada.

* **Explicación del código:**
  El programa solicita al usuario que ingrese 5 números uno a uno. Guarda el primer y el último número ingresado para compararlos y, en caso de ser iguales, calcula y muestra la media entre ambos.

  * **Variables utilizadas:**
    * `sc` (`Scanner`): Objeto para capturar la entrada de números por teclado.
    * `pri` (`double`): Almacena el primer número ingresado en la iteración 1.
    * `ult` (`double`): Almacena el último número ingresado en la iteración 5.
    * `act` (`double`): Variable temporal que captura el número ingresado en cada iteración.
    * `cic` (`int`): Variable de control del ciclo que actúa como contador de iteraciones.
    * `media` (`double`): Almacena el resultado del promedio entre el primer y último número.
  * **Estructura de control:** Se implementó un **ciclo `for`** para repetir 5 veces la lectura de datos, junto con **estructuras condicionales** (`if`) dentro y fuera del ciclo para detectar la primera y última iteración, evaluar si los valores son iguales y realizar el cálculo correspondiente.

* **Código fuente:**
El código desarrollado para el ejercicio es el siguiente:

   <details>
<summary><b>Ver código fuente</b></summary>

```java
import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
    public class ejercicio_3_NIVEL_MEDIO {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in); 
            double pri=0;
            double ult=0;
            System.out.println("por favor introduce 5 numeros: ");
             for (int cic  = 1; cic <= 5; cic++) {
                System.out.print("Número " + cic + ": ");
                double act = sc.nextDouble();

             if (cic == 1){
                 pri=act;
        }
             if  (cic==5) {
                 ult=act;
    }
    }
             if (pri==ult){
             System.out.println("el primer numero que digitó y el ultimo son iguales...");
             double media;
             media=(pri+ult)/2;
             System.out.println("la media de entre el primer y ultimo numero es: "+media);
        }
    }
        
    }
```
  
#### Ejercicio 4
* **Potencias:**
  > Escribir un programa que pida una base y un exponente (ambos números son enteros positivos) y que
calcule la potencia. Ejemplo, si se indica 3 y 4, nos da 81 de solución (3 elevado a 4, es 3*3*3*3).
* **Explicación del código:**
  El programa solicita al usuario el valor de una base y un exponente para calcular la potencia matemática correspondiente utilizando la librería estándar de Java.
  
  * **Variables utilizadas:**
    * `sc` (`Scanner`): Objeto para capturar la entrada de datos por teclado.
    * `bas` (`double`): Almacena la base ingresada por el usuario.
    * `exp` (`double`): Almacena el exponente ingresado por el usuario.
    * `sol` (`double`): Almacena el resultado de elevar la base al exponente.
  * **Estructura de control:** Se utilizó una **estructura secuencial** directa que delega el cálculo matemático al método `Math.pow(bas, exp)` de Java, sin requerir ciclos (`for`, `while` o `do-while`).

* **Código fuente:**
El código desarrollado para el ejercicio es el siguiente:

    <details>
<summary><b>Ver código fuente</b></summary>

```java
import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_4_NIVEL_MEDIO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        double bas,exp; 
        System.out.println("digite la base: ");
        bas=sc.nextInt();
        System.out.println("digite el exponente: ");
        exp=sc.nextInt();
        double sol; 
        sol=Math.pow(bas, exp);
        System.out.println("el resultado es: "+sol);
    }
}
```
  
#### Ejercicio 5
* **Meses del año:**
  > Hacer un programa que pide un número al usuario, y escribe en pantalla el mes correspondiente a tal
número (si el usuario introduce 2, el programa escribe “Febrero”). Si el numero no es válido, lo indica
igualmente. Tras ello, se le pregunta al usuario si quiere repetir, y si dice “si”, se vuelve a repetir el
proceso anterior
* **Explicación del código:**
  El programa solicita un número del 1 al 12 para mostrar el mes correspondiente del año. Incluye la opción de repetir la consulta tantas veces como el usuario lo desee mediante un menú interactivo.
  
  * **Variables utilizadas:**
    * `sc` (`Scanner`): Objeto para capturar la entrada de datos por teclado.
    * `num` (`int`): Almacena el número de mes ingresado por el usuario.
    * `res` (`char`): Almacena el primer carácter de la respuesta del usuario (`'s'` para continuar o cualquier otro para salir).
  * **Estructura de control:** Se implementó un **ciclo `do-while`** para garantizar que el programa se ejecute al menos una vez y continúe repitiéndose mientras el usuario responda con la letra 's'. Dentro del ciclo se emplean **estructuras condicionales** (`if` y `else if`) para validar e imprimir el mes o indicar un número inválido.

* **Código fuente:**
El código desarrollado para el ejercicio es el siguiente:

    <details>
<summary><b>Ver código fuente</b></summary>

```java
import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_5_NIVEL_MEDIO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int num;
        char res;
        do{
        System.out.println("digita un numero para saber el mes: ");
        num=sc.nextInt();
        if (num==1){
            System.out.println("es el mes de Enero!!");
        }
        if (num==2){
            System.out.println("es el mes de Febrero!!");
    }
        if (num==3){
            System.out.println("es el mes de Marzo!!");
}
        if (num==4){
            System.out.println("es el mes de Abril!!");
        }
        if (num==5){
            System.out.println("es el mes de Mayo!!");
        }
        if (num==6){
            System.out.println("es el mes de Junio!!");
        }
        if (num==7){
            System.out.println("es el mes de Julio!!");
        }
        if (num==8){
            System.out.println("es el mes de Agosto!!");
        }
        if (num==9){
            System.out.println("es el mes de Septiembre!!");
        }
        if (num==10){
            System.out.println("es el mes de Octubre!!");
        }
        if (num==11){
            System.out.println("es el mes de Noviembre!!");
        }
        if (num==12){
            System.out.println("es el mes de Diciembre!!");
        }
        else if (num>12){
            System.out.println("numero invalido");
    }
            System.out.println("quieres volver a intentarlo? (si o no) ");
        res = sc.next().toLowerCase().charAt(0);
            System.out.println();
            
        } while (res == 's');

        System.out.println("Programa finalizado. ¡Hasta luego!");
}
}
```

  
---

### Nivel Avanzado

#### Ejercicio 6
* **Asteriscos:**
  > Escribir un programa que muestre esto por pantalla:
*****
****
***
**
*
* **Explicación del código:**
  El programa imprime en consola un triángulo invertido formado por asteriscos (`*`), comenzando con 5 asteriscos en la primera fila y reduciendo la cantidad en una unidad por cada fila descendente.
  
  * **Variables utilizadas:**
    * `fil` (`int`): Variable de control para el ciclo externo que gestiona las filas (decrece de 5 a 1).
    * `ast` (`int`): Variable de control para el ciclo interno que controla el número de asteriscos impresos en la fila actual.
  * **Estructura de control:** Se implementaron **ciclos `for` anidados**. El ciclo externo controla la cantidad de filas impresas, mientras que el ciclo interno determina cuántos asteriscos se imprimen horizontalmente antes de realizar un salto de línea (`System.out.println()`).

* **Código fuente:**
El código desarrollado para el ejercicio es el siguiente:

   <details>
<summary><b>Ver código fuente</b></summary>

```java
**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_6_NIVEL_AVANZADO {
    public static void main(String[] args) {
        int fil, ast;
        for ( fil = 5; fil >= 1; fil--) {
            for ( ast = 1; ast <= fil; ast++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
    
```
    

  
#### Ejercicio 7
* **Enunciado:**
  > Escribir un programa que muestre esto por pantalla:
1
121
12321
1234321
* **Explicación del código:**
  El programa imprime una pirámide numéricas simétrica de 4 filas. En cada fila genera una secuencia incremental de números desde 1 hasta el número de la fila actual, seguida de una secuencia decreciente hasta volver al número 1.
  
  * **Variables utilizadas:**
    * `tot` (`int`): Define la cantidad total de filas que tendrá la figura (4 en este caso).
    * `fil` (`int`): Variable de control del ciclo externo que indica el número de fila actual.
    * `j` (`int`): Variable de control reutilizada en los ciclos internos para imprimir los valores numéricos.
  * **Estructura de control:** Se implementaron **ciclos `for` anidados**. El ciclo principal controla el avance de las filas, mientras que dentro de él se ejecutan dos ciclos secuenciales: el primero imprime los números en orden ascendente (de `1` a `fil`) y el segundo los imprime en orden descendente (de `fil - 1` a `1`).

* **Código fuente:**
El código desarrollado para el ejercicio es el siguiente:

   <details>
<summary><b>Ver código fuente</b></summary>

```java
/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_7_NIVEL_AVANZADO {
    public static void main(String[] args) {
        int tot = 4,fil,j; 
        for ( fil = 1; fil <= tot; fil++) {
            for ( j = 1; j <= fil; j++) {
                System.out.print(j);
            }
            for ( j = fil - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```

---

## 3. Evidencias

Capturas de pantalla de la ejecución y prueba de cada programa en la consola o IDE:

### Nivel Inicial
* **Ejercicio 1:**
  <img width="1917" height="1020" alt="Captura de pantalla 2026-09-03 122525" src="https://github.com/user-attachments/assets/18587009-5281-45de-9bbb-ce5008b94061" />


* **Ejercicio 2:**
  <img width="1917" height="1018" alt="Captura de pantalla 2026-09-03 122900" src="https://github.com/user-attachments/assets/709c01dc-54ea-42ae-b24b-c9d73e8b55b1" />


### Nivel Medio
* **Ejercicio 3:**
  <img width="1917" height="1016" alt="Captura de pantalla 2026-09-03 123114" src="https://github.com/user-attachments/assets/6bbda844-8497-4ca5-b6c8-127ef714a51d" />


* **Ejercicio 4:**
  <img width="1917" height="1011" alt="Captura de pantalla 2026-09-03 123152" src="https://github.com/user-attachments/assets/b56a8e25-6a87-4349-ad6b-fa385f617c3c" />


* **Ejercicio 5:**
  <img width="1917" height="1017" alt="Captura de pantalla 2026-09-03 123232" src="https://github.com/user-attachments/assets/05ba5bfd-11a0-4fd6-8ae9-a350e8320b97" />


### Nivel Avanzado
* **Ejercicio 6:**
  <img width="1917" height="1018" alt="Captura de pantalla 2026-09-03 123256" src="https://github.com/user-attachments/assets/27f0b981-6c9b-4f9a-948a-0f4a12e8ce56" />


* **Ejercicio 7:**
  <img width="1917" height="1017" alt="Captura de pantalla 2026-09-03 123340" src="https://github.com/user-attachments/assets/1622d237-3efd-4aae-9c4a-5e77e36244ae" />


---

## 4. Conclusiones

* **Implementación de estructuras de control:** A lo largo de los 7 ejercicios se aplicaron de manera práctica tanto estructuras secuenciales y condicionales (`if - else if`) como estructuras de control repetitivas (`for`, `do-while`), seleccionando en cada problema la opción que mejor se ajustaba al requerimiento planteado.

* **Manejo de flujo de repetición y ciclos anidados:** El desarrollo de los ejercicios de nivel medio y avanzado permitió dominar el uso de ciclos individuales para validación de menús e iteración de datos, así como la construcción de algoritmos más complejos mediante ciclos anidados para la generación de patrones visuales y simetrías numéricas en consola.

* **Lógica algorítmica y criterios del desarrollador:** La actividad fortaleció el análisis crítico sobre las instrucciones planteadas en las guías, permitiendo identificar discrepancias en fórmulas teóricas (como en el Ejercicio 1) y resolver los enunciados garantizando la lógica del código y el cumplimiento estricto de las especificaciones requeridas.
