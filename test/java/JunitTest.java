import com.code.LeetCode;
import com.code.template.Manual;
import org.junit.Test;

import java.util.List;

public class JunitTest {

    @Test
    public void test1(){
        LeetCode t = new Manual();
        List<String> strings = t.letterCombinations("23");
        System.out.println(strings.toString());
    }
    
     @Test
    public void test2(){
        LeetCode t = new Manual();
        List<String> strings = t.letterCombinations("ab");
        System.out.println(strings.toString());
    }

    @Test
    public void test3(){
        LeetCode t = new Manual();
        List<String> strings = t.letterCombinations("ab23");
        System.out.println(strings.toString());
    }

    @Test
    public void test4(){
        LeetCode t = new Manual();
        List<String> strings = t.letterCombinations("");
        System.out.println(strings.toString());
    }

    @Test
    public void test5(){
        LeetCode t = new Manual();
        List<String> strings = t.letterCombinations(null);
        System.out.println(strings.toString());
    }
}
