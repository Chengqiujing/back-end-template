package com.btbullet.core.constant.errorinfo;

/**
 * @Author chengqj
 * @Date 2020/10/10 21:25
 * @Desc
 */

public enum ErrorInfo {
    BS_SAVE_SUCCESS(ErrorCode.SUCCESS, "添加成功"),
    BS_SAVE_FAIL(ErrorCode.FAIL, "添加失败"),
    BS_UPDATE_SUCCESS(ErrorCode.SUCCESS, "更新成功"),
    BS_UPDATE_FAIL(ErrorCode.FAIL, "更新失败"),
    BS_DELETE_SUCCESS(ErrorCode.SUCCESS, "删除成功"),
    BS_DELETE_FAIL(ErrorCode.FAIL, "删除失败"),
    BS_SELECT_SUCCESS(ErrorCode.SUCCESS, "添加失败"),
    BS_SELECT_FAIL(ErrorCode.FAIL, "添加失败"),
    BS_OPERATION_SUCCESS(ErrorCode.SUCCESS, "操作成功"),
    BS_OPERATION_FAIL(ErrorCode.FAIL, "操作失败"),
    ;


    private Integer errorCode;

    private String errorMsg;

    ErrorInfo(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
