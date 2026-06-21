package com.vk.sdk.api.secure.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import gf.a;
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
public final class SecureTransaction {

    @b("date")
    @Nullable
    private final Integer date;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15232id;

    @b("uid_from")
    @Nullable
    private final Integer uidFrom;

    @b("uid_to")
    @Nullable
    private final Integer uidTo;

    @b("votes")
    @Nullable
    private final Integer votes;

    public SecureTransaction() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SecureTransaction copy$default(SecureTransaction secureTransaction, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = secureTransaction.date;
        }
        if ((i & 2) != 0) {
            num2 = secureTransaction.f15232id;
        }
        if ((i & 4) != 0) {
            num3 = secureTransaction.uidFrom;
        }
        if ((i & 8) != 0) {
            num4 = secureTransaction.uidTo;
        }
        if ((i & 16) != 0) {
            num5 = secureTransaction.votes;
        }
        Integer num6 = num5;
        Integer num7 = num3;
        return secureTransaction.copy(num, num2, num7, num4, num6);
    }

    @Nullable
    public final Integer component1() {
        return this.date;
    }

    @Nullable
    public final Integer component2() {
        return this.f15232id;
    }

    @Nullable
    public final Integer component3() {
        return this.uidFrom;
    }

    @Nullable
    public final Integer component4() {
        return this.uidTo;
    }

    @Nullable
    public final Integer component5() {
        return this.votes;
    }

    @NotNull
    public final SecureTransaction copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        return new SecureTransaction(num, num2, num3, num4, num5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureTransaction)) {
            return false;
        }
        SecureTransaction secureTransaction = (SecureTransaction) obj;
        return Intrinsics.a(this.date, secureTransaction.date) && Intrinsics.a(this.f15232id, secureTransaction.f15232id) && Intrinsics.a(this.uidFrom, secureTransaction.uidFrom) && Intrinsics.a(this.uidTo, secureTransaction.uidTo) && Intrinsics.a(this.votes, secureTransaction.votes);
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getId() {
        return this.f15232id;
    }

    @Nullable
    public final Integer getUidFrom() {
        return this.uidFrom;
    }

    @Nullable
    public final Integer getUidTo() {
        return this.uidTo;
    }

    @Nullable
    public final Integer getVotes() {
        return this.votes;
    }

    public int hashCode() {
        Integer num = this.date;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f15232id;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.uidFrom;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.uidTo;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.votes;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.date;
        Integer num2 = this.f15232id;
        Integer num3 = this.uidFrom;
        Integer num4 = this.uidTo;
        Integer num5 = this.votes;
        StringBuilder sbO = om1.o("SecureTransaction(date=", ", id=", num, num2, ", uidFrom=");
        a.t(sbO, num3, ", uidTo=", num4, ", votes=");
        return u.m(sbO, num5, ")");
    }

    public SecureTransaction(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.date = num;
        this.f15232id = num2;
        this.uidFrom = num3;
        this.uidTo = num4;
        this.votes = num5;
    }

    public /* synthetic */ SecureTransaction(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5);
    }
}
