package com.vk.sdk.api.pages.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.Metadata;
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
public final class PagesWikipageHistory {

    @b("date")
    private final int date;

    @b("editor_id")
    private final int editorId;

    @b("editor_name")
    @NotNull
    private final String editorName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15214id;

    @b(SentryEnvelopeItemHeader.JsonKeys.LENGTH)
    private final int length;

    public PagesWikipageHistory(int i, int i10, int i11, int i12, @NotNull String editorName) {
        Intrinsics.checkNotNullParameter(editorName, "editorName");
        this.f15214id = i;
        this.length = i10;
        this.date = i11;
        this.editorId = i12;
        this.editorName = editorName;
    }

    public static /* synthetic */ PagesWikipageHistory copy$default(PagesWikipageHistory pagesWikipageHistory, int i, int i10, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = pagesWikipageHistory.f15214id;
        }
        if ((i13 & 2) != 0) {
            i10 = pagesWikipageHistory.length;
        }
        if ((i13 & 4) != 0) {
            i11 = pagesWikipageHistory.date;
        }
        if ((i13 & 8) != 0) {
            i12 = pagesWikipageHistory.editorId;
        }
        if ((i13 & 16) != 0) {
            str = pagesWikipageHistory.editorName;
        }
        String str2 = str;
        int i14 = i11;
        return pagesWikipageHistory.copy(i, i10, i14, i12, str2);
    }

    public final int component1() {
        return this.f15214id;
    }

    public final int component2() {
        return this.length;
    }

    public final int component3() {
        return this.date;
    }

    public final int component4() {
        return this.editorId;
    }

    @NotNull
    public final String component5() {
        return this.editorName;
    }

    @NotNull
    public final PagesWikipageHistory copy(int i, int i10, int i11, int i12, @NotNull String editorName) {
        Intrinsics.checkNotNullParameter(editorName, "editorName");
        return new PagesWikipageHistory(i, i10, i11, i12, editorName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagesWikipageHistory)) {
            return false;
        }
        PagesWikipageHistory pagesWikipageHistory = (PagesWikipageHistory) obj;
        return this.f15214id == pagesWikipageHistory.f15214id && this.length == pagesWikipageHistory.length && this.date == pagesWikipageHistory.date && this.editorId == pagesWikipageHistory.editorId && Intrinsics.a(this.editorName, pagesWikipageHistory.editorName);
    }

    public final int getDate() {
        return this.date;
    }

    public final int getEditorId() {
        return this.editorId;
    }

    @NotNull
    public final String getEditorName() {
        return this.editorName;
    }

    public final int getId() {
        return this.f15214id;
    }

    public final int getLength() {
        return this.length;
    }

    public int hashCode() {
        return this.editorName.hashCode() + u.g(this.editorId, u.g(this.date, u.g(this.length, Integer.hashCode(this.f15214id) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.f15214id;
        int i10 = this.length;
        int i11 = this.date;
        int i12 = this.editorId;
        String str = this.editorName;
        StringBuilder sbI = z.i("PagesWikipageHistory(id=", i, ", length=", i10, ", date=");
        om1.t(sbI, i11, ", editorId=", i12, ", editorName=");
        return u.o(sbI, str, ")");
    }
}
