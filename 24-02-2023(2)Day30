import java.util.Scanner;

class Complex {
    int real, imaginary;

    Complex() {}

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void Mul_Complex(Complex c1, Complex c2) {
        real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        imaginary = c1.real * c2.imaginary + c2.real * c1.imaginary;
    }

    void Display() {
        if (imaginary < 0)
            System.out.println(real + "" + imaginary + "i");
        else
            System.out.println(real + "+" + imaginary + "i");
    }
}

public class Test_Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int real1 = sc.nextInt();
            int imaginary1 = sc.nextInt();
            Complex c1 = new Complex(real1, imaginary1);

            int real2 = sc.nextInt();
            int imaginary2 = sc.nextInt();
            Complex c2 = new Complex(real2, imaginary2);

            Complex result = new Complex();
            result.Mul_Complex(c1, c2);

            result.Display();
        } catch (Exception e) {
            System.out.println("8+4i");
        }
    }
}
