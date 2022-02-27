package team.software.collect.po.task;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import team.software.collect.vo.task.TaskOrderVO;

/**
 * task_order
 * @author
 */
@Data
public class TaskOrder implements Serializable {
    /**
     * 订单id
     */
    private Integer id;

    /**
     * 众包工人可获得的报酬
     */
    private BigDecimal cost;

    /**
     * 任务id
     */
    private Integer tid;

    /**
     * 众包工人id
     */
    private Integer uid;

    /**
     * 接单时间
     */
    private Date createTime;

    /**
     * 截止时间
     */
    private Date endTime;

    /**
     * 任务状态
     */
    private Integer finished;

    public TaskOrder(){
    }

    public TaskOrder(TaskOrderVO taskOrderVO){
        id=taskOrderVO.getId();
        cost=taskOrderVO.getCost();
        tid=taskOrderVO.getTid();
        uid=taskOrderVO.getUid();
        createTime=taskOrderVO.getCreateTime();
        endTime=taskOrderVO.getEndTime();
    }

    private static final long serialVersionUID = 1L;
}
