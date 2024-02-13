package p1;

public class A {
	int a = 100;
	
	protected void getA() {    // its protected it can only be accesed in other package by inheritance
		//where as private cant be accesed by any one outside that class 
		System.out.println("a ="+ a);
	}
}
  // defasult same package acess
  // public access in both packages
 // private same class
//proptected operatyes in same package.....in other create karicha asel tar need inheritance (extends)
  ///child class extends parent class


///static Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed. Static variables are created when the program starts and destroyed when the program stops. Instance variables can be accessed directly by calling the variable name inside the class.
  /// static same package it can be acessed by classnma.variable nam or fun nam
///it can acess  in other package by variablename or function name but we need to import that class and package
