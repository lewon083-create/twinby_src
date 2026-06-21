package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements pa.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6317g;

    public i0(t.o oVar, u.i iVar, j0.i iVar2, int i) {
        switch (i) {
            case 6:
                this.f6312b = false;
                t.l2 l2Var = new t.l2(this);
                this.f6313c = oVar;
                this.f6314d = iVar2;
                t.m2 m2VarC = c(iVar);
                this.f6317g = m2VarC;
                t.n2 n2Var = new t.n2(m2VarC.e(), m2VarC.k());
                this.f6315e = n2Var;
                n2Var.e(1.0f);
                this.f6316f = new androidx.lifecycle.d0(l0.a.e(n2Var));
                oVar.a(l2Var);
                break;
            default:
                this.f6312b = false;
                this.f6313c = oVar;
                this.f6314d = new t.k1(iVar);
                this.f6315e = iVar2;
                break;
        }
    }

    public static t.m2 c(u.i iVar) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) iVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e3) {
                com.google.android.gms.internal.auth.g.P("ZoomControl", "AssertionError, fail to get camera characteristic.", e3);
                range = null;
            }
            if (range != null) {
                return new t.b(iVar);
            }
        }
        s7.g gVar = new s7.g();
        gVar.f32796c = null;
        gVar.f32798e = null;
        gVar.f32795b = iVar;
        return gVar;
    }

    @Override // pa.d
    public void a(ma.b bVar) {
        ((oa.e) this.f6317g).f29849o.post(new k0.i(17, this, bVar, false));
    }

    public void b() {
        j1.h hVar = (j1.h) this.f6316f;
        if (hVar != null) {
            hVar.d(new a0.o("Cancelled by another setExposureCompensationIndex()"));
            this.f6316f = null;
        }
        t.j1 j1Var = (t.j1) this.f6317g;
        if (j1Var != null) {
            ((t.o) this.f6313c).B(j1Var);
            this.f6317g = null;
        }
    }

    public zc.p d(int i) {
        zc.p pVar;
        zc.p pVar2;
        HashMap map = (HashMap) this.f6314d;
        zc.p pVar3 = (zc.p) map.get(Integer.valueOf(i));
        if (pVar3 != null) {
            return pVar3;
        }
        final p3.g gVar = (p3.g) this.f6316f;
        gVar.getClass();
        if (i == 0) {
            final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(i4.b0.class);
            final int i10 = 0;
            pVar = new zc.p() { // from class: i4.o
                @Override // zc.p
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return q.e((Class) clsAsSubclass, gVar);
                        case 1:
                            return q.e((Class) clsAsSubclass, gVar);
                        case 2:
                            return q.e((Class) clsAsSubclass, gVar);
                        default:
                            return new w0(gVar, (q4.i) ((com.google.android.gms.internal.ads.i0) clsAsSubclass).f6313c);
                    }
                }
            };
        } else if (i == 1) {
            final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(i4.b0.class);
            final int i11 = 1;
            pVar = new zc.p() { // from class: i4.o
                @Override // zc.p
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return q.e((Class) clsAsSubclass2, gVar);
                        case 1:
                            return q.e((Class) clsAsSubclass2, gVar);
                        case 2:
                            return q.e((Class) clsAsSubclass2, gVar);
                        default:
                            return new w0(gVar, (q4.i) ((com.google.android.gms.internal.ads.i0) clsAsSubclass2).f6313c);
                    }
                }
            };
        } else {
            if (i != 2) {
                if (i == 3) {
                    pVar2 = new i4.p(0, RtspMediaSource$Factory.class.asSubclass(i4.b0.class));
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(l7.o.i(i, "Unrecognized contentType: "));
                    }
                    final int i12 = 3;
                    pVar2 = new zc.p() { // from class: i4.o
                        @Override // zc.p
                        public final Object get() {
                            switch (i12) {
                                case 0:
                                    return q.e((Class) this, gVar);
                                case 1:
                                    return q.e((Class) this, gVar);
                                case 2:
                                    return q.e((Class) this, gVar);
                                default:
                                    return new w0(gVar, (q4.i) ((com.google.android.gms.internal.ads.i0) this).f6313c);
                            }
                        }
                    };
                }
                map.put(Integer.valueOf(i), pVar2);
                return pVar2;
            }
            final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(i4.b0.class);
            final int i13 = 2;
            pVar = new zc.p() { // from class: i4.o
                @Override // zc.p
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return q.e((Class) clsAsSubclass3, gVar);
                        case 1:
                            return q.e((Class) clsAsSubclass3, gVar);
                        case 2:
                            return q.e((Class) clsAsSubclass3, gVar);
                        default:
                            return new w0(gVar, (q4.i) ((com.google.android.gms.internal.ads.i0) clsAsSubclass3).f6313c);
                    }
                }
            };
        }
        pVar2 = pVar;
        map.put(Integer.valueOf(i), pVar2);
        return pVar2;
    }

    public void e(l0.a aVar) {
        androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) this.f6316f;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d0Var.k(aVar);
        } else {
            d0Var.i(aVar);
        }
    }

    public void f(ma.b bVar) {
        oa.p pVar = (oa.p) ((oa.e) this.f6317g).f29845k.get((oa.a) this.f6314d);
        if (pVar != null) {
            pVar.j(bVar);
        }
    }

    public synchronized boolean g(Context context) {
        if (!z21.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f6316f = new in0(9, new v21(context));
        } catch (NullPointerException e3) {
            t9.c0.m("Error connecting LMD Overlay service");
            p9.k.C.f31302h.d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e3);
        }
        if (((in0) this.f6316f) == null) {
            this.f6312b = false;
            return false;
        }
        if (((ni.i) this.f6317g) == null) {
            this.f6317g = new ni.i(10, this);
        }
        this.f6312b = true;
        return true;
    }

    public void h(sz szVar, q21 q21Var) {
        String str = q21Var.f9297b;
        if (szVar == null) {
            i("adWebview missing", "onLMDShow");
            return;
        }
        this.f6315e = szVar;
        if (!this.f6312b && !g(szVar.getContext())) {
            i("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Jc)).booleanValue()) {
            this.f6314d = str;
        }
        if (((ni.i) this.f6317g) == null) {
            this.f6317g = new ni.i(10, this);
        }
        in0 in0Var = (in0) this.f6316f;
        if (in0Var != null) {
            ni.i iVar = (ni.i) this.f6317g;
            v21 v21Var = (v21) in0Var.f6553c;
            yi0 yi0Var = v21Var.f11218a;
            if (yi0Var == null) {
                v21.f11216c.c("error: %s", "Play Store not found.");
            } else if (v21.c(iVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                yi0Var.i(new y21(yi0Var, new d1(v21Var, q21Var, iVar, 11), 0));
            }
        }
    }

    public void i(String str, String str2) {
        t9.c0.m(str);
        if (((sz) this.f6315e) != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            j("onError", map);
        }
    }

    public void j(String str, HashMap map) {
        hx.f6284f.execute(new aa.y(this, str, map, 26));
    }

    public s21 k() {
        String str;
        String str2 = null;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.Jc)).booleanValue() || TextUtils.isEmpty((String) this.f6314d)) {
            String str3 = (String) this.f6313c;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                i("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f6314d;
        }
        return new s21(str2, str);
    }
}
