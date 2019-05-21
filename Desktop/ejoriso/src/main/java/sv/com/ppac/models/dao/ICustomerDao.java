package sv.com.ppac.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.ppac.models.entities.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long> {

}
