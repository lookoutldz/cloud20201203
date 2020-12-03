package org.example.cloud1203.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author looko
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
    @Id
    private Long id;
    private String serial;
}
