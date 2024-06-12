import java.util.Scanner;

// 14. Napisz program, który losuje liczbę całkowitą od 0 do 100 i pozwala użytkownikowi zgadywać, aż poda poprawną wartość

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int) (Math.random() * 100);
    int liczba;
    do {
      System.out.print("Podaj liczbę: ");
      liczba = scanner.nextInt();
      if (liczba < randomNumber) {
        System.out.println("Za mało!");
      } else if (liczba > randomNumber) {
        System.out.println("Za dużo!");
      }
    } while (liczba != randomNumber);
    System.out.println("Brawo! Zgadłeś!");
  }
}  
      
