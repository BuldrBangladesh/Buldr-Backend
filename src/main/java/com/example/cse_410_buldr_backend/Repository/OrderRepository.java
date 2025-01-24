package com.example.cse_410_buldr_backend.Repository;

import com.example.cse_410_buldr_backend.Entity.NoteTags;
import com.example.cse_410_buldr_backend.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    @Query(value="SELECT * FROM  orders  WHERE   orders.user_id=?1",nativeQuery = true)
    List<Order> searchByOrderByUserId(long id);
    @Query(value="SELECT * FROM  orders  WHERE   orders.orderid=?1",nativeQuery = true)
    Order searchByOrderById(long id);
}
