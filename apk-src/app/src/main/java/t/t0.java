package t;

import android.content.Context;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.os.RemoteException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements f, m4.p, x9.d, ya.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33288b;

    public /* synthetic */ t0(int i) {
        this.f33288b = i;
    }

    public static void c(Context context, String str) {
        q9.k2 k2VarD = q9.k2.d();
        synchronized (k2VarD.f31929h) {
            pa.c0.k("MobileAds.initialize() must be called prior to opening debug menu.", k2VarD.i != null);
            q9.h1 h1Var = k2VarD.i;
            if (h1Var == null) {
                return;
            }
            try {
                h1Var.s2(str, new xa.b(context));
            } catch (RemoteException e3) {
                u9.i.f("Unable to open debug menu.", e3);
            }
        }
    }

    public static void e(boolean z5) {
        q9.k2 k2VarD = q9.k2.d();
        synchronized (k2VarD.f31929h) {
            pa.c0.k("MobileAds.initialize() must be called prior to setting app muted state.", k2VarD.i != null);
            q9.h1 h1Var = k2VarD.i;
            if (h1Var == null) {
                return;
            }
            try {
                h1Var.I(z5);
            } catch (RemoteException e3) {
                u9.i.f("Unable to set app mute state.", e3);
            }
        }
    }

    @Override // t.f
    public CamcorderProfile a(int i, int i10) {
        return CamcorderProfile.get(i, i10);
    }

    @Override // t.f
    public boolean b(int i, int i10) {
        return CamcorderProfile.hasProfile(i, i10);
    }

    @Override // ya.c
    public com.google.android.gms.internal.ads.j0 d(Context context, String str, ya.b bVar) {
        int iB;
        switch (this.f33288b) {
            case 8:
                com.google.android.gms.internal.ads.j0 j0Var = new com.google.android.gms.internal.ads.j0();
                int iB2 = bVar.b(context, str, true);
                j0Var.f6667b = iB2;
                if (iB2 != 0) {
                    j0Var.f6668c = 1;
                } else {
                    int iC = bVar.c(context, str);
                    j0Var.f6666a = iC;
                    if (iC != 0) {
                        j0Var.f6668c = -1;
                    }
                }
                return j0Var;
            default:
                com.google.android.gms.internal.ads.j0 j0Var2 = new com.google.android.gms.internal.ads.j0();
                int iC2 = bVar.c(context, str);
                j0Var2.f6666a = iC2;
                int i = 1;
                int i10 = 0;
                if (iC2 != 0) {
                    iB = bVar.b(context, str, false);
                    j0Var2.f6667b = iB;
                } else {
                    iB = bVar.b(context, str, true);
                    j0Var2.f6667b = iB;
                }
                int i11 = j0Var2.f6666a;
                if (i11 == 0) {
                    if (iB == 0) {
                        i = 0;
                    }
                    j0Var2.f6668c = i;
                    return j0Var2;
                }
                i10 = i11;
                if (i10 >= iB) {
                    i = -1;
                }
                j0Var2.f6668c = i;
                return j0Var2;
        }
    }

    @Override // m4.p
    public Object m(Uri uri, p3.j jVar) {
        return Long.valueOf(m3.z.P(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    public t0(kotlin.collections.c0 class2ContextualFactory, kotlin.collections.c0 polyBase2Serializers, kotlin.collections.c0 polyBase2DefaultSerializerProvider, kotlin.collections.c0 polyBase2NamedSerializers, kotlin.collections.c0 polyBase2DefaultDeserializerProvider) {
        this.f33288b = 7;
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
    }
}
