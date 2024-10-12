// 6510405458 Nakorn Boonprasong
package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawaddee");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home";
    }
}
/*
สังเกต annotation @Controller Spring จะสร้าง object นี้ให้อัตโนมัติ และมีลักษณะเป็น controller ในโครงสร้าง MVC (ต่างจาก @RestController ที่เราใช้สำหรับ API)
สังเกต annotation @RequestMapping จะต่อด้วย endpoint หมายความว่า ไม่ว่าจะเป็น REST function ใดที่เรียก endpoint "/" ก็จะมาที่เมทอดนี้*
* */
