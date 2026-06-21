package com.vk.sdk.api.base.dto;

import a0.u;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class BaseLinkChat {

    @b("description")
    @Nullable
    private final String description;

    @b("invite_link")
    @NotNull
    private final String inviteLink;

    @b("members_count")
    private final int membersCount;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("title")
    @NotNull
    private final String title;

    @b("type")
    @NotNull
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        CHAT(0),
        GROUP(17);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public BaseLinkChat(@NotNull String title, @NotNull String inviteLink, @NotNull Type type, int i, @Nullable PhotosPhoto photosPhoto, @Nullable String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inviteLink, "inviteLink");
        Intrinsics.checkNotNullParameter(type, "type");
        this.title = title;
        this.inviteLink = inviteLink;
        this.type = type;
        this.membersCount = i;
        this.photo = photosPhoto;
        this.description = str;
    }

    public static /* synthetic */ BaseLinkChat copy$default(BaseLinkChat baseLinkChat, String str, String str2, Type type, int i, PhotosPhoto photosPhoto, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = baseLinkChat.title;
        }
        if ((i10 & 2) != 0) {
            str2 = baseLinkChat.inviteLink;
        }
        if ((i10 & 4) != 0) {
            type = baseLinkChat.type;
        }
        if ((i10 & 8) != 0) {
            i = baseLinkChat.membersCount;
        }
        if ((i10 & 16) != 0) {
            photosPhoto = baseLinkChat.photo;
        }
        if ((i10 & 32) != 0) {
            str3 = baseLinkChat.description;
        }
        PhotosPhoto photosPhoto2 = photosPhoto;
        String str4 = str3;
        return baseLinkChat.copy(str, str2, type, i, photosPhoto2, str4);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.inviteLink;
    }

    @NotNull
    public final Type component3() {
        return this.type;
    }

    public final int component4() {
        return this.membersCount;
    }

    @Nullable
    public final PhotosPhoto component5() {
        return this.photo;
    }

    @Nullable
    public final String component6() {
        return this.description;
    }

    @NotNull
    public final BaseLinkChat copy(@NotNull String title, @NotNull String inviteLink, @NotNull Type type, int i, @Nullable PhotosPhoto photosPhoto, @Nullable String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inviteLink, "inviteLink");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BaseLinkChat(title, inviteLink, type, i, photosPhoto, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkChat)) {
            return false;
        }
        BaseLinkChat baseLinkChat = (BaseLinkChat) obj;
        return Intrinsics.a(this.title, baseLinkChat.title) && Intrinsics.a(this.inviteLink, baseLinkChat.inviteLink) && this.type == baseLinkChat.type && this.membersCount == baseLinkChat.membersCount && Intrinsics.a(this.photo, baseLinkChat.photo) && Intrinsics.a(this.description, baseLinkChat.description);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getInviteLink() {
        return this.inviteLink;
    }

    public final int getMembersCount() {
        return this.membersCount;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iG = u.g(this.membersCount, (this.type.hashCode() + a.e(this.title.hashCode() * 31, 31, this.inviteLink)) * 31, 31);
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode = (iG + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        String str = this.description;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.inviteLink;
        Type type = this.type;
        int i = this.membersCount;
        PhotosPhoto photosPhoto = this.photo;
        String str3 = this.description;
        StringBuilder sbJ = z.j("BaseLinkChat(title=", str, ", inviteLink=", str2, ", type=");
        sbJ.append(type);
        sbJ.append(", membersCount=");
        sbJ.append(i);
        sbJ.append(", photo=");
        sbJ.append(photosPhoto);
        sbJ.append(", description=");
        sbJ.append(str3);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ BaseLinkChat(String str, String str2, Type type, int i, PhotosPhoto photosPhoto, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, type, i, (i10 & 16) != 0 ? null : photosPhoto, (i10 & 32) != 0 ? null : str3);
    }
}
