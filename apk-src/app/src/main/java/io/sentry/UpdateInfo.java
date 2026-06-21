package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class UpdateInfo {

    @NotNull
    private final String appName;
    private final int buildNumber;

    @NotNull
    private final String buildVersion;

    @Nullable
    private final String createdDate;

    @NotNull
    private final String downloadUrl;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f25884id;

    @Nullable
    private final List<String> installGroups;

    public UpdateInfo(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable List<String> list) {
        this.f25884id = str;
        this.buildVersion = str2;
        this.buildNumber = i;
        this.downloadUrl = str3;
        this.appName = str4;
        this.createdDate = str5;
        this.installGroups = list;
    }

    @NotNull
    public String getAppName() {
        return this.appName;
    }

    public int getBuildNumber() {
        return this.buildNumber;
    }

    @NotNull
    public String getBuildVersion() {
        return this.buildVersion;
    }

    @Nullable
    public String getCreatedDate() {
        return this.createdDate;
    }

    @NotNull
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @NotNull
    public String getId() {
        return this.f25884id;
    }

    @Nullable
    public List<String> getInstallGroups() {
        return this.installGroups;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateInfo{id='");
        sb2.append(this.f25884id);
        sb2.append("', buildVersion='");
        sb2.append(this.buildVersion);
        sb2.append("', buildNumber=");
        sb2.append(this.buildNumber);
        sb2.append(", downloadUrl='");
        sb2.append(this.downloadUrl);
        sb2.append("', appName='");
        sb2.append(this.appName);
        sb2.append("', createdDate='");
        sb2.append(this.createdDate);
        sb2.append("', installGroups=");
        return a0.u.p(sb2, this.installGroups, '}');
    }
}
