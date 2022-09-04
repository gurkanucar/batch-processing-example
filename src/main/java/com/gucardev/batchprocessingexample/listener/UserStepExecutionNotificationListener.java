package com.gucardev.batchprocessingexample.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserStepExecutionNotificationListener extends StepExecutionListenerSupport {


    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        log.info("After step");
        return super.afterStep(stepExecution);
    }

    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("Before step");
        super.beforeStep(stepExecution);
    }


}
