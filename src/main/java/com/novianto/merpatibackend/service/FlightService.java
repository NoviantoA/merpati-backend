package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.FlightDto;
import com.novianto.merpatibackend.model.flight.Flight;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface FlightService {

    List<FlightDto> getAllDto(UUID userId);
    FlightDto getDto(FlightDto flightDto, UUID userId);
    Flight getOne(UUID id, UUID userId);
    Map<String, Object> create(FlightDto flightDto, UUID userId);
    Map<String, Object> update(FlightDto flightDto, UUID userId);
    Map<String, Object> delete(UUID id, UUID userId);
    Map<String, Object> save(Flight flight);
    Boolean needForUpdateFlightResults(FlightDto flightDto, Flight flight);
}
