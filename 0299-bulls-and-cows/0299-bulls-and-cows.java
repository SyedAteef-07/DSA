class Solution {
    public String getHint(String secret, String guess) {
        int x=0;int y=0;
        int sfreq[]=new int[10];
        int gfreq[]=new int[10];
        for(int i=0;i<guess.length();i++){
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            if(c1==c2) x++;
            else{
                sfreq[c1-'0']++;
                gfreq[c2-'0']++;
            }
        }
        for(int i=0;i<10;i++){
            y+=Math.min(sfreq[i],gfreq[i]);
        }
        return x+"A"+y+"B";
    }
}