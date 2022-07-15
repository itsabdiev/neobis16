package com.sunny.donutShop.Controller;


import com.sunny.donutShop.Entity.AppUser;
import com.sunny.donutShop.Entity.Donut;
import com.sunny.donutShop.Entity.ExtraDonut;
import com.sunny.donutShop.Entity.RegistrationRequest;
import com.sunny.donutShop.Service.AppUserService;
import com.sunny.donutShop.Service.DonutService;
import com.sunny.donutShop.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.WebAttributes;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class DonutShopController {
    private final DonutService donutService;
    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private AppUserService appUserService;
    @Autowired
    public DonutShopController(DonutService donutService) {
        this.donutService = donutService;
    }



    @GetMapping("/")
    public String successMainPage() {
        return "Welcome to our site!";
    }
    @GetMapping("/getAllDonuts")
    public List<Donut> getThemAll() {
        return donutService.findDonuts();
    }
    @GetMapping(path = "/login")
    public ModelAndView login(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String errorMessage = null;
        if (session != null) {
            AuthenticationException ex = (AuthenticationException) session
                    .getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
            if (ex != null) {
                errorMessage = ex.getMessage();
            }
        }
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("errorMessage", errorMessage);
        modelAndView.addObject("user",new AppUser());
        return modelAndView;
    }
    @GetMapping("/darkzone")
    public String darkzone() {
        return "Only for creators";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute RegistrationRequest registrationRequest) {
        registrationService.register(registrationRequest);
        return "Confirmation link was sent to " + registrationRequest.getEmail() + ",check your inbox";
    }
    @GetMapping(path = "/confirm")
    public String confirm(@RequestParam("token") String token) {
        registrationService.confirmToken(token);
        return "Your account has been confirmed";
    }

    @PostMapping("/admin/saveDonut")
    public String saveProduct(@ModelAttribute ExtraDonut extraDonut) {
        donutService.save(extraDonut);
        return "redirect:/donuts/getAll";
    }
    @DeleteMapping("/admin/removeDonut/{id}")
    public ResponseEntity<String> deleteDonut(@PathVariable Long id) {
        return donutService.deleteById(id);
    }

    @GetMapping("/getDonutById/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return donutService.findById(id);
    }

    @PatchMapping("/admin/updateDonut")
    public ResponseEntity<String> updateDonut(@RequestBody Donut donut) {
        return donutService.update(donut);
    }

}


