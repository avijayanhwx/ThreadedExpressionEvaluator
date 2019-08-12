# Intern Project - ThreadedExpressionEvaluator

## Problem Statement
Generate a random mathematical expression using two threads (one for operand 
and another for operator) and subsequently evaluate the expression. 

## What is given
You are given a stub for a class 'ThreadedExpressionEvaluator', which has 2 
APIs.

1. operand() - Generates a random whole number between 0 and 99 repeatedly.
2. operator() - Generates a random operator from the 4 operators given in the
 'Operator' enum in the class stub.

## What needs to be done

- You will need to pass the same instance of ThreadedExpressionEvaluator to two
different threads A and B. Thread A will invoke operand() while thread B will 
invoke operator(). 

- Complete the class such that when the program is run, 
it generates and accumulates one operator and one operand into an 
expression repeatedly until a kill signal is encountered (Ctrl + C). 
At any time, the generated expression has to be of the form [OPERAND OPERATOR
 OPERAND OPERATOR OPERAND . . .]. When the kill is encountered, the expression
  needs to be evaluated. If the expression has a trailing OPERATOR when it is 
  stopped, **that** operator alone can be discarded.

- Add unit tests to test your program thoroughly.
- Explain time and space complexity in the complexity.txt file under resources.

**Hint :**
- The execution has to be interleaved between the two threads. You cannot 
generate an operand before the corresponding operator for the last operand is 
generated.

**Note :**
- Do not modify the existing method signatures since we will be 
extending your class to test it. 
- There should be a space between 2 tokens in the expression. 
  - Correct -> 57 * 82 * 40 + 26 + 15
  - Wrong -> 57\*82\*40+26+15

## How to submit
Zip the maven project with your solution in its whole and submit to the HR.

## Order of evaluation
- Compile, Build, Executable JAR using maven.
- Correct result for getExpression() and getResult(). 
- Unit tests added
- Clean coding + adequate comments for core logic
- Usability : kill signal handling.
- Correct time and space complexity.
