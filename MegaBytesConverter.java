import java.util.*;
public class MegaBytesConverter {

    public static void printMegaBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabytes = (kiloBytes/1024);
            int kiloRemainder = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int kiloBytes=sc.nextInt();
        printMegaBytes(kiloBytes);
    }    
}