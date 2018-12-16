#### Generic Method 

* m1(ArrayList < String > al) 
  * We can call this method by passing Arraylist of only String type 
  * But within the method we can add only string type of object to the list by mistake if we are trying to any other type then 
     we will get complie time error.
     
```java
  m1(ArrayList < String > al) 
  {
  al.add("sss");
  al.add("mmm");
  al.add(null);
  al.add(10); //Compile Time Error
  }
```



* m1(ArrayList<?> l)
  * We can call this method by passing Arraylist of any type  
  * But within the method we can't add anything to the list except null because we don't know the type exactly.
  * null is allowed because it is valid value for any type.
  * This type of method are best suitable for read only operation.
  
  
 ```java
 
  m1(ArrayList < ? > al) 
  {
  al.add("sss"); //Compile Time Error
  al.add("mmm"); //Compile Time Error
  al.add(null);
  al.add(10);    //Compile Time Error
  }
``` 
* m1(ArrayList<? extend X> l)
  * X can be either class or an interface
  * if X is class then we can call this method by passing arraylist of  either x type or its child classes
  * if X is an interface then we can call this method by passing arraylist of either X type or its implementation classes
  * But within the method we can't add anything to the list except null because we don't know the type exactly.
  * This type of method are best suitable for read only operation.

* m1(ArrayList<? super X> l)
  * X can be either class or an interface
  * if X is class then we can call this method by passing arraylist of  either X type or its super classes
  * if X is an interface then we can call this method by passing arraylist of either X type or super class of implementation class of X.
  * But within the method we can add X type of object and null to the list.
  
```java

ArrayList< ? > al = new ArrayList< String >();                   //valid
ArrayList< ? > al = new ArrayList< Integer >();                  //valid
ArrayList< ? extends Number> al = new ArrayList< Integer >();    //valid
ArrayList< ? extends Number> al = new ArrayList< String >();     //invalid
ArrayList< ? super String> al = new ArrayList< Object >();       //valid
ArrayList< ? > al = new ArrayList<? >();                        //invalid
ArrayList< ? > al = new ArrayList<? extend X>();                //invalid

```
