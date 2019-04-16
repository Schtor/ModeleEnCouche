package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class MemoryCustomerDAO implements CustomerDAO {

	private static final Map<Integer, Customer> DB = new HashMap<>();

	private static int id;
	
	@Override
	public void save(Customer c) {
	
		c.setId(id);
		DB.put(c.getId(), c);
		id++;
		
	}

	@Override
	public Customer findById(int id) {
		
		return DB.get(id);
	}

	@Override
	public void delete(int id) {
		DB.remove(id);
	}

	@Override
	public List<Customer> findAll() {
		
		return new ArrayList<>(DB.values());
	}

	
	
}
