package test.it;

public class 身份证信息查看 {
	public static void main(String[] args) {
		//定义数组记录身份证号
		String id = "371324166606066666";
		String year = id.substring(6, 10);
		String month = id.substring(10, 12);
		String day = id.substring(12, 14);
		System.out.println("人物信息为:");
		System.out.println("出生年月日:year" + "年" + month + "月" + day + "日");
		char gender = id.charAt(id.length() - 2);
		int num = gender - 48;
		if (num % 2 == 0) {
			System.out.println("性别为:女");
		} else {
			System.out.println("性别为:男");
		}
	}
}
