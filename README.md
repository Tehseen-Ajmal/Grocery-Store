# 🛒 Grocery Store Management System

A full-featured Java-based Grocery Store application with separate modules for **Admin** and **User**. The system connects to a **Microsoft SQL Server** database through JDBC.

---

## 📌 Features

### ✅ Admin App (`Main_Frame.java`)
- Manage employees (add, remove, view)  
- Manage products (add, update, remove, view)  
- Manage customers (add, update, remove, view)  

---

### 🛍️ User App (`User_Grocery.java`)
- Browse products  
- Add to cart and place orders  

📸 **Preview:**  

---
![User_Grocery](https://github.com/Tehseen-Ajmal/Grocery-Store/blob/main/user-2.jpg)

---

<p align="center">
  <img src="https://github.com/Tehseen-Ajmal/Grocery-Store/blob/main/src/resources/User_Grocery.gif" width="49%">
  <img src="https://github.com/Tehseen-Ajmal/Grocery-Store/blob/main/src/resources/Admin.gif" width="49%">
</p>


---

## 🗄️ Database Setup

This project requires a **SQL Server** database.  
To set it up:

1. Create a new database in SQL Server.
2. Update your database connection settings in the file:  
   `src/Const.java`  
   (Set your **username**, **password**, and **database name** here.)  
3. Ensure you have a `Products` table and other relevant tables as required by the project.

---

## 🔧 Technologies Used

- Java (Swing for GUI)  
- SQL Server (via JDBC)  
- IntelliJ IDEA  
- Git & GitHub  

---

## 🚀 Getting Started

1. Clone the repository using the following command:

```bash
git clone https://github.com/Tehseen-Ajmal/Grocery-Store.git
```

2. Create your SQL Server database  
3. Configure `Const.java` with your DB credentials  
4. Run the Admin or User apps from:
   - `Main_Frame.java` for Admin
   - `User_Grocery.java` for User

---

## 🙌 Credits

Made with 💻 by [Tehseen Ajmal](https://github.com/Tehseen-Ajmal)

🖼️ **Product Images Credit:** Thanks to my class fellows for contributing product images.
