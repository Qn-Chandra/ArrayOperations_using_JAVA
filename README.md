# Java Array Operations

This project demonstrates various operations that can be performed on arrays in Java. It is designed for beginners to understand how arrays work and how to manipulate them effectively.

---

## 📌 Features

The project covers the following array operations:

* Traversing an array
* Inserting an element
* Deleting an element
* Searching (Linear Search & Binary Search)
* Sorting (Ascending & Descending)
* Finding maximum and minimum values
* Reversing an array
* Merging two arrays

---

## 🛠️ Technologies Used

* Java (JDK 8 or above)
* Any Java IDE (IntelliJ IDEA / Eclipse / VS Code)

---

## 📂 Project Structure

```
JavaArrayOperations/
│── src/
│   └── Main.java
│── README.md
```

---

## 🚀 How to Run

1. Clone the repository:

   ```
   git clone https://github.com/your-username/java-array-operations.git
   ```

2. Navigate to the project directory:

   ```
   cd java-array-operations
   ```

3. Compile the program:

   ```
   javac Main.java
   ```

4. Run the program:

   ```
   java Main
   ```

---

## 💡 Example Code Snippets

### 1. Traversing an Array

```java
int[] arr = {1, 2, 3, 4, 5};
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

### 2. Finding Maximum Element

```java
int max = arr[0];
for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}
System.out.println("Max: " + max);
```

### 3. Reversing an Array

```java
for(int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;
}
```

---

## 📖 Learning Objectives

* Understand array basics in Java
* Learn common array manipulation techniques
* Improve problem-solving skills using arrays

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork this repository and submit a pull request.

---

## 📜 License

This project is open-source and available under the MIT License.

---

## 🙌 Acknowledgements

* Java Documentation
* Online coding resources and tutorials

---
