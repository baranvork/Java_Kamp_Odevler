
public class Program {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.firstName = "Baran";
        customer.lastName = "Baþaran";
        customer.id = 1;
        customer.dateTimeofBirth = "2000";
        customer.nationalityId = "12345";
        
        Customer customer2 = new Customer();

        customer2.firstName = "Baran";
        customer2.lastName = "Basaran";
        customer2.id = 2;
        customer2.dateTimeofBirth = "1999";
        customer2.nationalityId = "12345";

        BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager1.save(customer);

        BaseCustomerManager customerManager2 = new NeroCustomerManager(new CustomerCheckManager());
        customerManager2.save(customer2);


    }

}
