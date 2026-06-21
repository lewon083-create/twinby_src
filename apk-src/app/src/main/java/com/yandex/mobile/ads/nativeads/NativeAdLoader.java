package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import hk.c0;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.d10;
import yads.g10;
import yads.g9;
import yads.lu3;
import yads.q02;
import yads.r02;
import yads.st3;
import yads.x02;

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
public class NativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g10 f15286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f15287b = new e();

    public NativeAdLoader(@NotNull Context context) {
        this.f15286a = new g10(context, new lu3(context));
    }

    public final void cancelLoading() {
        this.f15286a.a();
    }

    public final void loadAd(@NotNull NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        g9 g9VarA = this.f15287b.a(nativeAdRequestConfiguration);
        g10 g10Var = this.f15286a;
        c0.m(g10Var.f38616c, null, new d10(g10Var, g9VarA, null), 3);
    }

    public final void setNativeAdLoadListener(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        st3 st3Var = nativeAdLoadListener != null ? new st3(nativeAdLoadListener) : null;
        q02 q02Var = this.f15286a.f38617d;
        q02Var.f42130e.a();
        q02Var.f42131f = st3Var;
        Iterator it = q02Var.f42129d.iterator();
        while (it.hasNext()) {
            x02 x02Var = ((r02) it.next()).f42438b.f41423x;
            x02Var.f44561d = st3Var;
            x02Var.f44560c.a(st3Var, null, null);
        }
    }
}
