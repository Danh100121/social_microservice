package com.danhpahm.profile_service.controller;

import com.danhpahm.profile_service.dto.response.UserProfileResponse;
import com.danhpahm.profile_service.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {

    UserProfileService userProfileService;

    @GetMapping("/users/{profileId}")
    UserProfileResponse getUserProfile(@PathVariable String profileId){
        return userProfileService.getProfileById(profileId);
    }

    @GetMapping("/users")
    List<UserProfileResponse> getAllUserProfiles(){
        return userProfileService.getAllUserProfiles();
    }
}
