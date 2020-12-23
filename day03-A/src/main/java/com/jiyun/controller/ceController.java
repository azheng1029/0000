package com.jiyun.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ceController {
    @RequestMapping("/ce")
    @ResponseBody
    public String ce(){
//        System.out.println(11111);
        return "111";
    }

    /*@RequestMapping("/ce2")
    @ResponseBody
    public String ce2(){
//        System.out.println(11111);
        return "2222··1111";
    }
*//*    @RequestMapping("/cee")
    @ResponseBody
    public String cee(){
        return "yyyyy";
    }*//*



    private Logger logger = LoggerFactory.getLogger(ceController.class);
    @RequestMapping("/cee")
    @ResponseBody
    public String cw(){
        try{
            int i=10/0;
        }catch (Exception e){
            logger.error("cee错误"+e);
        }
        return "测试日志";
    }
*/
}
