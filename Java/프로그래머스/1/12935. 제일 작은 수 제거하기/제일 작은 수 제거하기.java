import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int[] answer = new int[arr.length-1];
        int minidx = 0;
        int[] temp = new int[arr.length];
        
        for(int i = 0; i<arr.length; i++){    
            temp[i] = arr[i];
        }

        Arrays.sort(temp);
        
        for (int i=0; i<arr.length; i++) {
            if(temp[0]==arr[i]) {
                minidx = i;
            }                
        }

        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        list.remove(minidx);
        
        for(int i = 0; i<list.size(); i++) {
            answer[i]=list.get(i);
        }
        
        if(arr.length==1) {
            return new int[] {-1};
        }
        
        return answer;
    }
}