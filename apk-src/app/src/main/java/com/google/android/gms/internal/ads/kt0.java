package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends ug implements q9.s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lt0 f7293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft0 f7294c;

    public kt0(lt0 lt0Var, ft0 ft0Var) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f7293b = lt0Var;
        this.f7294c = ft0Var;
    }

    @Override // q9.s0
    public final void R(int i) {
        ft0 ft0Var = this.f7294c;
        synchronized (ft0Var) {
            try {
                k9.a aVarA = k9.a.a(i);
                if (aVarA != null) {
                    HashMap map = ft0Var.f5428a;
                    if (map.containsKey(aVarA)) {
                        Map map2 = (Map) map.get(aVarA);
                        int size = map2.size();
                        for (String str : map2.keySet()) {
                            ht0 ht0Var = (ht0) map2.get(str);
                            if (ht0Var != null) {
                                ht0Var.f6247g.set(false);
                                ht0Var.f6255p.set(false);
                                dt0 dt0Var = ft0Var.i;
                                if (dt0Var != null) {
                                    dt0Var.e(str, aVarA);
                                }
                                synchronized (ht0Var) {
                                    ht0Var.f6249j.clear();
                                }
                                u9.i.g("Destroyed ad preloader for preloadId: ".concat(String.valueOf(str)));
                            }
                        }
                        map2.clear();
                        u9.i.g("Destroyed all ad preloaders for ad format: ".concat(aVarA.toString()));
                        kx0 kx0Var = ft0Var.f5430c;
                        ft0Var.f5434g.getClass();
                        kx0Var.O("pda", System.currentTimeMillis(), null, null, aVarA, -1, -1, size);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        HashMap map;
        ht0 ht0Var;
        q9.p0 p0Var = null;
        x2Var = null;
        q9.x2 x2Var = null;
        q9.q0 q0Var = null;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(q9.x2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    p0Var = iInterfaceQueryLocalInterface instanceof q9.p0 ? (q9.p0) iInterfaceQueryLocalInterface : new q9.p0(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 1);
                }
                vg.f(parcel);
                l4(arrayListCreateTypedArrayList, p0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                vg.f(parcel);
                boolean zM4 = m4(string);
                parcel2.writeNoException();
                parcel2.writeInt(zM4 ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                vg.f(parcel);
                ev evVarN4 = n4(string2);
                parcel2.writeNoException();
                vg.e(parcel2, evVarN4);
                return true;
            case 4:
                String string3 = parcel.readString();
                vg.f(parcel);
                boolean zO4 = o4(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zO4 ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                vg.f(parcel);
                zh zhVarP4 = p4(string4);
                parcel2.writeNoException();
                vg.e(parcel2, zhVarP4);
                return true;
            case 6:
                String string5 = parcel.readString();
                vg.f(parcel);
                boolean zQ4 = q4(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zQ4 ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                vg.f(parcel);
                q9.l0 l0VarR4 = r4(string6);
                parcel2.writeNoException();
                vg.e(parcel2, l0VarR4);
                return true;
            case 8:
                fr.l4(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                q9.x2 x2Var2 = (q9.x2) vg.b(parcel, q9.x2.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    q0Var = iInterfaceQueryLocalInterface2 instanceof q9.q0 ? (q9.q0) iInterfaceQueryLocalInterface2 : new q9.q0(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 1);
                }
                vg.f(parcel);
                boolean zS4 = s4(string7, x2Var2, q0Var);
                parcel2.writeNoException();
                parcel2.writeInt(zS4 ? 1 : 0);
                return true;
            case 10:
                int i10 = parcel.readInt();
                String string8 = parcel.readString();
                vg.f(parcel);
                boolean zT4 = t4(i10, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zT4 ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                vg.f(parcel);
                q9.l0 l0VarU4 = u4(string9);
                parcel2.writeNoException();
                vg.e(parcel2, l0VarU4);
                return true;
            case 12:
                String string10 = parcel.readString();
                vg.f(parcel);
                zh zhVarV4 = v4(string10);
                parcel2.writeNoException();
                vg.e(parcel2, zhVarV4);
                return true;
            case 13:
                String string11 = parcel.readString();
                vg.f(parcel);
                ev evVarW4 = w4(string11);
                parcel2.writeNoException();
                vg.e(parcel2, evVarW4);
                return true;
            case 14:
                int i11 = parcel.readInt();
                String string12 = parcel.readString();
                vg.f(parcel);
                k9.a aVarA = k9.a.a(i11);
                if (aVarA != null) {
                    ft0 ft0Var = this.f7294c;
                    synchronized (ft0Var) {
                        HashMap map2 = ft0Var.f5428a;
                        if (map2.containsKey(aVarA)) {
                            ht0 ht0Var2 = (ht0) ((Map) map2.get(aVarA)).get(string12);
                            kx0 kx0Var = ft0Var.f5430c;
                            ft0Var.f5434g.getClass();
                            kx0Var.O("pgc", System.currentTimeMillis(), string12, ht0Var2 == null ? null : ht0Var2.f6245e.f31981b, aVarA, ht0Var2 == null ? -1 : ht0Var2.f6245e.f31984e, ht0Var2 != null ? ht0Var2.q() : -1, 1);
                            if (ht0Var2 != null) {
                                x2Var = ht0Var2.f6245e;
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                vg.d(parcel2, x2Var);
                return true;
            case 15:
                int i12 = parcel.readInt();
                vg.f(parcel);
                ft0 ft0Var2 = this.f7294c;
                synchronized (ft0Var2) {
                    try {
                        map = new HashMap();
                        k9.a aVarA2 = k9.a.a(i12);
                        if (aVarA2 != null) {
                            HashMap map3 = ft0Var2.f5428a;
                            if (map3.containsKey(aVarA2)) {
                                for (ht0 ht0Var3 : ((Map) map3.get(aVarA2)).values()) {
                                    map.put(ht0Var3.f6251l, ht0Var3.f6245e);
                                }
                                kx0 kx0Var2 = ft0Var2.f5430c;
                                ft0Var2.f5434g.getClass();
                                kx0Var2.O("pgcs", System.currentTimeMillis(), null, null, aVarA2, -1, -1, map.size());
                            }
                        }
                    } finally {
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    q9.x2 x2Var3 = (q9.x2) entry.getValue();
                    Parcel parcelObtain = Parcel.obtain();
                    x2Var3.writeToParcel(parcelObtain, 0);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    bundle.putByteArray(str, bArrMarshall);
                }
                parcel2.writeNoException();
                vg.d(parcel2, bundle);
                return true;
            case 16:
                int i13 = parcel.readInt();
                String string13 = parcel.readString();
                vg.f(parcel);
                k9.a aVarA3 = k9.a.a(i13);
                if (aVarA3 != null) {
                    ft0 ft0Var3 = this.f7294c;
                    synchronized (ft0Var3) {
                        HashMap map4 = ft0Var3.f5428a;
                        if (map4.containsKey(aVarA3)) {
                            ht0 ht0Var4 = (ht0) ((Map) map4.get(aVarA3)).get(string13);
                            int iQ = ht0Var4 != null ? ht0Var4.q() : 0;
                            kx0 kx0Var3 = ft0Var3.f5430c;
                            ft0Var3.f5434g.getClass();
                            kx0Var3.O("pnav", System.currentTimeMillis(), string13, ht0Var4 != null ? ht0Var4.f6245e.f31981b : null, aVarA3, ht0Var4 != null ? ht0Var4.f6245e.f31984e : -1, iQ, 1);
                            i = iQ;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            case 17:
                int i14 = parcel.readInt();
                String string14 = parcel.readString();
                vg.f(parcel);
                k9.a aVarA4 = k9.a.a(i14);
                if (aVarA4 != null) {
                    ft0 ft0Var4 = this.f7294c;
                    synchronized (ft0Var4) {
                        try {
                            HashMap map5 = ft0Var4.f5428a;
                            if (map5.containsKey(aVarA4) && (ht0Var = (ht0) ((Map) map5.get(aVarA4)).get(string14)) != null) {
                                ((Map) map5.get(aVarA4)).remove(string14);
                                ht0Var.f6247g.set(false);
                                ht0Var.f6255p.set(false);
                                dt0 dt0Var = ft0Var4.i;
                                if (dt0Var != null) {
                                    dt0Var.e(string14, aVarA4);
                                }
                                synchronized (ht0Var) {
                                    ht0Var.f6249j.clear();
                                }
                                kx0 kx0Var4 = ft0Var4.f5430c;
                                ft0Var4.f5434g.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                q9.x2 x2Var4 = ht0Var.f6245e;
                                kx0Var4.O("pd", jCurrentTimeMillis, string14, x2Var4.f31981b, aVarA4, x2Var4.f31984e, ht0Var.q(), 1);
                                i = 1;
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            case 18:
                int i15 = parcel.readInt();
                vg.f(parcel);
                R(i15);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        r6 = 0;
        r8 = u9.d.f34372b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r0.containsKey(r5) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        r6 = r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        r0.put(r5, java.lang.Integer.valueOf(((java.lang.Integer) r6).intValue() + 1));
        r7 = new com.google.android.gms.internal.ads.mt0(new com.google.android.gms.internal.ads.oq0(27, r4, r5));
        r4 = r3.f31984e;
        r1.f7612h.getClass();
        r3.D(r4, java.lang.System.currentTimeMillis(), r7, "1");
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:4:0x0003, B:35:0x008c, B:36:0x009b, B:38:0x00a1, B:41:0x00b9, B:43:0x00bd, B:44:0x00c4, B:45:0x00cd, B:50:0x00e0, B:51:0x00e1, B:53:0x00ed, B:54:0x00f1, B:63:0x0126, B:64:0x0127, B:7:0x000e, B:9:0x0012, B:21:0x0030, B:24:0x0035, B:26:0x003b, B:29:0x0040, B:34:0x0080, B:32:0x004c, B:33:0x0069, B:10:0x0013, B:12:0x0017, B:18:0x002d, B:17:0x0028, B:46:0x00ce, B:48:0x00da, B:49:0x00db, B:61:0x0124), top: B:71:0x0003, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:4:0x0003, B:35:0x008c, B:36:0x009b, B:38:0x00a1, B:41:0x00b9, B:43:0x00bd, B:44:0x00c4, B:45:0x00cd, B:50:0x00e0, B:51:0x00e1, B:53:0x00ed, B:54:0x00f1, B:63:0x0126, B:64:0x0127, B:7:0x000e, B:9:0x0012, B:21:0x0030, B:24:0x0035, B:26:0x003b, B:29:0x0040, B:34:0x0080, B:32:0x004c, B:33:0x0069, B:10:0x0013, B:12:0x0017, B:18:0x002d, B:17:0x0028, B:46:0x00ce, B:48:0x00da, B:49:0x00db, B:61:0x0124), top: B:71:0x0003, inners: #2, #4, #5 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l4(java.util.ArrayList r13, q9.p0 r14) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kt0.l4(java.util.ArrayList, q9.p0):void");
    }

    public final boolean m4(String str) {
        boolean zE;
        lt0 lt0Var = this.f7293b;
        synchronized (lt0Var) {
            zE = lt0Var.e(str, k9.a.REWARDED);
        }
        return zE;
    }

    public final ev n4(String str) {
        ev evVar;
        lt0 lt0Var = this.f7293b;
        synchronized (lt0Var) {
            evVar = (ev) lt0Var.f(ev.class, str, k9.a.REWARDED);
        }
        return evVar;
    }

    public final boolean o4(String str) {
        boolean zE;
        lt0 lt0Var = this.f7293b;
        synchronized (lt0Var) {
            zE = lt0Var.e(str, k9.a.APP_OPEN_AD);
        }
        return zE;
    }

    public final zh p4(String str) {
        zh zhVar;
        lt0 lt0Var = this.f7293b;
        synchronized (lt0Var) {
            zhVar = (zh) lt0Var.f(zh.class, str, k9.a.APP_OPEN_AD);
        }
        return zhVar;
    }

    public final boolean q4(String str) {
        boolean zE;
        lt0 lt0Var = this.f7293b;
        synchronized (lt0Var) {
            zE = lt0Var.e(str, k9.a.INTERSTITIAL);
        }
        return zE;
    }

    public final q9.l0 r4(String str) {
        q9.l0 l0Var;
        lt0 lt0Var = this.f7293b;
        synchronized (lt0Var) {
            l0Var = (q9.l0) lt0Var.f(q9.l0.class, str, k9.a.INTERSTITIAL);
        }
        return l0Var;
    }

    public final boolean s4(String str, q9.x2 x2Var, q9.q0 q0Var) {
        ht0 ht0VarB;
        ft0 ft0Var = this.f7294c;
        synchronized (ft0Var) {
            try {
                if (!ft0Var.f5433f.getAndSet(true)) {
                    if (ft0Var.f5432e == null) {
                        synchronized (ft0Var) {
                            if (ft0Var.f5432e == null) {
                                try {
                                    ft0Var.f5432e = (ConnectivityManager) ft0Var.f5431d.getSystemService("connectivity");
                                } catch (ClassCastException e3) {
                                    u9.i.i("Failed to get connectivity manager", e3);
                                }
                            }
                        }
                    }
                    if (!ua.b.h() || ft0Var.f5432e == null) {
                        ft0Var.f5435h = new AtomicInteger(((Integer) q9.s.f31967e.f31970c.a(al.I)).intValue());
                    } else {
                        try {
                            ft0Var.f5432e.registerDefaultNetworkCallback(new bf(ft0Var));
                        } catch (RuntimeException e7) {
                            u9.i.i("Failed to register network callback", e7);
                            ft0Var.f5435h = new AtomicInteger(((Integer) q9.s.f31967e.f31970c.a(al.I)).intValue());
                        }
                    }
                    p9.k.C.f31301g.v(new gi(ft0Var));
                }
                k9.a aVarA = k9.a.a(x2Var.f31982c);
                if (aVarA != null) {
                    HashMap map = ft0Var.f5428a;
                    if (map.containsKey(aVarA) && !((Map) map.get(aVarA)).containsKey(str) && ft0Var.d(aVarA) && (ht0VarB = ft0Var.f5429b.b(str, x2Var, q0Var)) != null) {
                        AtomicInteger atomicInteger = ft0Var.f5435h;
                        if (atomicInteger != null) {
                            ht0VarB.o(atomicInteger.get());
                        }
                        kx0 kx0Var = ft0Var.f5430c;
                        ht0VarB.f6257r = kx0Var;
                        dt0 dt0Var = ft0Var.i;
                        if (dt0Var != null) {
                            dt0Var.d(str, aVarA, ht0VarB);
                        } else {
                            synchronized (ht0VarB) {
                                ht0VarB.f6253n.submit(new ot0(ht0VarB, 0));
                            }
                        }
                        ((Map) map.get(aVarA)).put(str, ht0VarB);
                        oq0 oq0Var = new oq0(27, x2Var.f31981b, aVarA);
                        oq0Var.f8764e = str;
                        mt0 mt0Var = new mt0(oq0Var);
                        int i = x2Var.f31984e;
                        ft0Var.f5434g.getClass();
                        kx0Var.D(i, System.currentTimeMillis(), mt0Var, "2");
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean t4(int i, String str) {
        mt0 mt0Var;
        k9.a aVarA = k9.a.a(i);
        if (aVarA == null) {
            return false;
        }
        ft0 ft0Var = this.f7294c;
        synchronized (ft0Var) {
            try {
                ft0Var.f5434g.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = ft0Var.f5428a;
                if (!map.containsKey(aVarA)) {
                    return false;
                }
                ht0 ht0Var = (ht0) ((Map) map.get(aVarA)).get(str);
                String strN = ht0Var == null ? null : ht0Var.n();
                boolean z5 = strN != null && aVarA.equals(ht0Var.p());
                Long lValueOf = z5 ? Long.valueOf(System.currentTimeMillis()) : null;
                if (ht0Var == null) {
                    mt0Var = null;
                } else {
                    oq0 oq0Var = new oq0(27, ht0Var.f6245e.f31981b, aVarA);
                    oq0Var.f8764e = str;
                    mt0Var = new mt0(oq0Var);
                }
                ft0Var.f5430c.K(ht0Var == null ? 0 : ht0Var.f6245e.f31984e, ht0Var != null ? ht0Var.q() : 0, jCurrentTimeMillis, lValueOf, strN, mt0Var, "2");
                return z5;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q9.l0 u4(String str) {
        q9.l0 l0Var;
        ft0 ft0Var = this.f7294c;
        synchronized (ft0Var) {
            l0Var = (q9.l0) ft0Var.c(q9.l0.class, str, k9.a.INTERSTITIAL);
        }
        return l0Var;
    }

    public final zh v4(String str) {
        zh zhVar;
        ft0 ft0Var = this.f7294c;
        synchronized (ft0Var) {
            zhVar = (zh) ft0Var.c(zh.class, str, k9.a.APP_OPEN_AD);
        }
        return zhVar;
    }

    public final ev w4(String str) {
        ev evVar;
        ft0 ft0Var = this.f7294c;
        synchronized (ft0Var) {
            evVar = (ev) ft0Var.c(ev.class, str, k9.a.REWARDED);
        }
        return evVar;
    }

    @Override // q9.s0
    public final void x2(fr frVar) {
    }
}
