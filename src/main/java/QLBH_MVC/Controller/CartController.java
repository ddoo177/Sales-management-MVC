//package QLBH_MVC.Controller;
//
//import QLBH_MVC.Entity.*;
//import QLBH_MVC.Repository.*;
//import java.util.Date;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class CartController {
////
////    @Autowired
////    private OrderRepository orderRepository;
////
////    @Autowired
////    private OrderDetailRepository orderDetailRepository;
//
//    @GetMapping("/cart")
//    public String cartPage() {
//        return "cart";
//    }
//
//   @GetMapping("/cart")
//   public String cartPage(Model m) {
//       Iterable<Order> orders = orderRepository.findAll();
//       Iterable<OrderDetail> orderDetails = orderDetailRepository.findAll();
//       m.addAttribute("orders", orders);
//       m.addAttribute("orderDetails", orderDetails);
//       return "cart";
//   }
//
//   @PostMapping("/checkout")
//   public String checkout(@RequestParam("customerID") Long customerID,
//           @RequestParam("vegetableIDs") Iterable<Long> vegetableIDs,
//           @RequestParam("quantities") Iterable<Integer> quantities) {
//       Order order = new Order();
//       order.setCustomer(new Customer(customerID)); 
//       order.setDate(new Date());
//       order.setTotal(0);
//       order.setNote("");
//       orderRepository.save(order);
//       float total = 0;
//       for (int i = 0; i < vegetableIDs.size(); i++) {
//           OrderDetail orderDetail = new OrderDetail();
//           orderDetail.setOrder(order);
//           orderDetail.setVegetable(new Vegetable(vegetableIDs.get(i)));
//           orderDetail.setQuantity(quantities.get(i));
//
//           Vegetable vegetable = orderDetail.getVegetable();
//           float price = vegetable.getPrice();
//           orderDetail.setPrice(price);
//           total += price * quantities.get(i);
//           orderDetailRepository.save(orderDetail);
//       }
//       order.setTotal(total);
//       orderRepository.save(order);
//       return "redirect:/success";
//   }
//}
//
//
