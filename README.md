# 📚 Quantum Bookstore 🚀

Welcome to the **Quantum Bookstore** - a futuristic online book store management system built with Java! ✨

## 🌟 Features

### 📖 Book Types
- **📄 Paper Books** - Physical books with stock management and shipping
- **💻 E-Books** - Digital books delivered via email
- **🎭 Showcase Books** - Demo books for display only (not for sale)

### 🛠️ Core Functionality
- ➕ **Add Books** - Add new books to inventory with ISBN, title, year, price, and author
- 🗑️ **Remove Outdated Books** - Automatically remove books older than specified years
- 💰 **Purchase System** - Buy books with quantity, email, and address handling
- 📦 **Smart Delivery** - Paper books ship to addresses, e-books sent via email
- 📊 **Inventory Management** - Track stock levels and availability

## 🏗️ Architecture

### 📁 Project Structure
```
📂 Quantum Bookstore
├── 📄 Book.java (Abstract base class)
├── 📄 PaperBook.java (Physical books)
├── 💻 EBook.java (Digital books)
├── 🎭 ShowcaseBook.java (Demo books)
├── 🏪 Bookstore.java (Main store logic)
├── 📦 ShippingService.java (Shipping handler)
├── 📧 MailService.java (Email delivery)
└── 🧪 Main.java (Test suite)
```

### 🔧 Design Patterns
- **🎯 Strategy Pattern** - Different book types with unique behaviors
- **🏭 Template Method** - Abstract Book class with common structure
- **🔌 Service Pattern** - Separated shipping and mail services
- **🎨 Polymorphism** - Extensible design for new book types

## 🚀 Getting Started

### ⚡ Quick Start
1. **Compile all Java files:**
   ```bash
   javac *.java
   ```

2. **Run the test suite:**
   ```bash
   java Main
   ```

3. **Expected Output:**
   ```
   Quantum book store: Added Effective Java by Joshua Bloch to inventory
   Quantum book store: Added Clean Code by Robert Martin to inventory
   Quantum book store: Added Design Patterns by Gang of Four to inventory
   ...
   ```

### 📝 Usage Example
```java
// Create bookstore
BookStore bookstore = new BookStore();

// Add books
PaperBook paperBook = new PaperBook("ISBN123", "Java Guide", 2023, 39.99, "Author Name", 50);
EBook ebook = new EBook("ISBN456", "Digital Mastery", 2024, 19.99, "Tech Expert", "PDF");

bookstore.addBook(paperBook);
bookstore.addBook(ebook);

// Purchase books
double amount = bookstore.buyBook("ISBN123", 2, "customer@email.com", "123 Main St");
```

## 🎯 Key Features

### 🔄 Extensibility
The system is designed to be **easily extensible** - add new book types without modifying existing code:

```java
public class AudioBook extends Book {
    private String narrator;
    private int durationMinutes;
    
    // Implement abstract methods...
}
```

### 🛡️ Error Handling
- ❌ **Stock Validation** - Prevents overselling
- 🚫 **Availability Checks** - Blocks purchases of unavailable items
- 🔍 **ISBN Validation** - Ensures book exists before purchase

### 📊 Smart Inventory Management
- 📅 **Automatic Cleanup** - Remove books older than X years
- 📈 **Stock Tracking** - Real-time inventory updates
- 🔄 **Dynamic Pricing** - Flexible price management

## 🧪 Testing

The `Main` class demonstrates:
- ✅ Adding different book types
- ✅ Successful purchases
- ✅ Error handling for unavailable items
- ✅ Outdated book removal
- ✅ Stock validation

---
