package com.danhpahm.profile.mapper;

import com.danhpahm.profile.dto.request.ProfileCreationRequest;
import com.danhpahm.profile.dto.response.UserProfileResponse;
import com.danhpahm.profile.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);
    UserProfileResponse toUserProfileResponse(UserProfile entity);
}
