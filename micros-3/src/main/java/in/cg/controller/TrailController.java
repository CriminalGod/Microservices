package in.cg.controller;

import in.cg.AppCGProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trail")
@RequiredArgsConstructor
public class TrailController {

    private final AppCGProperties appCGProperties;

    @GetMapping
    public String hello() {
        return appCGProperties.getName() + " " + appCGProperties.getVersion() + " " + appCGProperties.getAuthor();
    }

}
