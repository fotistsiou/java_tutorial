# Random class

## Pseudorandom numbers and seeding
- A random number is a number that is almost impossible to predict, like the result of throwing a die. A random number 
  generator can provide you with such a number when you need it.
- However, The random numbers aren't truly random because they can always be determined by an initial value, called **seed**.
  - Every time we get a new random number, we actually get the next number in a predefined sequence. 
  - These numbers are often called **pseudorandom,** and they are not completely unpredictable. 
  - We can calculate them all if we know the initial value and the algorithm of the sequence.
  - It is guaranteed that the same seed produces the same sequence if the same Java runtime version is used because the 
    algorithm is the same.

## Creating a pseudorandom generator
- Java provides the java.util.Random class to generate pseudorandom values of different types, such as `int`, `long`, 
  `double`, and even `boolean`. 
- We have two constructors to create an object of this class:
  - `Random()` creates a new random generator and sets the seed of the generator to a value that is very likely to be 
    distinct from any other invocation of this constructor.
  - `Random(long seed)` creates a new random generator with the specified initial value of its internal state.

## The basic methods
After we've created a generator, we can invoke one of the following methods of it:
- `int nextInt()` returns a pseudorandom value of the `int` type;
- `int nextInt(int n)` returns a pseudorandom value of `int` type in the range from `0` (inclusive) to `n` (exclusive);
- `long nextLong()` returns a pseudorandom value of `long` type;
- `double nextDouble()` returns a pseudorandom value of `double` type between `0.0` and `1.0`;
- `void nextBytes(byte[] bytes)` generates random bytes and places them into a user-supplied byte array.
- `nextGaussian()` generates Gaussian distributed pseudorandom double numbers