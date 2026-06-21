package com.vk.sdk.api.ads.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
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
public final class AdsAccount {

    @b("access_role")
    @NotNull
    private final AdsAccessRole accessRole;

    @b("account_id")
    private final int accountId;

    @b("account_name")
    @NotNull
    private final String accountName;

    @b("account_status")
    @NotNull
    private final BaseBoolInt accountStatus;

    @b("account_type")
    @NotNull
    private final AdsAccountType accountType;

    @b("can_view_budget")
    private final boolean canViewBudget;

    public AdsAccount(@NotNull AdsAccessRole accessRole, int i, @NotNull BaseBoolInt accountStatus, @NotNull AdsAccountType accountType, @NotNull String accountName, boolean z5) {
        Intrinsics.checkNotNullParameter(accessRole, "accessRole");
        Intrinsics.checkNotNullParameter(accountStatus, "accountStatus");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        this.accessRole = accessRole;
        this.accountId = i;
        this.accountStatus = accountStatus;
        this.accountType = accountType;
        this.accountName = accountName;
        this.canViewBudget = z5;
    }

    public static /* synthetic */ AdsAccount copy$default(AdsAccount adsAccount, AdsAccessRole adsAccessRole, int i, BaseBoolInt baseBoolInt, AdsAccountType adsAccountType, String str, boolean z5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            adsAccessRole = adsAccount.accessRole;
        }
        if ((i10 & 2) != 0) {
            i = adsAccount.accountId;
        }
        if ((i10 & 4) != 0) {
            baseBoolInt = adsAccount.accountStatus;
        }
        if ((i10 & 8) != 0) {
            adsAccountType = adsAccount.accountType;
        }
        if ((i10 & 16) != 0) {
            str = adsAccount.accountName;
        }
        if ((i10 & 32) != 0) {
            z5 = adsAccount.canViewBudget;
        }
        String str2 = str;
        boolean z10 = z5;
        return adsAccount.copy(adsAccessRole, i, baseBoolInt, adsAccountType, str2, z10);
    }

    @NotNull
    public final AdsAccessRole component1() {
        return this.accessRole;
    }

    public final int component2() {
        return this.accountId;
    }

    @NotNull
    public final BaseBoolInt component3() {
        return this.accountStatus;
    }

    @NotNull
    public final AdsAccountType component4() {
        return this.accountType;
    }

    @NotNull
    public final String component5() {
        return this.accountName;
    }

    public final boolean component6() {
        return this.canViewBudget;
    }

    @NotNull
    public final AdsAccount copy(@NotNull AdsAccessRole accessRole, int i, @NotNull BaseBoolInt accountStatus, @NotNull AdsAccountType accountType, @NotNull String accountName, boolean z5) {
        Intrinsics.checkNotNullParameter(accessRole, "accessRole");
        Intrinsics.checkNotNullParameter(accountStatus, "accountStatus");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        return new AdsAccount(accessRole, i, accountStatus, accountType, accountName, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAccount)) {
            return false;
        }
        AdsAccount adsAccount = (AdsAccount) obj;
        return this.accessRole == adsAccount.accessRole && this.accountId == adsAccount.accountId && this.accountStatus == adsAccount.accountStatus && this.accountType == adsAccount.accountType && Intrinsics.a(this.accountName, adsAccount.accountName) && this.canViewBudget == adsAccount.canViewBudget;
    }

    @NotNull
    public final AdsAccessRole getAccessRole() {
        return this.accessRole;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    public final BaseBoolInt getAccountStatus() {
        return this.accountStatus;
    }

    @NotNull
    public final AdsAccountType getAccountType() {
        return this.accountType;
    }

    public final boolean getCanViewBudget() {
        return this.canViewBudget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iE = a.e((this.accountType.hashCode() + a.f(this.accountStatus, u.g(this.accountId, this.accessRole.hashCode() * 31, 31), 31)) * 31, 31, this.accountName);
        boolean z5 = this.canViewBudget;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        return iE + r12;
    }

    @NotNull
    public String toString() {
        return "AdsAccount(accessRole=" + this.accessRole + ", accountId=" + this.accountId + ", accountStatus=" + this.accountStatus + ", accountType=" + this.accountType + ", accountName=" + this.accountName + ", canViewBudget=" + this.canViewBudget + ")";
    }
}
