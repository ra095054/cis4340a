BigInteger x = new BigInteger("530500452766");
string s = x.toString(); // Valid character data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray);
x = new BigInteger(ns);
