package io.oneclicklabs.transaction.logging.types;

import java.util.Date;
import java.util.Map;

/**
 * Created by oneclicklabs.io on 2/10/17.
 */
public class TransactionMessageBuilder {
	private String message_type;
	private Long duration;
	private String host;
	private String level;
	private String method;
	private String node;
	private String service;
	private String system;
	private String contentType;
	private String serviceVersion;
	private Date startDateTime;
	private Date endDateTime;
	private Boolean error = Boolean.FALSE;
	private String errorCode;
	private String errorMessage;
	private Map<String, String> aspects;
	private String requestBody;
	private String responseBody;
	private String applicationName;
	private String httpMethod;
	private String query;

	private static final String MESSAGE_TYPE = "TRANSACTION_MESSAGE";

	public TransactionMessageBuilder(final String host, final String node, final String system,
			final String serviceOperation, final String httpMethod, final long duration) {
		this.message_type(MESSAGE_TYPE);
		this.host(host);
		this.node(node);
		this.system(system);
		this.httpMethod(httpMethod);
		this.duration(duration);
		this.method(serviceOperation);
	}

	public String getRequestBody() {
		return requestBody;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public TransactionMessageBuilder requestBody(String requestBody) {
		this.requestBody = requestBody;
		return this;
	}

	public TransactionMessageBuilder responseBody(String responseBody) {
		this.responseBody = responseBody;
		return this;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public TransactionMessageBuilder applicationName(String applicationName) {
		this.applicationName = applicationName;
		return this;
	}

	public String getMessage_type() {
		return message_type;
	}

	public TransactionMessageBuilder message_type(String message_type) {
		this.message_type = message_type;
		return this;
	}

	public TransactionMessageBuilder aspects(Map<String, String> aspects) {
		this.aspects = aspects;
		return this;
	}

	public Map<String, String> getAspects() {
		return aspects;
	}

	public Long getDuration() {
		return duration;
	}

	public TransactionMessageBuilder duration(Long duration) {
		this.duration = duration;
		return this;
	}

	public String getHost() {
		return host;
	}

	public TransactionMessageBuilder host(String host) {
		this.host = host;
		return this;
	}

	public String getLevel() {
		return level;
	}

	public TransactionMessageBuilder level(String level) {
		this.level = level;
		return this;
	}

	public String getMethod() {
		return method;
	}

	public TransactionMessageBuilder method(String method) {
		this.method = method;
		return this;
	}

	public String getNode() {
		return node;
	}

	public TransactionMessageBuilder node(String node) {
		this.node = node;
		return this;
	}

	public String getService() {
		return service;
	}

	public TransactionMessageBuilder service(String service) {
		this.service = service;
		return this;
	}

	public String getSystem() {
		return system;
	}

	public TransactionMessageBuilder system(String system) {
		this.system = system;
		return this;
	}

	public String getServiceVersion() {
		return serviceVersion;
	}

	public TransactionMessageBuilder serviceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		return this;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public TransactionMessageBuilder startDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
		return this;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public TransactionMessageBuilder endDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
		return this;
	}

	public Boolean getError() {
		return error;
	}

	public TransactionMessageBuilder error(Boolean error) {
		this.error = error;
		return this;
	}

	public TransactionMessageBuilder contentType(String contentType) {
		this.contentType = contentType;
		return this;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public TransactionMessageBuilder errorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public TransactionMessageBuilder errorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		return this;
	}

	public static String getMessageType() {
		return MESSAGE_TYPE;
	}

	public TransactionMessage createTransactionMessage() {
		return new TransactionMessage(message_type, duration, host, level, method, node, service, system,
				serviceVersion, startDateTime, endDateTime, error, errorCode, errorMessage, aspects, requestBody,
				responseBody, applicationName, httpMethod, query, contentType);
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public TransactionMessageBuilder httpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
		return this;
	}

	public String getQuery() {
		return query;
	}

	public TransactionMessageBuilder query(String query) {
		this.query = query;
		return this;
	}

	public TransactionMessageBuilder populateWithError(String code, String message) {
		return this.error(true).errorCode(code).errorMessage(message);
	}

}