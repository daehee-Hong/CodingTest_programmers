class Solution {
    public int[] solution(String my_string) {
        return my_string.chars()
                .mapToObj(v -> (char) v)
                .filter(Character::isDigit)
                .mapToInt(v -> Integer.parseInt(String.valueOf(v)))
                .sorted()
                .toArray();
    }
}