import java.util.Scanner;

public class SubArrayRange {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]=scan.nextInt();

        }
        int start=scan.nextInt();
        int end=scan.nextInt();
        for (int i=start;i<=end;i++){
            System.out.println(array[i]);
        }
    }
}
