package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import kotlin.KotlinVersion;
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
public final class GroupsLinksItem {

    @b("desc")
    @Nullable
    private final String desc;

    @b("edit_title")
    @Nullable
    private final BaseBoolInt editTitle;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15182id;

    @b("image_processing")
    @Nullable
    private final BaseBoolInt imageProcessing;

    @b("name")
    @Nullable
    private final String name;

    @b("photo_100")
    @Nullable
    private final String photo100;

    @b("photo_50")
    @Nullable
    private final String photo50;

    @b("url")
    @Nullable
    private final String url;

    public GroupsLinksItem() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public static /* synthetic */ GroupsLinksItem copy$default(GroupsLinksItem groupsLinksItem, String str, String str2, BaseBoolInt baseBoolInt, Integer num, String str3, String str4, String str5, BaseBoolInt baseBoolInt2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupsLinksItem.name;
        }
        if ((i & 2) != 0) {
            str2 = groupsLinksItem.desc;
        }
        if ((i & 4) != 0) {
            baseBoolInt = groupsLinksItem.editTitle;
        }
        if ((i & 8) != 0) {
            num = groupsLinksItem.f15182id;
        }
        if ((i & 16) != 0) {
            str3 = groupsLinksItem.photo100;
        }
        if ((i & 32) != 0) {
            str4 = groupsLinksItem.photo50;
        }
        if ((i & 64) != 0) {
            str5 = groupsLinksItem.url;
        }
        if ((i & 128) != 0) {
            baseBoolInt2 = groupsLinksItem.imageProcessing;
        }
        String str6 = str5;
        BaseBoolInt baseBoolInt3 = baseBoolInt2;
        String str7 = str3;
        String str8 = str4;
        return groupsLinksItem.copy(str, str2, baseBoolInt, num, str7, str8, str6, baseBoolInt3);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.desc;
    }

    @Nullable
    public final BaseBoolInt component3() {
        return this.editTitle;
    }

    @Nullable
    public final Integer component4() {
        return this.f15182id;
    }

    @Nullable
    public final String component5() {
        return this.photo100;
    }

    @Nullable
    public final String component6() {
        return this.photo50;
    }

    @Nullable
    public final String component7() {
        return this.url;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.imageProcessing;
    }

    @NotNull
    public final GroupsLinksItem copy(@Nullable String str, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BaseBoolInt baseBoolInt2) {
        return new GroupsLinksItem(str, str2, baseBoolInt, num, str3, str4, str5, baseBoolInt2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLinksItem)) {
            return false;
        }
        GroupsLinksItem groupsLinksItem = (GroupsLinksItem) obj;
        return Intrinsics.a(this.name, groupsLinksItem.name) && Intrinsics.a(this.desc, groupsLinksItem.desc) && this.editTitle == groupsLinksItem.editTitle && Intrinsics.a(this.f15182id, groupsLinksItem.f15182id) && Intrinsics.a(this.photo100, groupsLinksItem.photo100) && Intrinsics.a(this.photo50, groupsLinksItem.photo50) && Intrinsics.a(this.url, groupsLinksItem.url) && this.imageProcessing == groupsLinksItem.imageProcessing;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final BaseBoolInt getEditTitle() {
        return this.editTitle;
    }

    @Nullable
    public final Integer getId() {
        return this.f15182id;
    }

    @Nullable
    public final BaseBoolInt getImageProcessing() {
        return this.imageProcessing;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhoto100() {
        return this.photo100;
    }

    @Nullable
    public final String getPhoto50() {
        return this.photo50;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.editTitle;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        Integer num = this.f15182id;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.photo100;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo50;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.imageProcessing;
        return iHashCode7 + (baseBoolInt2 != null ? baseBoolInt2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.desc;
        BaseBoolInt baseBoolInt = this.editTitle;
        Integer num = this.f15182id;
        String str3 = this.photo100;
        String str4 = this.photo50;
        String str5 = this.url;
        BaseBoolInt baseBoolInt2 = this.imageProcessing;
        StringBuilder sbJ = z.j("GroupsLinksItem(name=", str, ", desc=", str2, ", editTitle=");
        sbJ.append(baseBoolInt);
        sbJ.append(", id=");
        sbJ.append(num);
        sbJ.append(", photo100=");
        o.t(sbJ, str3, ", photo50=", str4, ", url=");
        sbJ.append(str5);
        sbJ.append(", imageProcessing=");
        sbJ.append(baseBoolInt2);
        sbJ.append(")");
        return sbJ.toString();
    }

    public GroupsLinksItem(@Nullable String str, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BaseBoolInt baseBoolInt2) {
        this.name = str;
        this.desc = str2;
        this.editTitle = baseBoolInt;
        this.f15182id = num;
        this.photo100 = str3;
        this.photo50 = str4;
        this.url = str5;
        this.imageProcessing = baseBoolInt2;
    }

    public /* synthetic */ GroupsLinksItem(String str, String str2, BaseBoolInt baseBoolInt, Integer num, String str3, String str4, String str5, BaseBoolInt baseBoolInt2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseBoolInt, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : baseBoolInt2);
    }
}
