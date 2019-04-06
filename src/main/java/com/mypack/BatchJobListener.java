package main.java.com.mypack;

import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class BatchJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Job Started...");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("After the BatchJob execution...");
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			System.out.println("Batch job completed successfully...");
		} else if(jobExecution.getStatus() == BatchStatus.FAILED) {
			List<Throwable>  allExceptions = jobExecution.getAllFailureExceptions();
			 for(Throwable th : allExceptions){
	                System.err.println("exception :" +th.getLocalizedMessage());
	            }
		}
	}

}
