package org.jeecg.modules.demo.gas.entity;

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
 * @Description: 气体浓度
 * @Author: jeecg-boot
 * @Date:   2019-12-02
 * @Version: V1.0
 */
@Data
@TableName("gas_concentration")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="gas_concentration对象", description="气体浓度")
public class Concentration {
    
	/**id*/
	@TableId(type = IdType.ID_WORKER_STR)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**nodeNo*/
	@Excel(name = "nodeNo", width = 15)
    @ApiModelProperty(value = "nodeNo")
	private java.lang.String nodeNo;
	/**gas1*/
	@Excel(name = "gas1", width = 15)
    @ApiModelProperty(value = "gas1")
	private java.lang.String gas1;
	/**gas2*/
	@Excel(name = "gas2", width = 15)
    @ApiModelProperty(value = "gas2")
	private java.lang.String gas2;
	/**gas3*/
	@Excel(name = "gas3", width = 15)
    @ApiModelProperty(value = "gas3")
	private java.lang.String gas3;
	/**createTime*/
	@Excel(name = "createTime", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "createTime")
	private java.util.Date createTime;
}
