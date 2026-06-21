package com.vk.sdk.api.notifications.dto;

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
public final class NotificationsSendMessageError {

    @b("code")
    @Nullable
    private final Code code;

    @b("description")
    @Nullable
    private final String description;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Code {
        NOTIFICATIONS_DISABLED(1),
        FLOOD_CONTROL_PER_HOUR(2),
        FLOOD_CONTROL_PER_DAY(3),
        APP_IS_NOT_INSTALLED(4);

        private final int value;

        Code(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public NotificationsSendMessageError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NotificationsSendMessageError copy$default(NotificationsSendMessageError notificationsSendMessageError, Code code, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            code = notificationsSendMessageError.code;
        }
        if ((i & 2) != 0) {
            str = notificationsSendMessageError.description;
        }
        return notificationsSendMessageError.copy(code, str);
    }

    @Nullable
    public final Code component1() {
        return this.code;
    }

    @Nullable
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final NotificationsSendMessageError copy(@Nullable Code code, @Nullable String str) {
        return new NotificationsSendMessageError(code, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSendMessageError)) {
            return false;
        }
        NotificationsSendMessageError notificationsSendMessageError = (NotificationsSendMessageError) obj;
        return this.code == notificationsSendMessageError.code && Intrinsics.a(this.description, notificationsSendMessageError.description);
    }

    @Nullable
    public final Code getCode() {
        return this.code;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        Code code = this.code;
        int iHashCode = (code == null ? 0 : code.hashCode()) * 31;
        String str = this.description;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationsSendMessageError(code=" + this.code + ", description=" + this.description + ")";
    }

    public NotificationsSendMessageError(@Nullable Code code, @Nullable String str) {
        this.code = code;
        this.description = str;
    }

    public /* synthetic */ NotificationsSendMessageError(Code code, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : code, (i & 2) != 0 ? null : str);
    }
}
