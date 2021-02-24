package exercise4.utils;

import exercise4.pack1.*;

public class ConvertTool {
    private static final float minGrade = 2f;

    public static float NormalToFour(float d) {
        float diem = d;
        if (8.5 <= d && d <= 10)
            diem = 4f;
        else if (8 <= d && d <= 8.4)
            diem = 3.5f;
        else if (7 <= d && d <= 7.9)
            diem = 3f;
        else if (6.5 <= d && d <= 6.9)
            diem = 2.5f;
        else if (5.5 <= d && d <= 6.4)
            diem = 2f;
        else if (5 <= d && d <= 5.4)
            diem = 1.5f;
        else if (4 <= d && d <= 4.9)
            diem = 1f;
        else if (0 <= d && d <= 3.9)
            diem = 0;
        return diem;
    }

    public static String FourToABCDF(float d) {
        String diem = NormalToFour(d) + "";
        switch (diem) {
            case "4.0":
                diem = "A";
                break;
            case "3.5":
                diem = "B+";
                break;
            case "3.0":
                diem = "B";
                break;
            case "2.5":
                diem = "C+";
                break;
            case "2.0":
                diem = "C";
                break;
            case "1.5":
                diem = "D+";
                break;
            case "1.0":
                diem = "D";
                break;
            case "0.0":
                diem = "F";
                break;
        }
        return diem;
    }

    public static boolean Grade(Subject subs[]) {
        int ttc = 0;
        for (int i = 0; i < subs.length; ++i) {
            ttc += subs[i].getTinchi();
        }
        float td = 0f;
        float d = 0f;
        for (int i = 0; i < subs.length; ++i) {
            d = subs[i].getDiem() * subs[i].getTinchi();
            td += d;
        }
        float tb = td / ttc;
        if (tb < minGrade) {
            return false;
        }
        return true;
    }
}
