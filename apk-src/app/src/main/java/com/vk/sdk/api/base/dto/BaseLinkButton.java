package com.vk.sdk.api.base.dto;

import com.vk.dto.common.id.UserId;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class BaseLinkButton {

    @b("action")
    @Nullable
    private final BaseLinkButtonAction action;

    @b("album_id")
    @Nullable
    private final Integer albumId;

    @b("block_id")
    @Nullable
    private final String blockId;

    @b("curator_id")
    @Nullable
    private final Integer curatorId;

    @b("icon")
    @Nullable
    private final String icon;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("section_id")
    @Nullable
    private final String sectionId;

    @b("style")
    @Nullable
    private final BaseLinkButtonStyle style;

    @b("title")
    @Nullable
    private final String title;

    public BaseLinkButton() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ BaseLinkButton copy$default(BaseLinkButton baseLinkButton, BaseLinkButtonAction baseLinkButtonAction, String str, String str2, String str3, Integer num, Integer num2, UserId userId, String str4, BaseLinkButtonStyle baseLinkButtonStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            baseLinkButtonAction = baseLinkButton.action;
        }
        if ((i & 2) != 0) {
            str = baseLinkButton.title;
        }
        if ((i & 4) != 0) {
            str2 = baseLinkButton.blockId;
        }
        if ((i & 8) != 0) {
            str3 = baseLinkButton.sectionId;
        }
        if ((i & 16) != 0) {
            num = baseLinkButton.curatorId;
        }
        if ((i & 32) != 0) {
            num2 = baseLinkButton.albumId;
        }
        if ((i & 64) != 0) {
            userId = baseLinkButton.ownerId;
        }
        if ((i & 128) != 0) {
            str4 = baseLinkButton.icon;
        }
        if ((i & 256) != 0) {
            baseLinkButtonStyle = baseLinkButton.style;
        }
        String str5 = str4;
        BaseLinkButtonStyle baseLinkButtonStyle2 = baseLinkButtonStyle;
        Integer num3 = num2;
        UserId userId2 = userId;
        Integer num4 = num;
        String str6 = str2;
        return baseLinkButton.copy(baseLinkButtonAction, str, str6, str3, num4, num3, userId2, str5, baseLinkButtonStyle2);
    }

    @Nullable
    public final BaseLinkButtonAction component1() {
        return this.action;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.blockId;
    }

    @Nullable
    public final String component4() {
        return this.sectionId;
    }

    @Nullable
    public final Integer component5() {
        return this.curatorId;
    }

    @Nullable
    public final Integer component6() {
        return this.albumId;
    }

    @Nullable
    public final UserId component7() {
        return this.ownerId;
    }

    @Nullable
    public final String component8() {
        return this.icon;
    }

    @Nullable
    public final BaseLinkButtonStyle component9() {
        return this.style;
    }

    @NotNull
    public final BaseLinkButton copy(@Nullable BaseLinkButtonAction baseLinkButtonAction, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId, @Nullable String str4, @Nullable BaseLinkButtonStyle baseLinkButtonStyle) {
        return new BaseLinkButton(baseLinkButtonAction, str, str2, str3, num, num2, userId, str4, baseLinkButtonStyle);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButton)) {
            return false;
        }
        BaseLinkButton baseLinkButton = (BaseLinkButton) obj;
        return Intrinsics.a(this.action, baseLinkButton.action) && Intrinsics.a(this.title, baseLinkButton.title) && Intrinsics.a(this.blockId, baseLinkButton.blockId) && Intrinsics.a(this.sectionId, baseLinkButton.sectionId) && Intrinsics.a(this.curatorId, baseLinkButton.curatorId) && Intrinsics.a(this.albumId, baseLinkButton.albumId) && Intrinsics.a(this.ownerId, baseLinkButton.ownerId) && Intrinsics.a(this.icon, baseLinkButton.icon) && this.style == baseLinkButton.style;
    }

    @Nullable
    public final BaseLinkButtonAction getAction() {
        return this.action;
    }

    @Nullable
    public final Integer getAlbumId() {
        return this.albumId;
    }

    @Nullable
    public final String getBlockId() {
        return this.blockId;
    }

    @Nullable
    public final Integer getCuratorId() {
        return this.curatorId;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getSectionId() {
        return this.sectionId;
    }

    @Nullable
    public final BaseLinkButtonStyle getStyle() {
        return this.style;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        BaseLinkButtonAction baseLinkButtonAction = this.action;
        int iHashCode = (baseLinkButtonAction == null ? 0 : baseLinkButtonAction.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blockId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.curatorId;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.albumId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int iHashCode7 = (iHashCode6 + (userId == null ? 0 : userId.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseLinkButtonStyle baseLinkButtonStyle = this.style;
        return iHashCode8 + (baseLinkButtonStyle != null ? baseLinkButtonStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BaseLinkButtonAction baseLinkButtonAction = this.action;
        String str = this.title;
        String str2 = this.blockId;
        String str3 = this.sectionId;
        Integer num = this.curatorId;
        Integer num2 = this.albumId;
        UserId userId = this.ownerId;
        String str4 = this.icon;
        BaseLinkButtonStyle baseLinkButtonStyle = this.style;
        StringBuilder sb2 = new StringBuilder("BaseLinkButton(action=");
        sb2.append(baseLinkButtonAction);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", blockId=");
        o.t(sb2, str2, ", sectionId=", str3, ", curatorId=");
        a.t(sb2, num, ", albumId=", num2, ", ownerId=");
        sb2.append(userId);
        sb2.append(", icon=");
        sb2.append(str4);
        sb2.append(", style=");
        sb2.append(baseLinkButtonStyle);
        sb2.append(")");
        return sb2.toString();
    }

    public BaseLinkButton(@Nullable BaseLinkButtonAction baseLinkButtonAction, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId, @Nullable String str4, @Nullable BaseLinkButtonStyle baseLinkButtonStyle) {
        this.action = baseLinkButtonAction;
        this.title = str;
        this.blockId = str2;
        this.sectionId = str3;
        this.curatorId = num;
        this.albumId = num2;
        this.ownerId = userId;
        this.icon = str4;
        this.style = baseLinkButtonStyle;
    }

    public /* synthetic */ BaseLinkButton(BaseLinkButtonAction baseLinkButtonAction, String str, String str2, String str3, Integer num, Integer num2, UserId userId, String str4, BaseLinkButtonStyle baseLinkButtonStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseLinkButtonAction, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : userId, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : baseLinkButtonStyle);
    }
}
