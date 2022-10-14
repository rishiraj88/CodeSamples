# java8 Functional Interfaces in JDK [WIP]

## Base package is:
java.util.function

## Main interfaces are (InterfaceName HASH functionalMethodName):
- Supplier#get()
- Consumer#accept()
- Predicate#test()
- Function#apply()

## More interfaces: with specific parameter datatypes and return datatypes
- BooleanSupplier#getAsBoolean: for boolean primitive
- IntSupplier#getAsInt: for int primitive
- LongSupplier#getAsLong: for long primitive
- DoubleSupplier##getAsDouble: for double primitive
- IntConsumer#: for int primitive
- LongConsumer#: for long primitive
- DoubleConsumer#: for double primitive
- Supplier<Integer>: for wrapper type

## More Interfaces: with two or more parameters or return references
- BiConsumer<T,U>#accept(T t, U u): for two object references
- ObjIntConsumer#: for an object and an int primitive
- ObjLongConsumer#: for an object and a long primitive
- ObjDoubleConsumer#: for an object and a double primitive
