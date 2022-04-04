class Solution {
    List<Integer> input;
     int count = 0;
    public int countArrangement(int n) {
        input= new ArrayList<>();
        //result = new ArrayList<>();
        for (int i=1; i<=n; i++){
           input.add(i); 
        }
        helper(input, 0,n);
        return count;
    }
    
    public void helper(List<Integer> input, int start, int size){
        //base
        if(start==size){
            count++;
        }
            for(int i=start; i<size; i++){
                Collections.swap(input, i, start); 
                if(input.get(start)%(start+1) ==0 || (start+1)%input.get(start)==0){
                     helper(input, start+1,size);
                }
                  Collections.swap(input, i, start); 
            }
    }
    
}
//time complexity-O(n!)
//space complexity- O(n)