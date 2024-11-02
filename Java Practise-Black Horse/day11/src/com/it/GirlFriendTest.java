package com.it;

public class GirlFriendTest {
  public static void main(String[] args) {
    GirlFriend g = new GirlFriend();
    g.setName("女朋友");
    g.setAge(18);
    System.out.println(g.getName());
    System.out.println(g.getAge());
    g.accompany();
  }
}
