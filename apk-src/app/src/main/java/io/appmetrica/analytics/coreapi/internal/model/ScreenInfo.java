package io.appmetrica.analytics.coreapi.internal.model;

import a0.u;
import kotlin.Metadata;
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
public final class ScreenInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f21728d;

    public ScreenInfo(int i, int i10, int i11, float f10) {
        this.f21725a = i;
        this.f21726b = i10;
        this.f21727c = i11;
        this.f21728d = f10;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i, int i10, int i11, float f10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = screenInfo.f21725a;
        }
        if ((i12 & 2) != 0) {
            i10 = screenInfo.f21726b;
        }
        if ((i12 & 4) != 0) {
            i11 = screenInfo.f21727c;
        }
        if ((i12 & 8) != 0) {
            f10 = screenInfo.f21728d;
        }
        return screenInfo.copy(i, i10, i11, f10);
    }

    public final int component1() {
        return this.f21725a;
    }

    public final int component2() {
        return this.f21726b;
    }

    public final int component3() {
        return this.f21727c;
    }

    public final float component4() {
        return this.f21728d;
    }

    @NotNull
    public final ScreenInfo copy(int i, int i10, int i11, float f10) {
        return new ScreenInfo(i, i10, i11, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f21725a == screenInfo.f21725a && this.f21726b == screenInfo.f21726b && this.f21727c == screenInfo.f21727c && Float.valueOf(this.f21728d).equals(Float.valueOf(screenInfo.f21728d));
    }

    public final int getDpi() {
        return this.f21727c;
    }

    public final int getHeight() {
        return this.f21726b;
    }

    public final float getScaleFactor() {
        return this.f21728d;
    }

    public final int getWidth() {
        return this.f21725a;
    }

    public int hashCode() {
        return Float.hashCode(this.f21728d) + u.g(this.f21727c, u.g(this.f21726b, Integer.hashCode(this.f21725a) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "ScreenInfo(width=" + this.f21725a + ", height=" + this.f21726b + ", dpi=" + this.f21727c + ", scaleFactor=" + this.f21728d + ')';
    }
}
