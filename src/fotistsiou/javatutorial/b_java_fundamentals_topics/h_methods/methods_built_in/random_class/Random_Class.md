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

## Random Class
- Random class is part of java.util package.
- An instance of java Random class is used to generate random numbers.
- This class provides several methods to generate random numbers of type `integer`, `double`, `long`, `float`, and even `boolean`.
- If two Random instances have same seed value, then they will generate same sequence of random numbers.
- Java Random class is thread-safe, however in multithreaded environment it’s advised to use
  java.util.concurrent.ThreadLocalRandom class.

## The constructors
We have two constructors to create an object of this class:
  - `Random()` creates a new random generator and seed value is created from system nano time.
  - `Random(long seed)` creates a new random generator with the specified seed value.

## The basic methods
After we've created a generator, we can invoke one of the following methods of it:
- `int nextInt()` returns a pseudorandom value of the `int` type;
- `int nextInt(int n)` returns a pseudorandom value of `int` type in the range from `0` (inclusive) to `n` (exclusive);
- `long nextLong()` returns a pseudorandom value of `long` type;
- `double nextDouble()` returns a pseudorandom value of `double` type between `0.0` and `1.0`;
- `void nextBytes(byte[] bytes)` generates random bytes and places them into a user-supplied byte array.
- `nextGaussian()` generates Gaussian distributed pseudorandom double numbers