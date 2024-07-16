package com.plannerviagens.planner.participant;

import java.util.UUID;

public record ParticipantData(UUID id, String name, String emial, Boolean inConfirmed) {
}
