# Java-Basics
Java is a programming language used to develop software.
Software is a set of program.
Program- It is a set of instruction.
Java is a Object oriented programming language.
Object defines state and behaviour of the class.
oops can be explained by
1.Inheritance
2.Polymorphism
3.Abstraction
4.Encapsulation (Wraping of data , property or behaviour in a single unit)
Inheritance is the property  by which we access the properties of parent class in child class.
Polymorphism- Achieved by function overloading and function overwriting.

Ecllipse is integrated development environment
Java is non pure OOP language as it uses primitive datatype(float , double) not class.
........................................................................
Printis a memeber of printstream
out is a static member of system
out is object of printstream

...................................................................

For decimal value we use float and double
for integer we use byte short int long
char for character
boolean for true and false
..........................................................................

object is a base class of java
String is a class




static is compile time allocation
dynamic is runtime allocation

...........................................................................
array in java is defined as
int ar[];
ar=new int [5];
ar.length()
............................................................................
default value during dynamic allocation is 
string->null
int->0

student s1;--->refrence type variable
s1=new student
............................................................................
Constructor is a special type function used to initiallise object of the class
automatically called when object is created
Jvm creates a default constructor when no particular parametrized constructor is created.
.............................................................................

Types of variable-
static
global
instance->object level variable
local->within block defined
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
This keyword refers to current class object. generally used to call instance variable.

Static members have only one memory allocation for all the members
.............................................................................
Inheritance in Java:--
Single -- 1 parent and 1 child class
Multilevel-- child of child class
Hierarchial-- More than one child class
Multiple-- more than one parent class

Multiple inheritance by using interface. It doesnt support by class.

Inheritance done using keyword extend.
.............................................................................
Access Modifier in Java:
1.Private :- can access within a class
2.Default :- can access within a package any where
3.Protected :- can access within a package anywhere and outside the package by child class object
4.Public :- can access within a package anywhere and outside the package anywhere

Package is a collection of class.
...........................................................................

Polymorphism:
Static by function overloading
Dynamic by function Overwriting
............................................................................

Abstract class used for abstraction. Provides 0-100% abstraction. It may have abstract or non abstract method.
A method without implemention is called abstract method
It provides an interface. Can't allocate memory.
we can take refrence variable of abstract class.

..........................................................................

Interface 
It provide 100% abstraction
All method of interface are abstract.
by default all data member of interface are public.
All variables of interface are by default public, static and final.
By using interface we can implement multiple inheritance
...........................................................................

Exception Handling
1.Syntax error
It can be handled at compile time

2.Logical error
Unexpected output

3.Runtime Error
Cant be handled at compile time. Requires exception handling.
............................................................................

Exception is unexpected event at runtime.Every exception has a class.
The program terminates after an exception is encountered therefore it should be handled.
Jvm throws an object. Try and catch block is used to handle it 
Exception is base class of all exceptions.

.............................................................................
list-ordered
duplicate values can be present
 more than one null
...
Set- unodered
no duplicate values
only one null
...
Tree maintains natural order
Linked hash map is ordered
Hash map is unordered
.............................................................................
Wrapper class

int Integer
byte Byte
short Short
float Float
double Double
char character
boolean Boolean
..............................................................................
Retrieving of data in Linked list is slower than array list
Insertion and deletion is faster in linked list than in array list

Java is secured and no pointer is used

..............................................................................
Thread is used for multitasking

checked and unchecked exception
uchecked exception have rare exception
join allows one thread to wait until curent thread completes its task
..............................................................................
