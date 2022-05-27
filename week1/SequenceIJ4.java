public class SequenceIJ4 {
    public static void main(String[] args) {

        float i = 0.0f;
        while (i < 2.1) {
            for (int j = 1;j<=3;j++) {
                String str;
                if (((int)((i+j)*10)) % 10 != 0) {
                    str = String.format("I=%.1f J=%.1f", i, j + i).replace(',', '.');
                }
                else {
                    str = String.format("I=%.0f J=%.0f", i, j + i).replace(',', '.');
                }
                System.out.println(str);
            }
            i+=0.2;
        }
    }
}
