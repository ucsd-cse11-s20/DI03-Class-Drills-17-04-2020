# Discussion 3: Sign Up Form
In this discussion, we are going to use the concepts we have learned so far to create a class that represents a Sign Up form from a website. Before we begin, we need to introduce two minor additions to Java:

### Boolean Not!
We have seen a variety of operators in Java for comparing integers:
```java
1 < 2  // evaluates to true
1 > 2  // evaluates to false
1 <= 2 // evaluates to true
1 >= 2 // evaluates to false
1 == 2 // evaluates to false
```
and we learned that we can compare Strings with the `equals()` String method:
```java
"CSE11".equals("CSE11") // evaluates to true
"CSE11".equals("CSE8A") // evaluates to false
```
But what if we wanted to check if two things are _not_ equal? For integers, we saw that we can use the `!=` operator:
```java
1 != 2 // evaluates to true
```
But how about Strings? There is no `notEquals()` method on Strings, but we don't need that! Similar to the integer operator we saw above, there is a boolean operator that "negates" a boolean: The _not_ operator `!`
```java
!true // evaluates to false
!false // evaluates to true
```
and we can use it to see if two String are not equal like so:
```java
!"CSE11".equals("CSE11") // evaluates to false
!"CSE11".equals("CSE8A") // evaluates to true
```
The `!` operator works on any boolean, and flips the result, so we can even use it to check if integers are not equal. `!(1 == 2)` is the same as `1 != 2`.


### The String `contains()` method
We have seen a variety of String methods already:
```java
// Check if two Strings are equal
// e.g. "CSE11".equals("CSE11");
boolean equals(String other) { ... }

// Get the length of a String
// e.g. "CSE11".length();
int length() { ... }

// Get a part of a String
// e.g. "CSE11".substring(3, 5);
String substring(int start, int end) { ... }

// Replace part of a String
// e.g. "CSE11".replace("11", "8A");
String replace(String toFind, String replaceWith) { ... }

// Find the index of the given parameter in the String 
// (or -1 if the parameter doesn't appear in the String)
// e.g "CSE11".indexOf("11");
int indexOf(String toFind) { ... }
```
Today we will learn about another very useful String method: 

```java
// Returns `true` if the given parameter appears in the String
// e.g. "CSE11".contains("CSE")
boolean contains(String toFind) { ... }
```

As the name suggests, this method simply checks if the String contains the given parameter, and returns a boolean result. 

And with that we are ready to solve today's problems:

## Problem 1:
Create a class named `SignUpForm` representing a Sign Up form from a website. This class must contain two fields, `username` and `password`, which are both Strings. You must also write a constructor for this class.

## Problem 2:
Add a method named `checkUsername` to the SignUpForm class. It must return `"Username cannot be empty"` if the `username` field is empty, or `"Ok"` if the `username` field is not empty. It accepts no parameters.

## Problem 3:
### Subproblem 3.1
Write a method named `hasNumber` in the `SignUpForm` class that accepts one String parameter, and returns `true` if that parameter contains a number (0-9)

(Hint: Remember that the String `contains()` method accepts a String parameter, not an integer!)

### Subproblem 3.2
Write a method named `hasSpecialCharacter` in the `SignUpForm` class that accepts one String parameter, and returns `true` if that parameter contains any of these special characters: `!`, `#`, `$`, `*`

### Subproblem 3.3
Add a method named `checkPassword` to the `SignUpForm` class. It must check that the `password` field matches the following requirements:

1. Password must be at least 8 characters long.
2. Password must contain at least one number (0-9).
3. Password must contain at least one special character (!,#,$,*)

If the `password` matches these requirements, it should return `"Ok"`, otherwise it should return a String containing the requirement it does not match. This method accepts no parameters.

(Hint: Use the methods we wrote in the subproblems 1 and 2)

## Problem 4:
Write a class named `ExampleForms`. In that class, create at least 3 instances of the `SignUpForm` class. Then test your `checkUsername` and `checkPassword` methods by calling them on the objects you created. 

## Problem 5: [Bonus problem for the adventurous]
Add an extra requirement to the `checkPassword` method:

4. Password must contain at least one uppercase and one lowercase character.

Write a helper method similar to 3.1/3.2 that checks for this, and modify `checkPassword` to use this method.

(Hint: There are many ways to do this, but for one way you might want to look up the `toUpperCase()` and `toLowerCase()` String methods)