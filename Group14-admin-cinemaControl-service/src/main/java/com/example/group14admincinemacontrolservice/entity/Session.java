package com.example.group14admincinemacontrolservice.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.sql.Time;
import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "session")
public class Session {
    @TableId(type = IdType.AUTO)
    private int sessionId;//场次ID
    private int movieId;//电影ID
    private int cinemaId;//电影院ID
    private String screeningDate;//排片日期
    private String startTime;//排片时间
    @NotEmpty(message = "放映厅名不能为空")
    private String hallName;//放映厅名字
}
