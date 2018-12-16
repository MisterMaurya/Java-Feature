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


