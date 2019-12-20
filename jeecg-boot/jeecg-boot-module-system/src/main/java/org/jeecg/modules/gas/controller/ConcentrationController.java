package org.jeecg.modules.gas.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.gas.entity.Concentration;
import org.jeecg.modules.gas.service.IConcentrationService;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

 /**
 * @Description: 气体浓度信息
 * @Author: jeecg-boot
 * @Date:   2019-12-08
 * @Version: V1.0
 */
@Slf4j
@Api(tags="气体浓度信息")
@RestController
@RequestMapping("/gas/concentration")
public class ConcentrationController extends JeecgController<Concentration, IConcentrationService> {
	@Autowired
	private IConcentrationService concentrationService;
	
	/**
	 * 分页列表查询
	 *
	 * @param concentration
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	@AutoLog(value = "气体浓度信息-分页列表查询")
	@ApiOperation(value="气体浓度信息-分页列表查询", notes="气体浓度信息-分页列表查询")
	@GetMapping(value = "/list")
	public Result<?> queryPageList(Concentration concentration,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<Concentration> queryWrapper = QueryGenerator.initQueryWrapper(concentration, req.getParameterMap());
		Page<Concentration> page = new Page<Concentration>(pageNo, pageSize);
		IPage<Concentration> pageList = concentrationService.page(page, queryWrapper);
		return Result.ok(pageList);
	}
	
	/**
	 * 添加
	 *
	 * @param concentration
	 * @return
	 */
	@AutoLog(value = "气体浓度信息-添加")
	@ApiOperation(value="气体浓度信息-添加", notes="气体浓度信息-添加")
	@PostMapping(value = "/add")
	public Result<?> add(@RequestBody Concentration concentration) {
		concentrationService.save(concentration);
		return Result.ok("添加成功！");
	}
	
	/**
	 * 编辑
	 *
	 * @param concentration
	 * @return
	 */
	@AutoLog(value = "气体浓度信息-编辑")
	@ApiOperation(value="气体浓度信息-编辑", notes="气体浓度信息-编辑")
	@PutMapping(value = "/edit")
	public Result<?> edit(@RequestBody Concentration concentration) {
		concentrationService.updateById(concentration);
		return Result.ok("编辑成功!");
	}
	
	/**
	 * 通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "气体浓度信息-通过id删除")
	@ApiOperation(value="气体浓度信息-通过id删除", notes="气体浓度信息-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<?> delete(@RequestParam(name="id",required=true) String id) {
		concentrationService.removeById(id);
		return Result.ok("删除成功!");
	}
	
	/**
	 * 批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "气体浓度信息-批量删除")
	@ApiOperation(value="气体浓度信息-批量删除", notes="气体浓度信息-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<?> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.concentrationService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.ok("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "气体浓度信息-通过id查询")
	@ApiOperation(value="气体浓度信息-通过id查询", notes="气体浓度信息-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
		Concentration concentration = concentrationService.getById(id);
		return Result.ok(concentration);
	}

  /**
   * 导出excel
   *
   * @param request
   * @param concentration
   */
  @RequestMapping(value = "/exportXls")
  public ModelAndView exportXls(HttpServletRequest request, Concentration concentration) {
      return super.exportXls(request, concentration, Concentration.class, "气体浓度信息");
  }

  /**
   * 通过excel导入数据
   *
   * @param request
   * @param response
   * @return
   */
  @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
  public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
      return super.importExcel(request, response, Concentration.class);
  }

}
