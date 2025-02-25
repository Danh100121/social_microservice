package com.danhpahm.profile_service.controller;

import com.danhpahm.profile_service.dto.request.ProfileCreationRequest;
import com.danhpahm.profile_service.dto.response.UserProfileResponse;
import com.danhpahm.profile_service.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {

    UserProfileService userProfileService;

    @PostMapping("/user")
    UserProfileResponse createUserProfile(@RequestBody ProfileCreationRequest request){
        return userProfileService.createUserProfile(request);
    }

    @GetMapping("/users/{profileId}")
    UserProfileResponse getUserProfile(@PathVariable String profileId){
        return userProfileService.getProfileById(profileId);
    }
}
