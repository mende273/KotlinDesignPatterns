While Kotlin doesn't have direct pattern implementations, many design patterns can be expressed using its language features.

### Creational Patterns
- [Singleton](https://github.com/mende273/KotlinDesignPatterns/blob/main/src/creational/Singleton.kt): Easily achieved using object keyword.
- [Builder](https://github.com/mende273/KotlinDesignPatterns/blob/main/src/creational/Builder.kt): Constructed using nested classes or data classes with optional parameters.
- [Factory](https://github.com/mende273/KotlinDesignPatterns/blob/main/src/creational/Factory.kt): Implemented using functions or object expressions.
- Prototype: Achieved through deep copying or using serialization/deserialization.

### Structural Patterns
- Adapter: Implemented using interfaces and adapter classes.
- Decorator: Achieved using higher-order functions or delegation.
- Proxy: Implemented using interfaces and delegation.
- Facade: Created using a class with simplified methods.

### Behavioral Patterns
- Observer: Implemented using interfaces and event listeners.
- Strategy: Achieved using interfaces and object instances.
- Template Method: Implemented using abstract classes and overriding methods.
- Iterator: Provided by standard library collections.
- State: Implemented using sealed classes and when expressions.
