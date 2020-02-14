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
}
