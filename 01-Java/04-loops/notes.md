# Loops: To repeat a particular task without writing the same code multiple times.

- Types :
    1. While Loop:
```java
        while(condition) {
            //do something
        }
```

NOTE:
If we want to run while loop infinite times then,
```java
        while(true) {
            //do something
        }
```
In above when we write 'ture' as condition means there is no limit to it. The condition will be true how much ever time the loop runs. The loop will only stop when the memory of code is full. It is not a good practice to do.

Example:
![Components of a Loops](images/reverse-of-number.png)

    2. For Loop:
```java
        for(initialisation; condition; updation) { //in intialisation we declare an iterator that is used to iterate through the loop
            //do something
        }
```

    3. Do-While Loop: 
```java
        do {
            //do something
        } while (condition)
```

    Example:
```java
    int counter = 1;
    do {
        System.out.println("Hello World");
        counter++;
    } while (counter <= 10>);
```
NOTE: do-while and while loops are similar the only difference is:
 - while loop first checks the condition and then performs the task.
 - do-while loop first performs the task and then checks the condtion.

# Break statement: to exit the loop
Example:
```java
    for (int i=1; i<=5; i++) {
        if (i == 3) {
            break;
        }
        System.out.println(i);
    }
```

# Continue statement: to skip an iteration
Example: 
```java
    for (int i=1; i<=10; i++) {
        if (i == 5) {
            continue;
        }
        System.out.println(i);
    }
```