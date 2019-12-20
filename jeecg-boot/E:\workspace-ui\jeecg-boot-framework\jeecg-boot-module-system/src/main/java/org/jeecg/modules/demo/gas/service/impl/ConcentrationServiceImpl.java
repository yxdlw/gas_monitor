package org.jeecg.modules.demo.gas.service.impl;

import org.jeecg.modules.demo.gas.entity.Concentration;
import org.jeecg.modules.demo.gas.mapper.ConcentrationMapper;
import org.jeecg.modules.demo.gas.service.IConcentrationService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 气体浓度
 * @Author: jeecg-boot
 * @Date:   2019-12-02
 * @Version: V1.0
 */
@Service
public class ConcentrationServiceImpl extends ServiceImpl<ConcentrationMapper, Concentration> implements IConcentrationService {

}
