public class FunWith2DArrays
{
    public static int totalElements(int[][] ints)
    {
        return ints.length * ints[0].length;
    }

    public static void fourCorners(String[][] strings)
    {
        System.out.println(strings[0][0]);
        System.out.println(strings[0][strings[0].length - 1]);
        System.out.println(strings[strings.length - 1][0]);
        System.out.println(strings[strings.length - 1][strings[0].length - 1]);
    }


}
