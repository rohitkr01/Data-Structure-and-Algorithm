// DFS Traversal of Graph

import java.util.*;
import java.util.Scanner;

public class dfsOfGraph{
    public static void main(String args[]) {
        //your code here
		Scanner sc = new Scanner(System.in);
		// String[] s = sc.next().trim().split(" ");
		// int N = Integer.parseInt(s[0]);
		// int E = Integer.parseInt(s[1]);

		int N = sc.nextInt() , E = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i< N;i++){
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<E;i++){
			// String[] S = sc.next().trim().split(" ");
			// int u = Integer.parseInt(S[0]);
			// int v = Integer.parseInt(S[1]);
			int u = sc.nextInt() , v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		Solution sol = new Solution();
		ArrayList<Integer> ans = sol.dfsTraverse(N, adj);
		for(int val : ans)
			System.out.print(val + " ");
		System.out.println();

        sc.close();
	}
}

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsTraverse(int V, ArrayList<ArrayList<Integer>> adj) {
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
