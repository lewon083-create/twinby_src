package com.vk.sdk.api.pages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
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
public final class PagesWikipageFull {

    @b("created")
    private final int created;

    @b("creator_id")
    @Nullable
    private final Integer creatorId;

    @b("current_user_can_edit")
    @Nullable
    private final BaseBoolInt currentUserCanEdit;

    @b("current_user_can_edit_access")
    @Nullable
    private final BaseBoolInt currentUserCanEditAccess;

    @b("edited")
    private final int edited;

    @b("editor_id")
    @Nullable
    private final Integer editorId;

    @b("group_id")
    @NotNull
    private final UserId groupId;

    @b("html")
    @Nullable
    private final String html;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15213id;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("parent")
    @Nullable
    private final String parent;

    @b("parent2")
    @Nullable
    private final String parent2;

    @b("source")
    @Nullable
    private final String source;

    @b("title")
    @NotNull
    private final String title;

    @b("url")
    @Nullable
    private final String url;

    @b("view_url")
    @NotNull
    private final String viewUrl;

    @b("views")
    private final int views;

    @b("who_can_edit")
    @NotNull
    private final PagesPrivacySettings whoCanEdit;

    @b("who_can_view")
    @NotNull
    private final PagesPrivacySettings whoCanView;

    public PagesWikipageFull(int i, int i10, @NotNull UserId groupId, int i11, @NotNull String title, @NotNull String viewUrl, int i12, @NotNull PagesPrivacySettings whoCanEdit, @NotNull PagesPrivacySettings whoCanView, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        Intrinsics.checkNotNullParameter(whoCanEdit, "whoCanEdit");
        Intrinsics.checkNotNullParameter(whoCanView, "whoCanView");
        this.created = i;
        this.edited = i10;
        this.groupId = groupId;
        this.f15213id = i11;
        this.title = title;
        this.viewUrl = viewUrl;
        this.views = i12;
        this.whoCanEdit = whoCanEdit;
        this.whoCanView = whoCanView;
        this.creatorId = num;
        this.currentUserCanEdit = baseBoolInt;
        this.currentUserCanEditAccess = baseBoolInt2;
        this.editorId = num2;
        this.html = str;
        this.source = str2;
        this.url = str3;
        this.parent = str4;
        this.parent2 = str5;
        this.ownerId = userId;
    }

    public static /* synthetic */ PagesWikipageFull copy$default(PagesWikipageFull pagesWikipageFull, int i, int i10, UserId userId, int i11, String str, String str2, int i12, PagesPrivacySettings pagesPrivacySettings, PagesPrivacySettings pagesPrivacySettings2, Integer num, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num2, String str3, String str4, String str5, String str6, String str7, UserId userId2, int i13, Object obj) {
        UserId userId3;
        String str8;
        int i14 = (i13 & 1) != 0 ? pagesWikipageFull.created : i;
        int i15 = (i13 & 2) != 0 ? pagesWikipageFull.edited : i10;
        UserId userId4 = (i13 & 4) != 0 ? pagesWikipageFull.groupId : userId;
        int i16 = (i13 & 8) != 0 ? pagesWikipageFull.f15213id : i11;
        String str9 = (i13 & 16) != 0 ? pagesWikipageFull.title : str;
        String str10 = (i13 & 32) != 0 ? pagesWikipageFull.viewUrl : str2;
        int i17 = (i13 & 64) != 0 ? pagesWikipageFull.views : i12;
        PagesPrivacySettings pagesPrivacySettings3 = (i13 & 128) != 0 ? pagesWikipageFull.whoCanEdit : pagesPrivacySettings;
        PagesPrivacySettings pagesPrivacySettings4 = (i13 & 256) != 0 ? pagesWikipageFull.whoCanView : pagesPrivacySettings2;
        Integer num3 = (i13 & 512) != 0 ? pagesWikipageFull.creatorId : num;
        BaseBoolInt baseBoolInt3 = (i13 & 1024) != 0 ? pagesWikipageFull.currentUserCanEdit : baseBoolInt;
        BaseBoolInt baseBoolInt4 = (i13 & 2048) != 0 ? pagesWikipageFull.currentUserCanEditAccess : baseBoolInt2;
        Integer num4 = (i13 & 4096) != 0 ? pagesWikipageFull.editorId : num2;
        String str11 = (i13 & 8192) != 0 ? pagesWikipageFull.html : str3;
        int i18 = i14;
        String str12 = (i13 & 16384) != 0 ? pagesWikipageFull.source : str4;
        String str13 = (i13 & 32768) != 0 ? pagesWikipageFull.url : str5;
        String str14 = (i13 & 65536) != 0 ? pagesWikipageFull.parent : str6;
        String str15 = (i13 & 131072) != 0 ? pagesWikipageFull.parent2 : str7;
        if ((i13 & 262144) != 0) {
            str8 = str15;
            userId3 = pagesWikipageFull.ownerId;
        } else {
            userId3 = userId2;
            str8 = str15;
        }
        return pagesWikipageFull.copy(i18, i15, userId4, i16, str9, str10, i17, pagesPrivacySettings3, pagesPrivacySettings4, num3, baseBoolInt3, baseBoolInt4, num4, str11, str12, str13, str14, str8, userId3);
    }

    public final int component1() {
        return this.created;
    }

    @Nullable
    public final Integer component10() {
        return this.creatorId;
    }

    @Nullable
    public final BaseBoolInt component11() {
        return this.currentUserCanEdit;
    }

    @Nullable
    public final BaseBoolInt component12() {
        return this.currentUserCanEditAccess;
    }

    @Nullable
    public final Integer component13() {
        return this.editorId;
    }

    @Nullable
    public final String component14() {
        return this.html;
    }

    @Nullable
    public final String component15() {
        return this.source;
    }

    @Nullable
    public final String component16() {
        return this.url;
    }

    @Nullable
    public final String component17() {
        return this.parent;
    }

    @Nullable
    public final String component18() {
        return this.parent2;
    }

    @Nullable
    public final UserId component19() {
        return this.ownerId;
    }

    public final int component2() {
        return this.edited;
    }

    @NotNull
    public final UserId component3() {
        return this.groupId;
    }

    public final int component4() {
        return this.f15213id;
    }

    @NotNull
    public final String component5() {
        return this.title;
    }

    @NotNull
    public final String component6() {
        return this.viewUrl;
    }

    public final int component7() {
        return this.views;
    }

    @NotNull
    public final PagesPrivacySettings component8() {
        return this.whoCanEdit;
    }

    @NotNull
    public final PagesPrivacySettings component9() {
        return this.whoCanView;
    }

    @NotNull
    public final PagesWikipageFull copy(int i, int i10, @NotNull UserId groupId, int i11, @NotNull String title, @NotNull String viewUrl, int i12, @NotNull PagesPrivacySettings whoCanEdit, @NotNull PagesPrivacySettings whoCanView, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        Intrinsics.checkNotNullParameter(whoCanEdit, "whoCanEdit");
        Intrinsics.checkNotNullParameter(whoCanView, "whoCanView");
        return new PagesWikipageFull(i, i10, groupId, i11, title, viewUrl, i12, whoCanEdit, whoCanView, num, baseBoolInt, baseBoolInt2, num2, str, str2, str3, str4, str5, userId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagesWikipageFull)) {
            return false;
        }
        PagesWikipageFull pagesWikipageFull = (PagesWikipageFull) obj;
        return this.created == pagesWikipageFull.created && this.edited == pagesWikipageFull.edited && Intrinsics.a(this.groupId, pagesWikipageFull.groupId) && this.f15213id == pagesWikipageFull.f15213id && Intrinsics.a(this.title, pagesWikipageFull.title) && Intrinsics.a(this.viewUrl, pagesWikipageFull.viewUrl) && this.views == pagesWikipageFull.views && this.whoCanEdit == pagesWikipageFull.whoCanEdit && this.whoCanView == pagesWikipageFull.whoCanView && Intrinsics.a(this.creatorId, pagesWikipageFull.creatorId) && this.currentUserCanEdit == pagesWikipageFull.currentUserCanEdit && this.currentUserCanEditAccess == pagesWikipageFull.currentUserCanEditAccess && Intrinsics.a(this.editorId, pagesWikipageFull.editorId) && Intrinsics.a(this.html, pagesWikipageFull.html) && Intrinsics.a(this.source, pagesWikipageFull.source) && Intrinsics.a(this.url, pagesWikipageFull.url) && Intrinsics.a(this.parent, pagesWikipageFull.parent) && Intrinsics.a(this.parent2, pagesWikipageFull.parent2) && Intrinsics.a(this.ownerId, pagesWikipageFull.ownerId);
    }

    public final int getCreated() {
        return this.created;
    }

    @Nullable
    public final Integer getCreatorId() {
        return this.creatorId;
    }

    @Nullable
    public final BaseBoolInt getCurrentUserCanEdit() {
        return this.currentUserCanEdit;
    }

    @Nullable
    public final BaseBoolInt getCurrentUserCanEditAccess() {
        return this.currentUserCanEditAccess;
    }

    public final int getEdited() {
        return this.edited;
    }

    @Nullable
    public final Integer getEditorId() {
        return this.editorId;
    }

    @NotNull
    public final UserId getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getHtml() {
        return this.html;
    }

    public final int getId() {
        return this.f15213id;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getParent() {
        return this.parent;
    }

    @Nullable
    public final String getParent2() {
        return this.parent2;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getViewUrl() {
        return this.viewUrl;
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
        int iHashCode = (this.whoCanView.hashCode() + ((this.whoCanEdit.hashCode() + u.g(this.views, a.e(a.e(u.g(this.f15213id, o.e(this.groupId, u.g(this.edited, Integer.hashCode(this.created) * 31, 31), 31), 31), 31, this.title), 31, this.viewUrl), 31)) * 31)) * 31;
        Integer num = this.creatorId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.currentUserCanEdit;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.currentUserCanEditAccess;
        int iHashCode4 = (iHashCode3 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        Integer num2 = this.editorId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.html;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.parent;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.parent2;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UserId userId = this.ownerId;
        return iHashCode10 + (userId != null ? userId.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.created;
        int i10 = this.edited;
        UserId userId = this.groupId;
        int i11 = this.f15213id;
        String str = this.title;
        String str2 = this.viewUrl;
        int i12 = this.views;
        PagesPrivacySettings pagesPrivacySettings = this.whoCanEdit;
        PagesPrivacySettings pagesPrivacySettings2 = this.whoCanView;
        Integer num = this.creatorId;
        BaseBoolInt baseBoolInt = this.currentUserCanEdit;
        BaseBoolInt baseBoolInt2 = this.currentUserCanEditAccess;
        Integer num2 = this.editorId;
        String str3 = this.html;
        String str4 = this.source;
        String str5 = this.url;
        String str6 = this.parent;
        String str7 = this.parent2;
        UserId userId2 = this.ownerId;
        StringBuilder sbI = z.i("PagesWikipageFull(created=", i, ", edited=", i10, ", groupId=");
        sbI.append(userId);
        sbI.append(", id=");
        sbI.append(i11);
        sbI.append(", title=");
        o.t(sbI, str, ", viewUrl=", str2, ", views=");
        sbI.append(i12);
        sbI.append(", whoCanEdit=");
        sbI.append(pagesPrivacySettings);
        sbI.append(", whoCanView=");
        sbI.append(pagesPrivacySettings2);
        sbI.append(", creatorId=");
        sbI.append(num);
        sbI.append(", currentUserCanEdit=");
        a.s(sbI, baseBoolInt, ", currentUserCanEditAccess=", baseBoolInt2, ", editorId=");
        pe.a.r(num2, ", html=", str3, ", source=", sbI);
        o.t(sbI, str4, ", url=", str5, ", parent=");
        o.t(sbI, str6, ", parent2=", str7, ", ownerId=");
        sbI.append(userId2);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PagesWikipageFull(int i, int i10, UserId userId, int i11, String str, String str2, int i12, PagesPrivacySettings pagesPrivacySettings, PagesPrivacySettings pagesPrivacySettings2, Integer num, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num2, String str3, String str4, String str5, String str6, String str7, UserId userId2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, userId, i11, str, str2, i12, pagesPrivacySettings, pagesPrivacySettings2, (i13 & 512) != 0 ? null : num, (i13 & 1024) != 0 ? null : baseBoolInt, (i13 & 2048) != 0 ? null : baseBoolInt2, (i13 & 4096) != 0 ? null : num2, (i13 & 8192) != 0 ? null : str3, (i13 & 16384) != 0 ? null : str4, (32768 & i13) != 0 ? null : str5, (65536 & i13) != 0 ? null : str6, (131072 & i13) != 0 ? null : str7, (i13 & 262144) != 0 ? null : userId2);
    }
}
