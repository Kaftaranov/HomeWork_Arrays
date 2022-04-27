public class Main {
    public static void main(String[] args) {
    //Задание 1
    int [] intArr = new int[3]; intArr[0]=1; intArr[1]=2; intArr[2]=3;
    float[] floatArr = {1.57f,7.654f,9.986f};
    char[] charArr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
                      'T','U','V','W','X','Y','Z'};

    //Задание 2
    for (int i=0; i <= intArr.length-1; i++)
        {
            System.out.print(intArr[i]);
            if (i < intArr.length-1) {System.out.print(", ");}
        }
        System.out.println();
        for (int i=0; i <= floatArr.length-1; i++)
        {
            System.out.print(floatArr[i]);
            if (i < floatArr.length-1) {System.out.print(", ");}
        }
        System.out.println();
        for (int i=0; i <= charArr.length-1; i++)
        {
            System.out.print(charArr[i]);
            if (i < charArr.length-1) {System.out.print(", ");}
        }
        System.out.println();
        System.out.println("-----------------------------------------");

    //Задание 3
        for (int i=intArr.length-1; i>-1 ; i--)
        {
            System.out.print(intArr[i]);
            if (i >0) {System.out.print(", ");}
        }
        System.out.println();
        for (int i = floatArr.length-1; i>-1; i--)
        {
            System.out.print(floatArr[i]);
            if (i > 0) {System.out.print(", ");}
        }
        System.out.println();
        for (int i = charArr.length-1; i>-1; i--)
        {
            System.out.print(charArr[i]);
            if (i > 0) {System.out.print(", ");}
        }
        System.out.println();
        System.out.println("-----------------------------------------");
    //Задание 4
    for (int i=0; i<= intArr.length-1; i++)
    {
        if (intArr[i]%2 != 0){intArr[i] += 1;}
        System.out.print(intArr[i]);
        if (i<intArr.length-1) {System.out.print(", ");}
    }
    }
}