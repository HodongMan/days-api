package com.hodongman.days.entity.option;

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
public class ProjectOptionEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Boolean is_active;

    private Date alarm;

    public ProjectOptionEntity(Boolean is_active, Date alarm) {
        
        this.is_active  = is_active;
        this.alarm      = alarm;
    }
}