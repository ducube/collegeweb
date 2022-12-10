package com.laptoy.commonutils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
    @ApiModelProperty("是否成功")
    private boolean success;

    @ApiModelProperty("响应码")
    private Integer code;

    @ApiModelProperty("返回信息")
    private String message;

    @ApiModelProperty("返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    //无参构造方法私有
    private R() {
    }

    //成功 静态方法
    public static R ok() {
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    //失败 静态方法
    public static R error() {
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    // 链式编程写法
    // 自定义是否成功或失败
    // R.ok().success(true/false)
    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    // 自定义响应码
    // R.ok().code(xx)
    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    // 自定义消息
    // R.ok.message("自定义消息")
    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    // R.ok().data(k,v) 传入键值对
    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
    // R.ok().data(map) 传入map
    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

}

