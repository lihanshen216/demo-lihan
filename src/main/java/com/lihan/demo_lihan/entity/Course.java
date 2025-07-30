package com.lihan.demo_lihan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "edu_course", indexes = {
        @Index(name = "idx_teacher_id", columnList = "teacher_id"),
        @Index(name = "idx_category_id", columnList = "category_id")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "teacher_id", nullable = false)
    private Long teacherId;

    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "view_count", nullable = false)
    private Integer viewCount = 0;

    @Column(name = "student_count", nullable = false)
    private Integer studentCount = 0;

    @CreationTimestamp
    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(name = "updated_time")
    private LocalDateTime updatedTime;
}
