package org.jeecg.modules.gas.entity;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 设备节点信息
 * @Author: jeecg-boot
 * @Date:   2019-12-07
 * @Version: V1.0
 */
@Data
@TableName("gas_node")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="gas_node对象", description="设备节点信息")
public class Node {
    
	/**id*/
	@TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**nodeNo*/
	@Excel(name = "nodeNo", width = 15)
    @ApiModelProperty(value = "nodeNo")
	private java.lang.String nodeNo;
	/**status*/
	@Excel(name = "status", width = 15)
    @ApiModelProperty(value = "status")
	private java.lang.String status;
	/**createTime*/
	@Excel(name = "createTime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "createTime")
	private java.util.Date createTime;
	/**location*/
	@Excel(name = "location", width = 15)
    @ApiModelProperty(value = "location")
	private java.lang.String location;
	/**terminalNo*/
	@Excel(name = "terminalNo", width = 15)
    @ApiModelProperty(value = "terminalNo")
	private java.lang.String terminalNo;
}
