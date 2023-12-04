package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.FlightResultDto;
import com.novianto.merpatibackend.dto.LaunchPointDto;
import com.novianto.merpatibackend.model.flight.Flight;
import com.novianto.merpatibackend.model.flight.FlightResult;
import com.novianto.merpatibackend.model.pigeon.Pigeon;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface FlightResultService {

    FlightResult get(UUID id, UUID userId);
    List<FlightResult> getAllByFlightId(UUID flightId, UUID userId);
    List<FlightResult> getAllByFlightIdAndKeeperId(UUID flightId, UUID keeperId, UUID userId);
    List<FlightResult> getAllByLaunchPointId(UUID launchPointId, UUID userId);
    FlightResultDto getDto(UUID id, UUID userId);
    List<FlightResultDto> getAllDtoByPigeonId(UUID id, UUID userId);
    List<FlightResultDto> getAllDtoByFlightId(UUID id, UUID userId);
    Map<Long, Integer> getNumberOfMyParticipantsForEveryFlight(UUID userId);
    Integer getNumberOfMyParticipantsByFlightId(UUID id, UUID userId);
    Map<String, Object> saveOrUpdate(FlightResultDto flightResultDto, UUID flightId, UUID userId);
    Map<String, Object> delete(UUID id, UUID userId);
    Map<String, Object> recalculateAllFlightResultsBy(LaunchPointDto launchPointDto, UUID userId);
    Map<String, Object> recalculateAllFlightResultsBy(Flight flight, UUID userId);
    Map<String, Object> fillCalculatedFields(FlightResult flightResult);
    Map<String, Object> instantiateFrom(FlightResultDto flightResultDto, UUID userId);
    Double extractPreciseDistance(Flight flight, Pigeon pigeon);
}
