package com.mrz.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Page {
    int currentPage;//当前页
    int pageSize = 2;//展示的页数
}
