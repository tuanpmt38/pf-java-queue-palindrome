public class Test {
    public static void main(String[] args) {

        String str = "abcabcdaxyzkkkkabcd";

        int size = str.length();
        int[] Chater = new int[size];

        for (int i = 0; i < size; i++) {
            Chater[i] = (int) str.charAt(i);
        }

        int[] breakPoints = new int[size];
        int indexPoint = 1;
        for (int i = 0; i < size - 1; i++) {
            if (Chater[i + 1] < Chater[i]) {
                breakPoints[indexPoint] = i + 1;
                indexPoint++;
            }
        }

        String[] arrString = new String[indexPoint];
        for (int i = 0; i < indexPoint; i++) {
            String s;

            int last = indexPoint - 1;
            if (i == last) {
                s = str.substring(breakPoints[i]);
            } else {
                s = str.substring(breakPoints[i], breakPoints[i + 1]);
            }
            arrString[i] = s;
        }

        String maxStr = arrString[0];
        for (int i = 1; i < arrString.length; i++) {
            if (arrString[i].length() > maxStr.length()) {
                maxStr = arrString[i];
            }
        }

        System.out.println("Max str is: " + maxStr);
    }

}
