package com.connect2fly.c2flybacken.domain;

import com.connect2fly.c2flybacken.core.Aggregate;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car extends Aggregate<UUID> {
	private String model;
	private String brand;
	private String plateNumber;
}
