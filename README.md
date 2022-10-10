# overriding
overriding in java 


overriding bank exercise; 

Let's create an inherited structure first.
Then let's create student credit, teacher credit and agriculture credit.
then let's make these polymorphisms

![OverridingVsOverloading](https://user-images.githubusercontent.com/75886362/194964286-980b91bf-ef29-479a-b416-315b5c4e31bb.png)


### When to apply Method Overriding ?(with example)

Overriding and Inheritance : Part of the key to successfully applying polymorphism is understanding that the superclasses and subclasses form a hierarchy which moves from lesser to greater specialization. Used correctly, the superclass provides all elements that a subclass can use directly. It also defines those methods that the derived class must implement on its own. This allows the subclass the flexibility to define its methods, yet still enforces a consistent interface. Thus, by combining inheritance with overridden methods, a superclass can define the general form of the methods that will be used by all of its subclasses.



### Let’s look at a more practical example that uses method overriding.
Consider an employee management software for an organization, let the code has a simple base class Employee, the class has methods like raiseSalary(), transfer(), promote(), .. etc. Different types of employees like Manager, Engineer, ..etc may have their implementations of the methods present in base class Employee. In our complete software, we just need to pass a list of employees everywhere and call appropriate methods without even knowing the type of employee. For example, we can easily raise the salary of all employees by iterating through the list of employees. Every type of employee may have its logic in its class, we don’t need to worry because if raiseSalary() is present for a specific employee type, only that method would be called.


![JavaOVerriding](https://user-images.githubusercontent.com/75886362/194964551-624f0116-ae4f-4ca3-86b9-dd4281a7f995.jpg)


         // A Simple Java program to demonstrate application 
         // of overriding in Java 
  
        // Base Class 
       class Employee { 
       public static int base = 10000; 
       int salary() 
      { 
        return base; 
       } 
       } 
  
       // Inherited class 
       class Manager extends Employee { 
    // This method overrides salary() of Parent 
    int salary() 
    { 
        return base + 20000; 
     } 
     } 
  
     // Inherited class 
     class Clerk extends Employee { 
    // This method overrides salary() of Parent 
    int salary() 
    { 
        return base + 10000; 
    } 
    } 
  
    // Driver class 
    class Main { 
    // This method can be used to print the salary of 
    // any type of employee using base class reference 
    static void printSalary(Employee e) 
    { 
        System.out.println(e.salary()); 
    } 
  
    public static void main(String[] args) 
    { 
        Employee obj1 = new Manager(); 
  
        // We could also get type of employee using 
        // one more overridden method.loke getType() 
        System.out.print("Manager's salary : "); 
        printSalary(obj1); 
  
        Employee obj2 = new Clerk(); 
        System.out.print("Clerk's salary : "); 
        printSalary(obj2); 
    } 
     } 
     
     
 ### Output: 
 
                Manager's salary : 30000
                Clerk's salary : 20000



<img src="https://media.giphy.com/media/SYHz66JfYHbBtZXjHy/giphy.gif" height="300"  ><img src="https://media.giphy.com/media/HscDLzkO8EOTmgkhQP/giphy.gif"  align="right" height="300">
