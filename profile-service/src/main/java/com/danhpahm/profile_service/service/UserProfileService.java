package com.danhpahm.profile_service.service;

import com.danhpahm.profile_service.dto.request.ProfileCreationRequest;
import com.danhpahm.profile_service.dto.response.UserProfileResponse;

public interface UserProfileService {
    UserProfileResponse createUserProfile(ProfileCreationRequest request);
    UserProfileResponse getProfileById(String id);
}
