#### Generic Method
* We can declare type parameter either at class level or at method level.
  * Declaring type parameter at class level
  ```java 
  class Test<T>{
  // we can you T within this class based on our requirement
  }
  ```
  * Declaring type parameter at method level
  ```java 
  class Test{
  public <T>void m1(T ob){
  }
  // we have to declare type parameter jsust before return type 
  }
  ```
  #### Example
  
  * If we send generic object to non generic area then its start behave like non generic object. if we send non generic object to
   generic area then its behaving like generic object. that its is the location in which object persent based on that behaviour will 
   be defined
  
  
  ```java
  class Test{
  
  public static void m1(ArrayList al){
  al.add(10.5);
  al.add(10);
  al.add(true);
  }
  
  public static void main(String args[]){
  ArrayList<String> al  = new ArrayList<String>();
  al.add("rrrr");
  al.add("wwww");
  m1(al);
  
  System.out.println(al);
  
  }
  
  
  }
  
  //[rrrr, wwww, 10.5, 10, true]
  
  ```
  
  The main of purpose of generic is to provide type saftey to resolve type casting problem type saftey and type casting both are 
  applicable at complile time hence generic concept are also applicable only at complietime but not run time. 
  
  
  #### At the time of complilation at the last step generic syntax will be remove and hence for the JVM generic syntax won't be available.
  
  
  
  
  ```java
  class Test{
  
  public static void main(String args[]){
  ArrayList al  = new ArrayList<String>();
  al.add("rrrr");
  al.add("wwww");
  al.add(10);
  al.add(true);
  
  
  System.out.println(al);
  
  }
  }
  //[rrrr, wwww, 10, true]
  
  
  //OR
  
  /*
  ArrayList al  = new ArrayList<String>();
  ArrayList al  = new ArrayList<Integer>();
  ArrayList al  = new ArrayList<Boolean>();
  ArrayList al  = new ArrayList<Double>();
  
  These are equal
 
  ArrayList<String> al  = new ArrayList<String>();
  ArrayList<String> al  = new ArrayList();  
  
  */
  
  //both are equal
  
  ```
  
  #### AT COMPILE TIME
  1. Compile code normally by considering generic
  2. Remove Generic syntax
  3. compile once again resultant code
  
  ```java
  
  class Test {
  
  public void m1(ArrayList<String> al){
  
  }
 
  public void m1(ArrayList<Integer> al){
  
  }
  
  }
  
  
  //Erasure of method m1(ArrayList<Integer>) is the same as another method in type Test
  
  ```
