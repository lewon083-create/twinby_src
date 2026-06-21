package io.flutter.embedding.engine;

import a0.b1;
import a7.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.google.android.gms.internal.ads.jw1;
import fe.c;
import fh.nd;
import fh.zf;
import gj.b;
import h3.e;
import hi.h;
import i0.o;
import ii.x;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import j0.g;
import java.util.HashMap;
import java.util.HashSet;
import ji.a;
import ka.k;
import u7.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class FlutterEngine implements b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f25539x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final HashMap f25540y = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f25541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f25542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zh.b f25543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jw1 f25544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f25545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f25546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4.j f25547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f25548h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f25549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f25550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b1 f25551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f25552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hi.j f25553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b1 f25554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f25555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f25556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f25557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f25558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f25559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashSet f25560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f25561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yh.a f25562w;

    public FlutterEngine(Context context, String[] strArr) {
        this(context, null, new q(), strArr, true, false);
    }

    public FlutterEngine(Context context, FlutterJNI flutterJNI, q qVar, String[] strArr, boolean z5, boolean z10) {
        AssetManager assets;
        this.f25560u = new HashSet();
        this.f25562w = new yh.a(this);
        long j10 = f25539x;
        f25539x = 1 + j10;
        this.f25561v = j10;
        f25540y.put(Long.valueOf(j10), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        f fVarQ = f.q();
        if (flutterJNI == null) {
            Object obj = fVarQ.f34323d;
            flutterJNI = new FlutterJNI();
        }
        this.f25541a = flutterJNI;
        zh.b bVar = new zh.b(flutterJNI, assets, this.f25561v);
        this.f25543c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f46277e);
        f.q().getClass();
        this.f25546f = new k(bVar, flutterJNI);
        new ii.q(bVar, "flutter/deferredcomponent", x.f21321b, null).b(new v7.f(16, new nd()));
        f.q().getClass();
        new HashMap();
        this.f25547g = new e4.j(bVar);
        e eVar = new e(bVar, 4);
        this.f25548h = new b1(bVar, 15);
        this.i = new l(bVar, 19);
        new ii.q(bVar, "flutter/backgesture", x.f21321b, null).b(new zf());
        this.f25550k = new e(bVar, 5);
        e eVar2 = new e(bVar, context.getPackageManager());
        this.f25549j = new h(bVar, z10);
        this.f25551l = new b1(bVar, 17);
        this.f25552m = new c(bVar);
        hi.j jVar = new hi.j(bVar);
        this.f25553n = jVar;
        this.f25554o = new b1(bVar, 18);
        this.f25555p = new l(bVar, 22);
        this.f25556q = new e(bVar, 10);
        a aVar = new a(context, eVar);
        this.f25545e = aVar;
        ci.e eVar3 = (ci.e) fVarQ.f34322c;
        if (!flutterJNI.isAttached()) {
            eVar3.d(context.getApplicationContext());
            eVar3.a(context, strArr);
        }
        p pVar = new p();
        pVar.f25712b = qVar.f25728b;
        pVar.f25716f = flutterJNI;
        qVar.f25732f = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f25562w);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setPlatformViewsController2(pVar);
        flutterJNI.setLocalizationPlugin(aVar);
        fVarQ.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(jVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f25542b = new j(flutterJNI);
        this.f25557r = qVar;
        this.f25558s = pVar;
        e eVar4 = new e(19);
        eVar4.f20375c = qVar;
        eVar4.f20376d = pVar;
        this.f25559t = eVar4;
        jw1 jw1Var = new jw1(context.getApplicationContext(), this, eVar3);
        this.f25544d = jw1Var;
        aVar.b(context.getResources().getConfiguration());
        if (z5 && ((ci.b) eVar3.f2295d).f2280a) {
            o.L(this);
        }
        g.E(context, this);
        jw1Var.a(new li.a(eVar2));
    }
}
