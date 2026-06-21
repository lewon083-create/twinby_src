package androidx.lifecycle;

import a0.d1;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ProcessLifecycleOwner implements u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProcessLifecycleOwner f1526j = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1528c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f1531f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1529d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1530e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f1532g = new w(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d1 f1533h = new d1(5, this);
    public final v7.f i = new v7.f(4, this);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i = this.f1528c + 1;
        this.f1528c = i;
        if (i == 1) {
            if (this.f1529d) {
                this.f1532g.e(n.ON_RESUME);
                this.f1529d = false;
            } else {
                Handler handler = this.f1531f;
                Intrinsics.b(handler);
                handler.removeCallbacks(this.f1533h);
            }
        }
    }

    @Override // androidx.lifecycle.u
    public final p getLifecycle() {
        return this.f1532g;
    }
}
