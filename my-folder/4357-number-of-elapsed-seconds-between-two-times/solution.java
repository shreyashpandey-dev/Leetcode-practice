class Solution {
    int cToS(String t)
    {
        int h=Integer.parseInt(t.substring(0,2));
        int m=Integer.parseInt(t.substring(3,5));
        int s=Integer.parseInt(t.substring(6,8));
        return 3600*h+m*60+s;
    }
    public int secondsBetweenTimes(String startTime, String endTime) {
        int st=cToS(startTime);
        int end=cToS(endTime);
        return end-st;
        
    }
}
