package cn.shiki.user.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @Author: shiki
 * @Date: 2019/05/31 0:17
 */
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {

    private Integer uid;

    private String username;

    private String password;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date birthday;

    private Character sex;

    private String telephone;

    private String email;

    private Character status;

    private String code;

}
