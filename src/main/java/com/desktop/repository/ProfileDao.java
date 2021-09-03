package com.desktop.repository;

import com.desktop.entity.Profile;

import java.util.List;
import java.util.Map;

public interface ProfileDao {
    Profile getProfile(Profile profile);
    List<Profile> getAll(String searchInput , Map<String , Object> filter);

}
