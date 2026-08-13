// Last updated: 13/08/2026, 15:48:17
class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29;
        }

        int total = 0;
        for (int i = 0; i < month - 1; i++) {
            total += daysInMonth[i];
        }
        total += day;

        return total;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.dayOfYear("2019-01-09")); 
        System.out.println(sol.dayOfYear("2019-02-10")); 
        System.out.println(sol.dayOfYear("2003-03-01")); 
        System.out.println(sol.dayOfYear("2004-03-01")); 
    }
}
