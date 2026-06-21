package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z91 implements xd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z91 f12921a = new z91();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sd1 f12922b = new sd1(zc1.class, e91.class, mp0.f7976o);

    @Override // com.google.android.gms.internal.ads.xd1
    public final Object a(l91 l91Var, bd1 bd1Var, n90 n90Var) throws GeneralSecurityException {
        sl1 sl1VarH0;
        List arrayList;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) l91Var.f7465c).size(); i++) {
            k91 k91VarX = l91Var.x(i);
            if (k91VarX.f7151b.equals(h91.f6058d)) {
                gr grVarA = k91VarX.a();
                if (grVarA instanceof v91) {
                    sl1VarH0 = ((v91) grVarA).h0();
                } else {
                    if (!(grVarA instanceof zc1)) {
                        String name = grVarA.getClass().getName();
                        String strValueOf = String.valueOf(grVarA.q());
                        throw new GeneralSecurityException(om1.n(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    sl1VarH0 = ((zc1) grVarA).h0();
                }
                x91 x91Var = new x91((e91) n90Var.d(k91VarX), k91VarX.f7152c);
                byte[] bArr = sl1VarH0.f10334a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(sl1VarH0)) {
                    arrayList = (List) map.get(sl1VarH0);
                } else {
                    arrayList = new ArrayList();
                    map.put(sl1VarH0, arrayList);
                }
                arrayList.add(x91Var);
            }
        }
        if (!bd1Var.f3765a.isEmpty()) {
            gd1.f5783b.a().getClass();
        }
        l91Var.m();
        return new y91(new rd1(map));
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class h() {
        return e91.class;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class j() {
        return e91.class;
    }
}
