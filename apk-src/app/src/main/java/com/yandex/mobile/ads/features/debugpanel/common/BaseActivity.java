package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import hk.a0;
import hk.c0;
import kotlin.Metadata;
import yads.al3;
import yads.m70;
import yads.mc1;
import yads.mn;
import yads.z10;
import yi.f0;

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
public abstract class BaseActivity<T extends mc1> extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f15281a = z10.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mc1 f15282c;

    public BaseActivity() {
        getLastNonConfigurationInstance();
    }

    public final a0 a() {
        return this.f15281a;
    }

    public final mc1 b() {
        mc1 mc1Var = this.f15282c;
        if (mc1Var != null) {
            return mc1Var;
        }
        mc1 mc1VarA = m70.a((m70) ((f0) c()).f45657c);
        this.f15282c = mc1VarA;
        return mc1VarA;
    }

    public abstract al3 c();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        mn mnVar = lastNonConfigurationInstance instanceof mn ? (mn) lastNonConfigurationInstance : null;
        if (mnVar != null) {
            mc1 mc1Var = mnVar.f40969a;
            this.f15282c = mc1Var != null ? mc1Var : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        mc1 mc1Var;
        super.onDestroy();
        c0.d(this.f15281a);
        if (isChangingConfigurations() || (mc1Var = this.f15282c) == null) {
            return;
        }
        c0.d(mc1Var.f40859a);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new mn(b());
    }
}
