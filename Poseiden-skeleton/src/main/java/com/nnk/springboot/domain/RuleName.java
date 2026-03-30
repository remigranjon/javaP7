package com.nnk.springboot.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "rulename")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RuleName {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private String json;
    private String template;
    private String sqlStr;
    private String sqlPart;

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RuleName [id=" + id + ", name=" + name + ", description=" + description + ", json=" + json
                + ", template=" + template + ", sqlStr=" + sqlStr + ", sqlPart=" + sqlPart + "]";
    }
}
