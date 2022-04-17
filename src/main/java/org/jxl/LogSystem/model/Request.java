package org.jxl.LogSystem.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Request对象", description="")
public class Request extends Model<Request> {

    private static final long serialVersionUID = 1L;

    @TableId("requestID")
    private Long requestID;

    private String originIp;

    private String originPort;

    private String originLocation;

    private String requestContent;

    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.requestID;
    }

}
