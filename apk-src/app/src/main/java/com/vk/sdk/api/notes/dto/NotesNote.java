package com.vk.sdk.api.notes.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class NotesNote {

    @b("can_comment")
    @Nullable
    private final BaseBoolInt canComment;

    @b(UserFeedback.JsonKeys.COMMENTS)
    private final int comments;

    @b("date")
    private final int date;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15206id;

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
    @Nullable
    private final Integer readComments;

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

    public NotesNote(int i, int i10, int i11, @NotNull UserId ownerId, @NotNull String title, @NotNull String viewUrl, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        this.comments = i;
        this.date = i10;
        this.f15206id = i11;
        this.ownerId = ownerId;
        this.title = title;
        this.viewUrl = viewUrl;
        this.readComments = num;
        this.canComment = baseBoolInt;
        this.text = str;
        this.textWiki = str2;
        this.privacyView = list;
        this.privacyComment = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotesNote copy$default(NotesNote notesNote, int i, int i10, int i11, UserId userId, String str, String str2, Integer num, BaseBoolInt baseBoolInt, String str3, String str4, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = notesNote.comments;
        }
        if ((i12 & 2) != 0) {
            i10 = notesNote.date;
        }
        if ((i12 & 4) != 0) {
            i11 = notesNote.f15206id;
        }
        if ((i12 & 8) != 0) {
            userId = notesNote.ownerId;
        }
        if ((i12 & 16) != 0) {
            str = notesNote.title;
        }
        if ((i12 & 32) != 0) {
            str2 = notesNote.viewUrl;
        }
        if ((i12 & 64) != 0) {
            num = notesNote.readComments;
        }
        if ((i12 & 128) != 0) {
            baseBoolInt = notesNote.canComment;
        }
        if ((i12 & 256) != 0) {
            str3 = notesNote.text;
        }
        if ((i12 & 512) != 0) {
            str4 = notesNote.textWiki;
        }
        if ((i12 & 1024) != 0) {
            list = notesNote.privacyView;
        }
        if ((i12 & 2048) != 0) {
            list2 = notesNote.privacyComment;
        }
        List list3 = list;
        List list4 = list2;
        String str5 = str3;
        String str6 = str4;
        Integer num2 = num;
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        String str7 = str;
        String str8 = str2;
        return notesNote.copy(i, i10, i11, userId, str7, str8, num2, baseBoolInt2, str5, str6, list3, list4);
    }

    public final int component1() {
        return this.comments;
    }

    @Nullable
    public final String component10() {
        return this.textWiki;
    }

    @Nullable
    public final List<String> component11() {
        return this.privacyView;
    }

    @Nullable
    public final List<String> component12() {
        return this.privacyComment;
    }

    public final int component2() {
        return this.date;
    }

    public final int component3() {
        return this.f15206id;
    }

    @NotNull
    public final UserId component4() {
        return this.ownerId;
    }

    @NotNull
    public final String component5() {
        return this.title;
    }

    @NotNull
    public final String component6() {
        return this.viewUrl;
    }

    @Nullable
    public final Integer component7() {
        return this.readComments;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.canComment;
    }

    @Nullable
    public final String component9() {
        return this.text;
    }

    @NotNull
    public final NotesNote copy(int i, int i10, int i11, @NotNull UserId ownerId, @NotNull String title, @NotNull String viewUrl, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        return new NotesNote(i, i10, i11, ownerId, title, viewUrl, num, baseBoolInt, str, str2, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotesNote)) {
            return false;
        }
        NotesNote notesNote = (NotesNote) obj;
        return this.comments == notesNote.comments && this.date == notesNote.date && this.f15206id == notesNote.f15206id && Intrinsics.a(this.ownerId, notesNote.ownerId) && Intrinsics.a(this.title, notesNote.title) && Intrinsics.a(this.viewUrl, notesNote.viewUrl) && Intrinsics.a(this.readComments, notesNote.readComments) && this.canComment == notesNote.canComment && Intrinsics.a(this.text, notesNote.text) && Intrinsics.a(this.textWiki, notesNote.textWiki) && Intrinsics.a(this.privacyView, notesNote.privacyView) && Intrinsics.a(this.privacyComment, notesNote.privacyComment);
    }

    @Nullable
    public final BaseBoolInt getCanComment() {
        return this.canComment;
    }

    public final int getComments() {
        return this.comments;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getId() {
        return this.f15206id;
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

    @Nullable
    public final Integer getReadComments() {
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
        int iE = a.e(a.e(o.e(this.ownerId, u.g(this.f15206id, u.g(this.date, Integer.hashCode(this.comments) * 31, 31), 31), 31), 31, this.title), 31, this.viewUrl);
        Integer num = this.readComments;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode2 = (iHashCode + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textWiki;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.privacyView;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.privacyComment;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.comments;
        int i10 = this.date;
        int i11 = this.f15206id;
        UserId userId = this.ownerId;
        String str = this.title;
        String str2 = this.viewUrl;
        Integer num = this.readComments;
        BaseBoolInt baseBoolInt = this.canComment;
        String str3 = this.text;
        String str4 = this.textWiki;
        List<String> list = this.privacyView;
        List<String> list2 = this.privacyComment;
        StringBuilder sbI = z.i("NotesNote(comments=", i, ", date=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", title=");
        o.t(sbI, str, ", viewUrl=", str2, ", readComments=");
        sbI.append(num);
        sbI.append(", canComment=");
        sbI.append(baseBoolInt);
        sbI.append(", text=");
        o.t(sbI, str3, ", textWiki=", str4, ", privacyView=");
        return a.l(sbI, list, ", privacyComment=", list2, ")");
    }

    public /* synthetic */ NotesNote(int i, int i10, int i11, UserId userId, String str, String str2, Integer num, BaseBoolInt baseBoolInt, String str3, String str4, List list, List list2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, str, str2, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : baseBoolInt, (i12 & 256) != 0 ? null : str3, (i12 & 512) != 0 ? null : str4, (i12 & 1024) != 0 ? null : list, (i12 & 2048) != 0 ? null : list2);
    }
}
