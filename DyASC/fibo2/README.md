## Parados en el home de la materia

# Compilacion Fibonacci
``` bash
javac -d ./fibo2/target "C:\Users\IOSHI\Desktop\Untref\Materias\DyASC\fibo2\src\main\java\ar\edu\untref\dyasc\Ejecutable.java" "C:\Users\IOSHI\Desktop\Untref\Materias\DyASC\fibo2\src\main\java\ar\edu\untref\dyasc\Fibonacci.java"
``` 

# Armar jar Fibonacci
``` bash
jar cvfe fibo.jar ar.edu.untref.dyasc.Ejecutable -C fibo/target .
```

# Ejecutar Fibonacci
``` bash
java -jar fibo.jar 1
```