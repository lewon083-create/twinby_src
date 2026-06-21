package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseError;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class AdsUpdateOfficeUsersResult {

    @b("error")
    @Nullable
    private final BaseError error;

    @b("is_success")
    private final boolean isSuccess;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public AdsUpdateOfficeUsersResult(@NotNull UserId userId, boolean z5, @Nullable BaseError baseError) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.isSuccess = z5;
        this.error = baseError;
    }

    public static /* synthetic */ AdsUpdateOfficeUsersResult copy$default(AdsUpdateOfficeUsersResult adsUpdateOfficeUsersResult, UserId userId, boolean z5, BaseError baseError, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = adsUpdateOfficeUsersResult.userId;
        }
        if ((i & 2) != 0) {
            z5 = adsUpdateOfficeUsersResult.isSuccess;
        }
        if ((i & 4) != 0) {
            baseError = adsUpdateOfficeUsersResult.error;
        }
        return adsUpdateOfficeUsersResult.copy(userId, z5, baseError);
    }

    @NotNull
    public final UserId component1() {
        return this.userId;
    }

    public final boolean component2() {
        return this.isSuccess;
    }

    @Nullable
    public final BaseError component3() {
        return this.error;
    }

    @NotNull
    public final AdsUpdateOfficeUsersResult copy(@NotNull UserId userId, boolean z5, @Nullable BaseError baseError) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new AdsUpdateOfficeUsersResult(userId, z5, baseError);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUpdateOfficeUsersResult)) {
            return false;
        }
        AdsUpdateOfficeUsersResult adsUpdateOfficeUsersResult = (AdsUpdateOfficeUsersResult) obj;
        return Intrinsics.a(this.userId, adsUpdateOfficeUsersResult.userId) && this.isSuccess == adsUpdateOfficeUsersResult.isSuccess && Intrinsics.a(this.error, adsUpdateOfficeUsersResult.error);
    }

    @Nullable
    public final BaseError getError() {
        return this.error;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        boolean z5 = this.isSuccess;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        int i = (iHashCode + r12) * 31;
        BaseError baseError = this.error;
        return i + (baseError == null ? 0 : baseError.hashCode());
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "AdsUpdateOfficeUsersResult(userId=" + this.userId + ", isSuccess=" + this.isSuccess + ", error=" + this.error + ")";
    }

    public /* synthetic */ AdsUpdateOfficeUsersResult(UserId userId, boolean z5, BaseError baseError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, z5, (i & 4) != 0 ? null : baseError);
    }
}
