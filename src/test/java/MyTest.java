import com.tuzhi.pojo.Book;
import com.tuzhi.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 20:07
 **/

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        List<Book> books = bookService.selectBook();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
