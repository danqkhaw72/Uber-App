package com.rideshare.model;

/**
 * FLOW:
 * REQUESTED -> MATCHING -> ACCEPTED -> DRIVER_ARRIVING
 *         -> RIDE_STARTED -> COMPLETE
 *         -> CANCELLED (can happen at multiple stages)
 */

public enum RideStatus {
    REQUESTED,
    MATCHING,
    ACCEPTED,
    DRIVER_ARRIVING,
    RIDE_STARTED,
    COMPLETE,
    CANCELLED
}
