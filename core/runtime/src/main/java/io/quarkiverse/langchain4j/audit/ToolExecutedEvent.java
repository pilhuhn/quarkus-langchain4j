package io.quarkiverse.langchain4j.audit;

import dev.langchain4j.agent.tool.ToolExecutionRequest;

/**
 * Invoked with a tool response from an LLM. It is important to note that this can be invoked multiple times
 * when tools exist.
 */
public interface ToolExecutedEvent extends LLMInteractionEvent {

    /**
     * @return the tool execution request
     */
    ToolExecutionRequest request();

    /**
     * @return the result of the tool execution
     */
    String result();
}