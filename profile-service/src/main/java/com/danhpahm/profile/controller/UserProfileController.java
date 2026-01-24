package com.danhpahm.profile.controller;

import com.danhpahm.profile.dto.response.UserProfileResponse;
import com.danhpahm.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @GetMapping("/users/{profileId}")
    UserProfileResponse getUserProfile(@PathVariable String profileId) {
        return userProfileService.getProfile(profileId);
    }

    @GetMapping("/users")
    List<UserProfileResponse> getAllUserProfiles() {
        return userProfileService.getAllProfiles();
    }
}
