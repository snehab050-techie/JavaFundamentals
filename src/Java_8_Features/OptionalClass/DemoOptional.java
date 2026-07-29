package Java_8_Features.OptionalClass;

import java.util.Optional;

class Books{

    private int bookId;
    private String bookName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
public class DemoOptional {
    static void main() {
        Books b = new Books();
        b.setBookId(101);
        b.setBookName(null);

//        System.out.println(b.getBookName());

        //Find book with length 5
        // null checks are mandatory otherwise if values is null - throws NPE at runtime
        // Here i'm calling a method on a null object - NPE
//        System.out.println(b.getBookName().length());

        //To avoid NPE - Optional was introduced - which says if the value is present use it otherwise continue
        Optional<String> opt = Optional.ofNullable(b.getBookName());
        Optional<String> value = opt.orElse("Book name not found").describeConstable();

        System.out.println(value);

        //orElseThrow()
        String empEmail = null;
        Optional<String> emailOpt =Optional.ofNullable(empEmail);

        Optional<String>  v = emailOpt.orElseThrow(() -> new RuntimeException("email is empty")).describeConstable();
        System.out.println(v);
    }
}
