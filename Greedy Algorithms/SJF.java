//Burst time = the time a process takes to execute on CPU
//waiting time = sum of previous burst times
import java.util.*;
public class SJF {
    public static int averageWaitingTime(int[] bt) {
        Arrays.sort(bt);
        int totalwait = 0;
        int currentTime = 0;
        for(int i = 0; i<bt.length;i++) {
            totalwait = totalwait + currentTime;
            currentTime = currentTime + bt[i];
        }
        return totalwait / bt.length;
    }
        public static void main(String[] args) {
        int[] bt = {4, 1, 3, 7, 2};
        System.out.println(averageWaitingTime(bt));
    }
}