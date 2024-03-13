// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj liczbę a:");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println("Podaj liczbę b:");
    int b = scanner.nextInt();
    System.out.println("Podaj liczbę c:");
    int c = scanner.nextInt();

    if(a > b && a > c)
    {
      System.out.println("Największa liczba to a: " + a);
    }
    else if(b>a && b>c)
    {
      System.out.println("Największa liczba to b: " + b);
    }
    else if(c>a && c>b)
    {
      System.out.println("Największa liczba to c: " + c);
      
    }
  }
 
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}