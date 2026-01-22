package com.danhpahm.identity_service.repository;

import com.danhpahm.identity_service.dto.request.ProfileCreationRequest;
import com.danhpahm.identity_service.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
