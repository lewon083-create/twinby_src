package e8;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import d8.h0;
import g8.f;
import g8.g;
import g8.h;
import g8.l;
import ii.i;
import ii.q;
import java.util.HashMap;
import java.util.HashSet;
import m.h3;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h8.a f16280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f16281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f16282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GeolocatorLocationService f16283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h3 f16284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h3 f16285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f16286h = new h0(1, this);
    public bb.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fi.b f16287j;

    public c() {
        h8.a aVar;
        f fVar;
        g gVar;
        synchronized (h8.a.class) {
            try {
                if (h8.a.f20463e == null) {
                    h8.a.f20463e = new h8.a();
                }
                aVar = h8.a.f20463e;
            } finally {
            }
        }
        this.f16280b = aVar;
        synchronized (f.class) {
            try {
                if (f.f20028d == null) {
                    f.f20028d = new f();
                }
                fVar = f.f20028d;
            } finally {
            }
        }
        this.f16281c = fVar;
        synchronized (g.class) {
            try {
                if (g.f20031c == null) {
                    g.f20031c = new g(0);
                }
                gVar = g.f20031c;
            } finally {
            }
        }
        this.f16282d = gVar;
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        this.f16287j = bVar;
        if (bVar != null) {
            ((h3) bVar).a(this.f16281c);
            ((h3) this.f16287j).b(this.f16280b);
        }
        h3 h3Var = this.f16284f;
        if (h3Var != null) {
            h3Var.f28255g = (w) ((h3) bVar).f28250b;
        }
        h3 h3Var2 = this.f16285g;
        if (h3Var2 != null) {
            w wVar = (w) ((h3) bVar).f28250b;
            if (wVar == null && ((h) h3Var2.f28256h) != null && ((i) h3Var2.f28252d) != null) {
                h3Var2.h();
            }
            h3Var2.f28253e = wVar;
        }
        GeolocatorLocationService geolocatorLocationService = this.f16283e;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f2488f = (w) ((h3) this.f16287j).f28250b;
        }
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        l lVar;
        h3 h3Var = new h3();
        h8.a aVar2 = this.f16280b;
        h3Var.f28251c = aVar2;
        f fVar = this.f16281c;
        h3Var.f28252d = fVar;
        h3Var.f28253e = this.f16282d;
        h3Var.f28254f = new HashMap();
        this.f16284f = h3Var;
        Context context = aVar.f16381a;
        ii.f fVar2 = aVar.f16383c;
        if (((q) h3Var.f28256h) != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            q qVar = (q) h3Var.f28256h;
            if (qVar == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                qVar.b(null);
                h3Var.f28256h = null;
            }
        }
        q qVar2 = new q(fVar2, "flutter.baseflow.com/geolocator_android");
        h3Var.f28256h = qVar2;
        qVar2.b(h3Var);
        h3Var.f28250b = context;
        h3 h3Var2 = new h3();
        h3Var2.f28251c = aVar2;
        h3Var2.f28255g = fVar;
        this.f16285g = h3Var2;
        if (((i) h3Var2.f28252d) != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            h3Var2.h();
        }
        i iVar = new i(fVar2, "flutter.baseflow.com/geolocator_updates_android");
        h3Var2.f28252d = iVar;
        iVar.a(h3Var2);
        h3Var2.f28250b = context;
        bb.e eVar = new bb.e(8, false);
        this.i = eVar;
        eVar.f2019c = context;
        if (((i) eVar.f2020d) != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            if (((i) eVar.f2020d) != null) {
                Context context2 = (Context) eVar.f2019c;
                if (context2 != null && (lVar = (l) eVar.f2021e) != null) {
                    context2.unregisterReceiver(lVar);
                }
                ((i) eVar.f2020d).a(null);
                eVar.f2020d = null;
            }
        }
        i iVar2 = new i(fVar2, "flutter.baseflow.com/geolocator_service_updates_android");
        eVar.f2020d = iVar2;
        iVar2.a(eVar);
        eVar.f2019c = context;
        context.bindService(new Intent(context, (Class<?>) GeolocatorLocationService.class), this.f16286h, 1);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        fi.b bVar = this.f16287j;
        if (bVar != null) {
            ((h3) bVar).g(this.f16281c);
            ((HashSet) ((h3) this.f16287j).f28252d).remove(this.f16280b);
        }
        h3 h3Var = this.f16284f;
        if (h3Var != null) {
            h3Var.f28255g = null;
        }
        h3 h3Var2 = this.f16285g;
        if (h3Var2 != null) {
            if (((h) h3Var2.f28256h) != null && ((i) h3Var2.f28252d) != null) {
                h3Var2.h();
            }
            h3Var2.f28253e = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f16283e;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f2488f = null;
        }
        if (this.f16287j != null) {
            this.f16287j = null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        Context context = aVar.f16381a;
        GeolocatorLocationService geolocatorLocationService = this.f16283e;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f2486d--;
            Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + geolocatorLocationService.f2486d);
        }
        context.unbindService(this.f16286h);
        h3 h3Var = this.f16284f;
        if (h3Var != null) {
            q qVar = (q) h3Var.f28256h;
            if (qVar == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                qVar.b(null);
                h3Var.f28256h = null;
            }
            this.f16284f.f28255g = null;
            this.f16284f = null;
        }
        h3 h3Var2 = this.f16285g;
        if (h3Var2 != null) {
            h3Var2.h();
            this.f16285g.f28254f = null;
            this.f16285g = null;
        }
        bb.e eVar = this.i;
        if (eVar != null) {
            eVar.f2019c = null;
            if (((i) eVar.f2020d) != null) {
                ((i) eVar.f2020d).a(null);
                eVar.f2020d = null;
            }
            this.i = null;
        }
        GeolocatorLocationService geolocatorLocationService2 = this.f16283e;
        if (geolocatorLocationService2 != null) {
            geolocatorLocationService2.f2488f = null;
        }
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        onAttachedToActivity(bVar);
    }
}
