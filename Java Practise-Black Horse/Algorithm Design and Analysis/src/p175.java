import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.List;

class Graph {
	private int n;
	private List<List<Edge>> adjList;

	Graph(int n) {
		this.n = n;
		adjList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());
		}
	}

	// 添加边
	void addEdge(int from, int to, int weight) {
		adjList.get(from).add(new Edge(to, weight));
	}

	// Dijkstra算法实现单源最短路径
	int[] dijkstra(int source) {
		int[] dist = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source] = 0;

		PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
		pq.add(new Edge(source, 0));

		while (!pq.isEmpty()) {
			Edge current = pq.poll();
			if (dist[current.to] < current.weight) continue;

			for (Edge neighbor : adjList.get(current.to)) {
				int newDist = dist[current.to] + neighbor.weight;
				if (newDist < dist[neighbor.to]) {
					dist[neighbor.to] = newDist;
					pq.add(new Edge(neighbor.to, newDist));
				}
			}
		}
		return dist;
	}

	// 边类，表示图中的边
	static class Edge {
		int to;
		int weight;

		Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
	}
}

public class p175 {
	public static void main(String[] args) {
		// 示例用法
		Graph graph = new Graph(5);
		graph.addEdge(0, 1, 4);
		graph.addEdge(0, 2, 2);
		graph.addEdge(1, 3, 5);
		graph.addEdge(2, 1, 1);
		graph.addEdge(2, 3, 8);
		graph.addEdge(2, 4, 10);
		graph.addEdge(3, 4, 2);

		int[] shortestPaths = graph.dijkstra(0);
		for (int i = 0; i < shortestPaths.length; i++) {
			System.out.println("从0到" + i + "的最短距离是: " + shortestPaths[i]);
		}
	}
}