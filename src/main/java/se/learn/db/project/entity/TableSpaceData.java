package se.learn.db.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TABLE_SPACE_DATA")
public class TableSpaceData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int totalSizeAvailable;
    private int totalSpaceUsed;
}
