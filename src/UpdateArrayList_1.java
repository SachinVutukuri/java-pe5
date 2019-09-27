import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArrayList_1 {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        while(n>0){
            al.add(sc.next());
            n--;
        }
        System.out.print("Enter element to update:");
        String s=sc.next();
        System.out.print("Enter element to replace:");
        String rep=sc.next();
        al.set(al.indexOf(s),rep);
        System.out.println("Updated elements:"+al);
        al.clear();
        System.out.print("Array list after removing all elements:"+al);
    }
}
