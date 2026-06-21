package ti;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.HashMap;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class v0 implements ei.b, fi.a, ii.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ei.a f33902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ka.k f33903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f33904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o6.b f33905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s7.g f33906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f33907g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t.t0 f33908h = new t.t0(1);

    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        ka.k kVar = this.f33903c;
        if (kVar != null) {
            kVar.f27324c = (z2.w) ((h3) bVar).f28250b;
        }
        a aVar = this.f33904d;
        if (aVar != null) {
            aVar.f33792a = (z2.w) ((h3) bVar).f28250b;
        }
        s7.g gVar = this.f33906f;
        if (gVar != null) {
            gVar.f32798e = (z2.w) ((h3) bVar).f28250b;
        }
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        this.f33902b = aVar;
        Context context = aVar.f16381a;
        ii.f fVar = aVar.f16383c;
        d8.a aVar2 = new d8.a(7);
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                aVar2.f15577c = bundle.getString("io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION");
                aVar2.f15576b = applicationInfo.metaData.getString("io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION");
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
        this.f33904d = new a(context, aVar2);
        ii.q qVar = new ii.q(fVar, "plugins.flutter.io/google_mobile_ads", new ii.x(this.f33904d), null);
        qVar.b(this);
        ka.k kVar = new ka.k(qVar);
        this.f33903c = kVar;
        aVar.f16385e.h("plugins.flutter.io/google_mobile_ads/ad_widget", new w0(kVar));
        o6.b bVar = new o6.b();
        new ii.q(fVar, "plugins.flutter.io/google_mobile_ads/app_state_method").b(bVar);
        new ii.i(fVar, "plugins.flutter.io/google_mobile_ads/app_state_event").a(bVar);
        this.f33905e = bVar;
        Context context2 = aVar.f16381a;
        s7.g gVar = new s7.g();
        vi.c cVar = new vi.c();
        gVar.f32795b = cVar;
        new ii.q(fVar, "plugins.flutter.io/google_mobile_ads/ump", new ii.x(cVar), null).b(gVar);
        gVar.f32796c = context2;
        this.f33906f = gVar;
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        ei.a aVar;
        a aVar2 = this.f33904d;
        if (aVar2 != null && (aVar = this.f33902b) != null) {
            aVar2.f33792a = aVar.f16381a;
        }
        ka.k kVar = this.f33903c;
        if (kVar != null) {
            kVar.f27324c = null;
        }
        s7.g gVar = this.f33906f;
        if (gVar != null) {
            gVar.f32798e = null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        ei.a aVar;
        a aVar2 = this.f33904d;
        if (aVar2 != null && (aVar = this.f33902b) != null) {
            aVar2.f33792a = aVar.f16381a;
        }
        ka.k kVar = this.f33903c;
        if (kVar != null) {
            kVar.f27324c = null;
        }
        s7.g gVar = this.f33906f;
        if (gVar != null) {
            gVar.f32798e = null;
        }
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        o6.b bVar = this.f33905e;
        if (bVar != null) {
            ProcessLifecycleOwner.f1526j.f1532g.b(bVar);
            this.f33905e = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0b4c  */
    @Override // ii.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(ii.n r20, ii.p r21) {
        /*
            Method dump skipped, instruction units count: 3388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.v0.onMethodCall(ii.n, ii.p):void");
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        ka.k kVar = this.f33903c;
        if (kVar != null) {
            kVar.f27324c = (z2.w) ((h3) bVar).f28250b;
        }
        a aVar = this.f33904d;
        if (aVar != null) {
            aVar.f33792a = (z2.w) ((h3) bVar).f28250b;
        }
        s7.g gVar = this.f33906f;
        if (gVar != null) {
            gVar.f32798e = (z2.w) ((h3) bVar).f28250b;
        }
    }
}
