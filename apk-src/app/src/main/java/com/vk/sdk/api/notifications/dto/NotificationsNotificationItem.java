package com.vk.sdk.api.notifications.dto;

import a0.u;
import io.sentry.protocol.Feedback;
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
public final class NotificationsNotificationItem {

    @b("date")
    @Nullable
    private final Integer date;

    @b(Feedback.TYPE)
    @Nullable
    private final NotificationsFeedback feedback;

    @b("parent")
    @Nullable
    private final NotificationsNotification parent;

    @b("reply")
    @Nullable
    private final NotificationsReply reply;

    @b("type")
    @Nullable
    private final String type;

    public NotificationsNotificationItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ NotificationsNotificationItem copy$default(NotificationsNotificationItem notificationsNotificationItem, Integer num, NotificationsFeedback notificationsFeedback, NotificationsNotification notificationsNotification, NotificationsReply notificationsReply, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = notificationsNotificationItem.date;
        }
        if ((i & 2) != 0) {
            notificationsFeedback = notificationsNotificationItem.feedback;
        }
        if ((i & 4) != 0) {
            notificationsNotification = notificationsNotificationItem.parent;
        }
        if ((i & 8) != 0) {
            notificationsReply = notificationsNotificationItem.reply;
        }
        if ((i & 16) != 0) {
            str = notificationsNotificationItem.type;
        }
        String str2 = str;
        NotificationsNotification notificationsNotification2 = notificationsNotification;
        return notificationsNotificationItem.copy(num, notificationsFeedback, notificationsNotification2, notificationsReply, str2);
    }

    @Nullable
    public final Integer component1() {
        return this.date;
    }

    @Nullable
    public final NotificationsFeedback component2() {
        return this.feedback;
    }

    @Nullable
    public final NotificationsNotification component3() {
        return this.parent;
    }

    @Nullable
    public final NotificationsReply component4() {
        return this.reply;
    }

    @Nullable
    public final String component5() {
        return this.type;
    }

    @NotNull
    public final NotificationsNotificationItem copy(@Nullable Integer num, @Nullable NotificationsFeedback notificationsFeedback, @Nullable NotificationsNotification notificationsNotification, @Nullable NotificationsReply notificationsReply, @Nullable String str) {
        return new NotificationsNotificationItem(num, notificationsFeedback, notificationsNotification, notificationsReply, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationItem)) {
            return false;
        }
        NotificationsNotificationItem notificationsNotificationItem = (NotificationsNotificationItem) obj;
        return Intrinsics.a(this.date, notificationsNotificationItem.date) && Intrinsics.a(this.feedback, notificationsNotificationItem.feedback) && Intrinsics.a(this.parent, notificationsNotificationItem.parent) && Intrinsics.a(this.reply, notificationsNotificationItem.reply) && Intrinsics.a(this.type, notificationsNotificationItem.type);
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final NotificationsFeedback getFeedback() {
        return this.feedback;
    }

    @Nullable
    public final NotificationsNotification getParent() {
        return this.parent;
    }

    @Nullable
    public final NotificationsReply getReply() {
        return this.reply;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.date;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        NotificationsFeedback notificationsFeedback = this.feedback;
        int iHashCode2 = (iHashCode + (notificationsFeedback == null ? 0 : notificationsFeedback.hashCode())) * 31;
        NotificationsNotification notificationsNotification = this.parent;
        int iHashCode3 = (iHashCode2 + (notificationsNotification == null ? 0 : notificationsNotification.hashCode())) * 31;
        NotificationsReply notificationsReply = this.reply;
        int iHashCode4 = (iHashCode3 + (notificationsReply == null ? 0 : notificationsReply.hashCode())) * 31;
        String str = this.type;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.date;
        NotificationsFeedback notificationsFeedback = this.feedback;
        NotificationsNotification notificationsNotification = this.parent;
        NotificationsReply notificationsReply = this.reply;
        String str = this.type;
        StringBuilder sb2 = new StringBuilder("NotificationsNotificationItem(date=");
        sb2.append(num);
        sb2.append(", feedback=");
        sb2.append(notificationsFeedback);
        sb2.append(", parent=");
        sb2.append(notificationsNotification);
        sb2.append(", reply=");
        sb2.append(notificationsReply);
        sb2.append(", type=");
        return u.o(sb2, str, ")");
    }

    public NotificationsNotificationItem(@Nullable Integer num, @Nullable NotificationsFeedback notificationsFeedback, @Nullable NotificationsNotification notificationsNotification, @Nullable NotificationsReply notificationsReply, @Nullable String str) {
        this.date = num;
        this.feedback = notificationsFeedback;
        this.parent = notificationsNotification;
        this.reply = notificationsReply;
        this.type = str;
    }

    public /* synthetic */ NotificationsNotificationItem(Integer num, NotificationsFeedback notificationsFeedback, NotificationsNotification notificationsNotification, NotificationsReply notificationsReply, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : notificationsFeedback, (i & 4) != 0 ? null : notificationsNotification, (i & 8) != 0 ? null : notificationsReply, (i & 16) != 0 ? null : str);
    }
}
