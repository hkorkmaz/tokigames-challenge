package com.tokigames.util.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilterParams {
    private String filterBy;

    public String field(){
        return Optional.ofNullable(filterBy)
                .map(r -> r.split(":")[0])
                .orElse(null);
    }

    public Object value(){
        return Optional.ofNullable(filterBy)
                .map(r -> r.split(":")[1])
                .orElse(null);
    }
}
