package lesson_11;

import java.util.Comparator;

public class ReversIntegers implements Comparator<Integer> {

    // o1 == o2 -> 0 = ĞÀÂÍÛ                    10 == 10  = 0
    // o2 > o1 -> 1 = ÏÎËÎÆÈÒÅËÜÍÀß ÑÓÌÌÀ       10 - 5 = +++++
    // o2 < o1 -> -1 = ÎÒĞÈÖÀÒÅËÜÍÀß ÑÓÌÌÀ      5 - 10 = -----
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
