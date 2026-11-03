// Name: ____________________   Roll No: ____________
// Assignment 15: Subsets and Arrangements
// Task 2: All arrangements of a, b, c


public class Main {
    static void permute(char[] letters, boolean[] used, char[] cur, int pos) {
        if (pos == letters.length) {
            System.out.println(new String(cur));
            return;
        }
        for (int k = 0; k < letters.length; k++) {
            if (!used[k]) {
                used[k] = true;
                cur[pos] = letters[k];
                permute(letters, used, cur, pos + 1);
                used[k] = false;     // undo
            }
        }
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c'};
        permute(letters, new boolean[letters.length], new char[letters.length], 0);
    }
}
