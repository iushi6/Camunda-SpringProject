package com.demo.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("LeaveBalanceCheck")
public class LeaveBalanceChecker implements JavaDelegate {

	public static final int LEAVE_BALANCE =5;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		if(LEAVE_BALANCE > 0) {
			logger.info("Employee have Leave Balance");
		}else {
			logger.info("Employee dont't have Leave Balance");
		}
	}

}
