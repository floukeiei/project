package nodomain.freeyourgadget.gadgetbridge.entities;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import nodomain.freeyourgadget.gadgetbridge.entities.UserAttributes;
import nodomain.freeyourgadget.gadgetbridge.entities.User;
import nodomain.freeyourgadget.gadgetbridge.entities.DeviceAttributes;
import nodomain.freeyourgadget.gadgetbridge.entities.Device;
import nodomain.freeyourgadget.gadgetbridge.entities.Tag;
import nodomain.freeyourgadget.gadgetbridge.entities.ActivityDescription;
import nodomain.freeyourgadget.gadgetbridge.entities.ActivityDescTagLink;
import nodomain.freeyourgadget.gadgetbridge.entities.MiBandActivitySample;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleHealthActivitySample;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleHealthActivityOverlay;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleMisfitSample;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleMorpheuzSample;
import nodomain.freeyourgadget.gadgetbridge.entities.HPlusHealthActivityOverlay;
import nodomain.freeyourgadget.gadgetbridge.entities.HPlusHealthActivitySample;
import nodomain.freeyourgadget.gadgetbridge.entities.CalendarSyncState;

import nodomain.freeyourgadget.gadgetbridge.entities.UserAttributesDao;
import nodomain.freeyourgadget.gadgetbridge.entities.UserDao;
import nodomain.freeyourgadget.gadgetbridge.entities.DeviceAttributesDao;
import nodomain.freeyourgadget.gadgetbridge.entities.DeviceDao;
import nodomain.freeyourgadget.gadgetbridge.entities.TagDao;
import nodomain.freeyourgadget.gadgetbridge.entities.ActivityDescriptionDao;
import nodomain.freeyourgadget.gadgetbridge.entities.ActivityDescTagLinkDao;
import nodomain.freeyourgadget.gadgetbridge.entities.MiBandActivitySampleDao;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleHealthActivitySampleDao;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleHealthActivityOverlayDao;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleMisfitSampleDao;
import nodomain.freeyourgadget.gadgetbridge.entities.PebbleMorpheuzSampleDao;
import nodomain.freeyourgadget.gadgetbridge.entities.HPlusHealthActivityOverlayDao;
import nodomain.freeyourgadget.gadgetbridge.entities.HPlusHealthActivitySampleDao;
import nodomain.freeyourgadget.gadgetbridge.entities.CalendarSyncStateDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userAttributesDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig deviceAttributesDaoConfig;
    private final DaoConfig deviceDaoConfig;
    private final DaoConfig tagDaoConfig;
    private final DaoConfig activityDescriptionDaoConfig;
    private final DaoConfig activityDescTagLinkDaoConfig;
    private final DaoConfig miBandActivitySampleDaoConfig;
    private final DaoConfig pebbleHealthActivitySampleDaoConfig;
    private final DaoConfig pebbleHealthActivityOverlayDaoConfig;
    private final DaoConfig pebbleMisfitSampleDaoConfig;
    private final DaoConfig pebbleMorpheuzSampleDaoConfig;
    private final DaoConfig hPlusHealthActivityOverlayDaoConfig;
    private final DaoConfig hPlusHealthActivitySampleDaoConfig;
    private final DaoConfig calendarSyncStateDaoConfig;

    private final UserAttributesDao userAttributesDao;
    private final UserDao userDao;
    private final DeviceAttributesDao deviceAttributesDao;
    private final DeviceDao deviceDao;
    private final TagDao tagDao;
    private final ActivityDescriptionDao activityDescriptionDao;
    private final ActivityDescTagLinkDao activityDescTagLinkDao;
    private final MiBandActivitySampleDao miBandActivitySampleDao;
    private final PebbleHealthActivitySampleDao pebbleHealthActivitySampleDao;
    private final PebbleHealthActivityOverlayDao pebbleHealthActivityOverlayDao;
    private final PebbleMisfitSampleDao pebbleMisfitSampleDao;
    private final PebbleMorpheuzSampleDao pebbleMorpheuzSampleDao;
    private final HPlusHealthActivityOverlayDao hPlusHealthActivityOverlayDao;
    private final HPlusHealthActivitySampleDao hPlusHealthActivitySampleDao;
    private final CalendarSyncStateDao calendarSyncStateDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userAttributesDaoConfig = daoConfigMap.get(UserAttributesDao.class).clone();
        userAttributesDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        deviceAttributesDaoConfig = daoConfigMap.get(DeviceAttributesDao.class).clone();
        deviceAttributesDaoConfig.initIdentityScope(type);

        deviceDaoConfig = daoConfigMap.get(DeviceDao.class).clone();
        deviceDaoConfig.initIdentityScope(type);

        tagDaoConfig = daoConfigMap.get(TagDao.class).clone();
        tagDaoConfig.initIdentityScope(type);

        activityDescriptionDaoConfig = daoConfigMap.get(ActivityDescriptionDao.class).clone();
        activityDescriptionDaoConfig.initIdentityScope(type);

        activityDescTagLinkDaoConfig = daoConfigMap.get(ActivityDescTagLinkDao.class).clone();
        activityDescTagLinkDaoConfig.initIdentityScope(type);

        miBandActivitySampleDaoConfig = daoConfigMap.get(MiBandActivitySampleDao.class).clone();
        miBandActivitySampleDaoConfig.initIdentityScope(type);

        pebbleHealthActivitySampleDaoConfig = daoConfigMap.get(PebbleHealthActivitySampleDao.class).clone();
        pebbleHealthActivitySampleDaoConfig.initIdentityScope(type);

        pebbleHealthActivityOverlayDaoConfig = daoConfigMap.get(PebbleHealthActivityOverlayDao.class).clone();
        pebbleHealthActivityOverlayDaoConfig.initIdentityScope(type);

        pebbleMisfitSampleDaoConfig = daoConfigMap.get(PebbleMisfitSampleDao.class).clone();
        pebbleMisfitSampleDaoConfig.initIdentityScope(type);

        pebbleMorpheuzSampleDaoConfig = daoConfigMap.get(PebbleMorpheuzSampleDao.class).clone();
        pebbleMorpheuzSampleDaoConfig.initIdentityScope(type);

        hPlusHealthActivityOverlayDaoConfig = daoConfigMap.get(HPlusHealthActivityOverlayDao.class).clone();
        hPlusHealthActivityOverlayDaoConfig.initIdentityScope(type);

        hPlusHealthActivitySampleDaoConfig = daoConfigMap.get(HPlusHealthActivitySampleDao.class).clone();
        hPlusHealthActivitySampleDaoConfig.initIdentityScope(type);

        calendarSyncStateDaoConfig = daoConfigMap.get(CalendarSyncStateDao.class).clone();
        calendarSyncStateDaoConfig.initIdentityScope(type);

        userAttributesDao = new UserAttributesDao(userAttributesDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        deviceAttributesDao = new DeviceAttributesDao(deviceAttributesDaoConfig, this);
        deviceDao = new DeviceDao(deviceDaoConfig, this);
        tagDao = new TagDao(tagDaoConfig, this);
        activityDescriptionDao = new ActivityDescriptionDao(activityDescriptionDaoConfig, this);
        activityDescTagLinkDao = new ActivityDescTagLinkDao(activityDescTagLinkDaoConfig, this);
        miBandActivitySampleDao = new MiBandActivitySampleDao(miBandActivitySampleDaoConfig, this);
        pebbleHealthActivitySampleDao = new PebbleHealthActivitySampleDao(pebbleHealthActivitySampleDaoConfig, this);
        pebbleHealthActivityOverlayDao = new PebbleHealthActivityOverlayDao(pebbleHealthActivityOverlayDaoConfig, this);
        pebbleMisfitSampleDao = new PebbleMisfitSampleDao(pebbleMisfitSampleDaoConfig, this);
        pebbleMorpheuzSampleDao = new PebbleMorpheuzSampleDao(pebbleMorpheuzSampleDaoConfig, this);
        hPlusHealthActivityOverlayDao = new HPlusHealthActivityOverlayDao(hPlusHealthActivityOverlayDaoConfig, this);
        hPlusHealthActivitySampleDao = new HPlusHealthActivitySampleDao(hPlusHealthActivitySampleDaoConfig, this);
        calendarSyncStateDao = new CalendarSyncStateDao(calendarSyncStateDaoConfig, this);

        registerDao(UserAttributes.class, userAttributesDao);
        registerDao(User.class, userDao);
        registerDao(DeviceAttributes.class, deviceAttributesDao);
        registerDao(Device.class, deviceDao);
        registerDao(Tag.class, tagDao);
        registerDao(ActivityDescription.class, activityDescriptionDao);
        registerDao(ActivityDescTagLink.class, activityDescTagLinkDao);
        registerDao(MiBandActivitySample.class, miBandActivitySampleDao);
        registerDao(PebbleHealthActivitySample.class, pebbleHealthActivitySampleDao);
        registerDao(PebbleHealthActivityOverlay.class, pebbleHealthActivityOverlayDao);
        registerDao(PebbleMisfitSample.class, pebbleMisfitSampleDao);
        registerDao(PebbleMorpheuzSample.class, pebbleMorpheuzSampleDao);
        registerDao(HPlusHealthActivityOverlay.class, hPlusHealthActivityOverlayDao);
        registerDao(HPlusHealthActivitySample.class, hPlusHealthActivitySampleDao);
        registerDao(CalendarSyncState.class, calendarSyncStateDao);
    }
    
    public void clear() {
        userAttributesDaoConfig.getIdentityScope().clear();
        userDaoConfig.getIdentityScope().clear();
        deviceAttributesDaoConfig.getIdentityScope().clear();
        deviceDaoConfig.getIdentityScope().clear();
        tagDaoConfig.getIdentityScope().clear();
        activityDescriptionDaoConfig.getIdentityScope().clear();
        activityDescTagLinkDaoConfig.getIdentityScope().clear();
        miBandActivitySampleDaoConfig.getIdentityScope().clear();
        pebbleHealthActivitySampleDaoConfig.getIdentityScope().clear();
        pebbleHealthActivityOverlayDaoConfig.getIdentityScope().clear();
        pebbleMisfitSampleDaoConfig.getIdentityScope().clear();
        pebbleMorpheuzSampleDaoConfig.getIdentityScope().clear();
        hPlusHealthActivityOverlayDaoConfig.getIdentityScope().clear();
        hPlusHealthActivitySampleDaoConfig.getIdentityScope().clear();
        calendarSyncStateDaoConfig.getIdentityScope().clear();
    }

    public UserAttributesDao getUserAttributesDao() {
        return userAttributesDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public DeviceAttributesDao getDeviceAttributesDao() {
        return deviceAttributesDao;
    }

    public DeviceDao getDeviceDao() {
        return deviceDao;
    }

    public TagDao getTagDao() {
        return tagDao;
    }

    public ActivityDescriptionDao getActivityDescriptionDao() {
        return activityDescriptionDao;
    }

    public ActivityDescTagLinkDao getActivityDescTagLinkDao() {
        return activityDescTagLinkDao;
    }

    public MiBandActivitySampleDao getMiBandActivitySampleDao() {
        return miBandActivitySampleDao;
    }

    public PebbleHealthActivitySampleDao getPebbleHealthActivitySampleDao() {
        return pebbleHealthActivitySampleDao;
    }

    public PebbleHealthActivityOverlayDao getPebbleHealthActivityOverlayDao() {
        return pebbleHealthActivityOverlayDao;
    }

    public PebbleMisfitSampleDao getPebbleMisfitSampleDao() {
        return pebbleMisfitSampleDao;
    }

    public PebbleMorpheuzSampleDao getPebbleMorpheuzSampleDao() {
        return pebbleMorpheuzSampleDao;
    }

    public HPlusHealthActivityOverlayDao getHPlusHealthActivityOverlayDao() {
        return hPlusHealthActivityOverlayDao;
    }

    public HPlusHealthActivitySampleDao getHPlusHealthActivitySampleDao() {
        return hPlusHealthActivitySampleDao;
    }

    public CalendarSyncStateDao getCalendarSyncStateDao() {
        return calendarSyncStateDao;
    }

}
