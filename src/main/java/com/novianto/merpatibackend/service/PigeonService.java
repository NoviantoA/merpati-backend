package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.dto.FilterParams;
import com.novianto.merpatibackend.dto.PigeonDto;
import com.novianto.merpatibackend.dto.PigeonLabelDto;
import com.novianto.merpatibackend.dto.PigeonShallowDto;
import com.novianto.merpatibackend.model.pigeon.Image;
import com.novianto.merpatibackend.model.pigeon.Pigeon;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public interface PigeonService {

    Pigeon get(UUID id, UUID userId);
    List<PigeonShallowDto> getAll(UUID userId);
    List<PigeonShallowDto> getAllFiltered(FilterParams params, UUID userId);
    List<PigeonShallowDto> addSectionsTo(List<PigeonShallowDto> pigeons, UUID userId);
    PigeonDto getPigeonDtoWithoutNestedDto(UUID id, UUID userId);
    PigeonDto getPigeonDto(UUID id, UUID userId);
    PigeonDto getWithAncestors(UUID id, UUID userId);
    List<PigeonLabelDto> getAllLabelDto(UUID userId);
    List<PigeonLabelDto> getLabelDtoBySectionId(UUID sectionId, UUID userId);
    List<Pigeon> getAllBySectionId(UUID sectionId, UUID userId);
    List<Pigeon> getAllBySectionsIds(List<UUID> sectionIds, UUID userId);
    Map<String, Object> create(PigeonShallowDto pigeonShallowDto, @Nullable MultipartFile[] images, UUID userId);
    Map<String, Object> update(PigeonShallowDto pigeonShallowDto, @Nullable MultipartFile[] images, UUID id, UUID userId);
    void changeSection(UUID id, UUID newSectionId, UUID userId);
    Map<String, Object> delete(UUID id, UUID userId);
    Map<String, Object> save(Pigeon pigeon);
    Map<String, Object> saveAll(Iterable<Pigeon> pigeons);
    PigeonDto saveWithImage(Pigeon pigeon, MultipartFile[] images, @Nullable String mainImageFileName, UUID userId);
    PigeonDto makeFull(PigeonDto pigeonDto, UUID userId);
    void removeNotIncludeImage(Set<Image> previousImage, Set<Image> imagesForSave, UUID id, UUID userId);
    void validate(PigeonShallowDto source, Pigeon pigeon, UUID userId);
    void validate(Pigeon pigeon);
    void initializeFullStateFrom(PigeonShallowDto source, Pigeon pigeon, UUID userId);
}
