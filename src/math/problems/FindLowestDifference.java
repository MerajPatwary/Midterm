package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        // Calculate size of Both arrays
        int m = array1.length;
        int n = array2.length;

        // Call function to
        // print smallest result
        System.out.println(findSmallestDifference
                (array1, array2, m, n));



    } int N = 100, i, j, min;
        System.out.println("Value of N: " + N);

        for (i = 1; i <= N; i++)
    {
        for (j = 1; j <= N; j++)
        {
            min = i < j ? i : j;
            System.out.print(N - min + 1);
        }
        System.out.println();
    }

}






