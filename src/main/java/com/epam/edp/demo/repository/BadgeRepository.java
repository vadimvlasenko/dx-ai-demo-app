package com.epam.edp.demo.repository;

import com.epam.edp.demo.entity.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Badge entity.
 */
@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
}
