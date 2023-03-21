package com.chrm.mybatis.generator.plugins;

/**
 * @author <a href="shishouchao@corp.netease.com">shouchao.shi</a>
 * @version 1.0.0
 * @date 2022/07/21 11:50
 * @Description
 */
public class Util {

    public static String null2Str(Object obj) {
        return obj == null ? "" :  obj.toString();
    }

}
