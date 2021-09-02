package com.desktop.repositoryImpl;

import com.desktop.entity.Profile;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.ProfileDao;

import java.util.List;
import java.util.Map;

public class ProfileDaoImpl implements ProfileDao {
    private final DaoFactory daoFactory ;

    public ProfileDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public Profile getProfile(Profile profile) {
        return null;
    }

    @Override
    public List<Profile> getAll(String searchInput, Map<String, Object> filter) {
        return null;
    }

    @Override
    public Profile addProfile(Profile profile) {
        return null;
    }

    @Override
    public Profile editProfile(Profile profile) {
        return null;
    }

    @Override
    public int dellProfile(Profile profile) {
        return 0;
    }
}
