package com.vk.sdk.api.newsfeed.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class NewsfeedExpertCardWidgetRating {

    @b("highlighted")
    @Nullable
    private final Boolean highlighted;

    @b("value")
    @Nullable
    private final Float value;

    public NewsfeedExpertCardWidgetRating() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NewsfeedExpertCardWidgetRating copy$default(NewsfeedExpertCardWidgetRating newsfeedExpertCardWidgetRating, Float f10, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = newsfeedExpertCardWidgetRating.value;
        }
        if ((i & 2) != 0) {
            bool = newsfeedExpertCardWidgetRating.highlighted;
        }
        return newsfeedExpertCardWidgetRating.copy(f10, bool);
    }

    @Nullable
    public final Float component1() {
        return this.value;
    }

    @Nullable
    public final Boolean component2() {
        return this.highlighted;
    }

    @NotNull
    public final NewsfeedExpertCardWidgetRating copy(@Nullable Float f10, @Nullable Boolean bool) {
        return new NewsfeedExpertCardWidgetRating(f10, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedExpertCardWidgetRating)) {
            return false;
        }
        NewsfeedExpertCardWidgetRating newsfeedExpertCardWidgetRating = (NewsfeedExpertCardWidgetRating) obj;
        return Intrinsics.a(this.value, newsfeedExpertCardWidgetRating.value) && Intrinsics.a(this.highlighted, newsfeedExpertCardWidgetRating.highlighted);
    }

    @Nullable
    public final Boolean getHighlighted() {
        return this.highlighted;
    }

    @Nullable
    public final Float getValue() {
        return this.value;
    }

    public int hashCode() {
        Float f10 = this.value;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        Boolean bool = this.highlighted;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewsfeedExpertCardWidgetRating(value=" + this.value + ", highlighted=" + this.highlighted + ")";
    }

    public NewsfeedExpertCardWidgetRating(@Nullable Float f10, @Nullable Boolean bool) {
        this.value = f10;
        this.highlighted = bool;
    }

    public /* synthetic */ NewsfeedExpertCardWidgetRating(Float f10, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f10, (i & 2) != 0 ? null : bool);
    }
}
