# Labb-2
So I'm supposed to code a basic cache memory. The point is that the program will not have to do the same calculation twice.
One prerequisite is that it has to contain two classes; Program and Model.
The Model-class is supposed to be the contain the memory and methods to make calculations. It has to have an instance of:
HashMap<Integer, Long>
private Long getValueFromMemory(Integer value)
private void addValueToMemory(Integer value, Long result)   <- The integer value is to be n, the long value to be 2^n
public void clearMemory()
private long computePower(int power)
private long compute2Power(int power)

The Program-class is supposed to be the mainprogram and have all the code to handle user interaction. The program asks the user to enter a non-negative number, but -1 to clear the memory and -2 to exit the program. If the user puts in -2 the pgoram should: 1. clear the memory and 2. print: Memory cleared. and then quit the program.
If the user enters -1 it should 1. clear the memory and print memory cleared. 

If the user enter anything else than above, it should 1. if the number is non-negative, then the 2^n result should be printed by calling the compute2Power in the model class. 2. If the input number is negative then it should print Invalid input. This is supposed to be done by a try catch code segment. 
