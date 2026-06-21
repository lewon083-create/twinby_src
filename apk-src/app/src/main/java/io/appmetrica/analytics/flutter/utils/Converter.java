package io.appmetrica.analytics.flutter.utils;

import android.location.Location;
import androidx.annotation.NonNull;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.BirthDateAttribute;
import io.appmetrica.analytics.profile.BooleanAttribute;
import io.appmetrica.analytics.profile.CounterAttribute;
import io.appmetrica.analytics.profile.GenderAttribute;
import io.appmetrica.analytics.profile.NameAttribute;
import io.appmetrica.analytics.profile.NotificationsEnabledAttribute;
import io.appmetrica.analytics.profile.NumberAttribute;
import io.appmetrica.analytics.profile.StringAttribute;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Converter {
    private static final Map<Pigeon.GenderPigeon, GenderAttribute.Gender> genderToNative = new HashMap<Pigeon.GenderPigeon, GenderAttribute.Gender>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.1
        {
            put(Pigeon.GenderPigeon.MALE, GenderAttribute.Gender.MALE);
            put(Pigeon.GenderPigeon.FEMALE, GenderAttribute.Gender.FEMALE);
            put(Pigeon.GenderPigeon.OTHER, GenderAttribute.Gender.OTHER);
        }
    };
    private static final Map<Pigeon.AdTypePigeon, AdType> adTypeToNative = new HashMap<Pigeon.AdTypePigeon, AdType>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.2
        {
            put(Pigeon.AdTypePigeon.UNKNOWN, null);
            put(Pigeon.AdTypePigeon.NATIVE, AdType.NATIVE);
            put(Pigeon.AdTypePigeon.BANNER, AdType.BANNER);
            put(Pigeon.AdTypePigeon.REWARDED, AdType.REWARDED);
            put(Pigeon.AdTypePigeon.INTERSTITIAL, AdType.INTERSTITIAL);
            put(Pigeon.AdTypePigeon.MREC, AdType.MREC);
            put(Pigeon.AdTypePigeon.APP_OPEN, AdType.APP_OPEN);
            put(Pigeon.AdTypePigeon.OTHER, AdType.OTHER);
        }
    };

    /* JADX INFO: renamed from: io.appmetrica.analytics.flutter.utils.Converter$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType;

        static {
            int[] iArr = new int[DeferredDeeplinkParametersListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error = iArr;
            try {
                iArr[DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[DeferredDeeplinkParametersListener.Error.PARSE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[DeferredDeeplinkParametersListener.Error.NO_REFERRER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DeferredDeeplinkListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error = iArr2;
            try {
                iArr2[DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[DeferredDeeplinkListener.Error.PARSE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[DeferredDeeplinkListener.Error.NO_REFERRER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[StartupParamsItemStatus.values().length];
            $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus = iArr3;
            try {
                iArr3[StartupParamsItemStatus.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[StartupParamsItemStatus.PROVIDER_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[StartupParamsItemStatus.NETWORK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[StartupParamsItemStatus.FEATURE_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[Pigeon.UserProfileAttributeType.values().length];
            $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType = iArr4;
            try {
                iArr4[Pigeon.UserProfileAttributeType.BIRTH_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.COUNTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.GENDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.NOTIFICATION_ENABLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    @NonNull
    public static Revenue toNative(@NonNull Pigeon.RevenuePigeon revenuePigeon) {
        Revenue.Builder builderNewBuilder = Revenue.newBuilder(new BigDecimal(revenuePigeon.getPrice()).multiply(new BigDecimal(1000000)).longValue(), Currency.getInstance(revenuePigeon.getCurrency()));
        String productId = revenuePigeon.getProductId();
        if (productId != null) {
            builderNewBuilder.withProductID(productId);
        }
        String payload = revenuePigeon.getPayload();
        if (payload != null) {
            builderNewBuilder.withPayload(payload);
        }
        Long quantity = revenuePigeon.getQuantity();
        if (quantity != null) {
            builderNewBuilder.withQuantity(Integer.valueOf(quantity.intValue()));
        }
        Pigeon.ReceiptPigeon receipt = revenuePigeon.getReceipt();
        if (receipt != null) {
            Revenue.Receipt.Builder builderNewBuilder2 = Revenue.Receipt.newBuilder();
            String data = receipt.getData();
            if (data != null) {
                builderNewBuilder2.withData(data);
            }
            String signature = receipt.getSignature();
            if (signature != null) {
                builderNewBuilder2.withSignature(signature);
            }
            builderNewBuilder.withReceipt(builderNewBuilder2.build());
        }
        return builderNewBuilder.build();
    }

    @NonNull
    public static Pigeon.StartupParamsItemStatusPigeon toPigeon(@NonNull StartupParamsItemStatus startupParamsItemStatus) {
        int i = AnonymousClass4.$SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[startupParamsItemStatus.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Pigeon.StartupParamsItemStatusPigeon.UNKNOWN_ERROR : Pigeon.StartupParamsItemStatusPigeon.FEATURE_DISABLED : Pigeon.StartupParamsItemStatusPigeon.NETWORK_ERROR : Pigeon.StartupParamsItemStatusPigeon.INVALID_VALUE_FROM_PROVIDER : Pigeon.StartupParamsItemStatusPigeon.PROVIDER_UNAVAILABLE : Pigeon.StartupParamsItemStatusPigeon.OK;
    }

    @NonNull
    public static Pigeon.StartupParamsItemPigeon toPigeon(@NonNull StartupParamsItem startupParamsItem) {
        return new Pigeon.StartupParamsItemPigeon.Builder().setId(startupParamsItem.getId()).setStatus(toPigeon(startupParamsItem.getStatus())).setErrorDetails(startupParamsItem.getErrorDetails()).build();
    }

    @NonNull
    public static Pigeon.StartupParamsResultPigeon toPigeon(@NonNull StartupParamsCallback.Result result) {
        HashMap map = new HashMap();
        for (Map.Entry<String, StartupParamsItem> entry : result.parameters.entrySet()) {
            map.put(entry.getKey(), toPigeon(entry.getValue()));
        }
        return new Pigeon.StartupParamsResultPigeon.Builder().setDeviceId(result.deviceId).setDeviceIdHash(result.deviceIdHash).setParameters(map).setUuid(result.uuid).build();
    }

    @NonNull
    public static AppMetricaConfig toNative(@NonNull Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfigPigeon.getApiKey());
        Boolean advIdentifiersTracking = appMetricaConfigPigeon.getAdvIdentifiersTracking();
        if (advIdentifiersTracking != null) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(advIdentifiersTracking.booleanValue());
        }
        Boolean anrMonitoring = appMetricaConfigPigeon.getAnrMonitoring();
        if (anrMonitoring != null) {
            builderNewConfigBuilder.withAnrMonitoring(anrMonitoring.booleanValue());
        }
        Long anrMonitoringTimeout = appMetricaConfigPigeon.getAnrMonitoringTimeout();
        if (anrMonitoringTimeout != null) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(anrMonitoringTimeout.intValue());
        }
        Long appBuildNumber = appMetricaConfigPigeon.getAppBuildNumber();
        if (appBuildNumber != null) {
            builderNewConfigBuilder.withAppBuildNumber(appBuildNumber.intValue());
        }
        Map<String, String> appEnvironment = appMetricaConfigPigeon.getAppEnvironment();
        if (appEnvironment != null) {
            for (Map.Entry<String, String> entry : appEnvironment.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    builderNewConfigBuilder.withAppEnvironmentValue(key, value);
                }
            }
        }
        Boolean appOpenTrackingEnabled = appMetricaConfigPigeon.getAppOpenTrackingEnabled();
        if (appOpenTrackingEnabled != null) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appOpenTrackingEnabled.booleanValue());
        }
        String appVersion = appMetricaConfigPigeon.getAppVersion();
        if (appVersion != null) {
            builderNewConfigBuilder.withAppVersion(appVersion);
        }
        Boolean crashReporting = appMetricaConfigPigeon.getCrashReporting();
        if (crashReporting != null) {
            builderNewConfigBuilder.withCrashReporting(crashReporting.booleanValue());
        }
        List<String> customHosts = appMetricaConfigPigeon.getCustomHosts();
        if (customHosts != null) {
            builderNewConfigBuilder.withCustomHosts(customHosts);
        }
        Boolean dataSendingEnabled = appMetricaConfigPigeon.getDataSendingEnabled();
        if (dataSendingEnabled != null) {
            builderNewConfigBuilder.withDataSendingEnabled(dataSendingEnabled.booleanValue());
        }
        String deviceType = appMetricaConfigPigeon.getDeviceType();
        if (deviceType != null) {
            builderNewConfigBuilder.withDeviceType(deviceType);
        }
        Long dispatchPeriodSeconds = appMetricaConfigPigeon.getDispatchPeriodSeconds();
        if (dispatchPeriodSeconds != null) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(dispatchPeriodSeconds.intValue());
        }
        Map<String, String> errorEnvironment = appMetricaConfigPigeon.getErrorEnvironment();
        if (errorEnvironment != null) {
            for (Map.Entry<String, String> entry2 : errorEnvironment.entrySet()) {
                String key2 = entry2.getKey();
                String value2 = entry2.getValue();
                if (key2 != null) {
                    builderNewConfigBuilder.withErrorEnvironmentValue(key2, value2);
                }
            }
        }
        Boolean firstActivationAsUpdate = appMetricaConfigPigeon.getFirstActivationAsUpdate();
        if (firstActivationAsUpdate != null) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(firstActivationAsUpdate.booleanValue());
        }
        Pigeon.LocationPigeon location = appMetricaConfigPigeon.getLocation();
        if (location != null) {
            builderNewConfigBuilder.withLocation(toNative(location));
        }
        Boolean locationTracking = appMetricaConfigPigeon.getLocationTracking();
        if (locationTracking != null) {
            builderNewConfigBuilder.withLocationTracking(locationTracking.booleanValue());
        }
        if (appMetricaConfigPigeon.getLogs() != null) {
            builderNewConfigBuilder.withLogs();
        }
        Long maxReportsCount = appMetricaConfigPigeon.getMaxReportsCount();
        if (maxReportsCount != null) {
            builderNewConfigBuilder.withMaxReportsCount(maxReportsCount.intValue());
        }
        Long maxReportsInDatabaseCount = appMetricaConfigPigeon.getMaxReportsInDatabaseCount();
        if (maxReportsInDatabaseCount != null) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
        }
        Boolean nativeCrashReporting = appMetricaConfigPigeon.getNativeCrashReporting();
        if (nativeCrashReporting != null) {
            builderNewConfigBuilder.withNativeCrashReporting(nativeCrashReporting.booleanValue());
        }
        Pigeon.PreloadInfoPigeon preloadInfo = appMetricaConfigPigeon.getPreloadInfo();
        if (preloadInfo != null) {
            builderNewConfigBuilder.withPreloadInfo(toNative(preloadInfo));
        }
        Boolean revenueAutoTrackingEnabled = appMetricaConfigPigeon.getRevenueAutoTrackingEnabled();
        if (revenueAutoTrackingEnabled != null) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(revenueAutoTrackingEnabled.booleanValue());
        }
        Long sessionTimeout = appMetricaConfigPigeon.getSessionTimeout();
        if (sessionTimeout != null) {
            builderNewConfigBuilder.withSessionTimeout(sessionTimeout.intValue());
        }
        Boolean sessionsAutoTrackingEnabled = appMetricaConfigPigeon.getSessionsAutoTrackingEnabled();
        if (sessionsAutoTrackingEnabled != null) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(sessionsAutoTrackingEnabled.booleanValue());
        }
        String userProfileID = appMetricaConfigPigeon.getUserProfileID();
        if (userProfileID != null) {
            builderNewConfigBuilder.withUserProfileID(userProfileID);
        }
        return builderNewConfigBuilder.build();
    }

    @NonNull
    public static Pigeon.StartupParamsReasonPigeon toPigeon(@NonNull StartupParamsCallback.Reason reason) {
        return new Pigeon.StartupParamsReasonPigeon.Builder().setValue(reason.value).build();
    }

    @NonNull
    public static Pigeon.StartupParamsPigeon toPigeon(StartupParamsCallback.Result result, StartupParamsCallback.Reason reason) {
        if (reason == null) {
            return new Pigeon.StartupParamsPigeon.Builder().setResult(result != null ? toPigeon(result) : null).build();
        }
        return new Pigeon.StartupParamsPigeon.Builder().setResult(result != null ? toPigeon(result) : null).setReason(toPigeon(reason)).build();
    }

    @NonNull
    public static Pigeon.AppMetricaDeferredDeeplinkPigeon toPigeon(String str, DeferredDeeplinkListener.Error error, String str2) {
        Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon;
        String description;
        if (str != null) {
            return new Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder().setDeeplink(str).build();
        }
        if (error != null) {
            int i = AnonymousClass4.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[error.ordinal()];
            if (i == 1) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NOT_A_FIRST_LAUNCH;
            } else if (i == 2) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.PARSE_ERROR;
            } else if (i != 3) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
            } else {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NO_REFERRER;
            }
        } else {
            appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
        }
        if (error != null) {
            description = error.getDescription();
        } else {
            description = "";
        }
        return new Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder().setDeeplink(null).setError(new Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder().setReason(appMetricaDeferredDeeplinkReasonPigeon).setMessage(str2).setDescription(description).build()).build();
    }

    @NonNull
    public static Pigeon.AppMetricaDeferredDeeplinkParametersPigeon toPigeon(Map<String, String> map, DeferredDeeplinkParametersListener.Error error, String str) {
        Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon;
        String description;
        if (map != null) {
            return new Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder().setParameters(map).build();
        }
        if (error != null) {
            int i = AnonymousClass4.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[error.ordinal()];
            if (i == 1) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NOT_A_FIRST_LAUNCH;
            } else if (i == 2) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.PARSE_ERROR;
            } else if (i != 3) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
            } else {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NO_REFERRER;
            }
        } else {
            appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
        }
        if (error != null) {
            description = error.getDescription();
        } else {
            description = "";
        }
        return new Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder().setParameters(null).setError(new Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder().setReason(appMetricaDeferredDeeplinkReasonPigeon).setMessage(str).setDescription(description).build()).build();
    }

    @NonNull
    public static ReporterConfig toNative(@NonNull Pigeon.ReporterConfigPigeon reporterConfigPigeon) {
        ReporterConfig.Builder builderNewConfigBuilder = ReporterConfig.newConfigBuilder(reporterConfigPigeon.getApiKey());
        Map<String, String> appEnvironment = reporterConfigPigeon.getAppEnvironment();
        if (appEnvironment != null) {
            for (Map.Entry<String, String> entry : appEnvironment.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    builderNewConfigBuilder.withAppEnvironmentValue(key, value);
                }
            }
        }
        Boolean dataSendingEnabled = reporterConfigPigeon.getDataSendingEnabled();
        if (dataSendingEnabled != null) {
            builderNewConfigBuilder.withDataSendingEnabled(dataSendingEnabled.booleanValue());
        }
        Long dispatchPeriodSeconds = reporterConfigPigeon.getDispatchPeriodSeconds();
        if (dispatchPeriodSeconds != null) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(dispatchPeriodSeconds.intValue());
        }
        if (reporterConfigPigeon.getLogs() != null) {
            builderNewConfigBuilder.withLogs();
        }
        Long maxReportsCount = reporterConfigPigeon.getMaxReportsCount();
        if (maxReportsCount != null) {
            builderNewConfigBuilder.withMaxReportsCount(maxReportsCount.intValue());
        }
        Long maxReportsInDatabaseCount = reporterConfigPigeon.getMaxReportsInDatabaseCount();
        if (maxReportsInDatabaseCount != null) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
        }
        Long sessionTimeout = reporterConfigPigeon.getSessionTimeout();
        if (sessionTimeout != null) {
            builderNewConfigBuilder.withSessionTimeout(sessionTimeout.intValue());
        }
        String userProfileID = reporterConfigPigeon.getUserProfileID();
        if (userProfileID != null) {
            builderNewConfigBuilder.withUserProfileID(userProfileID);
        }
        return builderNewConfigBuilder.build();
    }

    @NonNull
    public static PreloadInfo toNative(@NonNull Pigeon.PreloadInfoPigeon preloadInfoPigeon) {
        PreloadInfo.Builder builderNewBuilder = PreloadInfo.newBuilder(preloadInfoPigeon.getTrackingId());
        Map<String, String> additionalInfo = preloadInfoPigeon.getAdditionalInfo();
        if (additionalInfo != null) {
            for (Map.Entry<String, String> entry : additionalInfo.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    builderNewBuilder.setAdditionalParams(key, value);
                }
            }
        }
        return builderNewBuilder.build();
    }

    @NonNull
    public static Location toNative(@NonNull Pigeon.LocationPigeon locationPigeon) {
        Location location = new Location(locationPigeon.getProvider());
        location.setLongitude(locationPigeon.getLongitude().doubleValue());
        location.setLatitude(locationPigeon.getLatitude().doubleValue());
        Double altitude = locationPigeon.getAltitude();
        if (altitude != null) {
            location.setAltitude(altitude.doubleValue());
        }
        Double course = locationPigeon.getCourse();
        if (course != null) {
            location.setBearing(course.floatValue());
        }
        Long timestamp = locationPigeon.getTimestamp();
        if (timestamp != null) {
            location.setTime(timestamp.longValue());
        }
        Double accuracy = locationPigeon.getAccuracy();
        if (accuracy != null) {
            location.setAccuracy(accuracy.floatValue());
        }
        Double speed = locationPigeon.getSpeed();
        if (speed != null) {
            location.setSpeed(speed.floatValue());
        }
        return location;
    }

    @NonNull
    public static UserProfile toNative(@NonNull Pigeon.UserProfilePigeon userProfilePigeon) {
        UserProfile.Builder builderNewBuilder = UserProfile.newBuilder();
        List<Pigeon.UserProfileAttributePigeon> attributes = userProfilePigeon.getAttributes();
        ArrayList<UserProfileUpdate<? extends Cdo>> arrayList = new ArrayList();
        for (Pigeon.UserProfileAttributePigeon userProfileAttributePigeon : attributes) {
            Pigeon.UserProfileAttributeType type = userProfileAttributePigeon.getType();
            if (type != null) {
                int i = AnonymousClass4.$SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[type.ordinal()];
                double dDoubleValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
                switch (i) {
                    case 1:
                        BirthDateAttribute birthDateAttributeBirthDate = Attribute.birthDate();
                        if (Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(birthDateAttributeBirthDate.withValueReset());
                        } else {
                            Long year = userProfileAttributePigeon.getYear();
                            Long month = userProfileAttributePigeon.getMonth();
                            Long day = userProfileAttributePigeon.getDay();
                            Long age = userProfileAttributePigeon.getAge();
                            if (year == null) {
                                if (age != null) {
                                    arrayList.add(birthDateAttributeBirthDate.withAge(age.intValue()));
                                }
                            } else if (month == null) {
                                arrayList.add(birthDateAttributeBirthDate.withBirthDate(year.intValue()));
                            } else if (day == null) {
                                arrayList.add(birthDateAttributeBirthDate.withBirthDate(year.intValue(), month.intValue()));
                            } else {
                                arrayList.add(birthDateAttributeBirthDate.withBirthDate(year.intValue(), month.intValue(), day.intValue()));
                            }
                        }
                        break;
                    case 2:
                        BooleanAttribute booleanAttributeCustomBoolean = Attribute.customBoolean(userProfileAttributePigeon.getKey());
                        Boolean bool = Boolean.TRUE;
                        if (bool.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(booleanAttributeCustomBoolean.withValueReset());
                        } else {
                            Boolean boolValue = userProfileAttributePigeon.getBoolValue();
                            boolean zBooleanValue = boolValue != null ? boolValue.booleanValue() : false;
                            if (bool.equals(userProfileAttributePigeon.getIfUndefined())) {
                                arrayList.add(booleanAttributeCustomBoolean.withValueIfUndefined(zBooleanValue));
                            } else {
                                arrayList.add(booleanAttributeCustomBoolean.withValue(zBooleanValue));
                            }
                        }
                        break;
                    case 3:
                        CounterAttribute counterAttributeCustomCounter = Attribute.customCounter(userProfileAttributePigeon.getKey());
                        Double doubleValue = userProfileAttributePigeon.getDoubleValue();
                        if (doubleValue != null) {
                            dDoubleValue = doubleValue.doubleValue();
                        }
                        arrayList.add(counterAttributeCustomCounter.withDelta(dDoubleValue));
                        break;
                    case 4:
                        GenderAttribute genderAttributeGender = Attribute.gender();
                        if (Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(genderAttributeGender.withValueReset());
                        } else {
                            GenderAttribute.Gender gender = genderToNative.get(userProfileAttributePigeon.getGenderValue());
                            if (gender == null) {
                                gender = GenderAttribute.Gender.OTHER;
                            }
                            arrayList.add(genderAttributeGender.withValue(gender));
                        }
                        break;
                    case 5:
                        NameAttribute nameAttributeName = Attribute.name();
                        if (Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(nameAttributeName.withValueReset());
                        } else {
                            String stringValue = userProfileAttributePigeon.getStringValue();
                            arrayList.add(nameAttributeName.withValue(stringValue != null ? stringValue : ""));
                        }
                        break;
                    case 6:
                        NotificationsEnabledAttribute notificationsEnabledAttributeNotificationsEnabled = Attribute.notificationsEnabled();
                        if (Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(notificationsEnabledAttributeNotificationsEnabled.withValueReset());
                        } else {
                            Boolean boolValue2 = userProfileAttributePigeon.getBoolValue();
                            arrayList.add(notificationsEnabledAttributeNotificationsEnabled.withValue(boolValue2 != null ? boolValue2.booleanValue() : false));
                        }
                        break;
                    case 7:
                        NumberAttribute numberAttributeCustomNumber = Attribute.customNumber(userProfileAttributePigeon.getKey());
                        Boolean bool2 = Boolean.TRUE;
                        if (bool2.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(numberAttributeCustomNumber.withValueReset());
                        } else {
                            Double doubleValue2 = userProfileAttributePigeon.getDoubleValue();
                            if (doubleValue2 != null) {
                                dDoubleValue = doubleValue2.doubleValue();
                            }
                            if (bool2.equals(userProfileAttributePigeon.getIfUndefined())) {
                                arrayList.add(numberAttributeCustomNumber.withValueIfUndefined(dDoubleValue));
                            } else {
                                arrayList.add(numberAttributeCustomNumber.withValue(dDoubleValue));
                            }
                        }
                        break;
                    case 8:
                        StringAttribute stringAttributeCustomString = Attribute.customString(userProfileAttributePigeon.getKey());
                        Boolean bool3 = Boolean.TRUE;
                        if (bool3.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(stringAttributeCustomString.withValueReset());
                        } else {
                            String stringValue2 = userProfileAttributePigeon.getStringValue();
                            String str = stringValue2 != null ? stringValue2 : "";
                            if (bool3.equals(userProfileAttributePigeon.getIfUndefined())) {
                                arrayList.add(stringAttributeCustomString.withValueIfUndefined(str));
                            } else {
                                arrayList.add(stringAttributeCustomString.withValue(str));
                            }
                        }
                        break;
                }
            }
        }
        for (UserProfileUpdate<? extends Cdo> userProfileUpdate : arrayList) {
            if (userProfileUpdate != null) {
                builderNewBuilder.apply(userProfileUpdate);
            }
        }
        return builderNewBuilder.build();
    }

    @NonNull
    public static StackTraceItem toNative(@NonNull Pigeon.StackTraceElementPigeon stackTraceElementPigeon) {
        return new StackTraceItem.Builder().withFileName(stackTraceElementPigeon.getFileName()).withClassName(stackTraceElementPigeon.getClassName()).withMethodName(stackTraceElementPigeon.getMethodName()).withLine(Integer.valueOf(stackTraceElementPigeon.getLine().intValue())).withColumn(Integer.valueOf(stackTraceElementPigeon.getColumn().intValue())).build();
    }

    @NonNull
    public static PluginErrorDetails toNative(@NonNull Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        PluginErrorDetails.Builder builderWithVirtualMachineVersion = new PluginErrorDetails.Builder().withExceptionClass(errorDetailsPigeon.getExceptionClass()).withMessage(errorDetailsPigeon.getMessage()).withPlatform(PluginErrorDetails.Platform.FLUTTER).withVirtualMachineVersion(errorDetailsPigeon.getDartVersion());
        List<Pigeon.StackTraceElementPigeon> backtrace = errorDetailsPigeon.getBacktrace();
        if (backtrace != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Pigeon.StackTraceElementPigeon> it = backtrace.iterator();
            while (it.hasNext()) {
                arrayList.add(toNative(it.next()));
            }
            builderWithVirtualMachineVersion.withStacktrace(arrayList);
        }
        return builderWithVirtualMachineVersion.build();
    }

    @NonNull
    public static AdRevenue toNative(@NonNull Pigeon.AdRevenuePigeon adRevenuePigeon) {
        AdType adType;
        AdRevenue.Builder builderNewBuilder = AdRevenue.newBuilder(new BigDecimal(adRevenuePigeon.getAdRevenue()), Currency.getInstance(adRevenuePigeon.getCurrency()));
        Pigeon.AdTypePigeon adType2 = adRevenuePigeon.getAdType();
        if (adType2 != null && (adType = adTypeToNative.get(adType2)) != null) {
            builderNewBuilder.withAdType(adType);
        }
        String adNetwork = adRevenuePigeon.getAdNetwork();
        if (adNetwork != null) {
            builderNewBuilder.withAdNetwork(adNetwork);
        }
        String adUnitId = adRevenuePigeon.getAdUnitId();
        if (adUnitId != null) {
            builderNewBuilder.withAdUnitId(adUnitId);
        }
        String adUnitName = adRevenuePigeon.getAdUnitName();
        if (adUnitName != null) {
            builderNewBuilder.withAdUnitName(adUnitName);
        }
        String adPlacementId = adRevenuePigeon.getAdPlacementId();
        if (adPlacementId != null) {
            builderNewBuilder.withAdPlacementId(adPlacementId);
        }
        String adPlacementName = adRevenuePigeon.getAdPlacementName();
        if (adPlacementName != null) {
            builderNewBuilder.withAdPlacementName(adPlacementName);
        }
        String precision = adRevenuePigeon.getPrecision();
        if (precision != null) {
            builderNewBuilder.withPrecision(precision);
        }
        Map<String, String> payload = adRevenuePigeon.getPayload();
        if (payload != null) {
            builderNewBuilder.withPayload(payload);
        }
        return builderNewBuilder.build();
    }

    @NonNull
    public static FlutterExternalAttribution toNative(@NonNull Pigeon.ExternalAttributionPigeon externalAttributionPigeon) {
        return new FlutterExternalAttribution(new HashMap<String, Integer>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.3
            {
                put("appsflyer", 1);
                put("adjust", 2);
                put("kochava", 3);
                put("tenjin", 4);
                put("airbridge", 5);
                put("singular", 6);
            }
        }.get(externalAttributionPigeon.getSource()).intValue(), new JSONObject(externalAttributionPigeon.getData()).toString());
    }
}
