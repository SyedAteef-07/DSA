class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> ans=new HashSet<>();
        for(int x:arr){
            if(ans.contains(2*x)||(x%2==0 && ans.contains(x/2))){
                return true;
            }
            ans.add(x);
        }
        return false;
    }
}