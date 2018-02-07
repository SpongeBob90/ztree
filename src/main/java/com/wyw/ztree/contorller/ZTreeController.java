package com.wyw.ztree.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyw
 * @date 2018\2\6 0006 17:35
 */
@Controller
public class ZTreeController {

    @GetMapping(value = "/index")
    public String zTree() {
        return "html/zTree.html";
    }

}
