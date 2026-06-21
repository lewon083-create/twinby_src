package com.vk.sdk.api.ads.dto;

import com.vk.dto.common.id.UserId;
import io.sentry.TraceContext;
import java.util.List;
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
public final class AdsUserSpecification {

    @b("client_ids")
    @Nullable
    private final List<Integer> clientIds;

    @b("grant_access_to_all_clients")
    @Nullable
    private final Boolean grantAccessToAllClients;

    @b("role")
    @NotNull
    private final AdsAccessRolePublic role;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    @b("view_budget")
    @Nullable
    private final Boolean viewBudget;

    public AdsUserSpecification(@NotNull UserId userId, @NotNull AdsAccessRolePublic role, @Nullable Boolean bool, @Nullable List<Integer> list, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.userId = userId;
        this.role = role;
        this.grantAccessToAllClients = bool;
        this.clientIds = list;
        this.viewBudget = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsUserSpecification copy$default(AdsUserSpecification adsUserSpecification, UserId userId, AdsAccessRolePublic adsAccessRolePublic, Boolean bool, List list, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = adsUserSpecification.userId;
        }
        if ((i & 2) != 0) {
            adsAccessRolePublic = adsUserSpecification.role;
        }
        if ((i & 4) != 0) {
            bool = adsUserSpecification.grantAccessToAllClients;
        }
        if ((i & 8) != 0) {
            list = adsUserSpecification.clientIds;
        }
        if ((i & 16) != 0) {
            bool2 = adsUserSpecification.viewBudget;
        }
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        return adsUserSpecification.copy(userId, adsAccessRolePublic, bool4, list, bool3);
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
    public final Boolean component3() {
        return this.grantAccessToAllClients;
    }

    @Nullable
    public final List<Integer> component4() {
        return this.clientIds;
    }

    @Nullable
    public final Boolean component5() {
        return this.viewBudget;
    }

    @NotNull
    public final AdsUserSpecification copy(@NotNull UserId userId, @NotNull AdsAccessRolePublic role, @Nullable Boolean bool, @Nullable List<Integer> list, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        return new AdsUserSpecification(userId, role, bool, list, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsUserSpecification)) {
            return false;
        }
        AdsUserSpecification adsUserSpecification = (AdsUserSpecification) obj;
        return Intrinsics.a(this.userId, adsUserSpecification.userId) && this.role == adsUserSpecification.role && Intrinsics.a(this.grantAccessToAllClients, adsUserSpecification.grantAccessToAllClients) && Intrinsics.a(this.clientIds, adsUserSpecification.clientIds) && Intrinsics.a(this.viewBudget, adsUserSpecification.viewBudget);
    }

    @Nullable
    public final List<Integer> getClientIds() {
        return this.clientIds;
    }

    @Nullable
    public final Boolean getGrantAccessToAllClients() {
        return this.grantAccessToAllClients;
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
        Boolean bool = this.grantAccessToAllClients;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list = this.clientIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.viewBudget;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsUserSpecification(userId=" + this.userId + ", role=" + this.role + ", grantAccessToAllClients=" + this.grantAccessToAllClients + ", clientIds=" + this.clientIds + ", viewBudget=" + this.viewBudget + ")";
    }

    public /* synthetic */ AdsUserSpecification(UserId userId, AdsAccessRolePublic adsAccessRolePublic, Boolean bool, List list, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, adsAccessRolePublic, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool2);
    }
}
