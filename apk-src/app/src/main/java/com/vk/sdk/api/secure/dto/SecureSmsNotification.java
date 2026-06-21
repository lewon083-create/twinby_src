package com.vk.sdk.api.secure.dto;

import a0.u;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class SecureSmsNotification {

    @b(CommonUrlParts.APP_ID)
    @Nullable
    private final String appId;

    @b("date")
    @Nullable
    private final String date;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final String f15231id;

    @b("message")
    @Nullable
    private final String message;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final String userId;

    public SecureSmsNotification() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SecureSmsNotification copy$default(SecureSmsNotification secureSmsNotification, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secureSmsNotification.appId;
        }
        if ((i & 2) != 0) {
            str2 = secureSmsNotification.date;
        }
        if ((i & 4) != 0) {
            str3 = secureSmsNotification.f15231id;
        }
        if ((i & 8) != 0) {
            str4 = secureSmsNotification.message;
        }
        if ((i & 16) != 0) {
            str5 = secureSmsNotification.userId;
        }
        String str6 = str5;
        String str7 = str3;
        return secureSmsNotification.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    public final String component1() {
        return this.appId;
    }

    @Nullable
    public final String component2() {
        return this.date;
    }

    @Nullable
    public final String component3() {
        return this.f15231id;
    }

    @Nullable
    public final String component4() {
        return this.message;
    }

    @Nullable
    public final String component5() {
        return this.userId;
    }

    @NotNull
    public final SecureSmsNotification copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new SecureSmsNotification(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureSmsNotification)) {
            return false;
        }
        SecureSmsNotification secureSmsNotification = (SecureSmsNotification) obj;
        return Intrinsics.a(this.appId, secureSmsNotification.appId) && Intrinsics.a(this.date, secureSmsNotification.date) && Intrinsics.a(this.f15231id, secureSmsNotification.f15231id) && Intrinsics.a(this.message, secureSmsNotification.message) && Intrinsics.a(this.userId, secureSmsNotification.userId);
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getId() {
        return this.f15231id;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.appId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.date;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15231id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.appId;
        String str2 = this.date;
        String str3 = this.f15231id;
        String str4 = this.message;
        String str5 = this.userId;
        StringBuilder sbJ = z.j("SecureSmsNotification(appId=", str, ", date=", str2, ", id=");
        o.t(sbJ, str3, ", message=", str4, ", userId=");
        return u.o(sbJ, str5, ")");
    }

    public SecureSmsNotification(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.appId = str;
        this.date = str2;
        this.f15231id = str3;
        this.message = str4;
        this.userId = str5;
    }

    public /* synthetic */ SecureSmsNotification(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
