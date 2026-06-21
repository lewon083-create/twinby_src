package com.vk.sdk.api.notifications.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseGeo;
import com.vk.sdk.api.base.dto.BaseLikesInfo;
import com.vk.sdk.api.wall.dto.WallWallpostAttachment;
import io.sentry.protocol.User;
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
public final class NotificationsFeedback {

    @b("attachments")
    @Nullable
    private final List<WallWallpostAttachment> attachments;

    @b("from_id")
    @Nullable
    private final Integer fromId;

    @b(User.JsonKeys.GEO)
    @Nullable
    private final BaseGeo geo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15208id;

    @b("likes")
    @Nullable
    private final BaseLikesInfo likes;

    @b("text")
    @Nullable
    private final String text;

    @b("to_id")
    @Nullable
    private final Integer toId;

    public NotificationsFeedback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationsFeedback copy$default(NotificationsFeedback notificationsFeedback, List list, Integer num, BaseGeo baseGeo, Integer num2, BaseLikesInfo baseLikesInfo, String str, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notificationsFeedback.attachments;
        }
        if ((i & 2) != 0) {
            num = notificationsFeedback.fromId;
        }
        if ((i & 4) != 0) {
            baseGeo = notificationsFeedback.geo;
        }
        if ((i & 8) != 0) {
            num2 = notificationsFeedback.f15208id;
        }
        if ((i & 16) != 0) {
            baseLikesInfo = notificationsFeedback.likes;
        }
        if ((i & 32) != 0) {
            str = notificationsFeedback.text;
        }
        if ((i & 64) != 0) {
            num3 = notificationsFeedback.toId;
        }
        String str2 = str;
        Integer num4 = num3;
        BaseLikesInfo baseLikesInfo2 = baseLikesInfo;
        BaseGeo baseGeo2 = baseGeo;
        return notificationsFeedback.copy(list, num, baseGeo2, num2, baseLikesInfo2, str2, num4);
    }

    @Nullable
    public final List<WallWallpostAttachment> component1() {
        return this.attachments;
    }

    @Nullable
    public final Integer component2() {
        return this.fromId;
    }

    @Nullable
    public final BaseGeo component3() {
        return this.geo;
    }

    @Nullable
    public final Integer component4() {
        return this.f15208id;
    }

    @Nullable
    public final BaseLikesInfo component5() {
        return this.likes;
    }

    @Nullable
    public final String component6() {
        return this.text;
    }

    @Nullable
    public final Integer component7() {
        return this.toId;
    }

    @NotNull
    public final NotificationsFeedback copy(@Nullable List<WallWallpostAttachment> list, @Nullable Integer num, @Nullable BaseGeo baseGeo, @Nullable Integer num2, @Nullable BaseLikesInfo baseLikesInfo, @Nullable String str, @Nullable Integer num3) {
        return new NotificationsFeedback(list, num, baseGeo, num2, baseLikesInfo, str, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsFeedback)) {
            return false;
        }
        NotificationsFeedback notificationsFeedback = (NotificationsFeedback) obj;
        return Intrinsics.a(this.attachments, notificationsFeedback.attachments) && Intrinsics.a(this.fromId, notificationsFeedback.fromId) && Intrinsics.a(this.geo, notificationsFeedback.geo) && Intrinsics.a(this.f15208id, notificationsFeedback.f15208id) && Intrinsics.a(this.likes, notificationsFeedback.likes) && Intrinsics.a(this.text, notificationsFeedback.text) && Intrinsics.a(this.toId, notificationsFeedback.toId);
    }

    @Nullable
    public final List<WallWallpostAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final Integer getFromId() {
        return this.fromId;
    }

    @Nullable
    public final BaseGeo getGeo() {
        return this.geo;
    }

    @Nullable
    public final Integer getId() {
        return this.f15208id;
    }

    @Nullable
    public final BaseLikesInfo getLikes() {
        return this.likes;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getToId() {
        return this.toId;
    }

    public int hashCode() {
        List<WallWallpostAttachment> list = this.attachments;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.fromId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseGeo baseGeo = this.geo;
        int iHashCode3 = (iHashCode2 + (baseGeo == null ? 0 : baseGeo.hashCode())) * 31;
        Integer num2 = this.f15208id;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseLikesInfo baseLikesInfo = this.likes;
        int iHashCode5 = (iHashCode4 + (baseLikesInfo == null ? 0 : baseLikesInfo.hashCode())) * 31;
        String str = this.text;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.toId;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<WallWallpostAttachment> list = this.attachments;
        Integer num = this.fromId;
        BaseGeo baseGeo = this.geo;
        Integer num2 = this.f15208id;
        BaseLikesInfo baseLikesInfo = this.likes;
        String str = this.text;
        Integer num3 = this.toId;
        StringBuilder sb2 = new StringBuilder("NotificationsFeedback(attachments=");
        sb2.append(list);
        sb2.append(", fromId=");
        sb2.append(num);
        sb2.append(", geo=");
        sb2.append(baseGeo);
        sb2.append(", id=");
        sb2.append(num2);
        sb2.append(", likes=");
        sb2.append(baseLikesInfo);
        sb2.append(", text=");
        sb2.append(str);
        sb2.append(", toId=");
        return u.m(sb2, num3, ")");
    }

    public NotificationsFeedback(@Nullable List<WallWallpostAttachment> list, @Nullable Integer num, @Nullable BaseGeo baseGeo, @Nullable Integer num2, @Nullable BaseLikesInfo baseLikesInfo, @Nullable String str, @Nullable Integer num3) {
        this.attachments = list;
        this.fromId = num;
        this.geo = baseGeo;
        this.f15208id = num2;
        this.likes = baseLikesInfo;
        this.text = str;
        this.toId = num3;
    }

    public /* synthetic */ NotificationsFeedback(List list, Integer num, BaseGeo baseGeo, Integer num2, BaseLikesInfo baseLikesInfo, String str, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : baseGeo, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : baseLikesInfo, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num3);
    }
}
