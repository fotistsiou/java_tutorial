# Java Access Modifiers and Non-Access Modifiers

## Access Modifiers

Access modifiers control the access level of classes, attributes, constructors, and methods in Java. There are four types:

### 1. `private`
- The code is only accessible within the declared class.
- **Applicable to**: Attributes, constructors, methods.

### 2. `default` (package-private, no explicit modifier)
- The code is only accessible within the same package.
- **Applicable to**: Classes, attributes, constructors, methods.
- **Note**: Used when no modifier is specified.

### 3. `protected`
- The code is accessible within the same package and in subclasses.
- **Applicable to**: Attributes, constructors, methods.

### 4. `public`
- The code is accessible to all classes.
- **Applicable to**: Classes, attributes, constructors, methods.

## Non-Access Modifiers

Non-access modifiers do not control access levels but provide additional functionalities. There are six types:

### For Classes:
1. **`final`**
    - The class cannot be inherited by other classes.

2. **`abstract`**
    - An Abstract Class is a restricted class, that cannot be used to create objects.
    - To access it, it must be inherited from another class.
    - We use Abstract Classes and Methods
      - To achieve security - hide certain details.
      - To only show the important details of an object.
    - Abstraction can also be achieved with Interfaces.

### For Attributes and Methods:
1. **`final`**
    - Attributes and methods cannot be overridden or modified.

2. **`static`**
    - Attributes and methods belong to the class rather than an instance of the class.

3. **`abstract`**
    - Can only be used in an abstract class and on methods.
    - Abstract methods do not have a body; the body is provided by the subclass.

4. **`transient`**
    - Attributes and methods are skipped during the serialization of the object containing them.

5. **`synchronized`**
    - Methods can only be accessed by one thread at a time.

6. **`volatile`**
    - The value of an attribute is not cached thread-locally and is always read from the "main memory".
