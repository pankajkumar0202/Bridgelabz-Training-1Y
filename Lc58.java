import java.util.Scanner;
class Lc58{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          String [] arr  = s.split(" ");
          String lw = arr[arr.length-1];
          System.out.println(lw.length());
        }
    }