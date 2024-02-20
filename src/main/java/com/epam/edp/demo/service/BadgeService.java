```java
package com.epam.edp.demo.service;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing badges.
 */
@Service
public class BadgeService {

    private final BadgeRepository badgeRepository;

    @Autowired
    public BadgeService(BadgeRepository badgeRepository) {
        this.badgeRepository = badgeRepository;
    }

    /**
     * Fetch all badges from the database.
     *
     * @return list of badges
     */
    public List<Badge> getAllBadges() {
        return badgeRepository.findAll();
    }
}
```
