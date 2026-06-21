package com.vk.sdk.api.users.dto;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class UsersOnlineInfo {

    @b(CommonUrlParts.APP_ID)
    @Nullable
    private final Integer appId;

    @b("is_mobile")
    @Nullable
    private final Boolean isMobile;

    @b("is_online")
    @Nullable
    private final Boolean isOnline;

    @b("last_seen")
    @Nullable
    private final Integer lastSeen;

    @b("status")
    @Nullable
    private final Status status;

    @b("visible")
    private final boolean visible;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Status {
        RECENTLY("recently"),
        LAST_WEEK("last_week"),
        LAST_MONTH("last_month"),
        LONG_AGO("long_ago"),
        NOT_SHOW("not_show");


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

    public UsersOnlineInfo(boolean z5, @Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Status status) {
        this.visible = z5;
        this.lastSeen = num;
        this.isOnline = bool;
        this.appId = num2;
        this.isMobile = bool2;
        this.status = status;
    }

    public static /* synthetic */ UsersOnlineInfo copy$default(UsersOnlineInfo usersOnlineInfo, boolean z5, Integer num, Boolean bool, Integer num2, Boolean bool2, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = usersOnlineInfo.visible;
        }
        if ((i & 2) != 0) {
            num = usersOnlineInfo.lastSeen;
        }
        if ((i & 4) != 0) {
            bool = usersOnlineInfo.isOnline;
        }
        if ((i & 8) != 0) {
            num2 = usersOnlineInfo.appId;
        }
        if ((i & 16) != 0) {
            bool2 = usersOnlineInfo.isMobile;
        }
        if ((i & 32) != 0) {
            status = usersOnlineInfo.status;
        }
        Boolean bool3 = bool2;
        Status status2 = status;
        return usersOnlineInfo.copy(z5, num, bool, num2, bool3, status2);
    }

    public final boolean component1() {
        return this.visible;
    }

    @Nullable
    public final Integer component2() {
        return this.lastSeen;
    }

    @Nullable
    public final Boolean component3() {
        return this.isOnline;
    }

    @Nullable
    public final Integer component4() {
        return this.appId;
    }

    @Nullable
    public final Boolean component5() {
        return this.isMobile;
    }

    @Nullable
    public final Status component6() {
        return this.status;
    }

    @NotNull
    public final UsersOnlineInfo copy(boolean z5, @Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Status status) {
        return new UsersOnlineInfo(z5, num, bool, num2, bool2, status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersOnlineInfo)) {
            return false;
        }
        UsersOnlineInfo usersOnlineInfo = (UsersOnlineInfo) obj;
        return this.visible == usersOnlineInfo.visible && Intrinsics.a(this.lastSeen, usersOnlineInfo.lastSeen) && Intrinsics.a(this.isOnline, usersOnlineInfo.isOnline) && Intrinsics.a(this.appId, usersOnlineInfo.appId) && Intrinsics.a(this.isMobile, usersOnlineInfo.isMobile) && this.status == usersOnlineInfo.status;
    }

    @Nullable
    public final Integer getAppId() {
        return this.appId;
    }

    @Nullable
    public final Integer getLastSeen() {
        return this.lastSeen;
    }

    @Nullable
    public final Status getStatus() {
        return this.status;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z5 = this.visible;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = r02 * 31;
        Integer num = this.lastSeen;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isOnline;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.appId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isMobile;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Status status = this.status;
        return iHashCode4 + (status != null ? status.hashCode() : 0);
    }

    @Nullable
    public final Boolean isMobile() {
        return this.isMobile;
    }

    @Nullable
    public final Boolean isOnline() {
        return this.isOnline;
    }

    @NotNull
    public String toString() {
        return "UsersOnlineInfo(visible=" + this.visible + ", lastSeen=" + this.lastSeen + ", isOnline=" + this.isOnline + ", appId=" + this.appId + ", isMobile=" + this.isMobile + ", status=" + this.status + ")";
    }

    public /* synthetic */ UsersOnlineInfo(boolean z5, Integer num, Boolean bool, Integer num2, Boolean bool2, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : status);
    }
}
