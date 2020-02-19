import com.code.LeetCode;
import com.code.template.Manual;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class JunitTest {

    @Test
    public void test1(){
        sout("23");
    }

    @Test
    public void test2(){
        sout("ab");
    }

    @Test
    public void test3(){
        sout("ab23");
    }

    @Test
    public void test4(){
        sout("");
    }

    @Test
    public void test5(){
        sout(null);
    }

    public void sout(String string){
        LeetCode t = new Manual();
        List<String> strings = t.letterCombinations(string);
        System.out.println(strings.stream().collect(Collectors.joining(" ")));
    }
}
