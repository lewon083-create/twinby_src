package ma;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import pa.a0;
import pa.b0;
import pa.c0;
import pa.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f28801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f28802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b0 f28803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f28804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f28805e;

    static {
        new n(0, o.X1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new n(1, o.X1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new n(2, o.X1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new n(3, o.X1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f28801a = new n(4, o.X1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f28802b = new n(5, o.X1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f28804d = new Object();
    }

    public static void a() {
        b0 zVar;
        if (f28803c != null) {
            return;
        }
        c0.i(f28805e);
        synchronized (f28804d) {
            try {
                if (f28803c == null) {
                    IBinder iBinderB = ya.d.c(f28805e, ya.d.f36576e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = a0.f31321c;
                    if (iBinderB == null) {
                        zVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zVar = iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new z(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 6);
                    }
                    f28803c = zVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static v b(String str, p pVar, boolean z5, boolean z10) {
        try {
            a();
            c0.i(f28805e);
            try {
                b0 b0Var = f28803c;
                xa.b bVar = new xa.b(f28805e.getPackageManager());
                z zVar = (z) b0Var;
                Parcel parcelD0 = zVar.D0();
                int i = fb.h.f16740a;
                boolean z11 = true;
                parcelD0.writeInt(1);
                int iI0 = j0.g.i0(parcelD0, 20293);
                j0.g.b0(parcelD0, 1, str);
                j0.g.X(parcelD0, 2, pVar);
                j0.g.h0(parcelD0, 3, 4);
                parcelD0.writeInt(z5 ? 1 : 0);
                j0.g.h0(parcelD0, 4, 4);
                parcelD0.writeInt(z10 ? 1 : 0);
                j0.g.m0(parcelD0, iI0);
                fb.h.b(parcelD0, bVar);
                Parcel parcelL0 = zVar.l0(parcelD0, 5);
                if (parcelL0.readInt() == 0) {
                    z11 = false;
                }
                parcelL0.recycle();
                return z11 ? v.f28812d : new u(new q(z5, str, pVar));
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return v.c("module call", e3);
            }
        } catch (ya.a e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            return v.c("module init: ".concat(String.valueOf(e7.getMessage())), e7);
        }
    }
}
