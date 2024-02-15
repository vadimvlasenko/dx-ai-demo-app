```java
package com.epam.edp.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Badge entity representing a reward or achievement that can be earned by users.
 */
@Entity
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badgeId;

    @Column(nullable = false)
    private String badgeName;

    private String description;

    @Column(nullable = false)
    private Integer pointsRequired;

    private String badgeImage;

    @Column(nullable = false)
    private LocalDateTime createDate;

    @Column(nullable = false)
    private LocalDateTime updateDate;

    // Constructors, getters and setters
}
```