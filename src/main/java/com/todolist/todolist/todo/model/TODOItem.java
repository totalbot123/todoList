package com.todolist.todolist.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class TODOItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@NonNull
	String quest;
	@NonNull
	@Column(name="tab_id")
	Integer tabId;
}
