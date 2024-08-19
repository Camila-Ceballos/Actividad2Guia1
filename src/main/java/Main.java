import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // punto1();
    // punto2();
    // punto3escalera();
  }

  public static void punto1() {
    // declara un nuevo scanner que lee las entradas del usuario
    Scanner lectura = new Scanner(System.in);

    System.out.print("Ingrese valor de x: ");
    int x = lectura.nextInt(); // pide un valor de x y lo guarda en la variable x

    System.out.print("Ingrese valor de y: ");
    int y = lectura.nextInt(); // pide un valor de y y lo guarda en la variable y

    double resultado = calcular_funcion(x, y);

    System.out.println("El resultado es: " + resultado);
  }

  public static double calcular_funcion(int x, int y) {
    return Math.pow(x, 2) + 2 * x * y + Math.pow(y, 2);
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

}