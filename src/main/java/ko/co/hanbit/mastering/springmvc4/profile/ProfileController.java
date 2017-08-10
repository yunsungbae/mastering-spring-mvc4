package ko.co.hanbit.mastering.springmvc4.profile;

/**
 * Created by bys on 2017-08-10.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ProfileController {
    @RequestMapping("/profile")
        public String displayPfofile(ProfileForm profileForm){
        return "profile/profilePage";
    }
    @RequestMapping(value="/profile",method = RequestMethod.POST)
    public String savePfile(ProfileForm profileForm){
            System.out.println("save ok"+profileForm);
            return  "redirect:/profile";
    }
}
