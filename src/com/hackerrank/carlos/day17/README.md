# Objective
Yesterday's challenge taught you to manage exceptional situations by using try and catch blocks. In today's 
challenge, you're going to practice throwing and propagating an exception. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-more-exceptions/tutorial) tab for learning 
materials and an instructional video!

## Task
Write a Calculator class with a single method: int power(int,int). The power method takes two integers, **_n_** and **_p_**, as
parameters and returns the integer result of **_n^p_**. If either **_n_** or **_p_** is negative, then the method must throw an 
exception with the message: n and p should be non-negative.
*Note*: Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.

## Input Format
Input from stdin is handled for you by the locked stub code in your editor. The first line contains an integer, **_T_**, the 
number of test cases. Each of the **_T_** subsequent lines describes a test case in **_2_** space-separated integers denoting 
**_n_** and **_p_**, respectively.

## Constraints
- No Test Case will result in overflow for correctly written code.

## Output Format
Output to stdout is handled for you by the locked stub code in your editor. There are **_T_** lines of output, where each 
line contains the result of **_n^p_** as calculated by your Calculator class' power method.

## Sample Input
    4
    3 5
    2 4
    -1 -2
    -1 3
 
## Sample Output
    243
    16
    n and p should be non-negative
    n and p should be non-negative

## Explanation
**_T = 4_**  
**_T0: 3_** and **_5_** are positive, so power returns the result of **_3^5_**, which is **_243_**.  
**_T1: 2_** and **_4_** are positive, so power returns the result of **_2^4_**=, which is **_16_**.  
**_T2:_** Both inputs (**_-1_** and **_-2_**) are negative, so power throws an exception and "_n and p should be non-negative_" is printed.  
**_T3:_** One of the inputs (**_-1_**) is negative, so power throws an exception and "_n and p should be non-negative_" is printed.  