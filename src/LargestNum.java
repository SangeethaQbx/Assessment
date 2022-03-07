public class LargestNum {

    public static int largestNum(String str,int count) {
        System.out.println("The Input of Largest num: "+str);

        int max = 0, sum = 0;
        int len = str.length();

        int i = 0;
        while (i < len) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                max = Math.max(max, sum);
                sum = 0;
                i = i + 1;
            } else {
                char a = str.charAt(i);
                int b = Character.getNumericValue(a);
                sum = sum * 10 + b;
                i++;
            }
        }
        return max;
    }
    }
//abc123vb567