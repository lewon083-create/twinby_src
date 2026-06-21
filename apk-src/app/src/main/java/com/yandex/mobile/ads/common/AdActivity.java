package com.yandex.mobile.ads.common;

import android.content.res.Configuration;
import com.google.android.gms.internal.ads.om1;
import d.n;
import java.util.Iterator;
import kotlin.Metadata;
import yads.a2;
import yads.b2;
import yads.ha2;
import yads.w1;

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
public final class AdActivity extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ha2 f15272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f15273b;

    @Override // d.n, android.app.Activity
    public final void onBackPressed() {
        w1 w1Var = this.f15273b;
        if (w1Var == null || w1Var.f44249c.d()) {
            super.onBackPressed();
        }
    }

    @Override // d.n, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f15273b;
        if (w1Var != null) {
            b2 b2Var = w1Var.f44250d;
            b2Var.getClass();
            int i = configuration.orientation;
            if (i != b2Var.f36896c) {
                Iterator it = b2Var.f36894a.iterator();
                if (it.hasNext()) {
                    a2.a(it.next());
                    throw null;
                }
                b2Var.f36896c = i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // d.n, t1.d, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r12) throws java.lang.Throwable {
        /*
            r11 = this;
            super.onCreate(r12)
            yads.b2 r4 = new yads.b2
            r4.<init>(r11)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r11)
            android.content.Intent r5 = r11.getIntent()
            r12 = 0
            if (r5 != 0) goto L17
        L14:
            r3 = r12
            goto L77
        L17:
            android.view.Window r6 = r11.getWindow()
            yads.z1 r0 = yads.y1.a()
            java.lang.String r1 = "data_identifier"
            boolean r1 = r5.hasExtra(r1)     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L37
            java.lang.String r1 = "data_identifier"
            r7 = -1
            long r9 = r5.getLongExtra(r1, r7)     // Catch: java.lang.Exception -> L37
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> L37
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 != 0) goto L38
        L37:
            r1 = r12
        L38:
            if (r1 == 0) goto L44
            long r7 = r1.longValue()
            yads.x1 r0 = r0.a(r7)
            r7 = r0
            goto L45
        L44:
            r7 = r12
        L45:
            if (r7 == 0) goto L4a
            yads.z9 r0 = r7.f44564c     // Catch: java.lang.Exception -> L4a
            goto L4b
        L4a:
            r0 = r12
        L4b:
            yads.q2 r3 = new yads.q2
            r3.<init>(r11, r0)
            yads.j2 r0 = yads.k2.f40047b
            yads.k2 r8 = r0.a()
            monitor-enter(r8)
            java.lang.String r0 = "window_type"
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L75
            java.util.LinkedHashMap r1 = r8.f40049a     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L71
            yads.i2 r0 = (yads.i2) r0     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L75
            r1 = r11
            yads.h2 r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r8)
            r3 = r0
            goto L77
        L71:
            r0 = move-exception
            r12 = r0
            r1 = r11
            goto Lc4
        L75:
            monitor-exit(r8)
            goto L14
        L77:
            if (r3 == 0) goto L85
            yads.w1 r0 = new yads.w1
            yads.kl3 r5 = new yads.kl3
            r5.<init>()
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            goto L87
        L85:
            r1 = r11
            r0 = r12
        L87:
            r1.f15273b = r0
            if (r0 == 0) goto Lae
            yads.h2 r12 = r0.f44249c
            r12.f()
            yads.h2 r12 = r0.f44249c
            r12.c()
            android.widget.RelativeLayout r12 = r0.f44248b
            yads.kl3 r2 = r0.f44251e
            r2.getClass()
            java.lang.String r2 = "root_layout"
            java.lang.String r2 = yads.kl3.a(r2)
            r12.setTag(r2)
            android.app.Activity r12 = r0.f44247a
            android.widget.RelativeLayout r0 = r0.f44248b
            r12.setContentView(r0)
            kotlin.Unit r12 = kotlin.Unit.f27471a
        Lae:
            if (r12 != 0) goto Lb3
            r11.finish()
        Lb3:
            yads.w1 r12 = r1.f15273b
            yads.ha2 r12 = yads.ka2.a(r11, r12)
            r1.f15272a = r12
            if (r12 == 0) goto Lc0
            r12.a()
        Lc0:
            return
        Lc1:
            r0 = move-exception
            r1 = r11
            r12 = r0
        Lc4:
            monitor-exit(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.common.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        w1 w1Var = this.f15273b;
        if (w1Var != null) {
            w1Var.f44249c.onAdClosed();
            w1Var.f44249c.g();
            w1Var.f44248b.removeAllViews();
        }
        ha2 ha2Var = this.f15272a;
        if (ha2Var != null) {
            ha2Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        w1 w1Var = this.f15273b;
        if (w1Var != null) {
            w1Var.f44249c.b();
            Iterator it = w1Var.f44250d.f36895b.iterator();
            if (it.hasNext()) {
                throw om1.i(it);
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        w1 w1Var = this.f15273b;
        if (w1Var != null) {
            w1Var.f44249c.a();
            Iterator it = w1Var.f44250d.f36895b.iterator();
            if (it.hasNext()) {
                throw om1.i(it);
            }
        }
    }
}
