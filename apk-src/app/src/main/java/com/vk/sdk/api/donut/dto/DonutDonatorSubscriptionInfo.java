package com.vk.sdk.api.donut.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class DonutDonatorSubscriptionInfo {

    @b("amount")
    private final int amount;

    @b("next_payment_date")
    private final int nextPaymentDate;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("status")
    @NotNull
    private final Status status;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Status {
        ACTIVE("active"),
        EXPIRING("expiring");


        @NotNull
        private final String value;

        Status(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public DonutDonatorSubscriptionInfo(@NotNull UserId ownerId, int i, int i10, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.ownerId = ownerId;
        this.nextPaymentDate = i;
        this.amount = i10;
        this.status = status;
    }

    public static /* synthetic */ DonutDonatorSubscriptionInfo copy$default(DonutDonatorSubscriptionInfo donutDonatorSubscriptionInfo, UserId userId, int i, int i10, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userId = donutDonatorSubscriptionInfo.ownerId;
        }
        if ((i11 & 2) != 0) {
            i = donutDonatorSubscriptionInfo.nextPaymentDate;
        }
        if ((i11 & 4) != 0) {
            i10 = donutDonatorSubscriptionInfo.amount;
        }
        if ((i11 & 8) != 0) {
            status = donutDonatorSubscriptionInfo.status;
        }
        return donutDonatorSubscriptionInfo.copy(userId, i, i10, status);
    }

    @NotNull
    public final UserId component1() {
        return this.ownerId;
    }

    public final int component2() {
        return this.nextPaymentDate;
    }

    public final int component3() {
        return this.amount;
    }

    @NotNull
    public final Status component4() {
        return this.status;
    }

    @NotNull
    public final DonutDonatorSubscriptionInfo copy(@NotNull UserId ownerId, int i, int i10, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new DonutDonatorSubscriptionInfo(ownerId, i, i10, status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutDonatorSubscriptionInfo)) {
            return false;
        }
        DonutDonatorSubscriptionInfo donutDonatorSubscriptionInfo = (DonutDonatorSubscriptionInfo) obj;
        return Intrinsics.a(this.ownerId, donutDonatorSubscriptionInfo.ownerId) && this.nextPaymentDate == donutDonatorSubscriptionInfo.nextPaymentDate && this.amount == donutDonatorSubscriptionInfo.amount && this.status == donutDonatorSubscriptionInfo.status;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + u.g(this.amount, u.g(this.nextPaymentDate, this.ownerId.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "DonutDonatorSubscriptionInfo(ownerId=" + this.ownerId + ", nextPaymentDate=" + this.nextPaymentDate + ", amount=" + this.amount + ", status=" + this.status + ")";
    }
}
