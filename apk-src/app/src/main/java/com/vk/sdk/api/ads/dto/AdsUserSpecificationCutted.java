package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
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
public final class AdsUserSpecificationCutted {

    @b("client_id")
    @Nullable
    private final Integer clientId;

    @b("role")
    @NotNull
    private final AdsAccessRolePublic role;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    @b("view_budget")
    @Nullable
    private final Boolean viewBudget;

    public AdsUserSpecificationCutted(@NotNull UserId userId, @NotNull AdsAccessRolePublic role, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.userId = userId;
        this.role = role;
        this.clientId = num;
        this.viewBudget = bool;
    }

    public static /* synthetic */ AdsUserSpecificationCutted copy$default(AdsUserSpecificationCutted adsUserSpecificationCutted, UserId userId, AdsAccessRolePublic adsAccessRolePublic, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = adsUserSpecificationCutted.userId;
        }
        if ((i & 2) != 0) {
            adsAccessRolePublic = adsUserSpecificationCutted.role;
        }
        if ((i & 4) != 0) {
            num = adsUserSpecificationCutted.clientId;
        }
        if ((i & 8) != 0) {
            bool = adsUserSpecificationCutted.viewBudget;
        }
        return adsUserSpecificationCutted.copy(userId, adsAccessRolePublic, num, bool);
    }

    @NotNull
    public final UserId component1() {
        return this.userId;
    }

    @NotNull
    public final AdsAccessRolePublic component2() {
        return this.role;
    }

    @Nullable
    public final Integer component3() {
        return this.clientId;
    }

    @Nullable
    public final Boolean component4() {
        return this.viewBudget;
    }

    @NotNull
    public final AdsUserSpecificationCutted copy(@NotNull UserId userId, @NotNull AdsAccessRolePublic role, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        return new AdsUserSpecificationCutted(userId, role, num, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUserSpecificationCutted)) {
            return false;
        }
        AdsUserSpecificationCutted adsUserSpecificationCutted = (AdsUserSpecificationCutted) obj;
        return Intrinsics.a(this.userId, adsUserSpecificationCutted.userId) && this.role == adsUserSpecificationCutted.role && Intrinsics.a(this.clientId, adsUserSpecificationCutted.clientId) && Intrinsics.a(this.viewBudget, adsUserSpecificationCutted.viewBudget);
    }

    @Nullable
    public final Integer getClientId() {
        return this.clientId;
    }

    @NotNull
    public final AdsAccessRolePublic getRole() {
        return this.role;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    @Nullable
    public final Boolean getViewBudget() {
        return this.viewBudget;
    }

    public int hashCode() {
        int iHashCode = (this.role.hashCode() + (this.userId.hashCode() * 31)) * 31;
        Integer num = this.clientId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.viewBudget;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsUserSpecificationCutted(userId=" + this.userId + ", role=" + this.role + ", clientId=" + this.clientId + ", viewBudget=" + this.viewBudget + ")";
    }

    public /* synthetic */ AdsUserSpecificationCutted(UserId userId, AdsAccessRolePublic adsAccessRolePublic, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, adsAccessRolePublic, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool);
    }
}
