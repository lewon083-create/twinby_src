package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f9441a;

    static {
        f51 f51Var;
        nu0 nu0Var = new nu0(4);
        nu0Var.g(new Long[]{-42L, -64L}, bc.f3720b);
        nu0Var.g(new Long[]{-6L, -53L}, bc.f3722c);
        nu0Var.g(new Long[]{-41L, -31L}, bc.f3724d);
        nu0Var.g(new Long[]{-40L, -28L}, bc.f3726e);
        nu0Var.g(new Long[]{-29L, -37L}, bc.f3728f);
        nu0Var.g(new Long[]{-80L, -32L}, bc.f3730g);
        nu0Var.g(new Long[]{-17L, -36L}, bc.f3732h);
        nu0Var.g(new Long[]{-82L, -35L}, bc.i);
        nu0Var.g(new Long[]{-63L, -52L}, bc.f3734j);
        nu0Var.g(new Long[]{-23L, -11L}, bc.f3736k);
        nu0Var.g(new Long[]{-69L, -68L}, bc.f3738l);
        nu0Var.g(new Long[]{-62L, -55L}, bc.f3740m);
        nu0Var.g(new Long[]{-78L, -25L}, bc.f3742n);
        nu0Var.g(new Long[]{-71L, -3L}, bc.f3744o);
        nu0Var.g(new Long[]{-18L, -4L}, bc.f3745p);
        nu0Var.g(new Long[]{-67L, -19L}, bc.f3746q);
        nu0Var.g(new Long[]{-58L}, bc.f3747r);
        nu0Var.g(new Long[]{-2L}, bc.f3748s);
        nu0Var.g(new Long[]{-34L}, bc.f3749t);
        nu0Var.g(new Long[]{-30L}, bc.f3750u);
        nu0Var.g(new Long[]{-56L}, bc.f3751v);
        nu0Var.g(new Long[]{-57L}, bc.f3753x);
        nu0Var.g(new Long[]{-66L}, bc.f3754y);
        nu0Var.g(new Long[]{-60L}, bc.f3755z);
        nu0Var.g(new Long[]{-27L}, bc.A);
        nu0Var.g(new Long[]{-26L}, bc.B);
        nu0Var.g(new Long[]{-74L}, bc.C);
        nu0Var.g(new Long[]{-77L}, bc.D);
        nu0Var.g(new Long[]{-38L}, bc.F);
        nu0Var.g(new Long[]{-79L}, bc.H);
        nu0Var.g(new Long[]{-7L}, bc.I);
        nu0Var.g(new Long[]{-51L}, bc.J);
        nu0Var.g(new Long[]{-9L}, bc.K);
        nu0Var.g(new Long[]{-47L}, bc.L);
        nu0Var.g(new Long[]{-70L}, bc.M);
        nu0Var.g(new Long[]{-14L}, bc.N);
        nu0Var.g(new Long[]{-5L}, bc.O);
        nu0Var.g(new Long[]{-39L}, bc.P);
        nu0Var.g(new Long[]{-8L}, bc.Q);
        nu0Var.g(new Long[]{-54L}, bc.R);
        nu0Var.g(new Long[]{-15L}, bc.S);
        nu0Var.g(new Long[]{-12L}, bc.T);
        nu0Var.g(new Long[]{-21L}, bc.U);
        nu0Var.g(new Long[]{-43L}, bc.V);
        nu0Var.g(new Long[]{-20L}, bc.G);
        nu0Var.g(new Long[]{-81L}, bc.E);
        nu0Var.g(new Long[]{-46L}, bc.W);
        nu0Var.g(new Long[]{-61L}, bc.X);
        nu0Var.g(new Long[]{-44L}, bc.Y);
        nu0Var.g(new Long[]{-59L}, bc.f3752w);
        nu0Var.g(new Long[]{-49L}, bc.Z);
        nu0Var.g(new Long[]{-75L}, bc.f3719a0);
        nu0Var.g(new Long[]{-24L}, bc.f3721b0);
        nu0Var.g(new Long[]{-13L}, bc.f3731g0);
        nu0Var.g(new Long[]{-1L}, bc.h0);
        nu0Var.g(new Long[]{-33L}, bc.f3723c0);
        nu0Var.g(new Long[]{-45L}, bc.f3725d0);
        nu0Var.g(new Long[]{-50L}, bc.f3727e0);
        nu0Var.g(new Long[]{-65L}, bc.f3729f0);
        nu0Var.g(new Long[]{-16L}, bc.f3733i0);
        nu0Var.g(new Long[]{-73L}, bc.f3735j0);
        nu0Var.g(new Long[]{-10L}, bc.f3737k0);
        nu0Var.g(new Long[]{-48L}, bc.f3739l0);
        nu0Var.g(new Long[]{-22L}, bc.f3741m0);
        nu0Var.g(new Long[]{-76L}, bc.f3743n0);
        nu0Var.g(new Long[]{-72L}, bc.o0);
        m41 m41Var = (m41) nu0Var.f8456c;
        if (m41Var == null) {
            f51Var = r41.f9706h;
        } else {
            Collection collectionEntrySet = m41Var.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                f51Var = r41.f9706h;
            } else {
                k41<Map.Entry> k41Var = (k41) collectionEntrySet;
                ya yaVar = new ya(k41Var.f7117c.size());
                int size = 0;
                for (Map.Entry entry : k41Var) {
                    Object key = entry.getKey();
                    d51 d51VarR = d51.r(((c51) entry.getValue()).h());
                    if (!d51VarR.isEmpty()) {
                        yaVar.g(key, d51VarR);
                        size += d51VarR.size();
                    }
                }
                f51Var = new f51(yaVar.s(true), size);
            }
        }
        e51 e51Var = f51Var.f5245g;
        if (e51Var == null) {
            e51Var = new e51(f51Var);
            f51Var.f5245g = e51Var;
        }
        d61 d61VarA = e51Var.a();
        while (d61VarA.hasNext()) {
            Map.Entry entry2 = (Map.Entry) d61VarA.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new oc(zb.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap map = new HashMap();
        e51 e51Var2 = f51Var.f5245g;
        if (e51Var2 == null) {
            e51Var2 = new e51(f51Var);
            f51Var.f5245g = e51Var2;
        }
        d61 d61VarA2 = e51Var2.a();
        while (d61VarA2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) d61VarA2.next();
            bc bcVar = (bc) entry3.getKey();
            Long l10 = (Long) entry3.getValue();
            long jLongValue = l10.longValue();
            if (map.containsKey(l10)) {
                String strValueOf = String.valueOf(map.get(l10));
                String strValueOf2 = String.valueOf(bcVar);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                sb2.append(zb.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA=="));
                sb2.append(jLongValue);
                sb2.append(zb.a("cQk="));
                sb2.append(strValueOf);
                sb2.append(zb.a("a0ivq0U="));
                sb2.append(strValueOf2);
                throw new oc(sb2.toString());
            }
            map.put(l10, bcVar);
        }
        f9441a = map;
    }
}
