package kotlin;

import ij.f;
import kotlin.jvm.internal.Intrinsics;
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
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;

    @NotNull
    public static final f Companion = new f(null);

    @NotNull
    public static final KotlinVersion CURRENT = new KotlinVersion(2, 2, 0);

    public KotlinVersion(int i, int i10, int i11) {
        this.major = i;
        this.minor = i10;
        this.patch = i11;
        this.version = versionOf(i, i10, i11);
    }

    private final int versionOf(int i, int i10, int i11) {
        if (i >= 0 && i < 256 && i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256) {
            return (i << 16) + (i10 << 8) + i11;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i10 + '.' + i11).toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i, int i10) {
        int i11 = this.major;
        if (i11 <= i) {
            return i11 == i && this.minor >= i10;
        }
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public KotlinVersion(int i, int i10) {
        this(i, i10, 0);
    }

    public final boolean isAtLeast(int i, int i10, int i11) {
        int i12 = this.major;
        if (i12 > i) {
            return true;
        }
        if (i12 != i) {
            return false;
        }
        int i13 = this.minor;
        if (i13 <= i10) {
            return i13 == i10 && this.patch >= i11;
        }
        return true;
    }
}
