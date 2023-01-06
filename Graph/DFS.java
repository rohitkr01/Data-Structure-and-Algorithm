//  GeeksforGeeks Q. Link : https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/

//You are given a connected undirected graph. Perform a Depth First Traversal of the graph

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> storedfs = new ArrayList<Integer>();
        boolean[] visited = new boolean[V];
        for(int curr=0 ; curr<V ; curr++){
            if(visited[curr]==false){
                dfsHelp(curr , visited , adj ,storedfs);
            }
        }
        return storedfs;
    }
    
    public void dfsHelp(int curr , boolean[] visited ,ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> storedfs ){
        storedfs.add(curr);
        visited[curr] = true;
        
        ArrayList<Integer> adjOfCurr = adj.get(curr);
        for(int node : adjOfCurr){
            if(visited[node] == false){
                dfsHelp(node , visited , adj , storedfs);
            }
        }
    }
}
