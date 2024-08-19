import java.util.Scanner;
import java.util.Locale;

public class Main { // nombre de la clase
  
  public static void main(String[] args) { // main de java donde empieza el programa
    Scanner entrada = new Scanner(System.in);
    System.out.println("+-------------------------------------+");
    System.out.println("|   Ingrese el numero del ejercicio   | ");
    System.out.println("+-------------------------------------+");
    System.out.println("+-------------------------------------+");
    System.out.println("|            1. Ejercicio 1           | ");
    System.out.println("|            2. Ejercicio 2           | ");
    System.out.println("|            3. Ejercicio 3           | ");
    System.out.println("|            4. Ejercicio 3           | ");
    System.out.println("|            5. Ejercicio 3           | ");
    System.out.println("|            6. Ejercicio 3           | ");
    System.out.println("|            7. Ejercicio 3           | ");
    System.out.println("|            8. Ejercicio 3           | ");
    System.out.println("|            9. Ejercicio 3           | ");
    System.out.println("|           10. Ejercicio 3           | ");
    System.out.println("|           11. Ejercicio 3           | ");
    System.out.println("|           12. Ejercicio 3           | ");
    System.out.println("|           13. Ejercicio 3           | ");
    System.out.println("|           14. Ejercicio 3           | ");
    System.out.println("+-------------------------------------+");


    
    int opcion = entrada.nextInt();
    switch(opcion){
      case 1: punto1(); break;
      case 2: punto2(); break;
      case 3: punto3escalera(); break;
      case 4: punto4Arriendo(); break;
      case 5: punto5(); break;
      case 6: punto6(); break;
      case 7: punto7(); break;
      case 8: punto8(); break;
      case 9: punto9(); break;
      case 10: punto10(); break;
      case 11: punto11(); break;
      case 12: punto12(); break;
      case 13: punto13(); break;
      case 14: punto14(); break;

    }
    
  }

  public static void punto1() {
    //  scanner que lee las entradas del usuario
    Scanner lectura = new Scanner(System.in);

    System.out.print("Ingrese valor de x: ");
    int x = lectura.nextInt(); // solicita un valor de x y lo guarda en la variable x

    System.out.print("Ingrese valor de y: ");
    int y = lectura.nextInt(); // solicita un valor de y y lo guarda en la variable y

    double resultado = calcular_funcion(x, y); //resultado de la función lo guarda en la variable resultado

    System.out.println("El resultado es: " + resultado); //imprime el resultado
  }

  public static double calcular_funcion(int x, int y) {
    //función matematica que eleva a x al cuadrado y a Y, la suma, la multiplica y Y la eleva al cuadrado
    return Math.pow(x, 2) + 2 * x * y + Math.pow(y, 2);
  }

  public static void punto2(){
    Scanner scanner = new Scanner(System.in);

    // se solicita  número de sillas por bus
    System.out.print("Ingrese el numero de sillas por bus: ");
    int sillasPorBus = scanner.nextInt();

    // se solicita el número de estudiantes gordos
    System.out.print("Ingrese el numero de estudiantes gordos: ");
    int estudiantesGordos = scanner.nextInt();

    // se solicita el número de estudiantes flacos
    System.out.print("Ingrese el numero de estudiantes flacos: ");
    int estudiantesFlacos = scanner.nextInt();

    // aqui se calcula el número de que son necesarios de  buse 
    int busesNecesarios = calculaBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);


    System.out.println("Numero de buses necesarios: " + busesNecesarios);


    scanner.close();
  } 

  public static int calculaBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
      // En el enunciado dice que cada estudiante gordo ocupa 2 sillas y cada estudiante flaco ocupa 1 silla
      int sillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;

      int busesNecesarios = (int) Math.ceil((double) sillasNecesarias / sillasPorBus);

      return busesNecesarios;
  }
  
  public static void punto3escalera() {
    Scanner entrada = new Scanner(System.in);
    // Angulos en grados
    System.out.println("Ingrese el angulo en grados: ");
    double anguloGrados = entrada.nextDouble();
    // cateto opuesto
    System.out.println("Ingrese la altura (x): ");
    double catetoOpuesto = entrada.nextDouble();

    // Convierte el angulo en grados a radianes, ya que java usa radianes
    double anguloRadianes = Math.toRadians(anguloGrados);

    // Calcula el seno del angulo
    double hipotenusaOpuesto = catetoOpuesto / Math.sin(anguloRadianes);

    System.out.println("Hipotenusa : " + hipotenusaOpuesto);
  }

  public static void punto4Arriendo(){
    Scanner scanner = new Scanner(System.in);

    // sueldo de Pedro
    System.out.print("Ingrese el sueldo de Pedro: ");
    double sueldo = scanner.nextDouble();

    // Calcula los gastos en arriendo y comida
    double gastosArriendo = calcularGastoArriendo(sueldo);
    double gastosComida = calcularGastoComida(sueldo);

    // Calcula cuánto dinero le queda a Pedro después de pagar arriendo y comida
    double dineroRestante = sueldo - (gastosArriendo + gastosComida);


    System.out.println("Gasto en arriendo: " + gastosArriendo);
    System.out.println("Gasto en comida: " + gastosComida);
    System.out.println("Dinero restante: " + dineroRestante);

    scanner.close();
  }
  // Función para calcular el gasto en arriendo (40% del sueldo)
  public static double calcularGastoArriendo(double sueldo) {
      return sueldo * 0.40;
  }

  // Función para calcular el gasto en comida (15% del sueldo)
  public static double calcularGastoComida(double sueldo) {
      return sueldo * 0.15;
  }

  public static void punto5(){
    //este escanner pide el Radio Grande (R)
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = entrada.nextDouble();

        //este escanner pide el Radio pequenio (r)
        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequenio = entrada.nextDouble();

        //llama a la funcion calcularAreaCirculo tomando el dato del scanner de radio pequenio (r)
      double arear = CalcularArea(radioPequenio);

      //llama a la funcion calcularAreaCirculo tomando el dato del scanner de radio pequenio (r)
      double areaR = CalcularArea(radioGrande);
      //llama a  radio pequenio (r)
      System.out.println("arear " + arear );
      //llama a  radio Grande (R)
      System.out.println("areaR " + areaR );
      //Resta Radio Grande (R) a  radio pequenio (r)
      System.out.println("Resultado " + (areaR - arear) );
    }
    //Función de calcular area
  public static double CalcularArea(double radio) {
          return Math.PI * Math.pow(radio, 2);
  }

  public static void punto6(){
    Scanner scanner = new Scanner(System.in);

    // Pide al usuario que ingrese las dimensiones de los lados del trapecio
    System.out.print("Ingrese la longitud del lado A (base mayor del trapecio): ");
    double ladoA = scanner.nextDouble();

    System.out.print("Ingrese la longitud del lado B (base menor del trapecio): ");
    double ladoB = scanner.nextDouble();

    System.out.print("Ingrese la longitud del lado C (altura del trapecio): ");
    double ladoC = scanner.nextDouble();

    // Cálculo del área del rectángulo
    double areaRectangulo = areaRectangulo(ladoB, ladoC); 

    // Cálculo del área del triángulo
    double baseTriangulo = ladoA - ladoB; 
    double areaTriangulo = areaTriangulo(baseTriangulo, ladoC); 

    // calcula Área total del terreno
    double areaTotal = areaRectangulo + areaTriangulo;

    // Cálculo del perímetro del terreno (calculamos la hipotenusa)
    double hipotenusa = hipotenusa(ladoC, baseTriangulo);
    double perimetro = perimetroTerreno(ladoA, ladoB, hipotenusa);

    // imprime los resultados
    System.out.println("Área del rectángulo: " + areaRectangulo);
    System.out.println("Área del triángulo: " + areaTriangulo);
    System.out.println("Área total del terreno: " + areaTotal);
    System.out.println("Perímetro del terreno: " + perimetro);

    scanner.close();
  }
  // calcula el área de un rectángulo
  public static double areaRectangulo(double base, double altura) {
      return base * altura;
  }

  //  calcula la hipotenusa del triángulo rectángulo
  public static double hipotenusa(double cateto1, double cateto2) {
      return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
  }

  //calcula el área del triángulo
  public static double areaTriangulo(double base, double altura) {
      return (base * altura) / 2;
  }

  //calcula el perímetro del terreno
  public static double perimetroTerreno(double ladoA, double ladoB, double ladoC) {
      return ladoA + ladoB + ladoC; 
  }

  public static void punto7(){

    Scanner lectura = new Scanner (System.in);

    System.out.println("Ingrese x1:");
    int x1 = lectura.nextInt();

    System.out.println("Ingrese y1:");
    int y1 = lectura.nextInt();

    System.out.println("Ingrese x2:");
    int x2 = lectura.nextInt();

    System.out.println("Ingrese y2:");
    int y2 = lectura.nextInt();


    calculaDistancia(x1, y1, x2, y2);
    calculaPendiente(x1, y1, x2, y2);

    
  }
  public static void calculaDistancia(int x1, int y1, int x2, int y2){
    double d = Math.sqrt (Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
    System.out.println(d);
  }

  public static void calculaPendiente(int x1, int y1, int x2, int y2){
    double m = (y2-y1)/(x2-x1);
    System.out.println(m);
  }

  public static void punto8(){

    Scanner lectura = new Scanner (System.in);

    System.out.println("Ingrese cantidad de estudiantes: ");
    double estudiantes = lectura.nextDouble();    
    
    System.out.println("Ingrese capacidad de cada salon: ");
    double capacidad = lectura.nextDouble();
    
    double salones = calcularSalones(estudiantes,capacidad);

    System.out.println("Ingrese capacidad de salones por cada piso: ");
    double salonesxpiso = lectura.nextDouble();

    double pisos = Math.ceil(salones / salonesxpiso);

    System.out.println("El nuevo edificio entrá este numero de salones: " + salones);

    System.out.println("Y tendrá " + pisos + " pisos");
 
  }

  public static double calcularSalones(double estu, double cap){
    double salones = Math.ceil(estu/cap);
    return salones;
  }

  public static void punto9(){

      Scanner scanner = new Scanner(System.in);

      System.out.print("Ingrese el primer número: ");
      int primerNumero = scanner.nextInt();

      System.out.print("Ingrese el segundo número: ");
      int segundoNumero = scanner.nextInt();

      int  mayor = encontrarMayor(primerNumero, segundoNumero);
      System.out.println("El mayor número es: " + mayor);

      scanner.close();
  }
  public static int encontrarMayor(int num1, int num2) {
    //Si el numero 1 es mayor que el numero 2, retorna el numero 1, si no, retorna el 2
      if (num1 > num2) {
          return num1;
      } else {
          return num2;
      }
  }

  public static void punto10(){
  
    Scanner scanner = new Scanner(System.in);

    // analiza los dos números
    System.out.print("Ingrese el primer numero: ");
    int num1 = scanner.nextInt();

    System.out.print("Ingrese el segundo numero: ");
    int num2 = scanner.nextInt();

    // analiza el operador aritmetico
    System.out.print("Ingrese el operador aritmetico (+, -, *, /, %, **): ");
    String operador = scanner.next();

    // Realiza la operacion y obtiene el resultado
    double resultado = haceOperacion(num1, num2, operador);


    System.out.println("El resultado es: " + resultado);

    
  }
  public static double haceOperacion(int num1, int num2, String operador) {
      double resultado = 0;

      switch (operador) {
          case "+" : resultado = num1 + num2; break;
          case "-" : resultado = num1 - num2; break;
          case "*" : resultado = num1 * num2; break;
          case "/" : {
              // Asegurarse de que no haya division por cero
              if (num2 != 0) {
                  resultado = (double) num1 / num2;
              } else {
                  System.out.println("Error:Division por cero no permitida");
              }
          } break;
          case "%" : resultado = num1 % num2; break;
          case "**" : resultado = Math.pow(num1, num2); break;
          default : System.out.println("Operador no valido"); break;
      }

      return resultado;
  }


  public static void punto11(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese numero: ");
    int numero = scanner.nextInt();
    
   if (numero < 100 && numero > 0){
     //Si el numero es menor que 100 y mayor que 0, entonces es un numero de dos digitos
     int decena = calcularDecenas(numero);
     int unidad = calcularUnidades(numero);
     String unidadLetra = retornarUnidad(unidad);
     String decenasLetra = retornarDecenas(decena);

     System.out.println(  "El " + numero + " en romano es " + decenasLetra +  " " +  unidadLetra);
   } //si es de 3 digitos entonces sale error
    else if (numero >= 100){
     System.out.println("El numero es de 3 digitos, intete con uno de 2 digitos");
    } // si es un numero negativo o 0, entonces sale error
    else if (numero < 0){
      System.out.println("El numero es negativo, intente con uno positivo y de 2 digitos");
    }


    
    scanner.close();
  }

  public static int calcularDecenas(int numero){
    return numero / 10; 
  }

  public static int calcularUnidades(int numero){
    return numero % 10;
  }
 
  public static String retornarUnidad(int numero){
    String unidad = "";

    if(numero == 0){
      unidad = "";
    } 
    else if(numero == 1){
      unidad = "I";
    }
    else if (numero == 2){
      unidad = "II";
    }
    else if (numero == 3){
      unidad = "III";
    }
    else if (numero == 4){
      unidad = "IV";
    }
    else if (numero == 5){
      unidad = "V";
    }
    else if (numero == 6){
      unidad = "VI";
    }
    else if (numero == 7){
      unidad = "VII";
    }
    else if (numero == 8){
      unidad = "VIII";
    }
    else if (numero == 9){
      unidad = "IX";
    }
    
    return unidad;
  } 

  public static String retornarDecenas(int numero){
    String decena = "";

    if(numero == 0){
      decena = "";
    } 
    else if(numero == 1){
      decena = "X";
    }
    else if (numero == 2){
      decena = "XX";
    }
    else if (numero == 3){
      decena = "XXX";
    }
    else if (numero == 4){
      decena = "XL";
    }
    else if (numero == 5){
      decena = "L";
    }
    else if (numero == 6){
      decena = "LX";
    }
    else if (numero == 7){
      decena = "LXX";
    }
    else if (numero == 8){
      decena = "LXXX";
    }
    else if (numero == 9){
      decena = "XC";
    }

    return decena;
  } 

  public static void punto12(){
    java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el nombre de un día de la semana: ");
        String dia = scanner.nextLine();

        String diaSiguiente = obtenerDiaSiguiente(dia);
        System.out.println("El día siguiente es: " + diaSiguiente);

        scanner.close();
    
  }

  public static String obtenerDiaSiguiente(String dia) {
      switch (dia.toLowerCase()) { // Convertir a minúsculas para evitar problemas de mayúsculas/minúsculas
          case "lunes":
              return "martes";
          case "martes":
              return "miércoles";
          case "miércoles":
              return "jueves";
          case "jueves":
              return "viernes";
          case "viernes":
              return "sábado";
          case "sábado":
              return "domingo";
          case "domingo":
              return "lunes";
          default:
              return "Día inválido"; // error si no es un día de la semana
      }
  }

  public static void punto13(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el sueldo actual del empleado: ");
    double sueldoActual = scanner.nextDouble();  


    double aumento = calcularAumento(sueldoActual); // Llamada a la función con el nuevo sueldo
    double nuevoSalario = sueldoActual + aumento;

    System.out.println("El aumento para este empleado es: $" + aumento);
    System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);

    scanner.close();
  }

  public static double calcularAumento(double sueldoActual) {
      double aumento = 0.0;

      if (sueldoActual <= 800000) {
          aumento = sueldoActual * 0.10; // 10% de aumento
      } else if (sueldoActual <= 1200000) {
          aumento = sueldoActual * 0.08; // 8% de aumento
      } else {
          aumento = sueldoActual * 0.05; // 5% de aumento
      }

      return aumento;
  }

  public static void punto14(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre del primer hermano: ");
    String nombre1 = scanner.nextLine();
    System.out.print("Ingrese la edad del primer hermano: ");
    int edad1 = scanner.nextInt();
    scanner.nextLine(); 
     // Consumir el salto de línea para que no identi el print como entrada

    System.out.print("Ingrese el nombre del segundo hermano: ");
    String nombre2 = scanner.nextLine();
    System.out.print("Ingrese la edad del segundo hermano: ");
    int edad2 = scanner.nextInt();
    scanner.nextLine(); 
     // Consumir el salto de línea para que no tome el print como entrada

    System.out.print("Ingrese el nombre del tercer hermano: ");
    String nombre3 = scanner.nextLine();
    System.out.print("Ingrese la edad del tercer hermano: ");
    int edad3 = scanner.nextInt(); 


    String hermanoMayor = encontrarHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

    System.out.println("El hermano mayor es: " + hermanoMayor);

    scanner.close();
  }

  public static String encontrarHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
      String hermanoMayor = nombre1;
      int edadMayor = edad1;

      if (edad2 > edadMayor) {
          hermanoMayor = nombre2;
          edadMayor = edad2;
      }

      if (edad3 > edadMayor) {
          hermanoMayor = nombre3;
      }

      return hermanoMayor;
  }
    
}
