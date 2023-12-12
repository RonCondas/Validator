/*
Create a class with a method that accepts a charge account number as its argument. The method
should determine whether the number is valid by comparing it to the following list of valid
charge account numbers:
5658845 4520125 7895122 8777541 8451277 1302850
8080152 4562555 5552012 5050552 7825877 1250255
1005231 6545231 3852085 7576651 7881200 4581002
These numbers should be stored in an array. Use a sequential search to locate the number passed
as an argument. If the number is in the array, the method should return true, indicating the
number is valid. If the number is not in the array, the method should return false, indicating the
number is invalid.

 */


public class Validator {
    // Array of valid charge account numbers
    private int[] valid = {
        5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152,
        4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231,
        3852085, 7576651, 7881200, 4581002
    };

    // Default constructor - no additional action required as valid is already initialized
    public Validator() {}

    // Method to check if a given number is valid
    public boolean isValid(int number) {
        for (int i = 0; i < valid.length; i++) {
            if (valid[i] == number) {
                return true; // Return true if number is found
            }
        }
        return false; // Return false if number is not found
    }
}
