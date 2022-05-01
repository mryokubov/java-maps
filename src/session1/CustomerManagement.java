package session1;

import java.awt.desktop.ScreenSleepEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerManagement {

    public static void main(String[] args) {

        //  SSN     Customer
        Map<String, Customer> customers = new HashMap<>();

        Customer  customer1 = new Customer("1234567", "James Peterson", "123 main street", 5657.87);
        Customer  customer2 = new Customer("7657664", "Kevin Lee", "125 main street", 9867);
        Customer  customer3 = new Customer("6845465", "Walter Jackson", "127 main street", 675345);
        Customer  customer4 = new Customer("4548879", "Mason Tyler", "129 main street", 35556);
        Customer  customer5 = new Customer("6587657", "Harry Potter", "131 main street", 565798697.87);

        customers.put( customer1.getSsn(), customer1 );

        customers.put( customer2.getSsn(), customer2 );
        customers.put( customer3.getSsn(), customer3 );
        customers.put( customer4.getSsn(), customer4 );
        customers.put(customer5.getSsn(), customer5);

        System.out.println(customers);



        //2 plus 2 must be 4
        // 2 plus 2 is 5

    }
}
