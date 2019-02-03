package tugas1;

import java.util.Scanner;

public class HitungLuas {
	public static void LuasPersegiPanjang() {
        int panjang;
        int lebar;
        int luas;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang(cm) : ");
        panjang = input.nextInt();

        System.out.print("Masukan Lebar(cm)   : ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi dengan Panjang " + panjang + " 
cm dan lebar " + lebar + " cm = " + luas + " cm");
        System.out.println("");
    }

public static void main(String[] args) {
        System.out.println("Program menghitung luas persegi panjang dan 
luas lingkaran");
        System.out.println("");

        System.out.println("Menghitung Luas Persegi Panjang!");
        LuasPersegiPanjang();

}
