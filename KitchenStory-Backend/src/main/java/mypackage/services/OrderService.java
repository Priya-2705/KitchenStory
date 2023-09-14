package mypackage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.entities.Order;
import mypackage.repo.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orepo;

	public void saveOrder(Order order) {
		this.orepo.save(order);
	}

	public List<Order> getOrders() {
		return this.orepo.findAll();
	}

	public void deleteOrder(String id) {
		this.orepo.deleteById(id);
	}

	public Order getOrder(String id) {
		return this.orepo.findById(id).get();
	}
}