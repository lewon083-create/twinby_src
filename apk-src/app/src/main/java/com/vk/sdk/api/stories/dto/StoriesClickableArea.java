package com.vk.sdk.api.stories.dto;

import com.google.android.gms.internal.ads.om1;
import kotlin.Metadata;
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
public final class StoriesClickableArea {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b("x")
    private final int f15234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b("y")
    private final int f15235y;

    public StoriesClickableArea(int i, int i10) {
        this.f15234x = i;
        this.f15235y = i10;
    }

    public static /* synthetic */ StoriesClickableArea copy$default(StoriesClickableArea storiesClickableArea, int i, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = storiesClickableArea.f15234x;
        }
        if ((i11 & 2) != 0) {
            i10 = storiesClickableArea.f15235y;
        }
        return storiesClickableArea.copy(i, i10);
    }

    public final int component1() {
        return this.f15234x;
    }

    public final int component2() {
        return this.f15235y;
    }

    @NotNull
    public final StoriesClickableArea copy(int i, int i10) {
        return new StoriesClickableArea(i, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableArea)) {
            return false;
        }
        StoriesClickableArea storiesClickableArea = (StoriesClickableArea) obj;
        return this.f15234x == storiesClickableArea.f15234x && this.f15235y == storiesClickableArea.f15235y;
    }

    public final int getX() {
        return this.f15234x;
    }

    public final int getY() {
        return this.f15235y;
    }

    public int hashCode() {
        return Integer.hashCode(this.f15235y) + (Integer.hashCode(this.f15234x) * 31);
    }

    @NotNull
    public String toString() {
        return om1.j("StoriesClickableArea(x=", this.f15234x, ", y=", this.f15235y, ")");
    }
}
