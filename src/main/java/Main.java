// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.util.Random;
public class Main 
{
  public static int generateRandomNumber(int min, int max)
  {
    Random random = new Random();
    return random.nextInt(max - min + 1) + min;
  }
  public static void main(String[] args)
  {
    int randomNumber1 = generateRandomNumber(0,100);
    int randomNumber2 = generateRandomNumber(0,100);
    int randomNumber3 = generateRandomNumber(0,100);
    int randomNumber4 = generateRandomNumber(0,100);
    int randomNumber5 = generateRandomNumber(0,100);
    
    int suma = 0;

    
    suma = randomNumber1^2 + randomNumber2^ + randomNumber3^2 + randomNumber4^2+ randomNumber5^2;
    System.out.println(suma);
  }
  
}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
