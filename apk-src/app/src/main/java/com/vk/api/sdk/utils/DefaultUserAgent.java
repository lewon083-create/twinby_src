package com.vk.api.sdk.utils;

import android.graphics.Point;
import gf.a;
import ij.g;
import ij.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class DefaultUserAgent implements UserAgentProvider {
    private final String appBuild;
    private final String appVersion;
    private final Point displaySize;
    private final String prefix;
    private final g stringify$delegate;

    public DefaultUserAgent(String prefix, String appVersion, String appBuild, Point displaySize) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appBuild, "appBuild");
        Intrinsics.checkNotNullParameter(displaySize, "displaySize");
        this.prefix = prefix;
        this.appVersion = appVersion;
        this.appBuild = appBuild;
        this.displaySize = displaySize;
        this.stringify$delegate = h.b(new DefaultUserAgent$stringify$2(this));
    }

    public static /* synthetic */ DefaultUserAgent copy$default(DefaultUserAgent defaultUserAgent, String str, String str2, String str3, Point point, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultUserAgent.prefix;
        }
        if ((i & 2) != 0) {
            str2 = defaultUserAgent.appVersion;
        }
        if ((i & 4) != 0) {
            str3 = defaultUserAgent.appBuild;
        }
        if ((i & 8) != 0) {
            point = defaultUserAgent.displaySize;
        }
        return defaultUserAgent.copy(str, str2, str3, point);
    }

    private final String getStringify() {
        return (String) this.stringify$delegate.getValue();
    }

    public final String component1() {
        return this.prefix;
    }

    public final String component2() {
        return this.appVersion;
    }

    public final String component3() {
        return this.appBuild;
    }

    public final Point component4() {
        return this.displaySize;
    }

    public final DefaultUserAgent copy(String prefix, String appVersion, String appBuild, Point displaySize) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appBuild, "appBuild");
        Intrinsics.checkNotNullParameter(displaySize, "displaySize");
        return new DefaultUserAgent(prefix, appVersion, appBuild, displaySize);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultUserAgent)) {
            return false;
        }
        DefaultUserAgent defaultUserAgent = (DefaultUserAgent) obj;
        return Intrinsics.a(this.prefix, defaultUserAgent.prefix) && Intrinsics.a(this.appVersion, defaultUserAgent.appVersion) && Intrinsics.a(this.appBuild, defaultUserAgent.appBuild) && Intrinsics.a(this.displaySize, defaultUserAgent.displaySize);
    }

    public final String getAppBuild() {
        return this.appBuild;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Point getDisplaySize() {
        return this.displaySize;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    @Override // com.vk.api.sdk.utils.UserAgentProvider
    public String getUserAgent() {
        return getStringify();
    }

    public int hashCode() {
        return this.displaySize.hashCode() + a.e(a.e(this.prefix.hashCode() * 31, 31, this.appVersion), 31, this.appBuild);
    }

    public String toString() {
        return "DefaultUserAgent(prefix=" + this.prefix + ", appVersion=" + this.appVersion + ", appBuild=" + this.appBuild + ", displaySize=" + this.displaySize + ')';
    }
}
