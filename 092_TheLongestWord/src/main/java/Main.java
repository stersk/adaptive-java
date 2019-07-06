import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] words = scanner.nextLine().split(" ");
    String result = "";
    for (int i = 0; i < words.length; i++){
      if (words[i].length() > result.length()){
        result = words[i];
      }
    }

    System.out.println(result);
  }
}