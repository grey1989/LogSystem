package org.jxl.LogSystem.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jxl
 * @since 2022-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Log对象", description="")
public class Log extends Model<Log> {

    private static final long serialVersionUID = 1L;

    @TableId("logID")
    private Long logID;

    @TableField("appID")
    private Long appID;

    private String content;

    private String level;

    private String appEnv;

    private String serverIp;

    private String errClass;

    @TableField("requestID")
    private Long requestID;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.logID;
    }

}
