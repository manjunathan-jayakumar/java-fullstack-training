package com.programming.class8;

public class LambdaExpressionUse4 {

    @FunctionalInterface
    public interface Converter<F, T> {
        T convert(F From);
    }

    public static void main(String[] args) {
        Converter<String, Integer> integerConvert = (from) -> Integer.valueOf( from );
        Integer convertedValue = integerConvert.convert("123");
        System.out.println(convertedValue);

        Converter<String, Integer> intConvert = Integer::valueOf;
        Integer convertValue = intConvert.convert("123");
        System.out.println(convertValue);

        CustomerFactory<Customer> obj3 = Customer::new;  // lambda
        Customer customer = obj3.create("ABC", "XYZ");

        System.out.println("Fist name is "+ customer.firstName);
        System.out.println("last name is "+ customer.lastName);

        Converter<String, String> obj4 = StartsWithString::startsWith;
        System.out.println(obj4.convert("Jenny"));
    }

    static class StartsWithString{  // use Convert to access this method using lambda.
        static String startsWith(String str) {
            return String.valueOf(str.charAt(0));
        }
    }
    interface CustomerFactory<P extends Customer> {
        P create(String firstName, String lastName);
    }

}
class Customer {
    String firstName;
    String lastName;
    Customer() {}
    public Customer(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }
}