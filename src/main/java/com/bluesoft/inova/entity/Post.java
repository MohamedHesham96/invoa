package com.bluesoft.inova.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "POST")
@Setter
@Getter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TITLE", nullable = false, length = 150)
    private String title;

    @Column(name = "BODY", nullable = false, length = 500)
    private String body;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    public Post(Integer postId) {
        this.id = postId;
    }
}
