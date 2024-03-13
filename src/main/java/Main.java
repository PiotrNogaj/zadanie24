// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.util.Random;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int choice = 2;
    int suma = 0;
    int number = 0;

    while (choice !=4)
      {
        System.out.println("Podaj co chcesz zrobić\n1. Dodawanie\n2. Odejmowanie\n3. Mnożenie\n4. Dzielenie\n5.Wyjście");
        choice = scanner.nextInt();
    
    switch (choice)
      {
        case 1:
          number = scanner.nextInt();
          suma = suma + number;
          System.out.println("suma: " + suma);
          break;

        case 2:
          number = scanner.nextInt();
          suma = suma - number;
          System.out.println("suma: " + suma);
          break;

        case 3:
          number = scanner.nextInt();
          suma = suma * number;
          System.out.println("suma: " + suma);
          break;

        case 4: 
          number = scanner.nextInt();
          suma = suma / number;
          System.out.println("suma: " + suma);
          break;

        case 5:
          System.out.println("Wyjście");
          break;
          
          
          
      }
      }
  }
  
}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
