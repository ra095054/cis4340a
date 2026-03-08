class Foo implements Runnable {
  public void run() {
    try{
      Thread.sleep(1000);
    } catch(InterruptedException e) {
      Thread.currentThread().interrupt(); //Reset interrupted status
    }
  }
}
