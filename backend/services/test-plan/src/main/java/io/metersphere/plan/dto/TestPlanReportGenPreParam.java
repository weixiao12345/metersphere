package io.metersphere.plan.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TestPlanReportGenPreParam {

	@Schema(description = "项目ID")
	private String projectId;

	@Schema(description = "计划ID")
	private String testPlanId;

	@Schema(description = "计划名称")
	private String testPlanName;

	@Schema(description = "计划开始时间")
	private Long startTime;

	@Schema(description = "触发方式")
	private String triggerMode;

	@Schema(description = "执行状态")
	private String execStatus;

	@Schema(description = "结果状态")
	private String resultStatus;

	@Schema(description = "是否集成报告")
	private Boolean integrated;
}
