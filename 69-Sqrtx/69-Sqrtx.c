// Last updated: 13/08/2026, 15:54:56
int mySqrt(int x) {
    if (x < 2)
        return x;

    long left = 1, right = x / 2;

    while (left <= right) {
        long mid = left + (right - left) / 2;
        long square = mid * mid;

        if (square == x)
            return mid;
        else if (square < x)
            left = mid + 1;
        else
            right = mid - 1;
    }

    return right;
}