package io.sentry.util;

import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DebugMetaPropertiesApplier {

    @NotNull
    public static String DEBUG_META_PROPERTIES_FILENAME = "sentry-debug-meta.properties";

    public static void apply(@NotNull SentryOptions sentryOptions, @Nullable List<Properties> list) {
        if (list != null) {
            applyToOptions(sentryOptions, list);
            applyBuildTool(sentryOptions, list);
            applyDistributionOptions(sentryOptions, list);
        }
    }

    private static void applyBuildTool(@NotNull SentryOptions sentryOptions, @NotNull List<Properties> list) {
        for (Properties properties : list) {
            String buildTool = getBuildTool(properties);
            if (buildTool != null) {
                String buildToolVersion = getBuildToolVersion(properties);
                if (buildToolVersion == null) {
                    buildToolVersion = "unknown";
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Build tool found: %s, version %s", buildTool, buildToolVersion);
                SentryIntegrationPackageStorage.getInstance().addPackage(buildTool, buildToolVersion);
                return;
            }
        }
    }

    private static void applyBundleIds(@NotNull SentryOptions sentryOptions, @NotNull List<Properties> list) {
        if (sentryOptions.getBundleIds().isEmpty()) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String property = it.next().getProperty("io.sentry.bundle-ids");
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, -1)) {
                        sentryOptions.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void applyDistributionOptions(@NotNull SentryOptions sentryOptions, @NotNull List<Properties> list) {
        for (Properties properties : list) {
            String distributionOrgSlug = getDistributionOrgSlug(properties);
            String distributionProjectSlug = getDistributionProjectSlug(properties);
            String distributionAuthToken = getDistributionAuthToken(properties);
            String distributionBuildConfiguration = getDistributionBuildConfiguration(properties);
            String distributionInstallGroupsOverride = getDistributionInstallGroupsOverride(properties);
            if (distributionOrgSlug != null || distributionProjectSlug != null || distributionAuthToken != null || distributionBuildConfiguration != null || distributionInstallGroupsOverride != null) {
                SentryOptions.DistributionOptions distribution = sentryOptions.getDistribution();
                if (distributionOrgSlug != null && !distributionOrgSlug.isEmpty() && distribution.orgSlug.isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution org slug found: %s", distributionOrgSlug);
                    distribution.orgSlug = distributionOrgSlug;
                }
                if (distributionProjectSlug != null && !distributionProjectSlug.isEmpty() && distribution.projectSlug.isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution project slug found: %s", distributionProjectSlug);
                    distribution.projectSlug = distributionProjectSlug;
                }
                if (distributionAuthToken != null && !distributionAuthToken.isEmpty() && distribution.orgAuthToken.isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution org auth token found", new Object[0]);
                    distribution.orgAuthToken = distributionAuthToken;
                }
                if (distributionBuildConfiguration != null && !distributionBuildConfiguration.isEmpty() && distribution.buildConfiguration == null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution build configuration found: %s", distributionBuildConfiguration);
                    distribution.buildConfiguration = distributionBuildConfiguration;
                }
                if (distributionInstallGroupsOverride == null || distributionInstallGroupsOverride.isEmpty() || distribution.installGroupsOverride != null) {
                    return;
                }
                String[] strArrSplit = distributionInstallGroupsOverride.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, -1);
                ArrayList arrayList = new ArrayList();
                for (String str : strArrSplit) {
                    String strTrim = str.trim();
                    if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution install groups override found: %s", arrayList);
                distribution.installGroupsOverride = arrayList;
                return;
            }
        }
    }

    private static void applyProguardUuid(@NotNull SentryOptions sentryOptions, @NotNull List<Properties> list) {
        if (sentryOptions.getProguardUuid() == null) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String proguardUuid = getProguardUuid(it.next());
                if (proguardUuid != null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Proguard UUID found: %s", proguardUuid);
                    sentryOptions.setProguardUuid(proguardUuid);
                    return;
                }
            }
        }
    }

    public static void applyToOptions(@NotNull SentryOptions sentryOptions, @Nullable List<Properties> list) {
        if (list != null) {
            applyBundleIds(sentryOptions, list);
            applyProguardUuid(sentryOptions, list);
        }
    }

    @Nullable
    public static String getBuildTool(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    @Nullable
    public static String getBuildToolVersion(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    @Nullable
    private static String getDistributionAuthToken(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.distribution.auth-token");
    }

    @Nullable
    private static String getDistributionBuildConfiguration(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.distribution.build-configuration");
    }

    @Nullable
    private static String getDistributionInstallGroupsOverride(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.distribution.install-groups-override");
    }

    @Nullable
    private static String getDistributionOrgSlug(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.distribution.org-slug");
    }

    @Nullable
    private static String getDistributionProjectSlug(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.distribution.project-slug");
    }

    @Nullable
    public static String getProguardUuid(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
