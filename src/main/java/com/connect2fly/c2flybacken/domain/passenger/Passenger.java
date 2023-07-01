package com.connect2fly.c2flybacken.domain.passenger;

import com.connect2fly.c2flybacken.core.Aggregate;
import com.connect2fly.c2flybacken.domain.travel.Travel;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Passenger extends Aggregate<UUID> {
	private String name;
	private String surname;
	private String passportNumber;
	private LocalDate birthDate;
	private String email;
	private String phoneNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "travel_id")
	private Travel travel;
}
