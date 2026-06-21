package e4;

import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import java.net.DatagramSocket;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.g0 f16136b = new p3.g0(k3.f.d(8000));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f16137c;

    @Override // e4.d
    public final h0 A() {
        return null;
    }

    @Override // p3.h
    public final void addTransferListener(p3.e0 e0Var) {
        this.f16136b.addTransferListener(e0Var);
    }

    @Override // e4.d
    public final String c() {
        int i = i();
        h5.r(i != -1);
        String str = m3.z.f28608a;
        Locale locale = Locale.US;
        return a0.u.j(i, i + 1, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // p3.h
    public final void close() {
        this.f16136b.close();
        j0 j0Var = this.f16137c;
        if (j0Var != null) {
            j0Var.close();
        }
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f16136b.f31152u;
    }

    @Override // e4.d
    public final int i() {
        DatagramSocket datagramSocket = this.f16136b.f31153v;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // p3.h
    public final long open(p3.l lVar) {
        this.f16136b.open(lVar);
        return -1L;
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws p3.f0 {
        try {
            return this.f16136b.read(bArr, i, i10);
        } catch (p3.f0 e3) {
            if (e3.f31158b == 2002) {
                return -1;
            }
            throw e3;
        }
    }

    @Override // e4.d
    public final boolean s() {
        return true;
    }
}
