package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s90 implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10203b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10207f;

    public /* synthetic */ s90(v80 v80Var, w20 w20Var, bt0 bt0Var, kh0 kh0Var) {
        this.f10204c = v80Var;
        this.f10206e = w20Var;
        this.f10205d = bt0Var;
        this.f10207f = kh0Var;
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        switch (this.f10203b) {
            case 0:
                t90 t90Var = (t90) ((WeakReference) this.f10204c).get();
                String str = (String) map.get("u");
                if (t90Var != null && !TextUtils.isEmpty(str)) {
                    ((bt0) this.f10205d).b(str, (ni.i) this.f10206e, (as0) this.f10207f, t90Var.E);
                    break;
                }
                break;
            case 1:
                Object obj2 = ((WeakReference) this.f10204c).get();
                if (obj2 != null) {
                    ((vo) this.f10206e).o(obj2, map);
                } else {
                    ((kc0) this.f10207f).c((String) this.f10205d, this);
                }
                break;
            default:
                sz szVar = (sz) obj;
                uo.b(map, (v80) this.f10204c);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    kh0 kh0Var = (kh0) this.f10207f;
                    bt0 bt0Var = (bt0) this.f10205d;
                    w20 w20Var = (w20) this.f10206e;
                    ed.d dVarA = uo.a(szVar, str2);
                    cw cwVar = new cw(szVar, w20Var, bt0Var, kh0Var, 22, false);
                    dVarA.a(new l81(0, dVarA, cwVar), hx.f6279a);
                } else {
                    u9.i.h("URL missing from click GMSG.");
                }
                break;
        }
    }

    public /* synthetic */ s90(t90 t90Var, bt0 bt0Var, ni.i iVar, as0 as0Var) {
        this.f10204c = new WeakReference(t90Var);
        this.f10205d = bt0Var;
        this.f10206e = iVar;
        this.f10207f = as0Var;
    }

    public /* synthetic */ s90(kc0 kc0Var, WeakReference weakReference, String str, vo voVar) {
        this.f10207f = kc0Var;
        this.f10204c = weakReference;
        this.f10205d = str;
        this.f10206e = voVar;
    }
}
