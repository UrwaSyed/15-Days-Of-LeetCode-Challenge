class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for(int i = 0; i< numCourses; i++){
            adj[i] = new ArrayList<>();
        }
        int[] inCount = new int[numCourses];
        for(int[] p : prerequisites){
            int course = p[0];
            int dep = p[1];
            adj[dep].add(course);
            inCount[course]++;

        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(inCount[i] == 0){
                q.add(i);
            }
        }
        int completed = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            completed++;
            for(int nextC : adj[curr]){
                inCount[nextC]--;
                if(inCount[nextC] == 0){
                    q.add(nextC);
                }
            }
        }
        return completed == numCourses;
    }
}