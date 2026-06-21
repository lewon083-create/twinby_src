package com.vk.sdk.api.stories.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class StoriesStoryLink {

    @b("link_url_target")
    @Nullable
    private final String linkUrlTarget;

    @b("text")
    @NotNull
    private final String text;

    @b("url")
    @NotNull
    private final String url;

    public StoriesStoryLink(@NotNull String text, @NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url, "url");
        this.text = text;
        this.url = url;
        this.linkUrlTarget = str;
    }

    public static /* synthetic */ StoriesStoryLink copy$default(StoriesStoryLink storiesStoryLink, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storiesStoryLink.text;
        }
        if ((i & 2) != 0) {
            str2 = storiesStoryLink.url;
        }
        if ((i & 4) != 0) {
            str3 = storiesStoryLink.linkUrlTarget;
        }
        return storiesStoryLink.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @Nullable
    public final String component3() {
        return this.linkUrlTarget;
    }

    @NotNull
    public final StoriesStoryLink copy(@NotNull String text, @NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url, "url");
        return new StoriesStoryLink(text, url, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryLink)) {
            return false;
        }
        StoriesStoryLink storiesStoryLink = (StoriesStoryLink) obj;
        return Intrinsics.a(this.text, storiesStoryLink.text) && Intrinsics.a(this.url, storiesStoryLink.url) && Intrinsics.a(this.linkUrlTarget, storiesStoryLink.linkUrlTarget);
    }

    @Nullable
    public final String getLinkUrlTarget() {
        return this.linkUrlTarget;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iE = a.e(this.text.hashCode() * 31, 31, this.url);
        String str = this.linkUrlTarget;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.url;
        return u.o(z.j("StoriesStoryLink(text=", str, ", url=", str2, ", linkUrlTarget="), this.linkUrlTarget, ")");
    }

    public /* synthetic */ StoriesStoryLink(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
