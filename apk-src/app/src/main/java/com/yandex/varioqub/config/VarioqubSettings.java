package com.yandex.varioqub.config;

import android.util.Log;
import com.yandex.varioqub.config.impl.C;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class VarioqubSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f15338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15339g;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15341b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f15344e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f15342c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f15343d = 43200;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15345f = true;

        public Builder(@NotNull String str) {
            this.f15340a = str;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("ClientId must not be empty");
            }
        }

        @NotNull
        public final VarioqubSettings build() {
            return new VarioqubSettings(this.f15340a, this.f15341b, this.f15343d, this.f15344e, this.f15345f, j0.m(this.f15342c), null);
        }

        @NotNull
        public final Builder withActivateEvent(boolean z5) {
            this.f15345f = z5;
            return this;
        }

        @NotNull
        public final Builder withClientFeature(@NotNull String str, @NotNull String str2) {
            this.f15342c.put(str, str2);
            return this;
        }

        @NotNull
        public final Builder withLogs() {
            this.f15344e = true;
            return this;
        }

        @NotNull
        public final Builder withThrottleInterval(long j10) {
            if (j10 <= 0) {
                throw new IllegalArgumentException("Fetch timeout must be a positive number");
            }
            this.f15343d = j10;
            return this;
        }

        @NotNull
        public final Builder withUrl(@NotNull String str) {
            this.f15341b = str;
            return this;
        }
    }

    public /* synthetic */ VarioqubSettings(String str, String str2, long j10, boolean z5, boolean z10, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, z5, z10, map);
    }

    public final void clearClientFeatures$config_release() {
        this.f15338f.clear();
        String str = this.f15339g;
        if (C.f15354a) {
            Log.d("Varioqub/" + str, "Client features was cleaned");
        }
    }

    public final boolean getActivateEvent$config_release() {
        return this.f15337e;
    }

    @NotNull
    public final Map<String, String> getClientFeatures$config_release() {
        return j0.l(this.f15338f);
    }

    @NotNull
    public final String getClientId$config_release() {
        return this.f15333a;
    }

    public final long getFetchThrottleIntervalSec$config_release() {
        return this.f15335c;
    }

    public final boolean getLogs$config_release() {
        return this.f15336d;
    }

    @Nullable
    public final String getUrl$config_release() {
        return this.f15334b;
    }

    public final void putClientFeature$config_release(@NotNull String str, @NotNull String str2) {
        String str3 = (String) this.f15338f.put(str, str2);
        if (str3 != null) {
            String str4 = this.f15339g;
            StringBuilder sbJ = z.j("Client feature with key - ", str, " and value - ", str3, " was replaced with new value - ");
            sbJ.append(str2);
            String string = sbJ.toString();
            if (C.f15354a) {
                Log.d("Varioqub/" + str4, string);
            }
        }
    }

    private VarioqubSettings(String str, String str2, long j10, boolean z5, boolean z10, Map map) {
        this.f15333a = str;
        this.f15334b = str2;
        this.f15335c = j10;
        this.f15336d = z5;
        this.f15337e = z10;
        this.f15338f = map;
        this.f15339g = "VarioqubSettings";
    }
}
