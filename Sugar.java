class Sugar extends Cookie {
  private String text;
  private boolean isDecorated;

  Sugar() {
    text = "";
    isDecorated = false;
  }

  Sugar(String aText, boolean aIsDecorated) {
    text = aText;
    isDecorated = aIsDecorated;
  }

  String getText() {
    return text;
  }

  void setText(String aText) {
    text = aText;
  }

  void allowCut(String text, int noOfCookies) {
    System.out.println(noOfCookies + " cookies were cut into " + text);
  }

  void allowDecorate() {
    if (isBaked = true) {
      System.out.println("The cookies were decorated");
    }else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}