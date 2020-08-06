package com.wison;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class IndexController {

    @RequestMapping("/home.do")
    public String index(){
        return "aaa";
    }

    @RequestMapping("/json.do")
    @ResponseBody
    public Map<String,String> indexJ(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("cc","fwere");
        return map;
    }

}
