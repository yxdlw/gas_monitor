package org.jeecg.modules.gas.service.impl;

import org.jeecg.modules.gas.entity.Alarm;
import org.jeecg.modules.gas.mapper.AlarmMapper;
import org.jeecg.modules.gas.service.IAlarmService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 气体报警
 * @Author: jeecg-boot
 * @Date:   2019-12-07
 * @Version: V1.0
 */
@Service
public class AlarmServiceImpl extends ServiceImpl<AlarmMapper, Alarm> implements IAlarmService {

}
