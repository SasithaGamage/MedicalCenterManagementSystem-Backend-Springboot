package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.OrderRepo;

import com.example.demo.model.Orders;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	
	@Autowired
	private OrderRepo orders;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping("/orders")
	public Orders addOrderDetails(@RequestBody Orders order1) {
		
		
		orders.save(order1);
		
		
		return order1;
	}
	
	
	@GetMapping(path = "/orders")
	public List<Orders> getOrderDetails(){
		return orders.findAll();
	}
	
	@DeleteMapping("/orders/{oId}")
	public List<Orders> deleteOrderDetails(@PathVariable Long oId) {
		Orders ord = orders.getOne(oId);
		
		orders.delete(ord);
		
		return orders.findAll();
	}
	
	@PutMapping(path = "/orders/{oId}")
	public Orders saveOrUpdateOrderDetails(@RequestBody Orders order) {
		orders.save(order);
		return order;
	}
	
	
	
	@RequestMapping("/orders/{oId}")
	
	public Optional<Orders> getOrderDetails(@PathVariable("oId") Long oId) {
	
		return orders.findById(oId);
	}
}
	

	
//	@CrossOrigin(origins = "http://localhost:4200")
//	@RestController
//	@RequestMapping("/api/v1")
//	public class OrderController {
//		@Autowired
//		private OrderRepo orderRepository;
//
//		@GetMapping("/orders")
//		public List<OrderDetails> getAllEmployees() {
//			return orderRepository.findAll();
//		}
//
//		@GetMapping("/orders/{id}")
//		public ResponseEntity<OrderDetails> getEmployeeById(@PathVariable(value = "id") Long employeeId)
//				throws ResourceNotFoundException {
//			OrderDetails order = orderRepository.findById(employeeId)
//					.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//			return ResponseEntity.ok().body(order);
//		}
//
//		@PostMapping("/orders")
//		public OrderDetails createEmployee(@RequestBody OrderDetails order) {
//			return orderRepository.save(order);
//		}
//
//		@PutMapping("/orders/{id}")
//		public ResponseEntity<OrderDetails> updateEmployee(@PathVariable(value = "id") Long Order_Id,
//				@RequestBody OrderDetails orderDetails) throws ResourceNotFoundException {
//			OrderDetails order = orderRepository.findById(Order_Id)
//					.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + Order_Id));
//
//			
//			order.setMedicine(orderDetails.getMedicine());
//			order.setQuantity(orderDetails.getQuantity());
//			order.setSupplier_Name(orderDetails.getSupplier_Name());
//			order.setSupplier_mobile(orderDetails.getSupplier_mobile());
//			order.setType(orderDetails.getType());
//			final OrderDetails updatedOrder = orderRepository.save(order);
//			return ResponseEntity.ok(updatedOrder);
//		}
//
//		@DeleteMapping("/orders/{id}")
//		public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long Order_Id)
//				throws ResourceNotFoundException {
//			OrderDetails order = orderRepository.findById(Order_Id)
//					.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + Order_Id));
//
//			orderRepository.delete(order);
//			Map<String, Boolean> response = new HashMap<>();
//			response.put("deleted", Boolean.TRUE);
//			return response;
//		}
//	
//	
//	
//}
