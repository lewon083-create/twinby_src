package com.twinby;

import a0.a0;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import com.google.android.gms.internal.ads.jw1;
import df.c;
import df.d;
import df.e;
import df.f;
import df.g;
import ei.b;
import i0.o;
import ii.q;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pe.a;
import ti.v0;
import xh.k;
import xh.l;

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
public final class MainActivity extends l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f15086l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f15087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15088k;

    @Override // xh.e
    public final void d(FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        k kVar = this.f36145h;
        if (kVar == null || !kVar.W.f36112g) {
            o.L(flutterEngine);
        }
        jw1 jw1Var = flutterEngine.f25544d;
        jw1Var.a(new c());
        jw1Var.a(new d());
        jw1Var.a(new e());
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        f fVar = new f(layoutInflater);
        v0 v0Var = (v0) ((b) ((HashMap) jw1Var.f6954a).get(v0.class));
        if (v0Var == null) {
            throw new IllegalStateException(a.f("Could not find a ", v0.class.getSimpleName(), " instance. The plugin may have not been registered."));
        }
        HashMap map = v0Var.f33907g;
        if (map.containsKey("googleAdFactory")) {
            Log.e(v0.class.getSimpleName(), "A NativeAdFactory with the following factoryId already exists: googleAdFactory");
        } else {
            map.put("googleAdFactory", fVar);
        }
        LinkedHashMap linkedHashMap = ef.c.f16361l;
        LayoutInflater layoutInflater2 = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater2, "getLayoutInflater(...)");
        g nativeAdFactory = new g(layoutInflater2);
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        Intrinsics.checkNotNullParameter("yandexAdFactory", "factoryId");
        Intrinsics.checkNotNullParameter(nativeAdFactory, "nativeAdFactory");
        ef.c.f16361l.put("yandexAdFactory", nativeAdFactory);
        q qVar = new q(flutterEngine.f25543c.f46278f, "com.twinby.volume_buttons");
        this.f15087j = qVar;
        qVar.b(new a0(10, this));
    }

    @Override // xh.l, z2.w, d.n, t1.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.channel_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getString(R.string.channel_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            g8.a.n();
            NotificationChannel notificationChannelF = a7.d.f(getString(R.string.channel_id), string);
            notificationChannelF.setDescription(string2);
            notificationChannelF.setSound(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/2131755008"), new AudioAttributes.Builder().setContentType(0).setUsage(5).build());
            Object systemService = getSystemService("notification");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelF);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.f15088k) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            q qVar = this.f15087j;
            if (qVar != null) {
                qVar.a("volumeBtnPressed", "volume_up", null);
                return true;
            }
            Intrinsics.g("volumeChannel");
            throw null;
        }
        if (i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        q qVar2 = this.f15087j;
        if (qVar2 != null) {
            qVar2.a("volumeBtnPressed", "volume_down", null);
            return true;
        }
        Intrinsics.g("volumeChannel");
        throw null;
    }

    @Override // z2.w, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            Object systemService = getSystemService("notification");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancelAll();
        } catch (Exception unused) {
            System.out.print((Object) "Can not clear all notifications");
        }
    }
}
