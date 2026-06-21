package com.google.firebase;

import bf.i;
import com.google.firebase.components.ComponentRegistrar;
import fd.h;
import hk.x;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import ld.a;
import ld.c;
import ld.d;
import md.b;
import md.q;

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
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        i iVarB = b.b(new q(a.class, x.class));
        iVarB.d(new md.i(new q(a.class, Executor.class), 1, 0));
        iVarB.f2119e = h.f16767c;
        b bVarE = iVarB.e();
        Intrinsics.checkNotNullExpressionValue(bVarE, "build(...)");
        i iVarB2 = b.b(new q(c.class, x.class));
        iVarB2.d(new md.i(new q(c.class, Executor.class), 1, 0));
        iVarB2.f2119e = h.f16768d;
        b bVarE2 = iVarB2.e();
        Intrinsics.checkNotNullExpressionValue(bVarE2, "build(...)");
        i iVarB3 = b.b(new q(ld.b.class, x.class));
        iVarB3.d(new md.i(new q(ld.b.class, Executor.class), 1, 0));
        iVarB3.f2119e = h.f16769e;
        b bVarE3 = iVarB3.e();
        Intrinsics.checkNotNullExpressionValue(bVarE3, "build(...)");
        i iVarB4 = b.b(new q(d.class, x.class));
        iVarB4.d(new md.i(new q(d.class, Executor.class), 1, 0));
        iVarB4.f2119e = h.f16770f;
        b bVarE4 = iVarB4.e();
        Intrinsics.checkNotNullExpressionValue(bVarE4, "build(...)");
        return s.f(bVarE, bVarE2, bVarE3, bVarE4);
    }
}
