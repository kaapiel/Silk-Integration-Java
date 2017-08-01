package br.com.empresa.silkintegration;

import br.com.empresa.silkintegration.execution.GetExecutionRootNode;
import br.com.empresa.silkintegration.execution.GetTestContainers;
import br.com.empresa.silkintegration.execution.Login;
import br.com.empresa.silkintegration.execution.StartExecutionTMPLANNING;
import br.com.empresa.silkintegration.execution.modelExecutionRootNode.ExecutionRootNode;
import br.com.empresa.silkintegration.execution.modelTestContainer.TestContainer;

public class Main {

	//SESSION ID
	private static long sessionId;
	//PROJECT ID
	private static int projectId = 0;
	private static ExecutionRootNode executionRootNode;
	private static TestContainer testContainers;
	private static long executionId;
	private static int rootNodeId;
	
	public static void main(String[] args) throws Exception{

		sessionId = new Login().login();
		executionRootNode = new GetExecutionRootNode().getExecutionRootNode(sessionId, projectId);
		testContainers = new GetTestContainers().getTestContainers(sessionId, projectId);
		
		rootNodeId = executionRootNode.getSoapenvEnvelope()
				.getSoapenvBody()
				.getNs1GetExecutionRootNodeResponse()
				.getGetExecutionRootNodeReturn()
				.getId()
				.getContent();
		
		executionId = new StartExecutionTMPLANNING().startExecution(sessionId, rootNodeId);
		

	}
}
