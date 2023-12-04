package com.novianto.merpatibackend.service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

public interface ImageService {

    Map<String, Object> store(MultipartFile image, UUID userId, UUID pigeonId);
    Map<String, Object> store(MultipartFile[] images, UUID userId, UUID pigeonId);
    Stream<Path> loadAll(UUID userId, UUID pigeonId);
    Path load(String filename, UUID userId, UUID pigeonId);
    List<Resource> loadAllAsResources(UUID userId, UUID pigeonId);
    Resource loadAsResource(String filename, UUID userId, UUID pigeonId);
    Map<String, Object> deleteAll(Collection<String> filenames, UUID userId, UUID pigeonId);
    Map<String, Object> delete(String filename, UUID userId, UUID pigeonId);
    Map<String, Object> checkTargetDirectoryExist(UUID userId, UUID pigeonId);
    UrlResource toUrlResource(URI uri);
}
