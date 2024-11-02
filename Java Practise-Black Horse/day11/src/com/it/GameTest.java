package com.it;

public class GameTest {
  public static void main(String[] args) {
    Role r1 = new Role("榴莲", 100);
    Role r2 = new Role("拳刃", 100);
    while (true) {
      // r1攻击r2
      r1.attack(r2);
      if (r2.getBlood() == 0) {
        System.out.println(r1.getName() + "KO了" + r2.getName());
        break;
      }
      // r2攻击r1
      r2.attack(r1);
      if (r1.getBlood() == 0) {
        System.out.println(r2.getName() + "KO了" + r1.getName());
        break;
      }
    }
  }
}
