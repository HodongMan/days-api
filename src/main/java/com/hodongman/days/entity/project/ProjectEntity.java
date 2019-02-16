package com.hodongman.days.entity.project;

import java.util.Date;

import com.hodongman.days.entity.data.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private Date start_date;

    private Date end_date;

    public ProjectEntity(String title, String description, Date start_date, Date end_date) {

        this.title          = title;
        this.description    = description;
        this.start_date     = start_date;
        this.end_date       = end_date;
    }
}