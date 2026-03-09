class Helper {
  public void handle(Socket socket) {
    // ...
  }
}

final class RequestHandler {
  private final Helper helper = new Helper();
  private final ServerSocket server;
  private final ExecutorService exec;

private RequestHandler(int port, int poolSize) throws IOException{
  server = new ServerSocket(port);
  exec = Executors.newFixedThreadPoo;(poolSize);
}
  public static RequestHandler newInstance(int poolSize) thorws IOException {
    return new RequestHandler(0, poolSize);
  }
  public void handleRequest() {
    Future<?> future = exec.submit(new Runnable() {
      @Override public void run() {
        try {
          helper.handle(server.accept());
        } catch (IOException e) {
          // Foward to handler
        }
      }
    });
  }
}
