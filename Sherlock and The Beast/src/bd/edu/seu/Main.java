package bd.edu.seu;import java.util.Arrays;import java.util.Scanner;public class Main {    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        int t = input.nextInt();        while(t-->0){            int n = input.nextInt();            int m = n;            while (n%3>0){                n-=5;            }            if(n<0){                System.out.println(-1);            }else{                char [] res= new char[n];                char [] res1 = new char[m-n];                Arrays.fill(res,'5');                Arrays.fill(res1,'3');                Arrays.asList(res).forEach(System.out::print);                Arrays.asList(res1).forEach(System.out::print);            }            System.out.println();        }    }}