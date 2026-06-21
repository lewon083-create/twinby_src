package io.appmetrica.analytics.coreapi.internal.identifiers;

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
public final class PlatformIdentifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f21717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f21718b;

    public PlatformIdentifiers(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        this.f21717a = simpleAdvertisingIdGetter;
        this.f21718b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f21717a;
        }
        if ((i & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f21718b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    @NotNull
    public final SimpleAdvertisingIdGetter component1() {
        return this.f21717a;
    }

    @NotNull
    public final AppSetIdProvider component2() {
        return this.f21718b;
    }

    @NotNull
    public final PlatformIdentifiers copy(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return Intrinsics.a(this.f21717a, platformIdentifiers.f21717a) && Intrinsics.a(this.f21718b, platformIdentifiers.f21718b);
    }

    @NotNull
    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f21717a;
    }

    @NotNull
    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f21718b;
    }

    public int hashCode() {
        return this.f21718b.hashCode() + (this.f21717a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f21717a + ", appSetIdProvider=" + this.f21718b + ')';
    }
}
