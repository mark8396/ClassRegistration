package com.university.registration.classRegistration.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "classRegistration")
public class CourseStudent {
	
	@DynamoDBHashKey(attributeName = "PK")
	private String courseId;
	@DynamoDBRangeKey(attributeName = "SK")
	private String studentId;
}
