package hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/customers")
public class CustomerResource {
    private final AtomicLong counter = new AtomicLong();

    private Map<Long, Customer> customers = new HashMap<>();
    private Map<Long, Agreement> agreements = new HashMap<>();


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Map<Long, Customer> getCustomers() {
        return customers;
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public @ResponseBody Customer getCustomer(@PathVariable Long customerId) {
        return customers.get(customerId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
        customers.put(counter.incrementAndGet(), customer);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(counter.get()).toUri();
        return ResponseEntity.created(location).build();
    }
}