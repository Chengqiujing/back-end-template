package com.btbullet.core.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.btbullet.core.base
 * @description:
 * @author: chengqj
 * @date: Created in 2021/4/3 16:53
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO {

    private Integer status;

    private String message;

    private Object datda;

    public static ResultVO success() {
        return new ResultVO(0, "成功", null);
    }

    public static ResultVO success(Object data) {
        return new ResultVO(0, "成功", data);
    }

    public static ResultVO success(Object data, String msg) {
        return new ResultVO(0, msg, data);
    }

    public static ResultVO fail() {
        return new ResultVO(-1, "失败", null);
    }

    public static ResultVO fail(String msg) {
        return new ResultVO(-1, msg, null);
    }

    public static ResultVO fail(String msg, Object data) {
        return new ResultVO(-1, msg, data);
    }

}
