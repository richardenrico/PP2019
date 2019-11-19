import java.util.Scanner;
class Tp4n2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
    int arr1[][] = new int[i][j], arr2[][] = new int[j][k], arr3[][] = new int[i][k];
    for (int a = 0; a < arr1.length; a++) {
      for (int b = 0; b < arr1.length; b++) {
        arr1[a][b] = sc.nextInt();
      }
    }
    for (int a = 0; a < arr2.length; a++) {
      for (int b = 0; b < arr2.length; b++) {
        arr2[a][b] = sc.nextInt();
      }
    }
    /*for (int a = 0; a < i; a++) {
      for (int b = 0; b < k; b++) {
        //arr3[a][b] = 0;
        for (int c = 0; c < j ; c++) {
        arr3[a][b] += arr1[a][c] * arr2[c][b];
        }
        System.out.print(arr3[a][b] + "\t");
      }
      System.out.println();
    }*/ 
    for (int a = 0; a < i; a++) {
      for (int b = 0; b < k; b++) {
        matrix(a, b, arr3, arr2, arr1, j);
      } 
    }
    for (int a = 0; a < arr3.length; a++) {
      for (int b = 0; b < arr3.length; b++) {
        System.out.print(arr3[a][b] + "\t");
      }
      System.out.println();
    }
    sc.close();
  }
  private static int[][] matrix(int a, int b, int[][] arr3, int[][] arr2, int[][] arr1, int j) {
    for (int c = 0; c < j ; c++) {
      arr3[a][b] += arr1[a][c] * arr2[c][b];
    }
    return arr3;
  }
}
