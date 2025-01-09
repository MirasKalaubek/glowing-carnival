package kz.solvatech.coffee_for_solva.service;

import kz.solvatech.coffee_for_solva.dto.OrderDTO;
import kz.solvatech.coffee_for_solva.model.Order;
import kz.solvatech.coffee_for_solva.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Long findPopularRecipe() {
        return orderRepository.findMostPopularRecipe();
    }

    public void addOrder(OrderDTO orderDTO) {
        var order = new Order();
        order.setRecipeId(orderDTO.getRecipeId());
        order.setOrderDateTime(LocalDateTime.now());
        orderRepository.save(order);
    }
}
