package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.LaunchPointDto;
import com.novianto.merpatibackend.model.Keeper;
import com.novianto.merpatibackend.model.flight.LaunchPoint;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface LaunchPointService {

    LaunchPoint getOne(UUID id, UUID userId);
    LaunchPointDto getOneDto(UUID id, UUID userId);
    List<LaunchPoint> getAll(UUID userId);
    List<LaunchPointDto> getAllDto(UUID userId);
    Map<String, Object> createOrUpdate(LaunchPointDto launchPointDto, UUID userId);
    Map<String, Object> save(LaunchPoint launchPoint, UUID userId);
    Map<String, Object> delete(UUID id, UUID userId);
    LaunchPoint instantiateFrom(LaunchPointDto launchPointDto, UUID userId);
    void addPreciseDistancesInfoTo(List<LaunchPointDto> launchPointDto, Keeper keeper);
}
