package hu.terray.andras.java10;

public class LocalVariableInference {
    public static void main(String[] args) {
        var message = "Hello, Java 10";
        System.out.println(message.getClass().getSimpleName());

        var localVariableInference = new LocalVariableInference();
        System.out.println(localVariableInference.getClass().getSimpleName());
    }
}
