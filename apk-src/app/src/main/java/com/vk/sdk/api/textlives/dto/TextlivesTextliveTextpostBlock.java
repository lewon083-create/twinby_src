package com.vk.sdk.api.textlives.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import gf.a;
import io.sentry.protocol.Device;
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
public final class TextlivesTextliveTextpostBlock {

    @b("attach_url")
    @Nullable
    private final String attachUrl;

    @b("cover_photo")
    @Nullable
    private final PhotosPhoto coverPhoto;

    @b("end_date")
    @Nullable
    private final Integer endDate;

    @b("is_live")
    @NotNull
    private final IsLive isLive;

    @b(Device.JsonKeys.ONLINE)
    private final int online;

    @b("text")
    @Nullable
    private final String text;

    @b("textlive_id")
    private final int textliveId;

    @b("textlive_owner_id")
    @Nullable
    private final UserId textliveOwnerId;

    @b("textpost_attachment")
    @Nullable
    private final TextlivesTextpostAttachment textpostAttachment;

    @b("textpost_author_id")
    @Nullable
    private final UserId textpostAuthorId;

    @b("textpost_date")
    @Nullable
    private final Integer textpostDate;

    @b("textpost_is_important")
    @Nullable
    private final Boolean textpostIsImportant;

    @b("title")
    @Nullable
    private final String title;

    @b("type")
    @Nullable
    private final Type type;

    @b("unread")
    @Nullable
    private final Integer unread;

    @b("url")
    @NotNull
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum IsLive {
        OFFLINE(0),
        ONGOING(1);

        private final int value;

        IsLive(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        TEXTLIVE("textlive"),
        TEXTPOST("textpost"),
        TEXTPOST_PUBLISH("textpost_publish"),
        TEXTLIVE_FEED_BLOCK("textlive_feed_block");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public TextlivesTextliveTextpostBlock(int i, @NotNull String url, @NotNull IsLive isLive, int i10, @Nullable Type type, @Nullable String str, @Nullable Integer num, @Nullable PhotosPhoto photosPhoto, @Nullable Boolean bool, @Nullable UserId userId, @Nullable UserId userId2, @Nullable Integer num2, @Nullable String str2, @Nullable TextlivesTextpostAttachment textlivesTextpostAttachment, @Nullable String str3, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(isLive, "isLive");
        this.online = i;
        this.url = url;
        this.isLive = isLive;
        this.textliveId = i10;
        this.type = type;
        this.title = str;
        this.unread = num;
        this.coverPhoto = photosPhoto;
        this.textpostIsImportant = bool;
        this.textliveOwnerId = userId;
        this.textpostAuthorId = userId2;
        this.textpostDate = num2;
        this.text = str2;
        this.textpostAttachment = textlivesTextpostAttachment;
        this.attachUrl = str3;
        this.endDate = num3;
    }

    public final int component1() {
        return this.online;
    }

    @Nullable
    public final UserId component10() {
        return this.textliveOwnerId;
    }

    @Nullable
    public final UserId component11() {
        return this.textpostAuthorId;
    }

    @Nullable
    public final Integer component12() {
        return this.textpostDate;
    }

    @Nullable
    public final String component13() {
        return this.text;
    }

    @Nullable
    public final TextlivesTextpostAttachment component14() {
        return this.textpostAttachment;
    }

    @Nullable
    public final String component15() {
        return this.attachUrl;
    }

    @Nullable
    public final Integer component16() {
        return this.endDate;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final IsLive component3() {
        return this.isLive;
    }

    public final int component4() {
        return this.textliveId;
    }

    @Nullable
    public final Type component5() {
        return this.type;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    @Nullable
    public final Integer component7() {
        return this.unread;
    }

    @Nullable
    public final PhotosPhoto component8() {
        return this.coverPhoto;
    }

    @Nullable
    public final Boolean component9() {
        return this.textpostIsImportant;
    }

    @NotNull
    public final TextlivesTextliveTextpostBlock copy(int i, @NotNull String url, @NotNull IsLive isLive, int i10, @Nullable Type type, @Nullable String str, @Nullable Integer num, @Nullable PhotosPhoto photosPhoto, @Nullable Boolean bool, @Nullable UserId userId, @Nullable UserId userId2, @Nullable Integer num2, @Nullable String str2, @Nullable TextlivesTextpostAttachment textlivesTextpostAttachment, @Nullable String str3, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(isLive, "isLive");
        return new TextlivesTextliveTextpostBlock(i, url, isLive, i10, type, str, num, photosPhoto, bool, userId, userId2, num2, str2, textlivesTextpostAttachment, str3, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextlivesTextliveTextpostBlock)) {
            return false;
        }
        TextlivesTextliveTextpostBlock textlivesTextliveTextpostBlock = (TextlivesTextliveTextpostBlock) obj;
        return this.online == textlivesTextliveTextpostBlock.online && Intrinsics.a(this.url, textlivesTextliveTextpostBlock.url) && this.isLive == textlivesTextliveTextpostBlock.isLive && this.textliveId == textlivesTextliveTextpostBlock.textliveId && this.type == textlivesTextliveTextpostBlock.type && Intrinsics.a(this.title, textlivesTextliveTextpostBlock.title) && Intrinsics.a(this.unread, textlivesTextliveTextpostBlock.unread) && Intrinsics.a(this.coverPhoto, textlivesTextliveTextpostBlock.coverPhoto) && Intrinsics.a(this.textpostIsImportant, textlivesTextliveTextpostBlock.textpostIsImportant) && Intrinsics.a(this.textliveOwnerId, textlivesTextliveTextpostBlock.textliveOwnerId) && Intrinsics.a(this.textpostAuthorId, textlivesTextliveTextpostBlock.textpostAuthorId) && Intrinsics.a(this.textpostDate, textlivesTextliveTextpostBlock.textpostDate) && Intrinsics.a(this.text, textlivesTextliveTextpostBlock.text) && Intrinsics.a(this.textpostAttachment, textlivesTextliveTextpostBlock.textpostAttachment) && Intrinsics.a(this.attachUrl, textlivesTextliveTextpostBlock.attachUrl) && Intrinsics.a(this.endDate, textlivesTextliveTextpostBlock.endDate);
    }

    @Nullable
    public final String getAttachUrl() {
        return this.attachUrl;
    }

    @Nullable
    public final PhotosPhoto getCoverPhoto() {
        return this.coverPhoto;
    }

    @Nullable
    public final Integer getEndDate() {
        return this.endDate;
    }

    public final int getOnline() {
        return this.online;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final int getTextliveId() {
        return this.textliveId;
    }

    @Nullable
    public final UserId getTextliveOwnerId() {
        return this.textliveOwnerId;
    }

    @Nullable
    public final TextlivesTextpostAttachment getTextpostAttachment() {
        return this.textpostAttachment;
    }

    @Nullable
    public final UserId getTextpostAuthorId() {
        return this.textpostAuthorId;
    }

    @Nullable
    public final Integer getTextpostDate() {
        return this.textpostDate;
    }

    @Nullable
    public final Boolean getTextpostIsImportant() {
        return this.textpostIsImportant;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUnread() {
        return this.unread;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iG = u.g(this.textliveId, (this.isLive.hashCode() + a.e(Integer.hashCode(this.online) * 31, 31, this.url)) * 31, 31);
        Type type = this.type;
        int iHashCode = (iG + (type == null ? 0 : type.hashCode())) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.unread;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.coverPhoto;
        int iHashCode4 = (iHashCode3 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        Boolean bool = this.textpostIsImportant;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId = this.textliveOwnerId;
        int iHashCode6 = (iHashCode5 + (userId == null ? 0 : userId.hashCode())) * 31;
        UserId userId2 = this.textpostAuthorId;
        int iHashCode7 = (iHashCode6 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        Integer num2 = this.textpostDate;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextlivesTextpostAttachment textlivesTextpostAttachment = this.textpostAttachment;
        int iHashCode10 = (iHashCode9 + (textlivesTextpostAttachment == null ? 0 : textlivesTextpostAttachment.hashCode())) * 31;
        String str3 = this.attachUrl;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.endDate;
        return iHashCode11 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public final IsLive isLive() {
        return this.isLive;
    }

    @NotNull
    public String toString() {
        int i = this.online;
        String str = this.url;
        IsLive isLive = this.isLive;
        int i10 = this.textliveId;
        Type type = this.type;
        String str2 = this.title;
        Integer num = this.unread;
        PhotosPhoto photosPhoto = this.coverPhoto;
        Boolean bool = this.textpostIsImportant;
        UserId userId = this.textliveOwnerId;
        UserId userId2 = this.textpostAuthorId;
        Integer num2 = this.textpostDate;
        String str3 = this.text;
        TextlivesTextpostAttachment textlivesTextpostAttachment = this.textpostAttachment;
        String str4 = this.attachUrl;
        Integer num3 = this.endDate;
        StringBuilder sbI = pe.a.i(i, "TextlivesTextliveTextpostBlock(online=", ", url=", str, ", isLive=");
        sbI.append(isLive);
        sbI.append(", textliveId=");
        sbI.append(i10);
        sbI.append(", type=");
        sbI.append(type);
        sbI.append(", title=");
        sbI.append(str2);
        sbI.append(", unread=");
        sbI.append(num);
        sbI.append(", coverPhoto=");
        sbI.append(photosPhoto);
        sbI.append(", textpostIsImportant=");
        sbI.append(bool);
        sbI.append(", textliveOwnerId=");
        sbI.append(userId);
        sbI.append(", textpostAuthorId=");
        sbI.append(userId2);
        sbI.append(", textpostDate=");
        sbI.append(num2);
        sbI.append(", text=");
        sbI.append(str3);
        sbI.append(", textpostAttachment=");
        sbI.append(textlivesTextpostAttachment);
        sbI.append(", attachUrl=");
        sbI.append(str4);
        sbI.append(", endDate=");
        sbI.append(num3);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ TextlivesTextliveTextpostBlock(int i, String str, IsLive isLive, int i10, Type type, String str2, Integer num, PhotosPhoto photosPhoto, Boolean bool, UserId userId, UserId userId2, Integer num2, String str3, TextlivesTextpostAttachment textlivesTextpostAttachment, String str4, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, isLive, i10, (i11 & 16) != 0 ? null : type, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : photosPhoto, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : userId, (i11 & 1024) != 0 ? null : userId2, (i11 & 2048) != 0 ? null : num2, (i11 & 4096) != 0 ? null : str3, (i11 & 8192) != 0 ? null : textlivesTextpostAttachment, (i11 & 16384) != 0 ? null : str4, (i11 & 32768) != 0 ? null : num3);
    }
}
