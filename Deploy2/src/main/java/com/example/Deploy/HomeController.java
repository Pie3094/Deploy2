package com.example.Deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HomeController {
    @GetMapping("/sum")
    public int getSum() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        return num1 + num2;
    }
}

// java -jar target/Deploy-0.0.6-SNAPSHOT.jar prod
// java -jar target/Deploy-0.0.6-SNAPSHOT.jar test