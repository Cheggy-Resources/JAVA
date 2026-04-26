package JAVA.01-basics.code-connect.packages;

class second {
    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);
    }
  } 

/*
- If two different public classes are in two different files (obviously) and in same folder, then we dont need to import that. 
- If methods are in different files like shown above then compile both and then java second one. 
- javac Main.java 
  javac Second.java 
  java Second 
  (dono ka compiled bytecode chahiye!!)
*/
