package test.it;

import java.util.Scanner;

public class 大小写转换 {
  Scanner sc = new Scanner(System.in);
  int money;
  while(true){
      System.out.println("请输入一个金额");
        money = sc.nextInt();
      if(money>=0&&money<=9999999){
          break;
      }else{
          System.out.println("金额无效");
      }
    }
  String[] arr={"壹","贰","叁","肆","伍","陆","柒","捌","玖",};
}
