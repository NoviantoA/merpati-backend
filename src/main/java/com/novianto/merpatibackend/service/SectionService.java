package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.PigeonLabelDto;
import com.novianto.merpatibackend.dto.SectionDto;
import com.novianto.merpatibackend.model.dovecote.Section;
import com.novianto.merpatibackend.model.pigeon.Pigeon;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public interface SectionService {

    Section findOne(UUID id, UUID userId);
    Section getWithPigeons(UUID id, UUID userId);
    List<SectionDto> getAllDto(UUID userId);
    List<SectionDto> getAllWithFullAddress(UUID id, UUID userId);
    List<SectionDto> getAllHierarchicalWithoutNests(UUID userId);
    List<SectionDto> getAllHierarchical(UUID userId);
    List<SectionDto> getSectionsDtoTreeWithPigeons(UUID userId);
    void insertPigeonsToSections(List<PigeonLabelDto> pigeons, List<SectionDto> sections);
    SectionDto getDto(UUID id, UUID userId);
    Map<String, Object> createOrUpdate(SectionDto sectionDto, UUID userId);
    Section instantiateFrom(SectionDto sectionDto, UUID userId);
    Map<String, Object> save(Section section, UUID userId);
    Map<String, Object> delete(UUID id, UUID userId);
    List<Pigeon> changeParentSectionTo(@Nullable Section newParentSection, List<Pigeon> pigeons);
}
