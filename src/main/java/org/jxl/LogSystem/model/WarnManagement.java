package org.jxl.LogSystem.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="WarnManagement对象", description="")
public class WarnManagement extends Model<WarnManagement> {

    private static final long serialVersionUID = 1L;
    @TableId
    private Long warnManagementId;

    private String title;

    @TableField("appID")
    private Integer appID;

    private Integer infoCount;

    private Integer errorCount;

    private Integer warnCount;

    private Integer criticalCount;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.warnManagementId;
    }

}
