package com.eriksgda.api.model.news;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String icon;

    private String description;
}
