Nhóm 4:
 Lê Đại Thắng - B19DCCN657
 Đào Ngọc Huy - B19DCCN305
Chạy lệnh trước khi chạy:
install: mvn install
Khời tạo database theo sql/createmysql.txt
run: mvn spring-boot:run

Mô tả cách làm và đầu việc của từng bạn: 
    +) Lê Đại Thắng:  
      - Code ProductEntity : Sử dụng Spring data jpa để ánh xạ thực thể với database mysql
      - Code Service layer : Sử dụng Spring data Jpa để code các chức năng dịch vụ thao tác với dữ liệu CRUD (Thêm, Đọc, Sửa, Xóa)
      - Code Controller Layer : 
        + Sử dụng các mapping URL trong spring để ánh xạ xác đường dẫn (@GetMapping, @PostMapping) trả về View
      - Code database sử dụng mysql
      - Khởi tạo project và up lên git
    +) Đào Ngọc Huy:
      - Sử dụng thymleaf để hiện thị giao diện
      - Sử dụng Model để lấy dữ liệu từ database về
      - Code giao diên: 
        +) home
        +) product
      - Có sử dụng thư viện bootstrap4 để làm đẹp giao diện
