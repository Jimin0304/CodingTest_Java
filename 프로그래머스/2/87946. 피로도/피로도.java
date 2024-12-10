import java.util.*;
import java.util.stream.*;
class Solution {    // 다시 풀기

    class State{
        public int k;
        public int cnt;
        public boolean[] visited;
        State(int k,int cnt,boolean[] visited){
             this.k=k;
             this.cnt=cnt;
             this.visited=visited;
        }

    }

    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        Queue<State> que=new LinkedList<>();
        boolean[] visited=new boolean[dungeons.length];
        //k 피로도 cnt 클리어던전개수, visited
        int cnt=0;
        que.add(new State(k,cnt,visited));

        while(!que.isEmpty()){

            State st= que.poll();
            answer=Math.max(answer,st.cnt);


            for(int i=0;i<dungeons.length;i++){
                boolean[] tempV=Arrays.copyOf(st.visited,dungeons.length);
                if(tempV[i]!=true && st.k>=dungeons[i][0]){
                    tempV[i]=true;

                    que.add(new State(st.k-dungeons[i][1],st.cnt+1,tempV.clone()));



                }
            }
        }


        return answer;
    }
}   
