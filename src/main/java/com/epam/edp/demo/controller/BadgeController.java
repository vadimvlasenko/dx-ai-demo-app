```
package com.epam.edp.demo.controller;

import com.epam.edp.demo.service.BadgeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing Badges.
 */
@RestController
@RequestMapping("/badges")
public class BadgeController {
    
    private final BadgeService badgeService;
    
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }
    
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
```