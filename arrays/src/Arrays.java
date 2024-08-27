public class Arrays {
    public static void main(String[] args) {

        int[] meuArray = new int[3];
        meuArray[0] = 5;
        meuArray[1] = 6;
        meuArray[2] = 7;

        meuArray = new int[]{5, 6, 7};
        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        for(int i = 0; i < meuArray.length; i++) {
            System.out.println(meuArray[i]);
        }

        for (int i : meuArray) {
            System.out.println(i);
        }
    }
}