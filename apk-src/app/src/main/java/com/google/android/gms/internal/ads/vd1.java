package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11365b;

    public /* synthetic */ vd1(ut utVar) {
        this.f11364a = new HashMap((HashMap) utVar.f11061c);
        this.f11365b = new HashMap((HashMap) utVar.f11062d);
    }

    public final Object a(gr grVar, Class cls) throws GeneralSecurityException {
        ud1 ud1Var = new ud1(grVar.getClass(), cls);
        HashMap map = this.f11364a;
        if (map.containsKey(ud1Var)) {
            return ((sd1) map.get(ud1Var)).f10249c.b(grVar);
        }
        String string = ud1Var.toString();
        throw new GeneralSecurityException(t.z.g(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object b(l91 l91Var, bd1 bd1Var, Class cls) throws GeneralSecurityException {
        HashMap map = this.f11365b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        xd1 xd1Var = (xd1) map.get(cls);
        return xd1Var.a(l91Var, bd1Var, new n90(22, this, xd1Var));
    }
}
