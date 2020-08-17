package com.example.xcdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by dequan.yu on 2020/8/17.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
}
