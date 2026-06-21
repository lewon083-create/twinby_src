package com.vk.sdk.api.wall.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import io.sentry.UserFeedback;
import java.util.List;
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
public final class WallAttachedNote {

    @b("can_comment")
    @Nullable
    private final Integer canComment;

    @b(UserFeedback.JsonKeys.COMMENTS)
    private final int comments;

    @b("date")
    private final int date;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15255id;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("privacy_comment")
    @Nullable
    private final List<String> privacyComment;

    @b("privacy_view")
    @Nullable
    private final List<String> privacyView;

    @b("read_comments")
    private final int readComments;

    @b("text")
    @Nullable
    private final String text;

    @b("text_wiki")
    @Nullable
    private final String textWiki;

    @b("title")
    @NotNull
    private final String title;

    @b("view_url")
    @NotNull
    private final String viewUrl;

    public WallAttachedNote(int i, int i10, int i11, @NotNull UserId ownerId, int i12, @NotNull String title, @NotNull String viewUrl, @Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Integer num, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        this.comments = i;
        this.date = i10;
        this.f15255id = i11;
        this.ownerId = ownerId;
        this.readComments = i12;
        this.title = title;
        this.viewUrl = viewUrl;
        this.text = str;
        this.privacyView = list;
        this.privacyComment = list2;
        this.canComment = num;
        this.textWiki = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallAttachedNote copy$default(WallAttachedNote wallAttachedNote, int i, int i10, int i11, UserId userId, int i12, String str, String str2, String str3, List list, List list2, Integer num, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = wallAttachedNote.comments;
        }
        if ((i13 & 2) != 0) {
            i10 = wallAttachedNote.date;
        }
        if ((i13 & 4) != 0) {
            i11 = wallAttachedNote.f15255id;
        }
        if ((i13 & 8) != 0) {
            userId = wallAttachedNote.ownerId;
        }
        if ((i13 & 16) != 0) {
            i12 = wallAttachedNote.readComments;
        }
        if ((i13 & 32) != 0) {
            str = wallAttachedNote.title;
        }
        if ((i13 & 64) != 0) {
            str2 = wallAttachedNote.viewUrl;
        }
        if ((i13 & 128) != 0) {
            str3 = wallAttachedNote.text;
        }
        if ((i13 & 256) != 0) {
            list = wallAttachedNote.privacyView;
        }
        if ((i13 & 512) != 0) {
            list2 = wallAttachedNote.privacyComment;
        }
        if ((i13 & 1024) != 0) {
            num = wallAttachedNote.canComment;
        }
        if ((i13 & 2048) != 0) {
            str4 = wallAttachedNote.textWiki;
        }
        Integer num2 = num;
        String str5 = str4;
        List list3 = list;
        List list4 = list2;
        String str6 = str2;
        String str7 = str3;
        int i14 = i12;
        String str8 = str;
        return wallAttachedNote.copy(i, i10, i11, userId, i14, str8, str6, str7, list3, list4, num2, str5);
    }

    public final int component1() {
        return this.comments;
    }

    @Nullable
    public final List<String> component10() {
        return this.privacyComment;
    }

    @Nullable
    public final Integer component11() {
        return this.canComment;
    }

    @Nullable
    public final String component12() {
        return this.textWiki;
    }

    public final int component2() {
        return this.date;
    }

    public final int component3() {
        return this.f15255id;
    }

    @NotNull
    public final UserId component4() {
        return this.ownerId;
    }

    public final int component5() {
        return this.readComments;
    }

    @NotNull
    public final String component6() {
        return this.title;
    }

    @NotNull
    public final String component7() {
        return this.viewUrl;
    }

    @Nullable
    public final String component8() {
        return this.text;
    }

    @Nullable
    public final List<String> component9() {
        return this.privacyView;
    }

    @NotNull
    public final WallAttachedNote copy(int i, int i10, int i11, @NotNull UserId ownerId, int i12, @NotNull String title, @NotNull String viewUrl, @Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Integer num, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        return new WallAttachedNote(i, i10, i11, ownerId, i12, title, viewUrl, str, list, list2, num, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAttachedNote)) {
            return false;
        }
        WallAttachedNote wallAttachedNote = (WallAttachedNote) obj;
        return this.comments == wallAttachedNote.comments && this.date == wallAttachedNote.date && this.f15255id == wallAttachedNote.f15255id && Intrinsics.a(this.ownerId, wallAttachedNote.ownerId) && this.readComments == wallAttachedNote.readComments && Intrinsics.a(this.title, wallAttachedNote.title) && Intrinsics.a(this.viewUrl, wallAttachedNote.viewUrl) && Intrinsics.a(this.text, wallAttachedNote.text) && Intrinsics.a(this.privacyView, wallAttachedNote.privacyView) && Intrinsics.a(this.privacyComment, wallAttachedNote.privacyComment) && Intrinsics.a(this.canComment, wallAttachedNote.canComment) && Intrinsics.a(this.textWiki, wallAttachedNote.textWiki);
    }

    @Nullable
    public final Integer getCanComment() {
        return this.canComment;
    }

    public final int getComments() {
        return this.comments;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getId() {
        return this.f15255id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final List<String> getPrivacyComment() {
        return this.privacyComment;
    }

    @Nullable
    public final List<String> getPrivacyView() {
        return this.privacyView;
    }

    public final int getReadComments() {
        return this.readComments;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTextWiki() {
        return this.textWiki;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getViewUrl() {
        return this.viewUrl;
    }

    public int hashCode() {
        int iE = a.e(a.e(u.g(this.readComments, o.e(this.ownerId, u.g(this.f15255id, u.g(this.date, Integer.hashCode(this.comments) * 31, 31), 31), 31), 31), 31, this.title), 31, this.viewUrl);
        String str = this.text;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.privacyView;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.privacyComment;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.canComment;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.textWiki;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.comments;
        int i10 = this.date;
        int i11 = this.f15255id;
        UserId userId = this.ownerId;
        int i12 = this.readComments;
        String str = this.title;
        String str2 = this.viewUrl;
        String str3 = this.text;
        List<String> list = this.privacyView;
        List<String> list2 = this.privacyComment;
        Integer num = this.canComment;
        String str4 = this.textWiki;
        StringBuilder sbI = z.i("WallAttachedNote(comments=", i, ", date=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", readComments=");
        a.q(i12, ", title=", str, ", viewUrl=", sbI);
        o.t(sbI, str2, ", text=", str3, ", privacyView=");
        a.u(sbI, list, ", privacyComment=", list2, ", canComment=");
        sbI.append(num);
        sbI.append(", textWiki=");
        sbI.append(str4);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ WallAttachedNote(int i, int i10, int i11, UserId userId, int i12, String str, String str2, String str3, List list, List list2, Integer num, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, i12, str, str2, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : list2, (i13 & 1024) != 0 ? null : num, (i13 & 2048) != 0 ? null : str4);
    }
}
