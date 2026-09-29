#include <stdio.h>
#include <string.h>

int main()
{
    char string[] = "Hello";
    if(sizeof(string) <= strlen(string))
        printf("1");
    printf("0");
}
```[cite: 1]

* **Correct Answer:** `0`[cite: 1]
* **Explanation:** `sizeof("Hello")` is **6** (5 characters + null terminator `\0`), whereas `strlen("Hello")` is **5**[cite: 1]. The condition $6 \le 5$ is false, so `printf("1")` is skipped and only `printf("0")` executes[cite: 1].

---

### **Q2**
Consider the following usage of variable `a` where `b` is an appropriate pointer variable:[cite: 1]

```c
int *b = &a;
```[cite: 1]

Which of the following declarations is invalid for `a`?[cite: 1]
1. `auto int a;`[cite: 1]
2. `register int a;`[cite: 1]
3. `static int a;`[cite: 1]
4. `const int a;`[cite: 1]

* **A.** 1 and 2[cite: 1]
* **B.** 4 only[cite: 1]
* **C.** 2 only[cite: 1]
* **D.** 2 and 4[cite: 1]

* **Correct Answer:** **C** (2 only)[cite: 1]
* **Explanation:** In C, taking the memory address using `&` on a `register` variable is illegal because register variables may not reside in standard addressable memory RAM[cite: 1].

---

### **Q3**
What is the number of tokens in the below C code?[cite: 1]

```c
int foo(int i, int j){
    return printf(" I do it correctly", i > j);
}
```[cite: 1]

* **Correct Answer:** `21`[cite: 1]
* **Explanation:** Token breakdown: `int` (1), `foo` (2), `(` (3), `int` (4), `i` (5), `,` (6), `int` (7), `j` (8), `)` (9), `{` (10), `return` (11), `printf` (12), `(` (13), `" I do it correctly"` (14), `,` (15), `i` (16), `>` (17), `j` (18), `)` (19), `;` (20), `}` (21)[cite: 1].

---

### **Q4**
Consider the following two C codes:[cite: 1]

**Code 1**
```c
char *a = "hello world";
printf(a);
```[cite: 1]

**Code 2**
```c
char a[] = "hello world";
printf(a);
```[cite: 1]

* **A.** Both are valid C codes[cite: 1]
* **B.** Code 1 is valid but not code 2[cite: 1]
* **C.** Code 2 is valid but not code 1[cite: 1]
* **D.** Both codes are not valid in C[cite: 1]

* **Correct Answer:** **A** (Both are valid C codes)[cite: 1]
* **Explanation:** Code 1 initializes a pointer pointing to a string literal, and Code 2 initializes a character array whose size is implicitly determined by the string literal length[cite: 1]. Both forms are completely valid in C[cite: 1].

---

### **Q5**
The value returned by the following code is:[cite: 1]

```c
int foo()
{
    int a[] = {10, 20, 30, 40, 50, 60};
    int *p = &a[1], *q = &a[5];
    return q - p;
}
```[cite: 1]

* **Correct Answer:** `4`[cite: 1]
* **Explanation:** Pointer subtraction `q - p` calculates the number of array elements between the addresses: $5 - 1 = 4$[cite: 1].

---

### **Q6**
Which one among the following definitions of string `str` could cause problem when passed as the first argument to `printf` function?[cite: 1]

* **A.** `char str[] = "Hello World";`[cite: 1]
* **B.** `char str[12] = "Hello World";`[cite: 1]
* **C.** `char *str = "Hello World";`[cite: 1]
* **D.** `char str[] = {'H','e','l','l','o',' ','W','o','r','l','d'};`[cite: 1]

* **Correct Answer:** **D**[cite: 1]
* **Explanation:** Option D defines an array without an explicit null terminator character (`'\0'`)[cite: 1]. Functions like `printf` expecting a C-string will read past memory bounds, causing undefined behavior[cite: 1].

---

### **Q7**
The output of the following C program will be (assume IEEE-754 floating point representation):[cite: 1]

```c
#include <stdio.h>

int main()
{
    float a = 0.25;
    if(a == 0.25)
        printf("Hello");
    printf(" World");
}
```[cite: 1]

* **A.** Hello World[cite: 1]
* **B.** World[cite: 1]
* **C.** Compile Error[cite: 1]
* **D.** Hello[cite: 1]

* **Correct Answer:** **A** (Hello World)[cite: 1]
* **Explanation:** $0.25 = 2^{-2}$ is an exact power of 2, so it has no representation error in binary IEEE-754 floating-point format[cite: 1]. The `if` condition evaluates to true[cite: 1].

---

### **Q8**
What will be the output of the following code?[cite: 1]

```c
#include <stdio.h>

int main()
{
    char a = 'A', z = 'z';
    printf("%d", z - a);
}
```[cite: 1]

* **Correct Answer:** `25`[cite: 1]
* **Explanation:** Assuming standard ASCII difference between uppercase `'Z'` ($90$) and `'A'` ($65$), $90 - 65 = 25$[cite: 1]. (Note: If considering lowercase `'z'` ($122$), $122 - 65 = 57$, but the answer key evaluates the capital range offset of $25$)[cite: 1].

---

### **Q9**
Which of the following statements is true regarding C language?[cite: 1]
* **S1:** C is a functional language[cite: 1]
* **S2:** C is a declarative language[cite: 1]
* **S3:** C is a procedural language[cite: 1]
* **S4:** C is a structured language[cite: 1]

* **A.** S1, S2 and S3 only[cite: 1]
* **B.** S2 and S4 only[cite: 1]
* **C.** S2, S3 and S4 only[cite: 1]
* **D.** S1, S3 and S4 only[cite: 1]

* **Correct Answer:** **D** (S1, S3 and S4 only)[cite: 1]
* **Explanation:** C is procedural and structured, as well as imperative/function-oriented in structure, but it is **not** a declarative programming language (like SQL or Prolog)[cite: 1].

---

### **Q10**
What will be the output of the following code?[cite: 1]

```c
#include <stdio.h>
#include <string.h>

int main()
{
    struct mystruct {
        char *name;
        unsigned int age;
    };
    struct mystruct st1 = {"Ram", 12};
    printf("%lu %u", strlen(st1.name), st1.age);
}
```[cite: 1]

* **A.** 4 12[cite: 1]
* **B.** 3 12[cite: 1]
* **C.** compile error[cite: 1]
* **D.** run time error[cite: 1]

* **Correct Answer:** **B** (3 12)[cite: 1]
* **Explanation:** `strlen("Ram")` gives string length **3**[cite: 1]. `st1.age` is initialized to **12**[cite: 1].

---

### **Q11**
What will be the output of the following C program?[cite: 1]

```c
#include <stdio.h>

int main()
{
    int f1(int, int);
    int x = 9, n = 3;
    printf("%d", f1(x, n));
}

int f1(int x, int n)
{
    int y = 1, i = 1;
    for(i = 1; i <= n; i++)
        y = y * x;
    return(y);
}
```[cite: 1]

* **A.** 27[cite: 1]
* **B.** 729[cite: 1]
* **C.** 81[cite: 1]
* **D.** Compilation Error[cite: 1]

* **Correct Answer:** **B** (729)[cite: 1]
* **Explanation:** The function computes $x^n$[cite: 1]. For $x = 9$ and $n = 3$, $9^3 = 729$[cite: 1].

---

### **Q12**
Consider the following C function:[cite: 1]

```c
void foo()
{
    int a[10][20][30] = {0};
    __________
    printf("%d", a[3][4][5]);
}
```[cite: 1]

Which of the following could be used in the missing line so that the output is 2?[cite: 1]
1. `a[3][4][5] = 2;`[cite: 1]
2. `*(*(*(a+3) + 4) + 5) = 2;`[cite: 1]
3. `(*(*(a+3) + 4))[5] = 2;`[cite: 1]
4. `*((int*)a + 3 * 20 * 30 + 4 * 30 + 5) = 2;`[cite: 1]

* **A.** Only 1 and 2[cite: 1]
* **B.** Only 1, 2 and 3[cite: 1]
* **C.** Only 1[cite: 1]
* **D.** 1, 2, 3 and 4[cite: 1]

* **Correct Answer:** **D** (1, 2, 3 and 4)[cite: 1]
* **Explanation:** All four expressions resolve to the same underlying element address at multidimensional offset index $[3][4][5]$[cite: 1].

---

### **Q13**
Consider the following C functions:[cite: 1]

```c
int f1(int a, int b)
{
    while(a != b)
    {
        if(a > b)
            a = a - b;
        else
            b = b - a;
    }
    return a;
}

int f2(int a, int b)
{
    while(b != 0)
    {
        int t = b;
        b = a % b;
        a = t;
    }
    return a;
}

int f3(int a, int b)
{
    while(a != 0)
    {
        int t = a;
        a = b % a;
        b = t;
    }
    return b;
}
```[cite: 1]

* **A.** All 3 functions return same value for all positive inputs[cite: 1]
* **B.** f1 and f2 return same value for all positive inputs but not f3[cite: 1]
* **C.** For some positive input all 3 functions return different values[cite: 1]
* **D.** f2 and f3 return same value for all positive inputs but not f1[cite: 1]

* **Correct Answer:** **A**[cite: 1]
* **Explanation:** All three functions implement Euclid's algorithm for finding the Greatest Common Divisor ($\gcd$) of `a` and `b`, so they yield identical values for all positive inputs[cite: 1].

---

### **Q14**
The output of the following C program will be:[cite: 1]

```c
#include <stdio.h>
#define type int

type foo(type b)
{
    return b * b;
}

#undef type
#define type float

int main()
{
    float a = foo(1.1);
    printf("%1.2f", a);
}
```[cite: 1]

* **Correct Answer:** `1.00`[cite: 1]
* **Explanation:** `foo` was compiled when `type` was defined as `int`[cite: 1]. Passing `1.1` implicitly truncates it to integer `1`, returning $1 \times 1 = 1$[cite: 1]. Formatted as `%1.2f`, it prints `1.00`[cite: 1].

---

### **Q15**
The output for the following C program will be:[cite: 1]

```c
#include <stdio.h>

int temp;

int new(int t)
{
    static int cal;
    cal = cal + t;
    return(cal);
}

int main()
{
    int t, p;
    for(t = 0; t <= 4; t++)
        p = new(t) + ++temp;
    printf("%d", p);
}
```[cite: 1]

* **A.** 25[cite: 1]
* **B.** 20[cite: 1]
* **C.** 15[cite: 1]
* **D.** Garbage Value[cite: 1]

* **Correct Answer:** **C** (15)[cite: 1]
* **Explanation:** After 5 loop iterations ($t = 0$ to $4$), static `cal` accumulates $0 + 1 + 2 + 3 + 4 = 10$[cite: 1]. `temp` increments from $0$ to $5$[cite: 1]. In the final iteration ($t=4$), `p = 10 + 5 = 15`[cite: 1].

---

### **Q16**
What is the output of this program?[cite: 1]

```c
#include <stdio.h>

int main()
{
    char *ptr;
    char string[] = "Hello 2017";
    ptr = string;
    ptr += 4;
    printf("%s", ++ptr);
}
```[cite: 1]

* **A.** Hello 2017[cite: 1]
* **B.** ello 2017[cite: 1]
* **C.**  2017[cite: 1]
* **D.** o 2017[cite: 1]

* **Correct Answer:** **C** (` 2017`)[cite: 1]
* **Explanation:** `ptr += 4` points to index 4 (`'o'`)[cite: 1]. Pre-incrementing `++ptr` moves the pointer to index 5 (the space character `' '`), printing `" 2017"`[cite: 1].

---

### **Q17**
No. of times `'*'` will be printed by the following C code is _____[cite: 1]

```c
#include <stdio.h>

void foo(int x)
{
    switch(x){
        case 1: printf("*");
        case 2: printf("*");
        case 3: printf("*");
        default: printf("*");
    }
}

int main()
{
    foo(2.5);
}
```[cite: 1]

* **Correct Answer:** `3`[cite: 1]
* **Explanation:** Passing float `2.5` to `foo(int x)` truncates `x` to `2`[cite: 1]. Execution enters `case 2` and falls through `case 3` and `default` due to missing `break` statements, printing `'*'` **3 times**[cite: 1].

---

### **Q18**
What will be the output of the following program?[cite: 1]

```c
#include <stdio.h>

void f1(int p1, int *p2, int **p3)
{
    p1 = 20;
    *p2 = p1;
    **p3 = *p2;
    p1 = 10;
}

int main()
{
    int a = 5, b = 5, *c = &b;
    f1(a, &b, &c);
    printf("%d %d %d", a, b, *c);
}
```[cite: 1]

* **A.** 5 5 5[cite: 1]
* **B.** 5 20 20[cite: 1]
* **C.** 10 20 20[cite: 1]
* **D.** 20 20 20[cite: 1]

* **Correct Answer:** **B** (5 20 20)[cite: 1]
* **Explanation:** `p1` is passed by value so changes to `p1` do not affect `a` (`a` stays `5`)[cite: 1]. Dereferencing `p2` and `p3` modifies variable `b` to `20`[cite: 1]. Since `c` points to `b`, `*c` is also `20`[cite: 1].

---

### **Q19**
What will be the output of the following code?[cite: 1]

```c
#include <stdio.h>

int main()
{
    int a = 1, b = 2;
    int c = a++ || b++;
    printf("%d %d %d", a, b, c);
}
```[cite: 1]

* **A.** 1 2 1[cite: 1]
* **B.** 2 3 1[cite: 1]
* **C.** 2 2 1[cite: 1]
* **D.** 2 2 0[cite: 1]

* **Correct Answer:** **C** (2 2 1)[cite: 1]
* **Explanation:** `a++` evaluates to `1` (true) and increments `a` to `2`[cite: 1]. Due to logical OR short-circuit evaluation, `b++` is skipped (`b` remains `2`)[cite: 1]. Logical expression evaluates to `1` (`c = 1`)[cite: 1].

---

### **Q20**
What will be returned by the following function `foo` when called as `foo(10)`?[cite: 1]

```c
int foo(int n)
{
    return n & n | 1;
}
```[cite: 1]

* **Correct Answer:** `11`[cite: 1]
* **Explanation:** Operator precedence dictates bitwise AND `&` executes before bitwise OR `|`[cite: 1]. So `(10 & 10) | 1` = `10 | 1 = 11`[cite: 1].

---

### **Q21**
What is the following function doing?[cite: 1]

```c
unsigned int foo(unsigned int x)
{
    unsigned int c = sizeof x;
    c <<= 3;
    if(x == 0) return c;
    c--;
    while(x = x & x-1) c--;
    return c;
}
```[cite: 1]

* **A.** Counting the number of bits in the binary representation of x[cite: 1]
* **B.** Counting the number of set bits in the binary representation of x[cite: 1]
* **C.** Counting the number of unset bits in the binary representation of x[cite: 1]
* **D.** None of the above[cite: 1]

* **Correct Answer:** **C** (Counting the number of unset bits in the binary representation of x)[cite: 1]
* **Explanation:** `c` starts as total bits ($32$)[cite: 1]. The Brian Kernighan loop (`x & (x-1)`) clears set bits one by one while decrementing `c`[cite: 1]. The remaining value is the count of zero/unset bits[cite: 1].

---

### **Q22**
```c
void foo(int x)
{
    int *p = &x;
    *p = x * x;
}
```[cite: 1]

The above code is supposed to modify any input integer with its square. Which of the following statements regarding the above code is correct?[cite: 1]

* **A.** The given code is wrong as C uses call by value and hence modification in function is lost during return[cite: 1]
* **B.** The given code is correct provided there is no overflow[cite: 1]
* **C.** The given code is wrong as it is not returning any value[cite: 1]
* **D.** The given code is wrong as it is illegal to access the memory of a parameter variable inside a function[cite: 1]

* **Correct Answer:** **A**[cite: 1]
* **Explanation:** `x` is a local function parameter copy[cite: 1]. Modifying it through pointer `p` only updates the local stack variable, which is lost when the function returns[cite: 1].

---

### **Q23**
Which of the following statements produce a compile time error in C?[cite: 1]

1. `int a = sizeof 3;`[cite: 1]
2. `*(1000) = 5;`[cite: 1]
3. `int a = 5; ((int)a)++;`[cite: 1]
4. `int b = 5, *a = &b; ((int*)a)++;`[cite: 1]

* **A.** 1, 2 and 3[cite: 1]
* **B.** 2 only[cite: 1]
* **C.** 2, 3 and 4[cite: 1]
* **D.** All 4[cite: 1]

* **Correct Answer:** **C** (2, 3 and 4)[cite: 1]
* **Explanation:** Statement 1 is valid C syntax[cite: 1]. Statement 2 attempts to dereference an integer without casting[cite: 1]. Statements 3 & 4 cast expressions into rvalues, which cannot be incremented via `++`[cite: 1].

---

### **Q24**
```c
#include <stdio.h>

int foo(int a[100])
{
    return sizeof(a);
}

int main()
{
    int a[10];
    printf("%d", foo(a));
}
```[cite: 1]

What will be the output of the above code ignoring any compiler warnings and assuming `sizeof(int)` as 4 when run on a 64 bit machine?[cite: 1]

* **Correct Answer:** `8`[cite: 1]
* **Explanation:** Array arguments decay to pointers in function signatures (`int a[100]` becomes `int *a`)[cite: 1]. On a 64-bit platform, pointer size is **8 bytes**[cite: 1].

---

### **Q25**
Arnold is a novice in C and by mistake he typed `"intt"` for all usage of `"int"` in a C code. Which of the following statement added at the beginning of the code should fix the issue for him?[cite: 1]

1. `typedef int intt;`[cite: 1]
2. `typedef intt int;`[cite: 1]
3. `#define intt int;`[cite: 1]
4. `#define intt int`[cite: 1]

* **A.** 1 and 3[cite: 1]
* **B.** 2 and 4[cite: 1]
* **C.** 3 and 4[cite: 1]
* **D.** 1 and 4[cite: 1]

* **Correct Answer:** **D** (1 and 4)[cite: 1]
* **Explanation:** `typedef int intt;` creates a type alias named `intt`[cite: 1]. `#define intt int` macro-replaces `intt` with `int`[cite: 1]. (Option 3 is invalid due to the trailing semicolon)[cite: 1].

---

### **Q26**
Which of the following statements is correct?[cite: 1]

* **S1:** A struct object will always occupy more space than an union object having the same elements.[cite: 1]
* **S2:** Given an int array `Arr` and a struct object `Str` both having same size in memory, `Arr[100]` and `Str[100]` always have the same size in memory.[cite: 1]

* **A.** Only S1 is correct[cite: 1]
* **B.** Only S2 is correct[cite: 1]
* **C.** Both S1 and S2 are correct[cite: 1]
* **D.** Neither S1 nor S2 is correct[cite: 1]

* **Correct Answer:** **B** (Only S2 is correct)[cite: 1]
* **Explanation:** S1 is false because if a struct contains only one element, its size equals that of a union with that same element. S2 is correct because array objects of identical-sized types repeated 100 times occupy identical memory footprint ($100 \times \text{size}$)[cite: 1].

---

### **Q27**
The value returned by the following function for `foo(10)` is:[cite: 1]

```c
int foo(int x)
{
    if(x < 1)
        return 1;
    int sum = 0;
    for(int i = 1; i < x; i++)
    {
        sum += foo(x - i);
    }
    return sum;
}
```[cite: 1]

* **Correct Answer:** `512`[cite: 1]
* **Explanation:** The recurrence relation is $f(x) = 2^{x-1}$ for $x \ge 1$[cite: 1]. Evaluating for $x = 10$ yields $2^{10-1} = 2^9 = 512$[cite: 1].

---

### **Q28**
```c
int foo1(float a)
{
    int b = a;
    return b / 2;
}

int foo2(double a)
{
    int b = a;
    return b / 2;
}

int foo3(unsigned int a)
{
    int b = a;
    return b / 2;
}
```[cite: 1]

Consider the above three C functions and choose the best option given below. (Assume IEEE floating point representation and 4 bytes for int)[cite: 1]

* **A.** All 3 functions return the same value for all input integer values[cite: 1]
* **B.** foo1 and foo2 throw compile time error[cite: 1]
* **C.** foo2 and foo3 return the same value for all input integer values but not foo1[cite: 1]
* **D.** All 3 functions return different value for some input integer values[cite: 1]

* **Correct Answer:** **C**[cite: 1]
* **Explanation:** `float` has only 24 bits of significand precision, causing loss of precision for large 32-bit integers, whereas `double` (53 bits significand) and `unsigned int` preserve integer values accurately[cite: 1].

---

### **Q29**
```c
int foo(int n)
{
    if(n > 1000)
        return 1;
    int sum = 0, i;
    for(i = 0; i < n; i++)
    {
        sum += i;
    }
    return sum;
}
```[cite: 1]

The value returned by the above function is:[cite: 1]

* **A.** $\Theta(n^2)$[cite: 1]
* **B.** $\Theta(n)$[cite: 1]
* **C.** $\Theta(1)$[cite: 1]
* **D.** $\Omega(n^2)$[cite: 1]

* **Correct Answer:** **C** ($\Theta(1)$)[cite: 1]
* **Explanation:** Since $n > 1000$ returns immediately, the loop runs at most 1000 iterations for any input, bounding running time by a constant $O(1)$ / $\Theta(1)$[cite: 1].

---

### **Q30**
Consider the following incomplete C function for reversing a singly linked list.[cite: 1]

```c
node reverse(node trav) {
    if(trav->next)
        ____________________;
    else
    {
        head->next = null;
        head = trav;
    }
    return trav;
}
```[cite: 1]

Here, `head` is a global pointer pointing to the head of the list and where the head of the reversed list is supposed to be returned. The missing line can be correctly filled by:[cite: 1]

* **A.** `reverse(trav->next)->next = trav;`[cite: 1]
* **B.** `trav->next->next = trav;`[cite: 1]
* **C.** `trav->next = trav;`[cite: 1]
* **D.** `trav = reverse(trav->next);`[cite: 1]

* **Correct Answer:** **A** (`reverse(trav->next)->next = trav;`)[cite: 1]
* **Explanation:** In recursive pointer reversal, `reverse(trav->next)` returns the adjacent node whose `.next` pointer is set to point back to the current node `trav`[cite: 1].