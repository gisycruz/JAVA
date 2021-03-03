package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* 1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una  variable A
        de tipo double y una variable C de tipo char y asigna a cada una un valor.  A continuación muestra por pantalla:
        El valor de cada variable, la suma de N + A, la  diferencia de A - N, el valor numérico correspondiente
        al carácter que contiene la  variable C. */

        int n= 1;
        double a = 1.8;
        char c = 'g';
        //double suma ;
        System.out.println("valor de variable n :"+n );//1
        System.out.println("valor de variable a: "+a);//1
        System.out.println( "letra variable c:"+c);//1
        //suma = n + a;
        System.out.println("suma de n + a es = "+(n+a));//1
        System.out.println("resta de a - n es = "+(a-n));//1
        System.out.println("valor numerico de c = "+Character.getNumericValue(c));//1
       /* 2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int,
        dos  variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar 
        por pantalla una serie de operaciones entre ellas. */
        int x = 3 ;
        int y = 4;
        double i = 1.6;
        double m = 6.8;
        System.out.println("suma de x + y ="+(x+y));//2
        System.out.println("reta de m - y= "+(m-y));//2
        System.out.println("division de 4 % 3 ="+(x/y));//2
        System.out.println("multiplicacion i * m ="+(i*m));//2
        System.out.println("le sumo uno a x ="+(++x));//2
       /* 3. Programa Java que declare una variable entera N, asignarle un valor. A continuación  escribe las instrucciones
        que realicen lo siguiente: incrementar N en 77, reducir su  valor a 3, duplicar su valor. */
        n=3;
        System.out.println("es resultado de [(" +n+" +77)-3] x 2 es ..................="+(((n+77)-3)* 2));
       /* 4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a  cada una.
        A continuación realiza las instrucciones necesarias para que: B tome el  valor de C, C tome el valor de A,
         A tome el valor de D, D tome el valor de B. */
        int j = 2;//4
        int d = 6;//4
        int k = 8;//4
        int g = 9;//4
        d=k;//4
        k=j;//4
        j=g;//4
        g=d;//4
        System.out.println("el valor de j es ="+j );//4
        System.out.println("el valor de d es ="+d );//4
        System.out.println("el valor de k es ="+k);//4
        System.out.println("el valor de g es ="+g);//4

       /* 5. Programa Java que declare una variable A de tipo entero, asignarle un valor.
        A  continuación mostrar un mensaje indicando si A es par o impar. */
        int r = 11;
        int resultado ;
        resultado = r%2;// % modulo cantidad de numeros despues de la coma
        if (resultado == 0)
            System.out.println("variable r es par ");
        else
            System.out.println("variabre r es impar");
        /*6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A  continuación
        mostrar un mensaje indicando si el valor de B es positivo o negativo. */
        r = -20;
        if(r >= 0)
            System.out.println("la variable r es positiva");
        else
            System.out.println("la variable r es negativa");

        /*7. Programa Java que declare una variable C de tipo entero y asignarle un valor.
        A  continuación mostrar un mensaje indicando si el valor de C es positivo o negativo, 
        si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que  100. */
        r = 55;
        int aux;
        String result = (r >=0) ? "positivo." : "negativo.";
        System.out.println("la variable es................:"+result);

        aux = r%2;
        result=(aux == 0) ? "par." :"impar.";
        System.out.println("la variable es ...............:"+result);

        aux = r%5;
        result = ( aux == 0) ? "multiplo de 5":"no es multiplo de 5";
        System.out.println("la variable es...........:"+result);

        aux = r%10;
        result = ( aux == 0) ? "multiplo de 10":"no es multiplo de 10";
        System.out.println("la variable es...........:"+result);

        result = (r >100) ? "mayor a 100." : "menor a 100.";
        System.out.println("la variable es ..................:"+result);
        /* 8. Programa Java que lea un nombre y muestre por pantalla:   “Buenos días, {NOMBRE}”.*/

        String nombre = "gisela";
        System.out.println("buenos dias "+(nombre));
        /*9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de  ese número
        y lo muestre por pantalla.*/
        x =0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        x = teclado.nextInt();
        System.out.println("el doble del numero ingresado es .....:"+(x*2));
        System.out.println("el triple del numero ingresado es .....:"+(x*3));
        /*  10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados  centígrados. */
        y =0;
        System.out.println("introduzca un entero:");
        y= teclado.nextInt();
        System.out.println("los grados ingresados en f° convertidos a C° es.......:"+((y-32)/1.8000));
       /* 11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y 
        muestra por pantalla la longitud y el área de la circunferencia. */

        r =0;
        System.out.println("introduzca un numero entero ");
        r = teclado.nextInt();
        System.out.println("longitud del radio de la una circunferencia ingresado es ............:"+(2 * Math.PI * r));
        System.out.println("el area de la radio circuferencial ingresado es ..........................:"+(Math.PI * (int) Math.pow(r, 2)));

        /*12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/
        float v =0;
        System.out.println("introduzca velocidad km/h ");
        v = teclado.nextFloat();
        System.out.println("la velocidad k/m pasada a m/s es ................:"+(v*5/18));
        /*13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la  longitud de la hipotenusa
        según el teorema de Pitágoras.*/
        float l1=0;
        float l2=0;
        System.out.println("ingrese la longitud de los catetos");
        l1=teclado.nextFloat();
        l2=teclado.nextFloat();
        System.out.println("la medida de su hipotenusa es ............:"+((int)Math.pow((int)Math.pow(l1,2)+(int)Math.pow(l2,2),2)));

        /* 14. Programa que calcula el volumen de una esfera*/
        l1=0;
        System.out.println("intrdusca radio de la esfera");
        l1=teclado.nextFloat();
        System.out.println("el volumer de la esfera con radio de "  +l1+  " es..................:"+((4/3) * Math.PI * (float)Math.pow(l1,3)));
        /* 15. Programa que calcula el área de un triángulo equilatero a partir de la longitud de sus lados. */
        l2=0;
        System.out.println("ingrese la longitud de los lados del triangulo");
        l2=teclado.nextFloat();
        System.out.println("el area del triangulo es .................: "+(Math.sqrt(3/4)*(int)Math.pow(l2,2)));
        /*16. Programa que lee un número de 3 cifras y muestra sus cifras por separado. */
        int nume3sifras = 567;
        System.out.println("ingrese un numero de 3 cifras");
        nume3sifras = teclado.nextInt();
        System.out.println("primer numero del numero ingresado " +nume3sifras+  "     es........:"+(nume3sifras/100));
        System.out.println("el segundo numero del numero ingresado " +nume3sifras+  "  es................:"+(nume3sifras/10%10));
        System.out.println("el tercer numero del numero ingresado " +nume3sifras+ " es...................:"+(nume3sifras%10));

        /*17. Programa que lea un número entero N de 5 cifras y muestre las cifras que
        ocupan  posiciones impares.  */

        int[] num = new int[5];
        int cont = 0;
        System.out.println("ingrese un entero de 5 cifras");

        for ( cont = 0; cont <= 4 ; cont++) {
            num[cont] = teclado.nextInt();
        }
        for (cont = 0; cont <= 4 ; cont = cont + 2) {
            System.out.println("numero de los pocisiones impares"+num[cont]);
        }
        int nume5sifras ;
        System.out.println("ingrese un numero de 5 cifras");
        nume5sifras = teclado.nextInt();
        System.out.println("numero posicion impar es........:"+(nume5sifras/10000));
        System.out.println("numero de posion impar es................:"+(nume5sifras/100%10));
        System.out.println("numero de posion impar  es...................:"+(nume5sifras%10));

        /*  18.Programa que lea tres números enteros H, M, S que contienen hora, minutos y 
        segundos respectivamente, y comprueba si la hora que indican es una hora válida. */
        System.out.println("ingrese la hora");
        int H=teclado.nextInt();
        System.out.println("ingrese los minutos");
        int M=teclado.nextInt();
        System.out.println("ingrese los segundos");
        int S=teclado.nextInt();
        if (H <=24 &&  M<= 60  &&  S <= 60  )
        {
            System.out.println("hora :" +H+ " minutos: " +M+ " segundos: " +S);
        }
        else
            System.out.println("ERROR");

    }
}