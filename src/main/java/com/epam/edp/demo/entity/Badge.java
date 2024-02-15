package com.epam.edp.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Entity representing a Badge.
 */
@Entity
@Table(name = "badges")
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badgeId;

    @Column(name = "badge_name", nullable = false)
    private String badgeName;

    @Column(name = "description")
    private String description;

    @Column(name = "points_required", nullable = false)
    private Integer pointsRequired;

    @Column(name = "badge_image")
    private String badgeImage;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    // Constructors

    public Badge() {
    }

    // Getters and setters

    public Long getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(Long badgeId) {
        this.badgeId = badgeId;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPointsRequired() {
        return pointsRequired;
    }

    public void setPointsRequired(Integer pointsRequired) {
        this.pointsRequired = pointsRequired;
    }

    public String getBadgeImage() {
        return badgeImage;
    }

    public void setBadgeImage(String badgeImage) {
        this.badgeImage = badgeImage;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}