package com.mrz.service;

import com.mrz.vo.UserInfoVo;

import java.util.List;

public interface BaseService<T> {
    /**
     * 公共的添加方法
     * @param t 传入的参数
     * @return 受影响行数
     */
    boolean addObject(T t);

    /**
     * 公共的删除方法
     * @param t 传入参数
     * @return 受影响行数
     */
    boolean deleteObject(T t);

    /**
     * 公共的修改方法
     * @param t 传入参数
     * @return 受影响行数
     */
    boolean updateObject(T t);

    /**
     * 公共的查询方法
     * @return 返回一个对象集合
     */
    List<T> selectObjectBy(T t);

    int delBatch(UserInfoVo userInfoVo);
}
