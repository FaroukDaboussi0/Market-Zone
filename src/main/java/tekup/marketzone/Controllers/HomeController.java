package tekup.marketzone.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
public class HomeController {
    @GetMapping("/")
    public String home() {
        // Return the name of the HTML file for your home page
        return "index"; // Assuming index.html is your home page
    }
}
