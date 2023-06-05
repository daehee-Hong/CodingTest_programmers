class Solution {
    public String solution(String polynomial) {
        int xCount = 0;
        int num = 0;
        String x = "";
        for (String s : polynomial.split(" ")) {
            if (s.contains("x")){
                xCount +=  s.equals("x") ? 1 : Integer.parseInt(s.replace("x", ""));
            }else if (!s.equals("+")){
                num += Integer.parseInt(s);
            }
        }

        x = xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "";

        return x + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }
}