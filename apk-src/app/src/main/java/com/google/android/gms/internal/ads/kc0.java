package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kc0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f7185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd0 f7187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f7188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xe f7189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u9.a f7190g;
    public final kh0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bt0 f7192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ph0 f7193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jq0 f7194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s71 f7195m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fc0 f7184a = new fc0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final so f7191h = new so();

    public kc0(jc0 jc0Var) {
        this.f7186c = jc0Var.f6811c;
        this.f7188e = jc0Var.f6814f;
        this.f7189f = jc0Var.f6815g;
        this.f7190g = jc0Var.f6816h;
        this.f7185b = jc0Var.f6810b;
        this.i = jc0Var.f6813e;
        this.f7192j = jc0Var.i;
        this.f7187d = jc0Var.f6812d;
        this.f7193k = jc0Var.f6817j;
        this.f7194l = jc0Var.f6818k;
    }

    public final synchronized ed.d a(String str, JSONObject jSONObject) {
        s71 s71Var = this.f7195m;
        if (s71Var == null) {
            return n81.f8237c;
        }
        return vv.J(s71Var, new v40(this, str, jSONObject, 2), this.f7188e);
    }

    public final synchronized void b(String str, vo voVar) {
        s71 s71Var = this.f7195m;
        if (s71Var == null) {
            return;
        }
        zd1 zd1Var = new zd1(this, str, voVar, 13);
        s71Var.a(new l81(0, s71Var, zd1Var), this.f7188e);
    }

    public final synchronized void c(String str, vo voVar) {
        s71 s71Var = this.f7195m;
        if (s71Var == null) {
            return;
        }
        ut utVar = new ut(this, str, voVar);
        s71Var.a(new l81(0, s71Var, utVar), this.f7188e);
    }

    public final synchronized void d(Map map) {
        s71 s71Var = this.f7195m;
        if (s71Var == null) {
            return;
        }
        gk0 gk0Var = new gk0(this, map);
        s71Var.a(new l81(0, s71Var, gk0Var), this.f7188e);
    }
}
