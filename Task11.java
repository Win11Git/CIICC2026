
class Book{
        String title;
        String author;
        int yearPublished;
        double price;
        public Book(String title, String author, int yearPublished, double price){
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
        }
    }
    public class Task11 {
        public static void main(String[] args) {
            Book [] books = new Book[]{
                new Book("Java Programming", "John Smith", 2021, 39.99),
                new Book("Python Basics", "Jane Doe", 2020, 29.99),
                new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)

               
            };
            for (int i = 0; i<books.length;i++){
                System.out.println("Book " + (i+1) + ":");
                System.out.println("Title: " + books[i].title);
                System.out.println("Author: " +  books[i].author);
                System.out.println("Year Published: " + books[i].yearPublished);
                System.out.println("Price: $" + books[i].price + "\n");

            }
            
        }
    
        
    }
