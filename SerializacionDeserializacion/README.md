## Serializacion y Deserializacion


La clase a serializar debe implementar Serializable para que los objetos se puedan serializar y deserializar.


```java
public class Persona implements Serializable
```
El serialVersionUID es un identificador único para la versión de una clase y se define dentro de ella. Es importante definir un valor predeterminado por nosotros, puesto que si no lo hacemos Java lo generará automáticamente y su valor cambia cada vez que hagamos una modificacion a la clase, lo que puede causar conflictos al deserializar

```java
private static final long serialVersionUID = 1L;
```

