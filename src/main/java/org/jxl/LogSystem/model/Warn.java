package org.jxl.LogSystem.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
@ApiModel(value="Warn对象", description="")
public class Warn extends Model<Warn> {

    private static final long serialVersionUID = 1L;
    @TableId
    private Long warnId;

    private Long warnManagementId;

    private String count;

    private String serverIp;

    private String serverPort;

    private String description;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.warnId;
    }

}
