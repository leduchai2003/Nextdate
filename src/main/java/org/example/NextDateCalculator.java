package org.example;
import java.util.Scanner;

public class NextDateCalculator {

    public static boolean isLeapYear(int year) {
        // Kiểm tra năm nhuận
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int[] nextDay(int d, int m, int y) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (isLeapYear(y)) {
            daysInMonth[2] = 29;
        }

        // Tăng ngày
        d++;

        // Nếu ngày vượt quá số ngày trong tháng
        if (d > daysInMonth[m]) {
            d = 1;
            m++;
            if (m > 12) {
                m = 1;
                y++;
            }
        }

        return new int[]{d, m, y};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày (1-31): ");
        int d = scanner.nextInt();

        System.out.print("Nhập tháng (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int y = scanner.nextInt();

        scanner.close();

        int[] nextDate = nextDay(d, m, y);
        int nextD = nextDate[0];
        int nextM = nextDate[1];
        int nextY = nextDate[2];

        System.out.println("Ngày tiếp theo là: " + nextD + "-" + nextM + "-" + nextY);
    }
}
