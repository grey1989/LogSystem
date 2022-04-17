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
@ApiModel(value="App对象", description="")
public class App extends Model<App> {

    private static final long serialVersionUID = 1L;

    @TableId("appID")
    private Long appID;

    @TableField("appName")
    private String appName;

    private String description;

    private Integer count;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.appID;
    }

}
