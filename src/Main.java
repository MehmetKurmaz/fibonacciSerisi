import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input,result,number=1;
        String a=" + ",b=" = ";
        System.out.print("Basamak Degerini Giriniz :");
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextInt();

        for (int i=0;i<=input;i++){
            result=i+number;
            System.out.println(i+a+number+b+result);
            number=result;
        }

    }
}