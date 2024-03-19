package stream;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingDemo {
    public static void main(String[] args) {
        List<Customer> customers = List.of(new Customer("name", List.of(new Address(
"H104","Str110","10102","USB"
        ))));
        customers.stream().collect(
                Collectors.toMap(new HashMap(cust.getName(), cust.getAddresses()))
        )
    }
}
