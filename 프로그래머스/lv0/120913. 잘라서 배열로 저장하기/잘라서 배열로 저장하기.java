import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> strings = new ArrayList<>();
        int index = 0, from = 0, to = n;

        for (int i = 0; i <= my_str.length() / n; i++) {
            if (!"".equals(my_str.substring(from, to))) strings.add(index, my_str.substring(from, to));
            index++;
            from += n;
            to += n;
            if (to > n * (my_str.length() / n)) to = my_str.length();
        }

        return strings.toArray(new String[0]);
    }
}