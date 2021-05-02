public class NeroCustomerManager extends BaseCustomerManager{

    private CustomerCheckService _customerCheckService;

    public NeroCustomerManager(CustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    @Override
    public void save(Customer customer) {

        if(_customerCheckService.checkIfRealPerson(customer)) {

            System.out.println("Not a valid person!");
        }
        else {
        	super.save(customer);
        }
    }


}