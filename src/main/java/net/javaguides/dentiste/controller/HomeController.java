package net.javaguides.dentiste.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
        @GetMapping("/")
         public String home(){
             return " Home";
         }
        @GetMapping("/store")
        public String store(){
            return " Store";
        }
        @GetMapping("/admin/home")
        public String getAdminHome(){
            return " AdminHome ";
        }
        @GetMapping("/client/home")
        public String getClientHome(){
            return " ClientHome";
        }
}
