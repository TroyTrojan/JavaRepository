import java.util.Arrays;

class GraphColoring {
	private int ans = 0;
	private int[] x;
	private boolean[][] A;
	private int n;

	public GraphColoring(int n) {
		this.n = n;
		x = new int[n];
		A = new boolean[n][n];
	}

	// 添加边，用于构建图的邻接矩阵
	public void addEdge(int i, int j) {
		A[i][j] = true;
		A[j][i] = true;
	}

	// 判断顶点i着颜色j是否可行
	private boolean judge(int i, int j) {
		for (int k = 0; k < i; k++) {
			if (A[i][k] && x[k] == j) return false;
		}
		return true;
	}

	// 深度优先搜索，用于找到一种着色方案
	private boolean dfs(int m, int i) {
		if (i == m) return true;
		for (int j = 0; j < m; j++) {
			x[i] = j;
			if (judge(i, j)) {
				if (dfs(m, i + 1)) return true;
				x[i] = -1;
			}
		}
		return false;
	}

	// 求解算法
	public void color(int m) {
		Arrays.fill(x, -1);
		if (dfs(m, 0)) {
			ans++;
		}
		System.out.println("着色方案数: " + ans);
	}
}

public class p139 {
	public static void main(String[] args) {
		// 创建一个有4个顶点的图
		GraphColoring graph = new GraphColoring(4);
		// 添加图的边
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);

		// 调用color方法，假设m为3（3种颜色）
		graph.color(3);
	}
}