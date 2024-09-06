## Parados en el home de la materia

# Compilacion Fibonacci
``` bash
javac -d ./fibo3/target "C:\Users\IOSHI\Desktop\Untref\Materias\DyASC\fibo3\src\main\java\ar\edu\untref\dyasc\Ejecutable.java" "C:\Users\IOSHI\Desktop\Untref\Materias\DyASC\fibo3\src\main\java\ar\edu\untref\dyasc\Fibonacci.java" "C:\Users\IOSHI\Desktop\Untref\Materias\DyASC\fibo3\src\main\java\ar\edu\untref\dyasc\ImprimirFibo.java" "C:\Users\IOSHI\Desktop\Untref\Materias\DyASC\fibo3\src\main\java\ar\edu\untref\dyasc\OpcionesFibo.java"
``` 

# Armar jar Fibonacci
``` bash
jar cvfe fibo.jar ar.edu.untref.dyasc.Ejecutable -C fibo3/target .
```

# Ejecutar Fibonacci
``` bash
java -jar fibo.jar 1
```