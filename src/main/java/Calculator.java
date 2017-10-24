public class Calculator implements ICalculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("Cannot divide by zero.");
        return a / b;
    }

    public boolean equals(int a, int b) {
        return a == b;
    }
}
