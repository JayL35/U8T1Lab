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

    public static double average(int[][] ints)
    {
        double sum = 0;
        for (int row = 0; row < ints.length; row++)
        {
            for (int col = 0; col < ints[0].length; col++)
            {
                sum += ints[row][col];
            }
        }
        return sum / (double) (ints.length * ints[0].length);
    }

    public static int[] indexFound(String[][] words, String target)
    {
        int[] result = {-1, -1};

        for (int row = 0; row < words.length; row++)
        {
            for (int col = 0; col < words[0].length; col++)
            {
                if (words[row][col].equals(target))
                {
                    result[0] = row;
                    result[1] = col;
                    return result;
                }
            }
        }
        return result;
    }


}
