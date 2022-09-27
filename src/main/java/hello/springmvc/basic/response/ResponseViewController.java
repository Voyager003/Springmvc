package hello.springmvc.basic.response;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data","hello!");

        return mav;
    }

    // String 반환 @ResponseBOdy가 없으면 뷰 리졸버가 실행되어 뷰를 찾아 렌더링
    //                           있으면 HTTP 메시지 바디에 직접 문자를 입력
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data","hello!");

        return "response/hello";
    }

    @RequestMapping("/response/hello")
    public void responseViewV3(Model model){
        model.addAttribute("data","hello!");
        model.addAttribute("Data");
    }
}
