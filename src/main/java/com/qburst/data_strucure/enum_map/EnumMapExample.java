package com.qburst.data_strucure.enum_map;

import java.util.EnumMap;

/**
 * Created by albinmathew on 20/10/14.
 */
public class EnumMapExample {

    public static void main(String[] args) {
        EnumMap<Size, String> sizeMap = new EnumMap<Size, String>(Size.class);
        sizeMap.put(Size.S, "S");
        sizeMap.put(Size.M, "M");
        sizeMap.put(Size.L, "L");
        sizeMap.put(Size.XL, "XL");
        sizeMap.put(Size.XXL, "XXL");
        sizeMap.put(Size.XXXL, "XXXL");
        for (Size size : Size.values()) {
            System.out.println(size + ":" + sizeMap.get(size));
        }
    }
}


