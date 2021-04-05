package com.btbullet.core.base;

import lombok.Data;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.btbullet.core.base
 * @description:
 * @author: chengqj
 * @date: Created in 2021/4/5 23:35
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified:
 */
@Data
public class PageVO<T> {
    private Integer size;

    private Integer total;

    private Integer current;

    private List<T> data;
}
