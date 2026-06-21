package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 implements xd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we1 f11795a = new we1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sd1 f11796b = new sd1(zc1.class, n91.class, cc1.f4170m);

    @Override // com.google.android.gms.internal.ads.xd1
    public final Object a(l91 l91Var, bd1 bd1Var, n90 n90Var) throws GeneralSecurityException {
        sl1 sl1VarH0;
        List list;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) l91Var.f7465c).size(); i++) {
            k91 k91VarX = l91Var.x(i);
            if (k91VarX.f7151b.equals(h91.f6058d)) {
                gr grVarA = k91VarX.a();
                if (grVarA instanceof te1) {
                    sl1VarH0 = ((te1) grVarA).h0();
                } else {
                    if (!(grVarA instanceof zc1)) {
                        String name = grVarA.getClass().getName();
                        String strValueOf = String.valueOf(grVarA.q());
                        throw new GeneralSecurityException(om1.n(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    sl1VarH0 = ((zc1) grVarA).h0();
                }
                cc1 cc1Var = new cc1(11);
                byte[] bArr = sl1VarH0.f10334a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(sl1VarH0)) {
                    list = (List) map.get(sl1VarH0);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(sl1VarH0, arrayList);
                    list = arrayList;
                }
                list.add(cc1Var);
            }
        }
        if (!bd1Var.f3765a.isEmpty()) {
            gd1.f5783b.a().getClass();
        }
        l91Var.m();
        return new ve1();
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class h() {
        return n91.class;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class j() {
        return n91.class;
    }
}
