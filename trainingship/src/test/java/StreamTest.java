import com.alibaba.fastjson.JSONObject;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import pojo.Weapon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    public void  test(){
        System.out.println(1111111);
    }
    /**
     * 类型转换 List<Map<String, Object>> -> List<BlackProductVo>
     */
    @Test
    public void AList2BList() {
        List<Map<String, Object>> list = Lists.newArrayList(new HashMap<>());
            List<Weapon> blackProductVoList = list.stream().map((item) -> {
                Weapon blackProductVo = new Weapon();
                blackProductVo.setCode("");
            return blackProductVo;
        }).collect(Collectors.toList());

        System.out.println(JSONObject.toJSONString(blackProductVoList));
    }

    /**
     * 综合案例
     */
    public void integratedCase(String str){


    }
}
