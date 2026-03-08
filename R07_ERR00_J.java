class Foo implements Runnable {
  public void run() {
    try{
      Thread.sleep(1000);
    } catch(InterruptedException e) {
      // Ignore
    }
  }
}
