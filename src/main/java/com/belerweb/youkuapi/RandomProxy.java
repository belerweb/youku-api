package com.belerweb.youkuapi;

public class RandomProxy {
  public String cgStr = "";
  private double randomSeed;

  public RandomProxy(int randomSeed) {
    this.randomSeed = randomSeed;
    cgHun();
  }

  public String cgHun(String streamfileid) {
    String[] temps = streamfileid.split("\\*");
    String result = "";
    for (int i = 0; i < temps.length; i++) {
      result = result + cgStr.charAt(Integer.parseInt(temps[i]));
    }
    return result;
  }

  private void cgHun() {
    String oString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ/\\:._-1234567890";
    int size = oString.length();
    for (int i = 0; i < size; i++) {
      int temp = (int) (ran() * oString.length());
      char tempChar = oString.charAt(temp);
      cgStr = cgStr + tempChar;
      int charIndex = oString.indexOf(tempChar);
      oString = oString.substring(0, charIndex) + oString.substring(charIndex + 1);
    }
  }

  private double ran() {
    randomSeed = (randomSeed * 211 + 30031) % 65536;
    return randomSeed / 65536;
  }
}
