# ColGen
ColGen is a Java collection generation framework.
ColGen is useful for generating various collections for testing or demo purposes.

## Use
Using ColGen is as simple as calling a single static method with an `ElementEmitter`.
An `ElementEmitter` creates elements that will be put into the generated collection.
An `ElementEmitter` has generics that will be passed on to the resulting collection:
````
ElementEmitter<String> --> List<String>, Set<String>, Queue<String>, ...
````
