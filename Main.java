public class Main {
    public static void main(String[] args) {
        Main roman = new Main();
        System.out.println(roman.romanToInt("MCMXCIV"));
    }
    public int getArabian(char roman) {
        if('I' == roman) return 1;
        else if('V' == roman) return 5;
        else if('X' == roman) return 10;
        else if('L' == roman) return  50;
        else if('C' == roman) return 100;
        else if('D' == roman) return 500;
        else if('M' == roman) return 1000;
        return 0;
    }
    public int romanToInt(String chr) {
        int end = chr.length() - 1;
        char[] array = chr.toCharArray();
        int arabian;
        int result = getArabian(array[end]);
        for(int i = end - 1; i >=0; i--) {
            arabian = getArabian(array[i]);
            if (arabian < getArabian(array[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }
        }
        return result;
    }
}
