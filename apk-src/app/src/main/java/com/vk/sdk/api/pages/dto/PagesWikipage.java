package com.vk.sdk.api.pages.dto;

import a0.u;
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
public final class PagesWikipage {

    @b("creator_id")
    @Nullable
    private final Integer creatorId;

    @b("creator_name")
    @Nullable
    private final Integer creatorName;

    @b("editor_id")
    @Nullable
    private final Integer editorId;

    @b("editor_name")
    @Nullable
    private final String editorName;

    @b("group_id")
    @NotNull
    private final UserId groupId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15212id;

    @b("title")
    @NotNull
    private final String title;

    @b("views")
    private final int views;

    @b("who_can_edit")
    @NotNull
    private final PagesPrivacySettings whoCanEdit;

    @b("who_can_view")
    @NotNull
    private final PagesPrivacySettings whoCanView;

    public PagesWikipage(@NotNull UserId groupId, int i, @NotNull String title, int i10, @NotNull PagesPrivacySettings whoCanEdit, @NotNull PagesPrivacySettings whoCanView, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(whoCanEdit, "whoCanEdit");
        Intrinsics.checkNotNullParameter(whoCanView, "whoCanView");
        this.groupId = groupId;
        this.f15212id = i;
        this.title = title;
        this.views = i10;
        this.whoCanEdit = whoCanEdit;
        this.whoCanView = whoCanView;
        this.creatorId = num;
        this.creatorName = num2;
        this.editorId = num3;
        this.editorName = str;
    }

    public static /* synthetic */ PagesWikipage copy$default(PagesWikipage pagesWikipage, UserId userId, int i, String str, int i10, PagesPrivacySettings pagesPrivacySettings, PagesPrivacySettings pagesPrivacySettings2, Integer num, Integer num2, Integer num3, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userId = pagesWikipage.groupId;
        }
        if ((i11 & 2) != 0) {
            i = pagesWikipage.f15212id;
        }
        if ((i11 & 4) != 0) {
            str = pagesWikipage.title;
        }
        if ((i11 & 8) != 0) {
            i10 = pagesWikipage.views;
        }
        if ((i11 & 16) != 0) {
            pagesPrivacySettings = pagesWikipage.whoCanEdit;
        }
        if ((i11 & 32) != 0) {
            pagesPrivacySettings2 = pagesWikipage.whoCanView;
        }
        if ((i11 & 64) != 0) {
            num = pagesWikipage.creatorId;
        }
        if ((i11 & 128) != 0) {
            num2 = pagesWikipage.creatorName;
        }
        if ((i11 & 256) != 0) {
            num3 = pagesWikipage.editorId;
        }
        if ((i11 & 512) != 0) {
            str2 = pagesWikipage.editorName;
        }
        Integer num4 = num3;
        String str3 = str2;
        Integer num5 = num;
        Integer num6 = num2;
        PagesPrivacySettings pagesPrivacySettings3 = pagesPrivacySettings;
        PagesPrivacySettings pagesPrivacySettings4 = pagesPrivacySettings2;
        return pagesWikipage.copy(userId, i, str, i10, pagesPrivacySettings3, pagesPrivacySettings4, num5, num6, num4, str3);
    }

    @NotNull
    public final UserId component1() {
        return this.groupId;
    }

    @Nullable
    public final String component10() {
        return this.editorName;
    }

    public final int component2() {
        return this.f15212id;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.views;
    }

    @NotNull
    public final PagesPrivacySettings component5() {
        return this.whoCanEdit;
    }

    @NotNull
    public final PagesPrivacySettings component6() {
        return this.whoCanView;
    }

    @Nullable
    public final Integer component7() {
        return this.creatorId;
    }

    @Nullable
    public final Integer component8() {
        return this.creatorName;
    }

    @Nullable
    public final Integer component9() {
        return this.editorId;
    }

    @NotNull
    public final PagesWikipage copy(@NotNull UserId groupId, int i, @NotNull String title, int i10, @NotNull PagesPrivacySettings whoCanEdit, @NotNull PagesPrivacySettings whoCanView, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(whoCanEdit, "whoCanEdit");
        Intrinsics.checkNotNullParameter(whoCanView, "whoCanView");
        return new PagesWikipage(groupId, i, title, i10, whoCanEdit, whoCanView, num, num2, num3, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagesWikipage)) {
            return false;
        }
        PagesWikipage pagesWikipage = (PagesWikipage) obj;
        return Intrinsics.a(this.groupId, pagesWikipage.groupId) && this.f15212id == pagesWikipage.f15212id && Intrinsics.a(this.title, pagesWikipage.title) && this.views == pagesWikipage.views && this.whoCanEdit == pagesWikipage.whoCanEdit && this.whoCanView == pagesWikipage.whoCanView && Intrinsics.a(this.creatorId, pagesWikipage.creatorId) && Intrinsics.a(this.creatorName, pagesWikipage.creatorName) && Intrinsics.a(this.editorId, pagesWikipage.editorId) && Intrinsics.a(this.editorName, pagesWikipage.editorName);
    }

    @Nullable
    public final Integer getCreatorId() {
        return this.creatorId;
    }

    @Nullable
    public final Integer getCreatorName() {
        return this.creatorName;
    }

    @Nullable
    public final Integer getEditorId() {
        return this.editorId;
    }

    @Nullable
    public final String getEditorName() {
        return this.editorName;
    }

    @NotNull
    public final UserId getGroupId() {
        return this.groupId;
    }

    public final int getId() {
        return this.f15212id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getViews() {
        return this.views;
    }

    @NotNull
    public final PagesPrivacySettings getWhoCanEdit() {
        return this.whoCanEdit;
    }

    @NotNull
    public final PagesPrivacySettings getWhoCanView() {
        return this.whoCanView;
    }

    public int hashCode() {
        int iHashCode = (this.whoCanView.hashCode() + ((this.whoCanEdit.hashCode() + u.g(this.views, a.e(u.g(this.f15212id, this.groupId.hashCode() * 31, 31), 31, this.title), 31)) * 31)) * 31;
        Integer num = this.creatorId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.creatorName;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.editorId;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.editorName;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        UserId userId = this.groupId;
        int i = this.f15212id;
        String str = this.title;
        int i10 = this.views;
        PagesPrivacySettings pagesPrivacySettings = this.whoCanEdit;
        PagesPrivacySettings pagesPrivacySettings2 = this.whoCanView;
        Integer num = this.creatorId;
        Integer num2 = this.creatorName;
        Integer num3 = this.editorId;
        String str2 = this.editorName;
        StringBuilder sb2 = new StringBuilder("PagesWikipage(groupId=");
        sb2.append(userId);
        sb2.append(", id=");
        sb2.append(i);
        sb2.append(", title=");
        o.p(i10, str, ", views=", ", whoCanEdit=", sb2);
        sb2.append(pagesPrivacySettings);
        sb2.append(", whoCanView=");
        sb2.append(pagesPrivacySettings2);
        sb2.append(", creatorId=");
        a.t(sb2, num, ", creatorName=", num2, ", editorId=");
        sb2.append(num3);
        sb2.append(", editorName=");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ PagesWikipage(UserId userId, int i, String str, int i10, PagesPrivacySettings pagesPrivacySettings, PagesPrivacySettings pagesPrivacySettings2, Integer num, Integer num2, Integer num3, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, i, str, i10, pagesPrivacySettings, pagesPrivacySettings2, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? null : num3, (i11 & 512) != 0 ? null : str2);
    }
}
