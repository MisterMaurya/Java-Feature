#### Java Feature
#### Generic 


| ArrayList al = new ArrayList();                            |ArrayList < String >  al = new ArrayList < String > ();|
|------------------------------------------------------------|-------------------------------------------------------|
| non generic version                                        |generic version                                        |
| is not type safe   ``` add any type of object ```          | is type safe                                          |
| type cast required                                         | type cast not required                                |

```java

ArrayList<String>  al = new ArrayList<String>();    // correct
List<String>  al = new ArrayList<String> ();        // correct
Collection<String>  al = new ArrayList<String>();   // correct
ArrayList<Object>  al = new ArrayList<String>();    // complie time error

/***
Polymorphism concept only applicable for base type not for parameter type
Base type      : List,ArrayList,Collection
Parameter type : String


//For the type parameter we can provide any interface and class 
//if we are tying to provide primitive then we will get compile time error

Example 


ArrayList<int>  al = new ArrayList<int>(); 

*/

```
#### Generic class
* Until 1.4 Version a non-generic of ArrayList class as follows:
```java

public class ArrayList {

	boolean add(Object o) {
  
  }

	Object get(int index){
  
  }
  
}

/*the argument to add method is object and hence we can add any type of object to the ArrayList due to this we are missing
type saftey*/

// the return type of get method is object hence at the time of retrival we have to perform type casting

```

#### Generic Class

In Generic we are assosiating a type parameter to the class such type of parametrized class is nothing but Generic class or Template Classes

* But in 1.5 version a generic version of Arraylist class as follows

```java

public class ArrayList<T> {
 	
	 
	boolean add(T t) {
  
        }

	T get(int index){
  
        }
  
}

         // T = Type Parameter
	 // Based on our run requirement T will be replaced with our provided type
```

#### Bounded Types :
* We can bound the type paratemer for a particular range by using extends keyword such type are called bounded types.

```java

class Test<T>
{

public static void main(String[] args) 
{
 Test<String> t1 = new Test<String>();
 Test<Integer> t2 = new Test<Integer>()
 }
// as the type parameter we can pass any type and their are no restrictions and hence it is unbounded type
}




//Syntax for bounded type


class Test<T extends X> {



// X can be either class or interface

// if X is a class the as the type parameter we can pass either X type or its child classes
// if X is a interface the as the type parameter we can pass either X type or its implementation classes

}


//Example 


class Test<T extends Number> {

public static void main(String[] args) 
{
Test<String> t1 = new Test<String>();  // Compile Time Error : type parameter java.lang.String is not in bound
Test<Integer> t2 = new Test<Integer>();  //correct

 }

}
```
