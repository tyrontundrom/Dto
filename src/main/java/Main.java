class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Marian", "Kowal", "password");
        Mapper mapper = new Mapper();
        CustomerDto customerDto = mapper.toDto(customer);
        System.out.println(customerDto);
        Customer customer1 = mapper.toCustomer(new CreateCustomerDto(customerDto.getFirstName(),
                customerDto.getLastName(), "pass"));
        System.out.println(customer1);
    }
}
