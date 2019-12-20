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
 * @Description: 气体浓度信息
 * @Author: jeecg-boot
 * @Date:   2019-12-08
 * @Version: V1.0
 */
@Data
@TableName("gas_concentration")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="gas_concentration对象", description="气体浓度信息")
public class Concentration {
    
	/**id*/
	@TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "id")
	private java.lang.Integer id;
	/**节点编号*/
	@Excel(name = "节点编号", width = 15)
    @ApiModelProperty(value = "节点编号")
	private java.lang.String nodeNo;
	/**CO浓度值*/
	@Excel(name = "CO浓度值", width = 15)
    @ApiModelProperty(value = "CO浓度值")
	private java.lang.String co;
	/**H2S浓度值*/
	@Excel(name = "H2S浓度值", width = 15)
    @ApiModelProperty(value = "H2S浓度值")
	private java.lang.String h2s;
	/**采集时间*/
	@Excel(name = "采集时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "采集时间")
	private java.util.Date createTime;
	/**气体类型*/
	@Excel(name = "气体类型", width = 15)
    @ApiModelProperty(value = "气体类型")
	private java.lang.String gasType;
	/**是否超标*/
	@Excel(name = "是否超标", width = 15)
    @ApiModelProperty(value = "是否超标")
	private java.lang.String beyond;
}
