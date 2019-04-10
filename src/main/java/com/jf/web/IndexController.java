package com.jf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 国际化 测试
 * ouyangjie
 * 2019/4/10
 * 13:10
 */
@Controller
public class IndexController {


    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 切换语言
     * @return
     */
    @RequestMapping("/change")
    public String change(){
        return "index";
    }

}
