class Cookie {
  private int noOfCookies;
  private int bakeTemp;
  private int bakeTime;
  private boolean isBaked;

  Cookie() {
    noOfCookies = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isBaked = false;
  }

  Cookie(int aNoOfCookies, int aBakeTemp, int aBakeTime, boolean aIsBaked) {
    noOfCookies = aNoOfCookies;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isBaked = aIsBaked;
  }

  boolean getIsBaked() {
    return isBaked;
  }

  void setNoOfCookies(int aNoOfCookies) {
    noOfCookies = aNoOfCookies;
  }

  void print(int bakeTemp, int bakeTime) {
    System.out.println(noOfCookies + "cookies were baked at " + bakeTemp + " degrees F for " + bakeTime + " minutes");
    isBaked = true;
  }
}