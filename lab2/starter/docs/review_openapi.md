# Review Hợp Đồng OpenAPI — catalog-service (API-first)

## 1. Bảng Đánh Giá Các Endpoint

| Thao tác | Mã thành công | Mã lỗi đã khai báo | An toàn (Safe)? | Idempotent? |
| :--- | :--- | :--- | :--- | :--- |
| `GET /api/v1/books` | 200 | 400 | Có | Có |
| `POST /api/v1/books` | 201 + `Location` + `ETag` | 400, 409 | Không | Không |
| `GET /api/v1/books/{isbn}` | 200 + `ETag` / 304 | 404 | Có | Có |
| `PUT /api/v1/books/{isbn}` | 200 + `ETag` mới | 400, 404, 412, 428 | Không | Có |
| `DELETE /api/v1/books/{isbn}` | 204 | 404 | Không | Có |

## 2. Ràng Buộc Schema (Validation)
* `Isbn13`: Biểu thức chính quy `^(97[89][0-9]{10})$`.
* `Money`: Cấu trúc bắt buộc `minimum: 0`, `multipleOf: 0.01`.
