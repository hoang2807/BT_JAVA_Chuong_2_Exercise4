import java.util.Scanner;

import exercise4.pack1.*;
import exercise4.utils.*;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so mon: ");
        int n = scanner.nextInt();
        Subject[] subs = new Subject[n];
        int tinchi = 0;
        float diem = 0f;
        for (int i = 0; i < subs.length; ++i) {
            System.out.println("Nhap tin chi: ");
            tinchi = scanner.nextInt();
            System.out.println("Nhap diem: ");
            diem = scanner.nextFloat();
            subs[i] = new Subject(tinchi, diem);
        }
        System.out.println();
        for (int i = 0; i < subs.length; ++i) {
            System.out.println("Mon hoc thu " + (i + 1) + ":");
            System.out.println(ConvertTool.NormalToFour(subs[i].getDiem()));
            System.out.println(ConvertTool.FourToABCDF(subs[i].getDiem()));
        }
        boolean c = ConvertTool.Grade(subs);
        if (c == true)
            System.out.println("Du dieu kien ra truong");
        else
            System.out.println("Khong du dieu kien ra truong");
    }
}
