class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int as=get(arriveAlice);
        int la=get(leaveAlice);
        int ab=get(arriveBob);
        int lb=get(leaveBob);
        int start=Math.max(as,ab);
        int end=Math.min(la,lb);
        return start>end ? 0:end-start+1;
    }
    private int get(String d){
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(d.substring(0,2));
        int day=Integer.parseInt(d.substring(3,5));
        int total=day;
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        return total;
    }
}