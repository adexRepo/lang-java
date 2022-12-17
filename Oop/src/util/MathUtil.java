package util;

public class MathUtil {
    
    public static int jumlah(int... values){
        int total = 0;
        for (int i : values) {
            total += i;
        }

        return total;
    }

    // diakses di data.location.country
}
