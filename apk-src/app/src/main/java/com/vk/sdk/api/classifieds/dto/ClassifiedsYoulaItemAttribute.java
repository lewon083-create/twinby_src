package com.vk.sdk.api.classifieds.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
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
public final class ClassifiedsYoulaItemAttribute {

    @b("slug")
    @NotNull
    private final String slug;

    @b("title")
    @NotNull
    private final String title;

    @b("type")
    @NotNull
    private final String type;

    @b("value")
    @NotNull
    private final String value;

    public ClassifiedsYoulaItemAttribute(@NotNull String title, @NotNull String slug, @NotNull String type, @NotNull String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.slug = slug;
        this.type = type;
        this.value = value;
    }

    public static /* synthetic */ ClassifiedsYoulaItemAttribute copy$default(ClassifiedsYoulaItemAttribute classifiedsYoulaItemAttribute, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classifiedsYoulaItemAttribute.title;
        }
        if ((i & 2) != 0) {
            str2 = classifiedsYoulaItemAttribute.slug;
        }
        if ((i & 4) != 0) {
            str3 = classifiedsYoulaItemAttribute.type;
        }
        if ((i & 8) != 0) {
            str4 = classifiedsYoulaItemAttribute.value;
        }
        return classifiedsYoulaItemAttribute.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.slug;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final String component4() {
        return this.value;
    }

    @NotNull
    public final ClassifiedsYoulaItemAttribute copy(@NotNull String title, @NotNull String slug, @NotNull String type, @NotNull String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ClassifiedsYoulaItemAttribute(title, slug, type, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemAttribute)) {
            return false;
        }
        ClassifiedsYoulaItemAttribute classifiedsYoulaItemAttribute = (ClassifiedsYoulaItemAttribute) obj;
        return Intrinsics.a(this.title, classifiedsYoulaItemAttribute.title) && Intrinsics.a(this.slug, classifiedsYoulaItemAttribute.slug) && Intrinsics.a(this.type, classifiedsYoulaItemAttribute.type) && Intrinsics.a(this.value, classifiedsYoulaItemAttribute.value);
    }

    @NotNull
    public final String getSlug() {
        return this.slug;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + a.e(a.e(this.title.hashCode() * 31, 31, this.slug), 31, this.type);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.slug;
        return om1.n(z.j("ClassifiedsYoulaItemAttribute(title=", str, ", slug=", str2, ", type="), this.type, ", value=", this.value, ")");
    }
}
