package cn.joylau.code.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JoyLau on 2017/7/3.
 * cn.joylau.code.test
 * 2587038142@qq.com
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping
    public String index(){
        return "hello,index!";
    }
}
