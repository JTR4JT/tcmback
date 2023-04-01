package com.jt.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BXO
 * @version 1.0
 * @description: TODO
 * @date 2023/3/18 1:24
 */
@Data
public class MedicalBar {
    private List<String> names;
    private List<MedicalBar2> values;


}
