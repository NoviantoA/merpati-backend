package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.KeeperDto;
import com.novianto.merpatibackend.model.Keeper;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface KeeperService {

    Keeper get(UUID id, UUID userId);
    KeeperDto getDto(UUID id, UUID userId);
    List<KeeperDto> getAllDto(UUID userId);
    KeeperDto getMainKeeperDto(UUID userId);
    Keeper getMainWithPreciseDistances(UUID userId);
    Map<String, Object> createOrUpdate(KeeperDto dto, UUID userId);
    Map<String, Object> delete(UUID id, UUID userId);
}
