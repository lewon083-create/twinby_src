package com.yandex.mobile.ads.features.debugpanel.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import gh.a;
import hk.a0;
import hk.c0;
import ij.g;
import ij.h;
import java.util.Iterator;
import kotlin.Metadata;
import yads.al3;
import yads.b90;
import yads.bc1;
import yads.cc1;
import yads.e90;
import yads.ec1;
import yads.et;
import yads.m70;
import yads.mc1;
import yads.o90;
import yads.q90;
import yads.xb1;
import yads.y80;
import yads.z70;
import yads.zb1;
import zl.g1;

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
public final class IntegrationInspectorActivity extends BaseActivity<mc1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f15283d = h.b(new xb1(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f15284e = h.b(new ec1(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f15285f = h.b(new cc1(this));

    public static final m70 a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (m70) integrationInspectorActivity.f15283d.getValue();
    }

    public static final o90 b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (o90) integrationInspectorActivity.f15285f.getValue();
    }

    public static final q90 c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (q90) integrationInspectorActivity.f15284e.getValue();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(b90.f36966a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_debug);
        d();
        b().a(y80.f44949a);
        a0 a0VarA = a();
        c0.m(a0VarA, null, new zb1(this, null), 3);
        c0.m(a0VarA, null, new bc1(this, null), 3);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onDestroy() {
        z70 z70Var = (z70) ((m70) this.f15283d.getValue()).f40828r.getValue();
        Iterator it = z70Var.f45270b.iterator();
        while (it.hasNext()) {
            ((g1) ((et) it.next())).a();
        }
        z70Var.f45270b.clear();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        integrationInspectorActivity.b().a(e90.f38047a);
    }

    private final void d() {
        ((ImageButton) findViewById(R$id.toolbar_share_button)).setOnClickListener(new a(0, this));
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final al3 c() {
        return ((m70) this.f15283d.getValue()).a();
    }
}
