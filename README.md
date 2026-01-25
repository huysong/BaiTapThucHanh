# BaiTapThucHanh-Tống Khánh Huy-BIT230469

# Can't Unsee
Bài tập này tập trung vào việc rèn luyện khả năng **so sánh hình ảnh và phát hiện lỗi giao diện (UI bugs)** thông qua nền tảng **Can't Unsee**. Can't Unsee là một công cụ giúp cải thiện kỹ năng kiểm thử giao diện bằng cách yêu cầu người dùng tìm ra sự khác biệt tinh tế giữa hai phiên bản thiết kế.

Các bước thực hiện bài tập
1. Truy cập website: **Can't Unsee**
2. Thực hiện các câu hỏi theo thứ tự từ dễ đến khó
3. Quan sát và so sánh chi tiết giữa các cặp hình ảnh giao diện
4. Chọn đáp án thể hiện đúng sự khác biệt hoặc lỗi thiết kế

Sau khi hoàn thành các câu hỏi từ dễ đến khó, tôi đã đạt được điểm số 7030

## Kiến thức và kỹ năng thu được
Thông qua bài tập, tôi đã học và rèn luyện được:

- Khả năng quan sát chi tiết trong giao diện người dùng (UI)
- Nhận diện các lỗi UI phổ biến:
  - Căn lề (alignment)
  - Khoảng cách (spacing)
  - Kích thước và tỷ lệ (size & proportion)
  - Màu sắc và độ tương phản (color & contrast)
  - Tính nhất quán (consistency)
- Tư duy kiểm thử giao diện theo góc nhìn của người dùng cuối
- Nâng cao sự cẩn thận và tập trung khi review thiết kế

<img width="1918" height="1079" alt="image" src="https://github.com/user-attachments/assets/52e70e51-b878-44f2-9f30-13dc5a886b47" />

# JUnit

Trong bài tập này, tôi đã tạo chương trình StudentAnalyzer.java nhằm phân tích điểm số của học sinh và StudentAnalyzerTest.java cho việc kiểm thử thành phần (unit test). Chương trình sử dụng JUnit phiên bản 5.9.2.

Các bước thực hiện:

Bước 1: Tạo dự án Maven
Bước 2: Trong demo/src/main/java/com/example, tạo file StudentAnalyzer.java và thêm 2 phương thức **countExcellentStudents()** và **calculateValidAverage()**
Bước 3: trong demo/src/test/java, tạo file StudentAnalyzerTest.java và 2 phương thức để kiểm thử cho **countExcellentStudents()** và **calculateValidAverage()**
Bước 4: chạy mvn test trong terminal
Kết quả:
<img width="883" height="333" alt="image" src="https://github.com/user-attachments/assets/094328f7-34d8-423e-b21d-9f2f50cdd6b8" />

# Cypress
Dự án này được thực hiện trong khuôn khổ học phần **Kiểm thử phần mềm**, nhằm mục tiêu làm quen và thực hành kiểm thử tự động End-to-End (E2E) bằng công cụ **Cypress**.

Trang web được sử dụng để kiểm thử là:
- https://www.saucedemo.com  
Đây là một website mẫu mô phỏng cửa hàng trực tuyến, phục vụ cho việc học và thực hành kiểm thử tự động.

Mục tiêu:
- Hiểu quy trình và xây dựng kịch bản kiểm thử đầu cuối (E2E)
- Cài đặt và cấu hình Cypress trong dự án Node.js
- Viết và chạy các test case kiểm thử tự động
- Kiểm thử trang đăng nhập và trang giỏ hàng

Khởi chạy dự án:
- Khởi tạo project Node.js
```bash
mkdir cypress
cd cypress
npm init -y
```
- Cài đặt Cypress:
 ```bash
npm install cypress --save-dev
```
- Mở Cypress:
```bash
npx cypress open
```
File kiểm thử: login-spec.cy.js cho file đăng nhập, cart-spec.cy.js cho file giỏ hàng
- Ảnh sau khi test đăng nhập
<img width="1919" height="912" alt="Screenshot 2026-01-25 194826" src="https://github.com/user-attachments/assets/af325d06-7b76-4525-9240-626952773dcd" />

- Sau khi test giỏ hàng
<img width="1919" height="907" alt="Screenshot 2026-01-25 194908" src="https://github.com/user-attachments/assets/084cf429-37f8-44e5-aef9-5e0a23734338" />
