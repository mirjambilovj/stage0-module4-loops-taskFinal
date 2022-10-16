package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int i,j;
        int st = 1;
        int sp = cathetusLength-1;
        for(i=1; i<=cathetusLength; i++)
        {
            for(j=1; j<=sp; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=st; j++)
            {
                System.out.print("*");
            }
            sp--;
            st++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
