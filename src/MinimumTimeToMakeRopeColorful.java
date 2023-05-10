// https://leetcode.com/problems/minimum-time-to-make-rope-colorful/

public class MinimumTimeToMakeRopeColorful {

    static public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        char previousChar = colors.charAt(0);
        int maxTime = neededTime[0];
        int currentTotalTime = neededTime[0];
        int len = colors.length();
        for (int i = 1; i < len; i++) {
            char c = colors.charAt(i);
            int currentTime = neededTime[i];
            if (c == previousChar) {
                maxTime = Math.max(maxTime, currentTime);
                currentTotalTime += currentTime;
            } else {
                totalTime += currentTotalTime - maxTime;
                previousChar = c;
                maxTime = currentTime;
                currentTotalTime = currentTime;
            }
        }
        totalTime += currentTotalTime - maxTime;
        return totalTime;
    }
}
