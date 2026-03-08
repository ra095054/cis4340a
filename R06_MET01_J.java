public static int getAbsAdd(int x, int y) {
  assert x != Integer.MIN_VALUE;
  assert y != Integer.MIN_VALUE;
  int absX = Math.abs(x);
  int absY = Math.abs(y);
  asser (absX <= Integer.MAX_VALUE - absY);
  return absX + absY;
}
//Usage: getAbsAdd(Intger.MIN_VALUE, 1);
