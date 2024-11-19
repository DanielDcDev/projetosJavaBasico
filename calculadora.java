import java.util.Scanner;

public class calculadora {
public static Double somar(double n1, double n2){
    double r = 0;
    r = n1 + n2;
    return r;
}
public static Double dividir(double n1, double n2){
    double r = 0;
    r= n1/n2;
    return r;
}
public static Double multiplicar(double n1, double n2){
    double r = 0;
    r = n1*n2;
    return r;
}
public static Double diminuir(double n1, double n2){
    double r = 0;
    r= n1-n2;
    return r;
}

public static void main(String[] args) {
    Double n1, n2 ;
    Scanner  leitor = new Scanner(System.in);

    System.err.println("Digite o seu primeiro numero: ");
    n1 = leitor.nextDouble();
    System.out.println(n1);
    System.err.println("Digite o seu primeiro numero: ");
    n2 = leitor.nextDouble();
    System.out.println(n2);
    
    System.out.println(somar(n1,n2));
    System.out.println(dividir(n1,n2));
    System.out.println(multiplicar(n1,n2));
    System.out.println(diminuir(n1,n2));
}
}
