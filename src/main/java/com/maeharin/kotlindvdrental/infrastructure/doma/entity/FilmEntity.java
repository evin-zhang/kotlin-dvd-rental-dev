package com.maeharin.kotlindvdrental.infrastructure.doma.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jetbrains.annotations.Nullable;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

/**
 */
@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "film")
public class FilmEntity {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer filmId;

    /** */
    public String title;

    /** */
    @Nullable
    public String description;

    /** */
    @Nullable
    public Integer releaseYear;

    /** */
    public Integer languageId;

    /** */
    public Short rentalDuration;

    /** */
    public BigDecimal rentalRate;

    /** */
    public Short length;

    /** */
    public BigDecimal replacementCost;

    /** */
    public LocalDateTime lastUpdate;
}