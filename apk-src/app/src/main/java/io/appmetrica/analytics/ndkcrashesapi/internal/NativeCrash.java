package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

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
public final class NativeCrash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f25246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f25250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25251f;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f25252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f25254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f25255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f25256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f25257f;

        public Builder(@NotNull NativeCrashSource nativeCrashSource, @NotNull String str, @NotNull String str2, @NotNull String str3, long j10, @NotNull String str4) {
            this.f25252a = nativeCrashSource;
            this.f25253b = str;
            this.f25254c = str2;
            this.f25255d = str3;
            this.f25256e = j10;
            this.f25257f = str4;
        }

        @NotNull
        public final NativeCrash build() {
            return new NativeCrash(this.f25252a, this.f25253b, this.f25254c, this.f25255d, this.f25256e, this.f25257f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCrashSource, str, str2, str3, j10, str4);
    }

    public final long getCreationTime() {
        return this.f25250e;
    }

    @NotNull
    public final String getDumpFile() {
        return this.f25249d;
    }

    @NotNull
    public final String getHandlerVersion() {
        return this.f25247b;
    }

    @NotNull
    public final String getMetadata() {
        return this.f25251f;
    }

    @NotNull
    public final NativeCrashSource getSource() {
        return this.f25246a;
    }

    @NotNull
    public final String getUuid() {
        return this.f25248c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, String str4) {
        this.f25246a = nativeCrashSource;
        this.f25247b = str;
        this.f25248c = str2;
        this.f25249d = str3;
        this.f25250e = j10;
        this.f25251f = str4;
    }
}
