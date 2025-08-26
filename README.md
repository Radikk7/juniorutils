# JuniorUtils
![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Build](https://img.shields.io/badge/build-Maven-success)
![License](https://img.shields.io/badge/license-MIT-green)
[![CI](https://img.shields.io/badge/CI-GitHub%20Actions-blue)](#-tests)
[![Tests](https://img.shields.io/badge/tests-JUnit5-success)](#-tests)



A tiny Java utility library for juniors (and not only): strings, arrays, numbers, encoding/decoding — plus an interactive CLI demo.

## ✨ Features
- **strings**: reverse, palindrome (case-sensitive / ignore-case), capitalize words, remove vowels/consonants, isNumeric, isOnlyLetters, countWords, removePunctuation, reverseWords, unique chars, etc.
- **arrays**: reverse, sort, contains duplicate, sum/avg/min/max, isSorted, unique, rotate left/right, indexOf, removeElement, filter even/odd, merge, countOccurrences.
- **numbers**: isEven/isOdd/isPrime, factorial, fibonacci, gcd/lcm, toBinary/toHex, abs, isDivisible, power, random, min/max, isPositive/isNegative.
- **encoding**: Base64, URL encode/decode, HEX encode/decode (UTF-8), ROT13, Caesar, MD5, SHA-256.
- **demo (CLI)**: interactive menu to run all operations.

## 📦 Project Structure

src/main/java/
demo/JuniorDemoApp.java
strings/StringUtils.java
arrays/ArrayUtils.java
numbers/NumberUtils.java
encoding/EncodingUtils.java

src/test/java/
stringUtils/StringUtilsTest.java
arrayUtils/ArrayUtilsTest.java
numbers/NumberUtilsTest.java
encoding/EncodingUtilsTest.java


> Package names are lowercase (Java convention).

## 🔧 Requirements
- Java 17+
- Maven 3.9+

## 🚀 Build & Run
```bash
# build the project
mvn clean package

# run tests
mvn test

# run the interactive CLI demo
mvn exec:java -Dexec.mainClass="demo.JuniorDemoApp"

Example CLI:

==== JuniorUtils Demo App ====
Choose category:
1. String Operations
2. Array Operations
3. Number Operations
4. Encoding
0. Exit
>

📖 Usage in Code
// strings
String rev = strings.StringUtils.reverse("hello");

// arrays
int[] sorted = arrays.ArrayUtils.sort(new int[]{3,1,2});

// numbers
boolean prime = numbers.NumberUtils.isPrime(13);

// encoding
String sha = encoding.EncodingUtils.hashSHA256("hello");

🛣️ Roadmap

More CLI actions & examples

Javadoc & GitHub Pages

Publish via JitPack / Maven Central

More tests & small benchmarks

🤝 Contributing

PRs and issues are welcome!

📄 License

MIT

📚 Описание (на русском)

JuniorUtils — небольшая библиотека утилит для джунов: строки, массивы, числа, кодирование/декодирование + консольное демо.

Требования

Java 17+

Maven 3.9+
