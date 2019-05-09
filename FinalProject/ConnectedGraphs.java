import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class ConnectedGraphs {

     private Map<Integer, List<Integer>> adjacencyList;

 
    public ConnectedGraphs(int v) 
    {
        adjacencyList = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i <= v; i++)
            adjacencyList.put(i, new LinkedList<Integer>());
    }

 
    public void setEdge(int to, int from) 
    {
        if (to > adjacencyList.size() || from > adjacencyList.size())
            System.out.println("The vertices does not exists");

 
        List<Integer> sls = adjacencyList.get(to);
        sls.add(from);
        List<Integer> dls = adjacencyList.get(from);
        dls.add(to);
    }
    public List<Integer> getEdge(int to) 
    {
        if (to > adjacencyList.size()) 
        {
            System.out.println("The vertices does not exists");
            return null;
        }
        return adjacencyList.get(to);
    }

 
    public static void main(String args[]) 
    {
        System.out.println("Enter the number of edges: ");

 
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        try 
        {
            int minV = (int) Math.ceil((1 + Math.sqrt(1 + 8 * e)) / 2);
            int maxV = e + 1;

 
            Random random = new Random();
            int v = Math.abs(random.nextInt(maxV - minV) + minV);
            System.out.println("Random graph has "+v+" vertices");

 
            ConnectedGraphs reg = new ConnectedGraphs(v);
            int count = 1, to, from;
            while (count <= e) 
            {
                to = Math.abs(random.nextInt(v + 1 - 1) + 1);
                from = Math.abs(random.nextInt(v + 1 - 1) + 1);

 
                reg.setEdge(to, from);
                count++;
            }

 
            System.out
                    .println("THe Adjacency List Representation of the random graph is: ");

 
            for (int i = 1; i <= v; i++) 
            {
                System.out.print(i + " -> ");
                List<Integer> edgeList = reg.getEdge(i);
                if (edgeList.size() == 0)
                    System.out.print("null");
                else 
                {
                    for (int j = 1;; j++) 
                    {
                        if (j != edgeList.size())
                            System.out.print(edgeList.get(j - 1) + " -> ");
                        else {
                            System.out.print(edgeList.get(j - 1));
                            break;
                        }
                    }
                }
                System.out.println();
            }
        } 
        catch (Exception E) 
        {
            System.out.println("Something went wrong");
        }
        sc.close();
    }

}

void BFS(int s)
    {

 

        boolean visited[] = new boolean[V];

        // Create a queue for BFS

        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it

        visited[s]=true;

        queue.add(s);

        while (queue.size() != 0)
        {


            s = queue.poll();

            System.out.print(s+" ");

         

            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext())

            {

                int n = i.next();

                if (!visited[n])

                {

                    visited[n] = true;

                    queue.add(n);

                }

            }

        }

    }

void Graph::DFSUtil(int v, bool visited[])

{


    visited[v] = true;

    cout << v << " ";

   

    list<int>::iterator i;

    for (i = adj[v].begin(); i != adj[v].end(); ++i)

        if (!visited[*i])

            DFSUtil(*i, visited);

}



void Graph::DFS(int v)

{

    

    bool *visited = new bool[V];

    for (int i = 0; i < V; i++)

        visited[i] = false;


    DFSUtil(v, visited);

}

