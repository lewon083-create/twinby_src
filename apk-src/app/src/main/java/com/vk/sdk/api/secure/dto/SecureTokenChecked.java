package com.vk.sdk.api.secure.dto;

import com.google.android.gms.internal.ads.om1;
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
public final class SecureTokenChecked {

    @b("date")
    @Nullable
    private final Integer date;

    @b("expire")
    @Nullable
    private final Integer expire;

    @b("success")
    @Nullable
    private final Integer success;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    public SecureTokenChecked() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SecureTokenChecked copy$default(SecureTokenChecked secureTokenChecked, Integer num, Integer num2, Integer num3, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            num = secureTokenChecked.date;
        }
        if ((i & 2) != 0) {
            num2 = secureTokenChecked.expire;
        }
        if ((i & 4) != 0) {
            num3 = secureTokenChecked.success;
        }
        if ((i & 8) != 0) {
            userId = secureTokenChecked.userId;
        }
        return secureTokenChecked.copy(num, num2, num3, userId);
    }

    @Nullable
    public final Integer component1() {
        return this.date;
    }

    @Nullable
    public final Integer component2() {
        return this.expire;
    }

    @Nullable
    public final Integer component3() {
        return this.success;
    }

    @Nullable
    public final UserId component4() {
        return this.userId;
    }

    @NotNull
    public final SecureTokenChecked copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable UserId userId) {
        return new SecureTokenChecked(num, num2, num3, userId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureTokenChecked)) {
            return false;
        }
        SecureTokenChecked secureTokenChecked = (SecureTokenChecked) obj;
        return Intrinsics.a(this.date, secureTokenChecked.date) && Intrinsics.a(this.expire, secureTokenChecked.expire) && Intrinsics.a(this.success, secureTokenChecked.success) && Intrinsics.a(this.userId, secureTokenChecked.userId);
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getExpire() {
        return this.expire;
    }

    @Nullable
    public final Integer getSuccess() {
        return this.success;
    }

    @Nullable
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer num = this.date;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expire;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.success;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UserId userId = this.userId;
        return iHashCode3 + (userId != null ? userId.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.date;
        Integer num2 = this.expire;
        Integer num3 = this.success;
        UserId userId = this.userId;
        StringBuilder sbO = om1.o("SecureTokenChecked(date=", ", expire=", num, num2, ", success=");
        sbO.append(num3);
        sbO.append(", userId=");
        sbO.append(userId);
        sbO.append(")");
        return sbO.toString();
    }

    public SecureTokenChecked(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable UserId userId) {
        this.date = num;
        this.expire = num2;
        this.success = num3;
        this.userId = userId;
    }

    public /* synthetic */ SecureTokenChecked(Integer num, Integer num2, Integer num3, UserId userId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : userId);
    }
}
