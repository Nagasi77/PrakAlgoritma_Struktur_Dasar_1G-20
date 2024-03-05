package P3;

import java.util.Arrays;

public class nilaimahasiswa {
    public static double rata2ipk(double[] ipkArray) {
        double total = 0;
        for (double ipk : ipkArray) {
            total += ipk;
        }
        return total / ipkArray.length;
    }
    public static void sorting(double[] ipkArray) {
        int n = ipkArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (ipkArray[j] < ipkArray[j+1]) {

                    double temp = ipkArray[j];
                    ipkArray[j] = ipkArray[j+1];
                    ipkArray[j+1] = temp;
                }
            }
        }
    }
}

