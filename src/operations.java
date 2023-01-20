public class operations {
    float num1;
    float num2;

    public operations() {
        num1 =0;
        num2 =0;
    }

    public operations(float num1, float num2) {
        num1 = num2;
        num2 = num1;
    }

    public float add(float num1, float num2){
        return num1 + num2;
    }

    public float subtract(float num1, float num2){
        return num1 - num2;
    }

    public float multiply(float num1, float num2){
        return num1 * num2;
    }

    public float divide(float num1, float num2){
        return num1 / num2;
    }
}
