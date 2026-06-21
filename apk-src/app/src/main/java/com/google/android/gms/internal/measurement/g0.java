package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends x implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f13751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13752c;

    public g0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f13751b = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D0(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = t.z.e(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g0.D0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void W2(Bundle bundle) {
        AtomicReference atomicReference = this.f13751b;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f13752c = true;
                } finally {
                    this.f13751b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean c0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) y.a(parcel, Bundle.CREATOR);
        y.d(parcel);
        W2(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final String l0(long j10) {
        return (String) D0(n0(j10), String.class);
    }

    public final Bundle n0(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f13751b;
        synchronized (atomicReference) {
            if (!this.f13752c) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f13751b.get();
        }
        return bundle;
    }
}
