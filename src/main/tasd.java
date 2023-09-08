@PostMapping("/checkout")
    public String checkout(@RequestParam("customerID") Long customerID,
            @RequestParam("vegetableIDs") Iterable<Long> vegetableIDs,
            @RequestParam("quantities") Iterable<Integer> quantities) {
        // Tạo đối tượng Order
        Order order = new Order();
        order.setCustomer(new Customer(customerID)); // Đặt khách hàng dựa trên ID
        order.setDate(new Date());
        order.setTotal(0); // Tạm thời đặt tổng thành 0
        order.setNote("");
        // Lưu hóa đơn vào cơ sở dữ liệu
        orderRepository.save(order);
        float total = 0;
        // Tạo đối tượng OrderDetail cho từng sản phẩm trong giỏ hàng
        for (int i = 0; i < vegetableIDs.size(); i++) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrder(order);
            orderDetail.setVegetable(new Vegetable(vegetableIDs.get(i))); // Đặt sản phẩm dựa trên ID
            orderDetail.setQuantity(quantities.get(i));
            // Lấy giá của sản phẩm từ cơ sở dữ liệu
            Vegetable vegetable = orderDetail.getVegetable();
            float price = vegetable.getPrice();
            orderDetail.setPrice(price);
            // Tính tổng giá của đơn hàng
            total += price * quantities.get(i);
            // Lưu chi tiết hóa đơn vào cơ sở dữ liệu
            orderDetailRepository.save(orderDetail);
        }
        // Cập nhật tổng giá cho hóa đơn
        order.setTotal(total);
        orderRepository.save(order);
        // Chuyển hướng người dùng đến trang thành công hoặc thông báo
        return "redirect:/success";
    }
    