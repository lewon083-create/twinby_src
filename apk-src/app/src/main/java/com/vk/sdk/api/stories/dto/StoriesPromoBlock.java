package com.vk.sdk.api.stories.dto;

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
public final class StoriesPromoBlock {

    @b("name")
    @NotNull
    private final String name;

    @b("not_animated")
    private final boolean notAnimated;

    @b("photo_100")
    @NotNull
    private final String photo100;

    @b("photo_50")
    @NotNull
    private final String photo50;

    public StoriesPromoBlock(@NotNull String name, @NotNull String photo50, @NotNull String photo100, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        this.name = name;
        this.photo50 = photo50;
        this.photo100 = photo100;
        this.notAnimated = z5;
    }

    public static /* synthetic */ StoriesPromoBlock copy$default(StoriesPromoBlock storiesPromoBlock, String str, String str2, String str3, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storiesPromoBlock.name;
        }
        if ((i & 2) != 0) {
            str2 = storiesPromoBlock.photo50;
        }
        if ((i & 4) != 0) {
            str3 = storiesPromoBlock.photo100;
        }
        if ((i & 8) != 0) {
            z5 = storiesPromoBlock.notAnimated;
        }
        return storiesPromoBlock.copy(str, str2, str3, z5);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.photo50;
    }

    @NotNull
    public final String component3() {
        return this.photo100;
    }

    public final boolean component4() {
        return this.notAnimated;
    }

    @NotNull
    public final StoriesPromoBlock copy(@NotNull String name, @NotNull String photo50, @NotNull String photo100, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        return new StoriesPromoBlock(name, photo50, photo100, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesPromoBlock)) {
            return false;
        }
        StoriesPromoBlock storiesPromoBlock = (StoriesPromoBlock) obj;
        return Intrinsics.a(this.name, storiesPromoBlock.name) && Intrinsics.a(this.photo50, storiesPromoBlock.photo50) && Intrinsics.a(this.photo100, storiesPromoBlock.photo100) && this.notAnimated == storiesPromoBlock.notAnimated;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getNotAnimated() {
        return this.notAnimated;
    }

    @NotNull
    public final String getPhoto100() {
        return this.photo100;
    }

    @NotNull
    public final String getPhoto50() {
        return this.photo50;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iE = a.e(a.e(this.name.hashCode() * 31, 31, this.photo50), 31, this.photo100);
        boolean z5 = this.notAnimated;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        return iE + r12;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.photo50;
        String str3 = this.photo100;
        boolean z5 = this.notAnimated;
        StringBuilder sbJ = z.j("StoriesPromoBlock(name=", str, ", photo50=", str2, ", photo100=");
        sbJ.append(str3);
        sbJ.append(", notAnimated=");
        sbJ.append(z5);
        sbJ.append(")");
        return sbJ.toString();
    }
}
