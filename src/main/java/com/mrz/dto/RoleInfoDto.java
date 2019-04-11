package com.mrz.dto;

import com.mrz.pojo.RoleInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class RoleInfoDto implements Serializable {
    int roleid;
    String rolename;
    int userid;
}
