package com.danhpahm.profile.service;

import com.danhpahm.profile.dto.request.ProfileCreationRequest;
import com.danhpahm.profile.dto.response.UserProfileResponse;

import java.util.List;

public interface UserProfileService {
    UserProfileResponse createProfile(ProfileCreationRequest request);

    UserProfileResponse getProfile(String id);

    List<UserProfileResponse> getAllProfiles();
}
