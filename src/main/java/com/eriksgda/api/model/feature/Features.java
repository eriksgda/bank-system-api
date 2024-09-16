package com.eriksgda.api.model.feature;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "features")
public class Features {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String icon;

    private String description;
}
