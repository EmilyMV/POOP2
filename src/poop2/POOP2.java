package poop2;

/**
 *
 * @author Mendoza Valdez Emily Isabela
 */

import java.util.Scanner;
public class POOP2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int op;
        do{
            System.out.println("Practica 2");
            System.out.println("1. Suma los numeros pares comprendidos entre n1 y n2. \n");
            System.out.println("2. Calcula el área de una figura geométrica, hasta que seleccione la opción de salir.\n");
            System.out.println("Ingresa el numero del programa que deseas usar: \n");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            if(op==1){
                System.out.println("Por favor introduzca un numero entero: ");
                int n1 = sc.nextInt();
                System.out.println("Introduzca otro numero entero: ");
                int n2 = sc.nextInt();
                sumapares(n1,n2);
            }else if(op==2){
                areas();
            }else{
                System.out.println("Esta opción es invalida");
                return ;
            }
        }while(op ==1 || op ==2);*/
        System.out.println("Hola mundo");
        System.err.println("Hola mundo");
        
        System.out.println("############## if ##############");
        int a;
        a = 15;
        int b = 10;
        if (a<b) {
            System.out.println("a es menor que b");
        } else if (a==b){
            System.out.println("a es igual a b");
        }else{
            System.out.println("a es mayor que b");
        }
        
        System.out.println("############## if ##############");
        if(menor(a,b)){
            System.out.println("metodo menor retorna true");
        }else{
            System.out.println("metodo menor retorna false");
        }
        
        System.out.println("############## Switch ##############");
        int dia = 1;
        switch (dia) {
            case 1: 
                System.out.println("Domingo"); 
                break;
            case 2: System.out.println("Lunes"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Miercoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sabado"); break;
            default:
                System.out.println("Día incorrecto");
        }
        System.out.println("############## Switch ##############");
        char vocal = '9';
        switch (vocal) {
            case 'a': System.out.println("Seleccionó vocal a"); break;
            case 'e': System.out.println("Seleccionó vocal e"); break;
            case 'i': System.out.println("Seleccionó vocal i"); break;
            case 'o': System.out.println("Seleccionó vocal o"); break;
            case 'u': System.out.println("Seleccionó vocal u"); break;
            default:
                System.out.println("No se seleccionó una vocal");
        }
        System.out.println("############## While ##############");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba n="+n);
            n++;
        }
        while (n>0) {
            System.out.println("Contando hacia abajo n="+n);
            n--;
        }
        System.out.println("n="+n);
        
        System.out.println("############## Do-While ##############");
        do {            
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("n="+n);
        
        System.out.println("############## For ##############");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);  
        }
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo " + i);
        }
        System.out.println("############## For ##############");
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
        
        System.out.println("############## For-each ##############");
        for (int i : miArreglo2) {
            System.out.println("Hackeando la nasa "+i+"%");
        }
    }
    
    public static void sumapares(int n1, int n2){
        //Declaración de variables int ni , n2;
        int suma = 0;
        int mayor, menor;
        //Validar cual es el número mayor y el menor
        if (n1 > n2){
            mayor = n1;
            menor = n2;
        }else{
            mayor = n2;
            menor = n1;
        }
        //Hacer un ciclo desde el menor hasta el mayor
        for (int i = menor; i <= mayor; i++){
            //Validar si es par para sumarlo
            if( i % 2 == 0){
                suma += 1;
            }
        }
        //Imprimir el resultado
        System.out.println("La suma de los pares entre " + n1 + " y " + n2 +" es " + suma);
    }
    private static boolean menor(int x, int y) {
        return x<y;
    }
    
    public static void areas(){
        float area;
        int opcion;
        final float PI = 3.14159f;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Elige la opción");
            System.out.println("1.-Area de círculo");
            System.out.println("2.-Area de triángulo");
            System.out.println("3.-Area de cuadrado");
            System.out.println("4.-Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                //Círculo
                    System.out.println("Seleccionó el círculo");
                    float radio = 15;
                    area = PI * radio * radio;
                break;
                case 2:
                //Triangula
                    System.out.println("Seleccionó el triángulo");
                    float base = 8, altura = 5;
                    area = ( base * altura) / 2;
                break;
                case 3:
                    //Cuadrado
                    System.out. println("Seleccionó el cuadrado");
                    float Lado = 10;
                    area = Lado*Lado;
                break;
                case 4:
                //Salin
                    System.out.println("Hasta luego");
                continue;
                default:
                //Ninguno de los anteriores
                    System.out.println("Su elección no es correcta");
                continue;
            }
            System.out.println("El area es: " + area);
        }while (opcion != 4);
    }
}
