package com.btbullet.core.exception;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.btbullet.core.exception
 * @description:
 * @author: chengqj
 * @date: Created in 2021/4/5 23:40
 * @copyright: Copyright (c) 2021
 * @version: V1.0
 * @modified:
 */
public abstract class AbstractDefaultException extends RuntimeException {

    // 异常国际化处理

    // 异常信息返回


    public AbstractDefaultException() {
        super();
    }

    public AbstractDefaultException(String message) {
        super(message);
    }

    public AbstractDefaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbstractDefaultException(Throwable cause) {
        super(cause);
    }

    protected AbstractDefaultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
