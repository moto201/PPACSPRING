package sv.com.ppac.models.services;

import java.util.List;

import sv.com.ppac.models.entities.Customer;

public interface ICustomerService {
	public List<Customer> findAll();
	public void save (Customer customer);
	public Customer findOne(Long id);
	public void delete(Long id);
}
