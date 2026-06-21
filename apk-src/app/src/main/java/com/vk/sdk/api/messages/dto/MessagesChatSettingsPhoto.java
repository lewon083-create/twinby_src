package com.vk.sdk.api.messages.dto;

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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class MessagesChatSettingsPhoto {

    @b("is_default_call_photo")
    @Nullable
    private final Boolean isDefaultCallPhoto;

    @b("is_default_photo")
    @Nullable
    private final Boolean isDefaultPhoto;

    @b("photo_100")
    @Nullable
    private final String photo100;

    @b("photo_200")
    @Nullable
    private final String photo200;

    @b("photo_50")
    @Nullable
    private final String photo50;

    public MessagesChatSettingsPhoto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MessagesChatSettingsPhoto copy$default(MessagesChatSettingsPhoto messagesChatSettingsPhoto, String str, String str2, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagesChatSettingsPhoto.photo50;
        }
        if ((i & 2) != 0) {
            str2 = messagesChatSettingsPhoto.photo100;
        }
        if ((i & 4) != 0) {
            str3 = messagesChatSettingsPhoto.photo200;
        }
        if ((i & 8) != 0) {
            bool = messagesChatSettingsPhoto.isDefaultPhoto;
        }
        if ((i & 16) != 0) {
            bool2 = messagesChatSettingsPhoto.isDefaultCallPhoto;
        }
        Boolean bool3 = bool2;
        String str4 = str3;
        return messagesChatSettingsPhoto.copy(str, str2, str4, bool, bool3);
    }

    @Nullable
    public final String component1() {
        return this.photo50;
    }

    @Nullable
    public final String component2() {
        return this.photo100;
    }

    @Nullable
    public final String component3() {
        return this.photo200;
    }

    @Nullable
    public final Boolean component4() {
        return this.isDefaultPhoto;
    }

    @Nullable
    public final Boolean component5() {
        return this.isDefaultCallPhoto;
    }

    @NotNull
    public final MessagesChatSettingsPhoto copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        return new MessagesChatSettingsPhoto(str, str2, str3, bool, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsPhoto)) {
            return false;
        }
        MessagesChatSettingsPhoto messagesChatSettingsPhoto = (MessagesChatSettingsPhoto) obj;
        return Intrinsics.a(this.photo50, messagesChatSettingsPhoto.photo50) && Intrinsics.a(this.photo100, messagesChatSettingsPhoto.photo100) && Intrinsics.a(this.photo200, messagesChatSettingsPhoto.photo200) && Intrinsics.a(this.isDefaultPhoto, messagesChatSettingsPhoto.isDefaultPhoto) && Intrinsics.a(this.isDefaultCallPhoto, messagesChatSettingsPhoto.isDefaultCallPhoto);
    }

    @Nullable
    public final String getPhoto100() {
        return this.photo100;
    }

    @Nullable
    public final String getPhoto200() {
        return this.photo200;
    }

    @Nullable
    public final String getPhoto50() {
        return this.photo50;
    }

    public int hashCode() {
        String str = this.photo50;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photo100;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDefaultPhoto;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefaultCallPhoto;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDefaultCallPhoto() {
        return this.isDefaultCallPhoto;
    }

    @Nullable
    public final Boolean isDefaultPhoto() {
        return this.isDefaultPhoto;
    }

    @NotNull
    public String toString() {
        String str = this.photo50;
        String str2 = this.photo100;
        String str3 = this.photo200;
        Boolean bool = this.isDefaultPhoto;
        Boolean bool2 = this.isDefaultCallPhoto;
        StringBuilder sbJ = z.j("MessagesChatSettingsPhoto(photo50=", str, ", photo100=", str2, ", photo200=");
        sbJ.append(str3);
        sbJ.append(", isDefaultPhoto=");
        sbJ.append(bool);
        sbJ.append(", isDefaultCallPhoto=");
        sbJ.append(bool2);
        sbJ.append(")");
        return sbJ.toString();
    }

    public MessagesChatSettingsPhoto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.photo50 = str;
        this.photo100 = str2;
        this.photo200 = str3;
        this.isDefaultPhoto = bool;
        this.isDefaultCallPhoto = bool2;
    }

    public /* synthetic */ MessagesChatSettingsPhoto(String str, String str2, String str3, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }
}
