package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import io.sentry.TraceContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
public final class AdsUsers {

    @b("accesses")
    @NotNull
    private final List<AdsAccesses> accesses;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public AdsUsers(@NotNull List<AdsAccesses> accesses, @NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(accesses, "accesses");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.accesses = accesses;
        this.userId = userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsUsers copy$default(AdsUsers adsUsers, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adsUsers.accesses;
        }
        if ((i & 2) != 0) {
            userId = adsUsers.userId;
        }
        return adsUsers.copy(list, userId);
    }

    @NotNull
    public final List<AdsAccesses> component1() {
        return this.accesses;
    }

    @NotNull
    public final UserId component2() {
        return this.userId;
    }

    @NotNull
    public final AdsUsers copy(@NotNull List<AdsAccesses> accesses, @NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(accesses, "accesses");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new AdsUsers(accesses, userId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUsers)) {
            return false;
        }
        AdsUsers adsUsers = (AdsUsers) obj;
        return Intrinsics.a(this.accesses, adsUsers.accesses) && Intrinsics.a(this.userId, adsUsers.userId);
    }

    @NotNull
    public final List<AdsAccesses> getAccesses() {
        return this.accesses;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + (this.accesses.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AdsUsers(accesses=" + this.accesses + ", userId=" + this.userId + ")";
    }
}
