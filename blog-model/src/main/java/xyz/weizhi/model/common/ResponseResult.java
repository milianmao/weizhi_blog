package xyz.weizhi.model.common;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

/**
 * @Author milian
 * @Description 封装通用返回结果
 * @Date 2021/12/20 0020 19:37
 * @Version 1.0
 */
public class ResponseResult<T> implements Serializable {
    private String host;

    private Integer code;

    private String errorMessage;

    private T data;

    public ResponseResult(){
        this.code = 200;
    }

    public ResponseResult(Integer code,T data){
        this.code = code;
        this.data = data;
    }

    public ResponseResult(Integer code,String msg,T data){
        this.code = code;
        this.errorMessage = msg;
        this.data = data;
    }

    public ResponseResult(Integer code,String msg){
        this.code = code;
        this.errorMessage = msg;
    }

    public ResponseResult<?> error(Integer code, String msg) {
        this.code = code;
        this.errorMessage = msg;
        return this;
    }

    public ResponseResult<?> ok(Integer code,String msg){
        this.code = code;
        this.errorMessage = msg;
        return this;
    }

    public ResponseResult errorResult(int code,String msg){
        ResponseResult result = new ResponseResult();
        return result.error(code, msg);
    }

    public ResponseResult okResult(int code,String msg){
        ResponseResult result = new ResponseResult();
        return result.ok(code, msg);
    }
}
