package com.novianto.merpatibackend.service;

import com.novianto.merpatibackend.model.Keeper;
import com.novianto.merpatibackend.model.flight.LaunchPoint;
import com.novianto.merpatibackend.model.flight.PreciseDistance;

import java.util.UUID;

public interface PreciseDistanceService {

    PreciseDistance get(UUID keeperId, UUID launchPointId);
    PreciseDistance save(Double preciseDistance, Keeper keeper, LaunchPoint launchPoint);
}
