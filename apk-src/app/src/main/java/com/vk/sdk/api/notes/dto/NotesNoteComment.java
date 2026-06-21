package com.vk.sdk.api.notes.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
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
public final class NotesNoteComment {

    @b("date")
    private final int date;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15207id;

    @b("message")
    @NotNull
    private final String message;

    @b("nid")
    private final int nid;

    @b("oid")
    private final int oid;

    @b("reply_to")
    @Nullable
    private final Integer replyTo;

    @b("uid")
    private final int uid;

    public NotesNoteComment(int i, int i10, @NotNull String message, int i11, int i12, int i13, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.date = i;
        this.f15207id = i10;
        this.message = message;
        this.nid = i11;
        this.oid = i12;
        this.uid = i13;
        this.replyTo = num;
    }

    public static /* synthetic */ NotesNoteComment copy$default(NotesNoteComment notesNoteComment, int i, int i10, String str, int i11, int i12, int i13, Integer num, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i = notesNoteComment.date;
        }
        if ((i14 & 2) != 0) {
            i10 = notesNoteComment.f15207id;
        }
        if ((i14 & 4) != 0) {
            str = notesNoteComment.message;
        }
        if ((i14 & 8) != 0) {
            i11 = notesNoteComment.nid;
        }
        if ((i14 & 16) != 0) {
            i12 = notesNoteComment.oid;
        }
        if ((i14 & 32) != 0) {
            i13 = notesNoteComment.uid;
        }
        if ((i14 & 64) != 0) {
            num = notesNoteComment.replyTo;
        }
        int i15 = i13;
        Integer num2 = num;
        int i16 = i12;
        String str2 = str;
        return notesNoteComment.copy(i, i10, str2, i11, i16, i15, num2);
    }

    public final int component1() {
        return this.date;
    }

    public final int component2() {
        return this.f15207id;
    }

    @NotNull
    public final String component3() {
        return this.message;
    }

    public final int component4() {
        return this.nid;
    }

    public final int component5() {
        return this.oid;
    }

    public final int component6() {
        return this.uid;
    }

    @Nullable
    public final Integer component7() {
        return this.replyTo;
    }

    @NotNull
    public final NotesNoteComment copy(int i, int i10, @NotNull String message, int i11, int i12, int i13, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new NotesNoteComment(i, i10, message, i11, i12, i13, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotesNoteComment)) {
            return false;
        }
        NotesNoteComment notesNoteComment = (NotesNoteComment) obj;
        return this.date == notesNoteComment.date && this.f15207id == notesNoteComment.f15207id && Intrinsics.a(this.message, notesNoteComment.message) && this.nid == notesNoteComment.nid && this.oid == notesNoteComment.oid && this.uid == notesNoteComment.uid && Intrinsics.a(this.replyTo, notesNoteComment.replyTo);
    }

    public final int getDate() {
        return this.date;
    }

    public final int getId() {
        return this.f15207id;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getNid() {
        return this.nid;
    }

    public final int getOid() {
        return this.oid;
    }

    @Nullable
    public final Integer getReplyTo() {
        return this.replyTo;
    }

    public final int getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iG = u.g(this.uid, u.g(this.oid, u.g(this.nid, a.e(u.g(this.f15207id, Integer.hashCode(this.date) * 31, 31), 31, this.message), 31), 31), 31);
        Integer num = this.replyTo;
        return iG + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.date;
        int i10 = this.f15207id;
        String str = this.message;
        int i11 = this.nid;
        int i12 = this.oid;
        int i13 = this.uid;
        Integer num = this.replyTo;
        StringBuilder sbI = z.i("NotesNoteComment(date=", i, ", id=", i10, ", message=");
        o.p(i11, str, ", nid=", ", oid=", sbI);
        om1.t(sbI, i12, ", uid=", i13, ", replyTo=");
        return u.m(sbI, num, ")");
    }

    public /* synthetic */ NotesNoteComment(int i, int i10, String str, int i11, int i12, int i13, Integer num, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, str, i11, i12, i13, (i14 & 64) != 0 ? null : num);
    }
}
