import lombok.AllArgsConstructor;

@AllArgsConstructor
class Mapper {
    public CustomerDto toDto(Customer customer) {
        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        return new CustomerDto(firstName, lastName);
    }

    public Customer toCustomer(CreateCustomerDto customerDto) {
        return new Customer(customerDto.getFirstName(), customerDto.getLastName(),
                customerDto.getPassword());
    }
}
