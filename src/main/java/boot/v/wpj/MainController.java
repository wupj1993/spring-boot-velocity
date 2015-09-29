package boot.v.wpj;

import boot.v.wpj.daomain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by Administrator on 2015/9/29.
 */
@Controller
public class MainController {
    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        map.put("name","吴培基");
        User user=new User("小吴",23,20000f);
        map.put("user",user);
        Map<String,Object> myMap=new HashMap<String, Object>();
        myMap.put("one","一号");
        myMap.put("two","二号");
        myMap.put("three","三号");
        myMap.put("four","四号");
        map.put("myMap",myMap);
        Vector vector=new Vector();
        vector.add("元素一");
        vector.add("元素2");
        vector.add("元素3");
        vector.add("元素4");
        vector.add("元素5");
        map.put("vector",vector);
    return "index";
}
}
