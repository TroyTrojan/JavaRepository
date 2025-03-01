import java.util.ArrayList;
import java.util.List;

public class p150 {
	public static void main(String[] args) {
		int[] weights = {2, 3, 4, 5}; // 物品重量
		int[] values = {3, 4, 5, 6}; // 物品价值
		int capacity = 8; // 背包容量

		// 调用背包函数并获取结果
		int maxValue = knapsack(weights, values, capacity);
		System.out.println("背包能装的最大价值为: " + maxValue);
	}

	public static int knapsack(int[] weights, int[] values, int capacity) {
		int n = weights.length;
		int[][] dp = new int[n + 1][capacity + 1];

		// 动态规划计算最大价值
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= capacity; j++) {
				if (weights[i - 1] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		// 回溯选择的物品
		List<Integer> selectedItems = new ArrayList<>();
		int w = capacity;
		for (int i = n; i > 0 && w > 0; i--) {
			if (dp[i][w] != dp[i - 1][w]) {
				selectedItems.add(i - 1);
				w -= weights[i - 1];
			}
		}

		// 输出选择的物品
		System.out.print("选择的物品编号为: ");
		for (int item : selectedItems) {
			System.out.print(item + " ");
		}
		System.out.println();

		return dp[n][capacity];
	}
}