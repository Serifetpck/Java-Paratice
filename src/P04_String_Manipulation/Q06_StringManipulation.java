package P04_String_Manipulation;



import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scan =new Scanner(System.in);
        System.out.println("String1 :");
        String str1=scan.nextLine();
        System.out.println("String2 :");
        String str2=scan.nextLine();
        System.out.println("1.yöntem :" +str1+" "+str2);
        System.out.println("2.yöntem :" +str1.concat(" "+str2));

        String str1_0indextensonrasi=str1.substring(1);
        String str2_0indextensonrasi=str2.substring(1);
        System.out.println("manipulationdan sonraki hali :" +str1_0indextensonrasi+ ""+str2_0indextensonrasi);

    }
}