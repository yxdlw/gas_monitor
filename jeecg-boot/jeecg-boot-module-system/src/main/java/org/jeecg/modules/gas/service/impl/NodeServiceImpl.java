package org.jeecg.modules.gas.service.impl;

import org.jeecg.modules.gas.entity.Node;
import org.jeecg.modules.gas.mapper.NodeMapper;
import org.jeecg.modules.gas.service.INodeService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 设备节点信息
 * @Author: jeecg-boot
 * @Date:   2019-12-07
 * @Version: V1.0
 */
@Service
public class NodeServiceImpl extends ServiceImpl<NodeMapper, Node> implements INodeService {

}
