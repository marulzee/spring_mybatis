package com.mrz.dto;

import com.mrz.pojo.UserInfo;
import com.mrz.utils.Page;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class UserInfoDto {
    List<UserInfo> userInfoList;
    Page page;
}
