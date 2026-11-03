// Name: ____________________   Roll No: ____________
// Assignment 15: Subsets and Arrangements
// Task 1: All subsets of {1, 2, 3}

import java.util.ArrayList;

public class Main {
    static void subsets(int[] a, int i, ArrayList<Integer> cur) {
        if (i == a.length) {
            StringBuilder sb = new StringBuilder("{");
            for (int k = 0; k < cur.size(); k++) {
                if (k > 0) {
                    sb.append(", ");
                }
                sb.append(cur.get(k));
            }
            sb.append("}");
            System.out.println(sb);
            return;
        }
        subsets(a, i + 1, cur);          // skip
        cur.add(a[i]);                   // include
        subsets(a, i + 1, cur);
        cur.remove(cur.size() - 1);      // undo
    }

    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3}, 0, new ArrayList<Integer>());
    }
}
