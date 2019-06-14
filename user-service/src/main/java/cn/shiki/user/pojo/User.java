package cn.shiki.user.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @Author: shiki
 * @Date: 2019/05/31 0:17
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer uid;

    private String username;

    private String password;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @Column(name = "birthday")
    private Date birthday;

    private Character sex;

    private String telephone;

    private String email;

    private Character status;

    private String code;

}
