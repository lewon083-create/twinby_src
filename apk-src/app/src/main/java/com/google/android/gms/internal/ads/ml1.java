package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ml1 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc f7912a;

    public ml1(fc fcVar) {
        this.f7912a = fcVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            il1 il1Var = il1.f6535c;
            fc fcVar = this.f7912a;
            Mac mac = (Mac) il1Var.f6540a.b((String) fcVar.f5321d);
            mac.init((SecretKeySpec) fcVar.f5322e);
            return mac;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
