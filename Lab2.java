import java.util.ArrayList;
import java.time.LocalDate;

class Author {
	private String name;
	private int YearOfBirth;
	public Author(String name, int YearOfBirth) {
		this.YearOfBirth = YearOfBirth;
		this.name = name;
	}
	public String getAuthorName() {
		return this.name;
	}
	public int getYearOfBirth() {
		return this.YearOfBirth;
	}
	public void setAuthorName(String name) {
		this.name = name;
	}
	public void setYearOfBirth(int YearOfBirth) {
		this.YearOfBirth=YearOfBirth;
	}
}

class Book {
	private String title;
	private int items;
	private Author author;
	public Book(String title, Author author,int items) {
		this.title = title;
		this.items = items;
		this.author = author;
	}
	public String getTitle() {
		return this.title;
	}
	public int getItems() {
		return this.items;
	}
	public Author getAuthor() {
		return this.author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setItems(int items) {
		this.items=items;
	}
}

class Library {
	private int currentNumberOfUniqueBooks;
	private Book[] bookList;
	private int count  = 0;
	private ArrayList<Integer> borrowed;
	public Library (int currentNumberOfUniqueBooks) {
		this.currentNumberOfUniqueBooks = currentNumberOfUniqueBooks;
		this.bookList = new Book[currentNumberOfUniqueBooks];
		this.borrowed = new ArrayList<Integer>();
	}
	public void addBook(Book book) {
		if (count < bookList.length) {
			this.bookList[count] = book;
			count++;
		}
	}
	public void whichBooks() {
		for (int i = 0; i < count ; i++) {
			System.out.println(bookList[i]);
		}
	}
	public void whichAuthors() {
		for (int i = 0; i < count ; i++) {
			System.out.println(bookList[i].getAuthor().getAuthorName());
		}
	}
	public void borrowBook(Book book) {
		for (int i = 0; i < count ; i++) {
			if (bookList[i] == book) {
				if (borrowed.contains(i)) {
					System.out.println("Book not avaliable");
				} else {
					borrowed.add(i);
					System.out.println("Book borrowed successfully, at:" +LocalDate.now());
				}
				break;
			}
		}
	}
	public void returnBook(Book book) {
		for (int i = 0; i < count ; i++) {
			if (bookList[i] == book) {
				if (borrowed.contains(i)) {
					for (int j = 0; j < borrowed.size(); j++) {
						if (borrowed.get(j) == i) {
							borrowed.remove(j);
							System.out.println("Book returned");
							break;
						}
					}
				} 
			}
	}}
	public static void main(String[] args){
    System.out.println("Starting my new library\n");
    //1. Create library
    Library l= new Library(100);
    //2. Populate library
    //Add 'Oscar Wilde' as a new author
    Author a1 = new Author("Oscar Wilde", 1889);
    //Add three items of 'The Importance of Being Earnest' to the library
    Book b1 = new Book("The Importance of Being Earnest", a1, 3);
    l.addBook(b1);
    //Add two items of 'The Picture of Dorian Gray' to the library
    Book b2 = new Book("The Picture of Dorian Gray", a1, 2);
    l.addBook(b2);
    //Add 'Charles Dickens' as a new author
    Author a2 = new Author("Charles Dickens", 1812);
    //Add five items of 'The Picture of Dorian Gray' to the library
    Book b3 = new Book("Oliver Twist", a2, 3);
    l.addBook(b3);
    //3. Explore library
    l.whichBooks();
    l.whichAuthors();
    //4. Interact with the library
    //Borrow Oliver Twist
    l.borrowBook(b3);
    //Return Oliver Twist
    l.returnBook(b3);
    //Borrow more than available
    l.borrowBook(b2);
    l.borrowBook(b2);
    l.borrowBook(b2);
}
	}

