import java.util.*;

class Solution_1 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        int answer = 0;

        for(int i=0;i<scoville.length;i++){
            minpq.add(scoville[i]);
        }

        while(true){
            if(!minpq.isEmpty()) {
                int f = minpq.poll();
                if (f >= K)
                    break;
                if(!minpq.isEmpty()) {
                    int s = minpq.poll();
                    int num = f + s * 2;
                    minpq.add(num);
                    answer++;
                }
                else{
                    answer = -1;
                    break;
                }
            }
            else{
                answer = -1;
                break;
            }
        }

        return answer;
    }
}