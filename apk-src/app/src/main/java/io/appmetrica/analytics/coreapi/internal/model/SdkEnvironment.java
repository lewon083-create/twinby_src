package io.appmetrica.analytics.coreapi.internal.model;

import a0.u;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class SdkEnvironment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f21729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenInfo f21731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SdkInfo f21732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f21734f;

    public SdkEnvironment(@NotNull AppVersionInfo appVersionInfo, @NotNull String str, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String str2, @NotNull List<String> list) {
        this.f21729a = appVersionInfo;
        this.f21730b = str;
        this.f21731c = screenInfo;
        this.f21732d = sdkInfo;
        this.f21733e = str2;
        this.f21734f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            appVersionInfo = sdkEnvironment.f21729a;
        }
        if ((i & 2) != 0) {
            str = sdkEnvironment.f21730b;
        }
        if ((i & 4) != 0) {
            screenInfo = sdkEnvironment.f21731c;
        }
        if ((i & 8) != 0) {
            sdkInfo = sdkEnvironment.f21732d;
        }
        if ((i & 16) != 0) {
            str2 = sdkEnvironment.f21733e;
        }
        if ((i & 32) != 0) {
            list = sdkEnvironment.f21734f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    @NotNull
    public final AppVersionInfo component1() {
        return this.f21729a;
    }

    @NotNull
    public final String component2() {
        return this.f21730b;
    }

    @NotNull
    public final ScreenInfo component3() {
        return this.f21731c;
    }

    @NotNull
    public final SdkInfo component4() {
        return this.f21732d;
    }

    @NotNull
    public final String component5() {
        return this.f21733e;
    }

    @NotNull
    public final List<String> component6() {
        return this.f21734f;
    }

    @NotNull
    public final SdkEnvironment copy(@NotNull AppVersionInfo appVersionInfo, @NotNull String str, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String str2, @NotNull List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return Intrinsics.a(this.f21729a, sdkEnvironment.f21729a) && Intrinsics.a(this.f21730b, sdkEnvironment.f21730b) && Intrinsics.a(this.f21731c, sdkEnvironment.f21731c) && Intrinsics.a(this.f21732d, sdkEnvironment.f21732d) && Intrinsics.a(this.f21733e, sdkEnvironment.f21733e) && Intrinsics.a(this.f21734f, sdkEnvironment.f21734f);
    }

    @NotNull
    public final String getAppFramework() {
        return this.f21730b;
    }

    @NotNull
    public final AppVersionInfo getAppVersionInfo() {
        return this.f21729a;
    }

    @NotNull
    public final String getDeviceType() {
        return this.f21733e;
    }

    @NotNull
    public final List<String> getLocales() {
        return this.f21734f;
    }

    @NotNull
    public final ScreenInfo getScreenInfo() {
        return this.f21731c;
    }

    @NotNull
    public final SdkInfo getSdkInfo() {
        return this.f21732d;
    }

    public int hashCode() {
        return this.f21734f.hashCode() + a.e((this.f21732d.hashCode() + ((this.f21731c.hashCode() + a.e(this.f21729a.hashCode() * 31, 31, this.f21730b)) * 31)) * 31, 31, this.f21733e);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkEnvironment(appVersionInfo=");
        sb2.append(this.f21729a);
        sb2.append(", appFramework=");
        sb2.append(this.f21730b);
        sb2.append(", screenInfo=");
        sb2.append(this.f21731c);
        sb2.append(", sdkInfo=");
        sb2.append(this.f21732d);
        sb2.append(", deviceType=");
        sb2.append(this.f21733e);
        sb2.append(", locales=");
        return u.p(sb2, this.f21734f, ')');
    }
}
