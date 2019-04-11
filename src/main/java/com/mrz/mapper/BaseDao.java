package com.mrz.mapper;

import com.mrz.vo.UserInfoVo;

import java.util.List;

public interface BaseDao<T> {
    /**
     * 公共的添加方法
     * @param t 传入的参数
     * @return 受影响行数
     */
    int addObject(T t);

    /**
     * 公共的删除方法
     * @param t 传入参数
     * @return 受影响行数
     */
    int deleteObject(T t);

    /**
     * 公共的修改方法
     * @param t 传入参数
     * @return 受影响行数
     */
    int updateObject(T t);

    /**
     * 公共的查询方法
     * @return 返回一个对象集合
     */
    List<T> selectObjectBy(T t);

    int delBatch(UserInfoVo userInfoVo);
}
