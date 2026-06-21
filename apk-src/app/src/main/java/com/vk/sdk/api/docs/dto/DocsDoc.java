package com.vk.sdk.api.docs.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
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
public final class DocsDoc {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("date")
    private final int date;

    @b("ext")
    @NotNull
    private final String ext;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15164id;

    @b("is_licensed")
    @Nullable
    private final BaseBoolInt isLicensed;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("preview")
    @Nullable
    private final DocsDocPreview preview;

    @b(RRWebVideoEvent.JsonKeys.SIZE)
    private final int size;

    @b("tags")
    @Nullable
    private final List<String> tags;

    @b("title")
    @NotNull
    private final String title;

    @b("type")
    private final int type;

    @b("url")
    @Nullable
    private final String url;

    public DocsDoc(int i, @NotNull UserId ownerId, @NotNull String title, int i10, @NotNull String ext, int i11, int i12, @Nullable String str, @Nullable DocsDocPreview docsDocPreview, @Nullable BaseBoolInt baseBoolInt, @Nullable String str2, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ext, "ext");
        this.f15164id = i;
        this.ownerId = ownerId;
        this.title = title;
        this.size = i10;
        this.ext = ext;
        this.date = i11;
        this.type = i12;
        this.url = str;
        this.preview = docsDocPreview;
        this.isLicensed = baseBoolInt;
        this.accessKey = str2;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocsDoc copy$default(DocsDoc docsDoc, int i, UserId userId, String str, int i10, String str2, int i11, int i12, String str3, DocsDocPreview docsDocPreview, BaseBoolInt baseBoolInt, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = docsDoc.f15164id;
        }
        if ((i13 & 2) != 0) {
            userId = docsDoc.ownerId;
        }
        if ((i13 & 4) != 0) {
            str = docsDoc.title;
        }
        if ((i13 & 8) != 0) {
            i10 = docsDoc.size;
        }
        if ((i13 & 16) != 0) {
            str2 = docsDoc.ext;
        }
        if ((i13 & 32) != 0) {
            i11 = docsDoc.date;
        }
        if ((i13 & 64) != 0) {
            i12 = docsDoc.type;
        }
        if ((i13 & 128) != 0) {
            str3 = docsDoc.url;
        }
        if ((i13 & 256) != 0) {
            docsDocPreview = docsDoc.preview;
        }
        if ((i13 & 512) != 0) {
            baseBoolInt = docsDoc.isLicensed;
        }
        if ((i13 & 1024) != 0) {
            str4 = docsDoc.accessKey;
        }
        if ((i13 & 2048) != 0) {
            list = docsDoc.tags;
        }
        String str5 = str4;
        List list2 = list;
        DocsDocPreview docsDocPreview2 = docsDocPreview;
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        int i14 = i12;
        String str6 = str3;
        String str7 = str2;
        int i15 = i11;
        return docsDoc.copy(i, userId, str, i10, str7, i15, i14, str6, docsDocPreview2, baseBoolInt2, str5, list2);
    }

    public final int component1() {
        return this.f15164id;
    }

    @Nullable
    public final BaseBoolInt component10() {
        return this.isLicensed;
    }

    @Nullable
    public final String component11() {
        return this.accessKey;
    }

    @Nullable
    public final List<String> component12() {
        return this.tags;
    }

    @NotNull
    public final UserId component2() {
        return this.ownerId;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.size;
    }

    @NotNull
    public final String component5() {
        return this.ext;
    }

    public final int component6() {
        return this.date;
    }

    public final int component7() {
        return this.type;
    }

    @Nullable
    public final String component8() {
        return this.url;
    }

    @Nullable
    public final DocsDocPreview component9() {
        return this.preview;
    }

    @NotNull
    public final DocsDoc copy(int i, @NotNull UserId ownerId, @NotNull String title, int i10, @NotNull String ext, int i11, int i12, @Nullable String str, @Nullable DocsDocPreview docsDocPreview, @Nullable BaseBoolInt baseBoolInt, @Nullable String str2, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ext, "ext");
        return new DocsDoc(i, ownerId, title, i10, ext, i11, i12, str, docsDocPreview, baseBoolInt, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDoc)) {
            return false;
        }
        DocsDoc docsDoc = (DocsDoc) obj;
        return this.f15164id == docsDoc.f15164id && Intrinsics.a(this.ownerId, docsDoc.ownerId) && Intrinsics.a(this.title, docsDoc.title) && this.size == docsDoc.size && Intrinsics.a(this.ext, docsDoc.ext) && this.date == docsDoc.date && this.type == docsDoc.type && Intrinsics.a(this.url, docsDoc.url) && Intrinsics.a(this.preview, docsDoc.preview) && this.isLicensed == docsDoc.isLicensed && Intrinsics.a(this.accessKey, docsDoc.accessKey) && Intrinsics.a(this.tags, docsDoc.tags);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final String getExt() {
        return this.ext;
    }

    public final int getId() {
        return this.f15164id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final DocsDocPreview getPreview() {
        return this.preview;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iG = u.g(this.type, u.g(this.date, a.e(u.g(this.size, a.e(o.e(this.ownerId, Integer.hashCode(this.f15164id) * 31, 31), 31, this.title), 31), 31, this.ext), 31), 31);
        String str = this.url;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        DocsDocPreview docsDocPreview = this.preview;
        int iHashCode2 = (iHashCode + (docsDocPreview == null ? 0 : docsDocPreview.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.isLicensed;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        String str2 = this.accessKey;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.tags;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final BaseBoolInt isLicensed() {
        return this.isLicensed;
    }

    @NotNull
    public String toString() {
        int i = this.f15164id;
        UserId userId = this.ownerId;
        String str = this.title;
        int i10 = this.size;
        String str2 = this.ext;
        int i11 = this.date;
        int i12 = this.type;
        String str3 = this.url;
        DocsDocPreview docsDocPreview = this.preview;
        BaseBoolInt baseBoolInt = this.isLicensed;
        String str4 = this.accessKey;
        List<String> list = this.tags;
        StringBuilder sb2 = new StringBuilder("DocsDoc(id=");
        sb2.append(i);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", title=");
        o.p(i10, str, ", size=", ", ext=", sb2);
        o.p(i11, str2, ", date=", ", type=", sb2);
        a.q(i12, ", url=", str3, ", preview=", sb2);
        sb2.append(docsDocPreview);
        sb2.append(", isLicensed=");
        sb2.append(baseBoolInt);
        sb2.append(", accessKey=");
        sb2.append(str4);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ DocsDoc(int i, UserId userId, String str, int i10, String str2, int i11, int i12, String str3, DocsDocPreview docsDocPreview, BaseBoolInt baseBoolInt, String str4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, str, i10, str2, i11, i12, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? null : docsDocPreview, (i13 & 512) != 0 ? null : baseBoolInt, (i13 & 1024) != 0 ? null : str4, (i13 & 2048) != 0 ? null : list);
    }
}
