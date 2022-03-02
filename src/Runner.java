import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
//        String[][] seatingChart = {
//                {"Abby", "Don", "George", "Kim"},
//                {"Brian", "Elenor", "Harry", "Lenny"},
//                {"Cathy", "Fred", "Jill", "Matt"}};
//
////        for (String[] names : studentNames)
////        {
////            System.out.println(Arrays.toString(names));
////        }
//
//        seatingChart[1][2] = "Paul";
////        for (String[] names : studentNames)
////        {
////            System.out.println(Arrays.toString(names));
////        }
//
//        String tempName = seatingChart[0][0];
//        seatingChart[0][0] = seatingChart[2][3];
//        seatingChart[2][3] = tempName;
////        for (String[] names : studentNames)
////        {
////            System.out.println(Arrays.toString(names));
////        }
//
//        String[] tempRow = seatingChart[0];
//        seatingChart[0] = seatingChart[1];
//        seatingChart[1] = tempRow;
//        for (String[] names : seatingChart)
//        {
//            System.out.println(Arrays.toString(names));
//        }

//        int[][] arr1 = new int [2][3];
//        int[][] arr2 = new int [3][2];
//        for (int[] zeros : arr1)
//        {
//            System.out.println(Arrays.toString(zeros));
//        }
//        for (int[] zeros2 : arr2)
//        {
//            System.out.println(Arrays.toString(zeros2));
//        }
//
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//        for (int[] zeros2 : arr1)
//        {
//            System.out.println(Arrays.toString(zeros2));
//        }
//
//        arr2[0][0] = 1;
//        arr2[0][1] = 4;
//        arr2[1][0] = 2;
//        arr2[1][1] = 5;
//        arr2[2][0] = 3;
//        arr2[2][1] = 6;
//        for (int[] zeros4 : arr2)
//        {
//            System.out.println(Arrays.toString(zeros4));
//        }

//        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
//        System.out.println(FunWith2DArrays.totalElements(testArr1));
//        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
//        System.out.println(FunWith2DArrays.totalElements(testArr2));
//        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 8, 10}};
//        System.out.println(FunWith2DArrays.totalElements(testArr3));
//        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
//        System.out.println(FunWith2DArrays.totalElements(testArr4));
//        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
//        System.out.println(FunWith2DArrays.totalElements(testArr5));
//        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
//        System.out.println(FunWith2DArrays.totalElements(testArr6));
//        int[][] testArr7 = {{4}, {7}, {8}, {2}};
//        System.out.println(FunWith2DArrays.totalElements(testArr7));
//        int[][] testArr8 = {{4}};
//        System.out.println(FunWith2DArrays.totalElements(testArr8));
//        int[][] testArr9 = {{}};
//        System.out.println(FunWith2DArrays.totalElements(testArr9));

        String[][] words = {{"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "bow", "low", "mom"}};
        FunWith2DArrays.fourCorners(words);

        String[][] words2 = {{"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}};
        FunWith2DArrays.fourCorners(words2);

        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);

        String[][] words4 = {{"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}};
        FunWith2DArrays.fourCorners(words4);

        String[][] words5 = {{"title"}};
        FunWith2DArrays.fourCorners(words5);

    }
}
