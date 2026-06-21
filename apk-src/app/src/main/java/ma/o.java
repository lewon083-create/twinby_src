package ma;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import pa.c0;
import pa.r0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends cb.c implements r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28793c;

    public o(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        c0.b(bArr.length == 25);
        this.f28793c = Arrays.hashCode(bArr);
    }

    public static byte[] X1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    public abstract byte[] L1();

    @Override // cb.c
    public final boolean T0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            xa.a aVarG = g();
            parcel2.writeNoException();
            fb.h.b(parcel2, aVarG);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f28793c);
        return true;
    }

    public final boolean equals(Object obj) {
        xa.a aVarG;
        if (obj instanceof r0) {
            try {
                r0 r0Var = (r0) obj;
                if (r0Var.i() == this.f28793c && (aVarG = r0Var.g()) != null) {
                    return Arrays.equals(L1(), (byte[]) xa.b.X1(aVarG));
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return false;
            }
        }
        return false;
    }

    @Override // pa.r0
    public final xa.a g() {
        return new xa.b(L1());
    }

    public final int hashCode() {
        return this.f28793c;
    }

    @Override // pa.r0
    public final int i() {
        return this.f28793c;
    }
}
