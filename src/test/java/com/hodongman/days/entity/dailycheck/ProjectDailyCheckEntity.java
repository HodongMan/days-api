package com.hodongman.days.entity.dailycheck;

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
public class ProjectDailyCheckEntity extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;

    private Boolean is_cleared;

    private String description;

    // 생성자 작업해야함...
}