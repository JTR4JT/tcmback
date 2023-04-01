package com.jt.tool;

import java.awt.*;
import java.util.Random;

/**
 * @author BXO
 * @version 1.0
 * @description: TODO
 * @date 2023/3/18 1:41
 */
public class ColorRandom {
    public String getColor(){
        try {
            StringBuffer result = new StringBuffer();
            result.append('#');
            for(int i=0;i<6;i++) {
                //随机生成0-15的数值并转换成16进制
                result.append(Integer.toHexString(new Random().nextInt(16)));
            }
            return result.toString().toUpperCase();
        }catch (Exception e)
        {
            System.out.println("获取失败");
            return "#000000";
        }


    }


}
