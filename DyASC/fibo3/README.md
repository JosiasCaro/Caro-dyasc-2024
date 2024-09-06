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

# Decisiones de diseño

## Para las clases':'

### Lo dividi y modularice para que en cada clase se encuentren las funciones correspondientes a imprimir ya sea sobre la consola o el archivo'.'
### En la clase Fibonacci solo se genere la secuencia indicada por parametro  de Fibonacci'.'
### En OpcionesFibo se hace la validacion de los distintos parametros ingresados por consola y se modifican los valores de los distintos atributos para que la secuencia sea modificada y representada de la manera indicada'.'

## Decisiones de la trata de excepciones para fibo3':'

### Por falta de tiempo y por no consultar sobre que deberia hacer, si en el parametro -f="xxxxxx" no pude tomar como parte del string el tipo de archivo donde se escribe la secuencia de fibonacci y con respecto a -m si la opcion no es valida no importara y se ejecutara por default -o=hd con la longitud indicada de la secuencia de fibonacci'.'

## Decisiones de las pruebas':'

### Debo hacer unas modificaciones para la proxima implemetacion de fibo donde me permita utilizar asserts para la implementacion de pruebas, ya que al imprimirse utilizando syso no me facilita el uso de pruebas automaticas'.'