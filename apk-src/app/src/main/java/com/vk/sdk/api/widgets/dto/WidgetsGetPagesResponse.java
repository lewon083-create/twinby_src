package com.vk.sdk.api.widgets.dto;

import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
public final class WidgetsGetPagesResponse {

    @b("count")
    private final int count;

    @b("pages")
    @NotNull
    private final List<WidgetsWidgetPage> pages;

    public WidgetsGetPagesResponse(int i, @NotNull List<WidgetsWidgetPage> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.count = i;
        this.pages = pages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WidgetsGetPagesResponse copy$default(WidgetsGetPagesResponse widgetsGetPagesResponse, int i, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = widgetsGetPagesResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = widgetsGetPagesResponse.pages;
        }
        return widgetsGetPagesResponse.copy(i, list);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<WidgetsWidgetPage> component2() {
        return this.pages;
    }

    @NotNull
    public final WidgetsGetPagesResponse copy(int i, @NotNull List<WidgetsWidgetPage> pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new WidgetsGetPagesResponse(i, pages);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsGetPagesResponse)) {
            return false;
        }
        WidgetsGetPagesResponse widgetsGetPagesResponse = (WidgetsGetPagesResponse) obj;
        return this.count == widgetsGetPagesResponse.count && Intrinsics.a(this.pages, widgetsGetPagesResponse.pages);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<WidgetsWidgetPage> getPages() {
        return this.pages;
    }

    public int hashCode() {
        return this.pages.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    @NotNull
    public String toString() {
        return a.h(this.count, "WidgetsGetPagesResponse(count=", ", pages=", ")", this.pages);
    }
}
