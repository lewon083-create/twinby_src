package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import io.sentry.SentryLogEvent;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q9.b2 f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zm f6768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f6770e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q9.m2 f6772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f6773h;
    public sz i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sz f6774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sz f6775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public wh0 f6776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ed.d f6777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public jx f6778n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f6779o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f6780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public xa.a f6781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f6782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public en f6783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public en f6784t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f6785u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f6788x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f6789y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h1.i f6786v = new h1.i(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h1.i f6787w = new h1.i(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f6771f = Collections.EMPTY_LIST;

    public static ja0 l(sr srVar) {
        ia0 ia0Var;
        sr srVar2;
        try {
            q9.b2 b2VarQ = srVar.q();
            if (b2VarQ == null) {
                srVar2 = srVar;
                ia0Var = null;
            } else {
                srVar2 = srVar;
                ia0Var = new ia0(b2VarQ, srVar2);
            }
            return m(ia0Var, srVar2.r(), (View) n(srVar2.s()), srVar2.i(), srVar2.c(), srVar2.k(), srVar2.C3(), srVar2.f(), (View) n(srVar2.o()), srVar2.x(), srVar2.e(), srVar2.p(), srVar2.n(), srVar2.m(), srVar2.d(), srVar2.T());
        } catch (RemoteException e3) {
            u9.i.i("Failed to get native ad assets from unified ad mapper", e3);
            return null;
        }
    }

    public static ja0 m(ia0 ia0Var, zm zmVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, xa.a aVar, String str4, String str5, double d10, en enVar, String str6, float f10) {
        ja0 ja0Var = new ja0();
        ja0Var.f6766a = 6;
        ja0Var.f6767b = ia0Var;
        ja0Var.f6768c = zmVar;
        ja0Var.f6769d = view;
        ja0Var.o("headline", str);
        ja0Var.f6770e = list;
        ja0Var.o(SentryLogEvent.JsonKeys.BODY, str2);
        ja0Var.f6773h = bundle;
        ja0Var.o("call_to_action", str3);
        ja0Var.f6779o = view2;
        ja0Var.f6781q = aVar;
        ja0Var.o("store", str4);
        ja0Var.o("price", str5);
        ja0Var.f6782r = d10;
        ja0Var.f6783s = enVar;
        ja0Var.o("advertiser", str6);
        synchronized (ja0Var) {
            ja0Var.f6788x = f10;
        }
        return ja0Var;
    }

    public static Object n(xa.a aVar) {
        if (aVar == null) {
            return null;
        }
        return xa.b.X1(aVar);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final en b() {
        List list = this.f6770e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f6770e.get(0);
        if (obj instanceof IBinder) {
            return um.l4((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p(SentryLogEvent.JsonKeys.BODY);
    }

    public final synchronized Bundle d() {
        try {
            if (this.f6773h == null) {
                this.f6773h = new Bundle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6773h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p("advertiser");
    }

    public final synchronized String g() {
        return this.f6785u;
    }

    public final synchronized sz h() {
        return this.i;
    }

    public final synchronized sz i() {
        return this.f6774j;
    }

    public final synchronized sz j() {
        return this.f6775k;
    }

    public final synchronized wh0 k() {
        return this.f6776l;
    }

    public final synchronized void o(String str, String str2) {
        if (str2 == null) {
            this.f6787w.remove(str);
        } else {
            this.f6787w.put(str, str2);
        }
    }

    public final synchronized String p(String str) {
        return (String) this.f6787w.get(str);
    }

    public final synchronized int q() {
        return this.f6766a;
    }

    public final synchronized q9.b2 r() {
        return this.f6767b;
    }

    public final synchronized zm s() {
        return this.f6768c;
    }
}
