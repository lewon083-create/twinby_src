package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qa implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa f9372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ta f9377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f9378h;
    public sa i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ga f9380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public cw f9381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c3 f9382m;

    public qa(int i, String str, ta taVar) {
        Uri uri;
        String host;
        this.f9372b = wa.f11704c ? new wa() : null;
        this.f9376f = new Object();
        int iHashCode = 0;
        this.f9379j = false;
        this.f9380k = null;
        this.f9373c = i;
        this.f9374d = str;
        this.f9377g = taVar;
        c3 c3Var = new c3();
        c3Var.f4005a = 2500;
        this.f9382m = c3Var;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f9375e = iHashCode;
    }

    public final void a(String str) {
        if (wa.f11704c) {
            this.f9372b.a(Thread.currentThread().getId(), str);
        }
    }

    public final void b(String str) {
        sa saVar = this.i;
        if (saVar != null) {
            HashSet hashSet = (HashSet) saVar.f10209b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = (ArrayList) saVar.i;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            saVar.c();
        }
        if (wa.f11704c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new f1(this, str, id2));
                return;
            }
            wa waVar = this.f9372b;
            waVar.a(id2, str);
            waVar.b(toString());
        }
    }

    public final void c() {
        sa saVar = this.i;
        if (saVar != null) {
            saVar.c();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9378h.intValue() - ((qa) obj).f9378h.intValue();
    }

    public final String d() {
        int i = this.f9373c;
        String str = this.f9374d;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return t.z.g(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    public Map e() {
        return Collections.EMPTY_MAP;
    }

    public byte[] f() {
        return null;
    }

    public final boolean g() {
        boolean z5;
        synchronized (this.f9376f) {
            z5 = this.f9379j;
        }
        return z5;
    }

    public abstract b7 h(oa oaVar);

    public abstract void i(Object obj);

    public final void j(b7 b7Var) {
        cw cwVar;
        List list;
        synchronized (this.f9376f) {
            cwVar = this.f9381l;
        }
        if (cwVar != null) {
            ga gaVar = (ga) b7Var.f3659d;
            if (gaVar != null) {
                if (gaVar.f5723e >= System.currentTimeMillis()) {
                    String strD = d();
                    synchronized (cwVar) {
                        list = (List) ((HashMap) cwVar.f4347c).remove(strD);
                    }
                    if (list != null) {
                        if (xa.f12090a) {
                            xa.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strD);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((ox0) cwVar.f4350f).g((qa) it.next(), b7Var, null);
                        }
                        return;
                    }
                    return;
                }
            }
            cwVar.q(this);
        }
    }

    public final void k() {
        cw cwVar;
        synchronized (this.f9376f) {
            cwVar = this.f9381l;
        }
        if (cwVar != null) {
            cwVar.q(this);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f9375e));
        synchronized (this.f9376f) {
        }
        Integer num = this.f9378h;
        String str = this.f9374d;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        l7.o.t(sb2, "[ ] ", str, " ", strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }
}
