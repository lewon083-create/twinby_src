package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jd1 f6829b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6830a = new AtomicReference(new fe1(new na1(1)));

    static {
        try {
            jd1 jd1Var = new jd1();
            jd1Var.a(new tc1(zc1.class, cc1.f4166h));
            f6829b = jd1Var;
        } catch (Exception e3) {
            throw new oc(e3);
        }
    }

    public final synchronized void a(tc1 tc1Var) {
        AtomicReference atomicReference = this.f6830a;
        na1 na1Var = new na1((fe1) atomicReference.get());
        na1Var.c(tc1Var);
        atomicReference.set(new fe1(na1Var));
    }

    public final synchronized void b(rc1 rc1Var) {
        AtomicReference atomicReference = this.f6830a;
        na1 na1Var = new na1((fe1) atomicReference.get());
        na1Var.f(rc1Var);
        atomicReference.set(new fe1(na1Var));
    }

    public final synchronized void c(nd1 nd1Var) {
        AtomicReference atomicReference = this.f6830a;
        na1 na1Var = new na1((fe1) atomicReference.get());
        na1Var.h(nd1Var);
        atomicReference.set(new fe1(na1Var));
    }

    public final synchronized void d(ld1 ld1Var) {
        AtomicReference atomicReference = this.f6830a;
        na1 na1Var = new na1((fe1) atomicReference.get());
        na1Var.i(ld1Var);
        atomicReference.set(new fe1(na1Var));
    }

    public final gr e(yd1 yd1Var) throws GeneralSecurityException {
        fe1 fe1Var = (fe1) this.f6830a.get();
        fe1Var.getClass();
        de1 de1Var = new de1(yd1.class, (sl1) yd1Var.f12601d);
        HashMap map = fe1Var.f5331b;
        if (map.containsKey(de1Var)) {
            return ((rc1) map.get(de1Var)).f9819b.d(yd1Var);
        }
        String string = de1Var.toString();
        throw new GeneralSecurityException(t.z.g(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final ce1 f(gr grVar) throws GeneralSecurityException {
        fe1 fe1Var = (fe1) this.f6830a.get();
        fe1Var.getClass();
        ee1 ee1Var = new ee1(grVar.getClass(), yd1.class);
        HashMap map = fe1Var.f5330a;
        if (map.containsKey(ee1Var)) {
            return ((tc1) map.get(ee1Var)).f10591b.b(grVar);
        }
        String string = ee1Var.toString();
        throw new GeneralSecurityException(t.z.g(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final o91 g(zd1 zd1Var) throws GeneralSecurityException {
        fe1 fe1Var = (fe1) this.f6830a.get();
        fe1Var.getClass();
        de1 de1Var = new de1(zd1.class, (sl1) zd1Var.f12971c);
        HashMap map = fe1Var.f5333d;
        if (map.containsKey(de1Var)) {
            return ((ld1) map.get(de1Var)).f7491b.c(zd1Var);
        }
        String string = de1Var.toString();
        throw new GeneralSecurityException(t.z.g(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final ce1 h(o91 o91Var) throws GeneralSecurityException {
        fe1 fe1Var = (fe1) this.f6830a.get();
        fe1Var.getClass();
        ee1 ee1Var = new ee1(o91Var.getClass(), zd1.class);
        HashMap map = fe1Var.f5332c;
        if (map.containsKey(ee1Var)) {
            return ((nd1) map.get(ee1Var)).f8277b.f(o91Var);
        }
        String string = ee1Var.toString();
        throw new GeneralSecurityException(t.z.g(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }
}
