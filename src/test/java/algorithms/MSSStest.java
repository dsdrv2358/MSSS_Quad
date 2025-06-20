package algorithms;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import algorithms.MSSS_Quadratic;


class MSSStest {

    public static int[] createArray (int num){
        int[] array = new int[num];
        for (int i = 0; i < num; i++){
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }

        public void starterCodeTest(int num){
            // Warm-up phase to improve time accuracy
            for (int i = 0; i < 10; i++) {
                int[] array1 = createArray(num);
                MSSS_Quadratic.msssQuadratic(array1);
            }
            // Timing phase
            long sum = 0;
            for (int i=0; i<10; i++){
                int[] array1 = createArray(num);
                long startTime = System.nanoTime();
                MSSS_Quadratic.msssQuadratic(array1);
                long duration = System.nanoTime() - startTime;
                sum += duration;
            }
            long avg = sum/10;
            System.out.println(num + " items require a duration of " + avg);
            
        };

    @Test
    public void createChart(){
        starterCodeTest(0);
        starterCodeTest(1);
        starterCodeTest(10);
        starterCodeTest(100);
        starterCodeTest(1000);
        starterCodeTest(10000);
        starterCodeTest(50000);
        starterCodeTest(100000);
    }
}
