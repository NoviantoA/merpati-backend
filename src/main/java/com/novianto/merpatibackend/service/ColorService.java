package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.ColorDto;
import com.novianto.merpatibackend.model.pigeon.Color;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface ColorService {

    Color findOne(UUID id, UUID userId);
    List<ColorDto> getAll(UUID userId);
    ColorDto get(UUID id, UUID userId);
    Color getColorByName(String name, UUID userId);
    Color findColorByPigeonId(UUID id, UUID userId);
    Map<String, Object> create(ColorDto colorDto, UUID userId);
    Map<String, Object> update(ColorDto colorDto, UUID id, UUID userId);
    Map<String, Object> delete(UUID id, UUID userId);
}
