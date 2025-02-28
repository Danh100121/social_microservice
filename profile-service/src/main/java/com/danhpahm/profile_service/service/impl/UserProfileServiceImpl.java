package com.danhpahm.profile_service.service.impl;

import com.danhpahm.profile_service.dto.request.ProfileCreationRequest;
import com.danhpahm.profile_service.dto.response.UserProfileResponse;
import com.danhpahm.profile_service.entity.UserProfile;
import com.danhpahm.profile_service.mapper.UserProfileMapper;
import com.danhpahm.profile_service.repository.UserProfileRepository;
import com.danhpahm.profile_service.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileServiceImpl implements UserProfileService {
    UserProfileRepository userProfileRepository;
    UserProfileMapper userProfileMapper;

    @Override
    public UserProfileResponse createUserProfile(ProfileCreationRequest request) {
        UserProfile userProfile = userProfileMapper.toUserProfile(request);
        userProfile = userProfileRepository.save(userProfile);

        return userProfileMapper.toUserProfileResponse(userProfile);
    }

    @Override
    public UserProfileResponse getProfileById(String id) {
        UserProfile userProfile = userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found"));

        return userProfileMapper.toUserProfileResponse(userProfile);
    }

    @Override
    public List<UserProfileResponse> getAllUserProfiles() {
        var userProfiles = userProfileRepository.findAll();

        return userProfiles.stream().map(userProfileMapper::toUserProfileResponse).toList();
    }
}
