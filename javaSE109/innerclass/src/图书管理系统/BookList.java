package 图书管理系统;

public class BookList {

    Book[] books = new Book[10];
    
    private int count;

    // 实例代码块初始化
    {
        books[0] = new Book("三国演义","罗贯中",23);
        books[1] = new Book("西游记","吴承恩",24);
        books[2] = new Book("红楼梦","曹雪芹",25);
    }


    public void setBooks(int index,Book book){
        books[index] = book;
    }


    public Book getbook(int index){
       return books[index];
    }

    public int getCount(){
        return books.length;
    }

}
