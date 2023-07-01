package com.connect2fly.c2flybacken.domain.travel;

import com.connect2fly.c2flybacken.core.Aggregate;
import com.connect2fly.c2flybacken.domain.passenger.Passenger;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Travel extends Aggregate<UUID> {
	private String fromPlace;
	private String toPlace;
	private OffsetDateTime startingDate;
	private OffsetDateTime endingDate;
	private String driverId;
	private UUID carId;
	private BigDecimal price;
	private boolean exported;
	private BigDecimal exportPrice;
	@OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Passenger> passengers;

	public Travel(UUID id, String fromPlace, String toPlace, OffsetDateTime startingDate, OffsetDateTime endingDate, String driverId, UUID carId,
			BigDecimal price, boolean exported, BigDecimal exportPrice, Set<Passenger> passengers) {
		this.id = id;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.driverId = driverId;
		this.carId = carId;
		this.price = price;
		this.exported = exported;
		this.exportPrice = exportPrice;
		this.passengers = passengers;
	}
}
