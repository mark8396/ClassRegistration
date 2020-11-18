package com.university.registration.classRegistration.model;

import java.io.Serializable;
import java.util.UUID;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "classRegistration")
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@DynamoDBHashKey(attributeName = "PK")
	private String studentid = UUID.randomUUID().toString();;
	@DynamoDBRangeKey(attributeName = "SK")
	private String studentSk = studentid;
	@DynamoDBAttribute
	private String name;
}
